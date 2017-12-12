package com.wangshen.base.app;

import android.app.Application;
import android.content.Context;

import com.wangshen.base.utils.LogUtils;

/**
 * APP初始化类
 * Created by wangwenzhang on 2017/11/9.
 */

public class App extends Application {
    public static Context AppContext;
    @Override
    public void onCreate() {
        super.onCreate();
        LogUtils.isShow=true;
        AppContext = getApplicationContext();
    }
}
