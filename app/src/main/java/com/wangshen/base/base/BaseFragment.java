package com.wangshen.base.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Fragment的基类
 * Created by wangwenzhang on 2017/11/9.
 */

public abstract class BaseFragment<P extends BasePresenter> extends Fragment {
    protected  P presenter;
    protected Activity activity;
    protected String TAG=getClass().getName();
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.activity=activity;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(getLayout(),container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        setPresenter();
        getData();
    }

    public abstract void initView();//初始化布局
    public abstract void getData();//初始化布局
    public abstract int getLayout();//设置布局
    public abstract void setPresenter();//初始化Presenter

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (presenter!=null){
            presenter.detachView();//布局销毁 调用presenter置空view，防止内存溢出
        }
    }
}
