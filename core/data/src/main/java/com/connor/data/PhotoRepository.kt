package com.connor.data

import com.connor.network.NetworkDataSource
import javax.inject.Inject

class PhotoRepository @Inject constructor(private val networkDataSource: NetworkDataSource) {

    suspend fun getData() = networkDataSource.getPhoto()
}