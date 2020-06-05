package com.mahmoudshaaban.reyclerviewwithmvvm

class MoviesRepository(private val api : MoviesApi) : SafeApiRequest() {

    suspend fun getMovies() = apiRequest { api.getmovies() }
}