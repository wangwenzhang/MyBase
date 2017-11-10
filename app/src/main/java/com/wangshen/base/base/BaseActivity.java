package com.wangshen.base.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Activity的基类
 * Created by wangwenzhang on 2017/11/9.
 */

public abstract class BaseActivity <P extends BasePresenter>extends AppCompatActivity {
    protected P presenter;
    protected String TAG=getClass().getName();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        initView();
        setPresenter();
        getData();
    }
    public abstract void initView();//初始化布局
    public abstract void getData();//初始化布局
    public abstract int getLayout();//设置布局
    public abstract void setPresenter();//初始化Presenter

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (presenter!=null){
            presenter.detachView();//布局销毁 调用presenter置空view，防止内存溢出
        }
    }
}
