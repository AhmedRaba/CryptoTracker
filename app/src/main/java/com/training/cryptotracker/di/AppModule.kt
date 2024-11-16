package com.training.cryptotracker.di

import com.training.cryptotracker.core.data.networking.HttpClientFactory
import com.training.cryptotracker.crypto.data.networking.RemoteCoinDataSource
import com.training.cryptotracker.crypto.domain.CoinDataSource
import com.training.cryptotracker.crypto.presentation.CoinListViewModel
import io.ktor.client.engine.cio.CIO
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.bind
import org.koin.dsl.module

val appModule = module {
    single { HttpClientFactory.create(CIO.create()) }
    singleOf(::RemoteCoinDataSource).bind<CoinDataSource>()
    viewModelOf(::CoinListViewModel)
}