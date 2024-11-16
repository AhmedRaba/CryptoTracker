package com.training.cryptotracker.crypto.presentation.coin_list

import com.training.cryptotracker.crypto.presentation.models.CoinUi

sealed interface CoinListAction {

    data class OnCoinClick(val coinUi: CoinUi) : CoinListAction

}