package com.example.crudwithrestapi.home.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.crudwithrestapi.home.data.HomeRepository
import com.example.crudwithrestapi.home.data.PostModel

class HomeViewModel : ViewModel() {
    private var homeRepository:HomeRepository?=null
    var postModelListLiveData : LiveData<List<PostModel>>?=null
    var createPostLiveData:LiveData<PostModel>?=null
    var deletePostLiveData:LiveData<Boolean>?=null

    init {
        homeRepository = HomeRepository()
        postModelListLiveData = MutableLiveData()
        createPostLiveData = MutableLiveData()
        deletePostLiveData = MutableLiveData()
    }

    fun fetchAllPosts(){
        postModelListLiveData = homeRepository?.fetchAllPosts()
    }

    fun createPost(postModel: PostModel){
        createPostLiveData = homeRepository?.createPost(postModel)
    }

    fun deletePost(id:Int){
        deletePostLiveData = homeRepository?.deletePost(id)
    }
}