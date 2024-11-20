package com.training.cryptotracker.crypto.domain

import com.training.cryptotracker.core.domain.NetworkError
import com.training.cryptotracker.core.domain.Result
import java.time.ZonedDateTime

interface CoinDataSource {

    suspend fun getCoins(): Result<List<Coin>, NetworkError>
    suspend fun getCoinHistory(
        coinId: String,
        start: ZonedDateTime,
        end: ZonedDateTime,
    ): Result<List<CoinPrice>,NetworkError>
}