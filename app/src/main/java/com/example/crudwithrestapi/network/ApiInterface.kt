package com.example.crudwithrestapi.network

    import com.example.crudwithrestapi.home.data.PostModel
import retrofit2.Call
import retrofit2.http.*

interface ApiInterface {
    @GET("posts")
    fun fetchAllPosts(): Call<List<PostModel>>
}