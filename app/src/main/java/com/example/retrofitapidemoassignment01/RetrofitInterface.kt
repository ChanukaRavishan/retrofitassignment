package com.example.retrofitapidemoassignment01

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface RetrofitInterface {

    @get :GET("posts")
    val posts : Call<List<postModel?>?>?


    companion object{

        const   val BASE_URL = "https://jsonplaceholder.typicode.com"
        fun getRetrofitInstance(): Retrofit {
            return Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com").addConverterFactory(
                    GsonConverterFactory.create()).build()
        }
    }
}