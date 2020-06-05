package com.mahmoudshaaban.reyclerviewwithmvvm

import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface MoviesApi {


        @GET("posts/1")
        // we put suspend function because corotinues ( we'll learn it later )
        suspend fun getmovies() : Response<List<Posts>>

    companion object {

        operator fun invoke() : MoviesApi {

            return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .build()
                .create(MoviesApi::class.java)


        }

    }
}