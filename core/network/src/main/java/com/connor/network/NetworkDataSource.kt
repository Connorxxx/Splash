package com.connor.network

import androidx.paging.Pager
import androidx.paging.PagingConfig
import com.connor.network.model.PhotoItem
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class NetworkDataSource @Inject constructor(private val httpClient: HttpClient) {

    fun getPagingData(path: String) = Pager(
        config = PagingConfig(10),
        pagingSourceFactory = { PhotoPagingSource(httpClient, path)}
    ).flow.flowOn(Dispatchers.IO)

    suspend fun getPhoto() = httpClient.get("photos") {
        parameter("page", 3)
    }.body<List<PhotoItem>>()

}