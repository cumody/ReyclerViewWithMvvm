package com.mahmoudshaaban.reyclerviewwithmvvm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

@Suppress("UnChecked case")
class MoviesViewModelFactory(
    private val repository : MoviesRepository

) : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MoviesViewModel(repository) as T
    }



}