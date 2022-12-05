package com.connor.network

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.connor.network.model.PhotoItem
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*

class PhotoPagingSource(
    private val client: HttpClient,
    private val path: String,
) : PagingSource<Int, PhotoItem>() {

    override suspend fun load(params: LoadParams<Int>) = fire {
        val page = params.key ?: 1
        val repoResponse = photo(path, page)
        LoadResult.Page(
            data = repoResponse,
            prevKey = if (page > 1) page - 1 else null,
            nextKey =  if (repoResponse.isNotEmpty()) page + 1 else null
        )
    }

    override fun getRefreshKey(state: PagingState<Int, PhotoItem>): Int? = null

    private suspend fun photo(path: String, page: Int) =
        client.get(path) {
            parameter("page", page)
        }.body<List<PhotoItem>>()

    private inline fun <reified T : Any> fire(block: () -> LoadResult<Int, T>) = try {
        block()
    } catch (e: Exception) {
        LoadResult.Error(e)
    }

}