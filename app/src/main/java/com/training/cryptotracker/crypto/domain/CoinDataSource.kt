package com.training.cryptotracker.crypto.domain

import com.training.cryptotracker.core.domain.NetworkError
import com.training.cryptotracker.core.domain.Result

interface CoinDataSource {

    suspend fun getCoins(): Result<List<Coin>, NetworkError>

}