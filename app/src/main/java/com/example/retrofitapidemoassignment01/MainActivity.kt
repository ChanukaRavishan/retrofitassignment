package com.example.retrofitapidemoassignment01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import retrofit2.Callback
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var rf = Retrofit.Builder()
            .baseUrl(RetrofitInterface.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()).build()

        var API = rf.create(RetrofitInterface::class.java)
        var call = API.posts

        call?.enqueue(object::callback<List<postModel?>?> {


        })
    }
}