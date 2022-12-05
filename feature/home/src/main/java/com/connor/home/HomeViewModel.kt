package com.connor.home

import androidx.lifecycle.ViewModel
import com.connor.data.PhotoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val photoRepository: PhotoRepository) : ViewModel() {

    val getPhoto = flow {
        emit(photoRepository.getData())
    }

}