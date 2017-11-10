package com.wangshen.base.api;

import com.wangshen.base.base.BaseModle;

import okhttp3.OkHttpClient;
import retrofit2.CallAdapter;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 该类用于调用网络请求并且返回相应的数据类
 * Created by wangwenzhang on 2017/11/9.
 */

public class ApiService <M extends BaseModle>{
    private static OkHttpClient okHttpClient = new OkHttpClient();
    private static Converter.Factory gsonConverterFactory = GsonConverterFactory.create();
    private static CallAdapter.Factory rxJavaCallAdapterFactory = RxJava2CallAdapterFactory.create();
    private static BaseModle model;
    public static BaseModle getBaseModle(){
        if (model==null){
            Retrofit retrofit = new Retrofit.Builder()
                    .client(okHttpClient)
                    .baseUrl("")
                    .addConverterFactory(gsonConverterFactory)
                    .addCallAdapterFactory(rxJavaCallAdapterFactory)
                    .build();
            model = retrofit.create(BaseModle.class);
        }
        return model;
    }
}
