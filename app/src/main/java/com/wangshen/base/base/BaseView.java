package com.wangshen.base.base;



/**
 * Created by wangwenzhang on 2017/11/9.
 * 所有的普通View基类
 */

public interface BaseView<P> {
    /**
     * 显示加载动画
     */
    void onShowLoading();

    /**
     * 隐藏加载
     */
    void onHideLoading();

    /**
     * 显示网络错误
     */
    void onShowNetError();

    /**
     * 设置 presenter
     */
    void setPresenter();

    /**
     * 加载完毕
     */
    void onShowNoMore();
}
