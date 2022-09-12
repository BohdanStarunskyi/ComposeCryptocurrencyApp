package com.example.composecryptocurrencyapp.data.repository

import com.example.composecryptocurrencyapp.data.remote.CoinPaprikaApi
import com.example.composecryptocurrencyapp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins() = api.getCoins()
    override suspend fun getCoinById(coinId: String) = api.getCoinById(coinId)

}