package com.example.composecryptocurrencyapp.presentation.coin_detail

import com.example.composecryptocurrencyapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)