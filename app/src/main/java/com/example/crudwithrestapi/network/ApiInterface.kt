package com.example.crudwithrestapi.network

import com.example.crudwithrestapi.home.data.PostModel
import retrofit2.Call
import retrofit2.http.*

interface ApiInterface {
    @GET("user/view")
    fun fetchAllPosts(): Call<List<PostModel>>

    @POST("user/view")
    fun createPost(@Body postModel: PostModel):Call<PostModel>

    @DELETE("user/view")
    fun deletePost(@Path("id") id:Int):Call<String>
}