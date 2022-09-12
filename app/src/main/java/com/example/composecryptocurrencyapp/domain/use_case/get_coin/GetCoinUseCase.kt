package com.example.composecryptocurrencyapp.domain.use_case.get_coin

import com.example.composecryptocurrencyapp.common.Resource
import com.example.composecryptocurrencyapp.data.remote.dto.toCoinDetail
import com.example.composecryptocurrencyapp.domain.model.CoinDetail
import com.example.composecryptocurrencyapp.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> = flow {
        try {
            emit(Resource.Loading())
            val coin = repository.getCoinById(coinId).toCoinDetail()
            emit(Resource.Success(coin))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: ""))
        } catch (e: IOException) {
            emit(Resource.Error(e.localizedMessage ?: ""))
        }
    }
}