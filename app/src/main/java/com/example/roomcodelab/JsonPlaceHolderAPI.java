package com.example.roomcodelab;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderAPI {
    @GET("posts")
    Call<List<Post>> getPosts();
}
