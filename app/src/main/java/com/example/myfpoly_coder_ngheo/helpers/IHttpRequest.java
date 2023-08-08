package com.example.myfpoly_coder_ngheo.helpers;

import com.example.myfpoly_coder_ngheo.dto.ListProductResponseDTO;
import com.example.myfpoly_coder_ngheo.helpers.*;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

public interface IHttpRequest {



    @GET("/api/get_all_products.php")
    Call<ListProductResponseDTO> getProducts(@QueryMap Map<String,String> options);
}
