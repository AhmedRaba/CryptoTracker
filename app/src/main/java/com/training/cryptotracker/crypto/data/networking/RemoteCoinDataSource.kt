package com.training.cryptotracker.crypto.data.networking

import com.training.cryptotracker.core.data.networking.constructUrl
import com.training.cryptotracker.core.data.networking.safeCall
import com.training.cryptotracker.core.domain.NetworkError
import com.training.cryptotracker.core.domain.Result
import com.training.cryptotracker.core.domain.map
import com.training.cryptotracker.crypto.data.mappers.toCoin
import com.training.cryptotracker.crypto.data.networking.dto.CoinsResponseDto
import com.training.cryptotracker.crypto.domain.Coin
import com.training.cryptotracker.crypto.domain.CoinDataSource
import io.ktor.client.HttpClient
import io.ktor.client.request.get

class RemoteCoinDataSource(
    private val httpClient: HttpClient,
) : CoinDataSource {
    override suspend fun getCoins(): Result<List<Coin>, NetworkError> {
        return safeCall<CoinsResponseDto> {
            httpClient.get(
                urlString = constructUrl("/assets")
            )
        }.map { response ->
            response.data.map { it.toCoin() }

        }
    }

}