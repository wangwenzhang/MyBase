package com.wangshen.base.app;

import android.app.Application;
import android.content.Context;

import com.wangshen.base.utils.LogUtils;
import com.wangshen.base.utils.SharedPreferencesUtil;

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
        initPrefs();
    }
    /**
     * 初始化SharedPreference
     */
    protected void initPrefs() {
        SharedPreferencesUtil.init(getApplicationContext(), getPackageName() + "_preference", Context.MODE_MULTI_PROCESS);
    }
}
