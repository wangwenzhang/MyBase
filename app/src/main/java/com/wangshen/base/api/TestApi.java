package com.wangshen.base.api;

import com.wangshen.base.module.find.model.FindModle;

import io.reactivex.Observable;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * 用于存放接口
 * 创建者： wangwenzhang 时间： 2017/11/10.
 */

public interface TestApi {
    String URL_BASE="www.baidu.com";
    /**
     * GET示例
     * @param page
     * @param pagesize
     * @return
     */
    @GET("text.from?key=ae240f7fba620fc370b803566654949e")
    Observable<FindModle> getTestContent(@Query("page") int page, @Query("pagesize") int pagesize);

    /**
     * POST示例
     * @param requestBody
     * @return
     */
    @POST("api/Test/Info")
    Observable<FindModle> getPictrue(@Body RequestBody requestBody);
}
