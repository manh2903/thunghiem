package com.ndm.retrofitapiexample;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface UserApi {

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://192.168.1.234:8080/users/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    @GET("get")
    Call<List<User>> getUsers();
}
