package com.mweluh.mybmi;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface Api {

    @FormUrlEncoded
    @POST("bmi-calc")
    Call<BmiResponse> calcBmi(@Field("height") String height, @Field("weight") String weight);
}
