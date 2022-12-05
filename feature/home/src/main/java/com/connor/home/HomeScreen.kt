package com.connor.home

import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun HomeScreen(vm: HomeViewModel = viewModel()) {
    var text by remember { mutableStateOf("") }

    LaunchedEffect(Unit) {
        vm.getPhoto.collect {
            text = it.last().id ?: "null"
        }
    }

    Text(text = text)
}