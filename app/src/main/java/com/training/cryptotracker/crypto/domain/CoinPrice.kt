package com.training.cryptotracker.crypto.domain

import java.time.ZonedDateTime

data class CoinPrice(
    val priceUsd: Double,
    val time: ZonedDateTime
)
