package com.example.composecryptocurrencyapp.domain.repository

import com.example.composecryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.example.composecryptocurrencyapp.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}