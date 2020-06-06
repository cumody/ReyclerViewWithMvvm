package com.mahmoudshaaban.reyclerviewwithmvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MoviesViewModel(
    private val repository: MoviesRepository

) : ViewModel() {

    private val _movies = MutableLiveData<List<Movies>>()

    val movies : LiveData<List<Movies>>

        get()  = _movies


    suspend fun getMovies() {

        val movies = repository.getMovies()

        _movies.value = movies  
    }



}
