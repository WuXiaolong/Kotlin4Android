package com.wuxiaolong.kotlin4android

import retrofit2.http.GET
import retrofit2.http.Path
import rx.Observable


/**
 * Creator: AndyQiu(andyqiubo@126.com)
 * Date: 2017-05-26 17:11
 * Purpose:
 */
interface ApiStores {
    //baseUrl
    //val API_SERVER_URL = "http://www.weather.com.cn/"

    //加载天气
    @GET("adat/sk/{cityId}.html")
    fun loadDataByRetrofitRxjava(@Path("cityId") cityId: String): Observable<MainModel>
}