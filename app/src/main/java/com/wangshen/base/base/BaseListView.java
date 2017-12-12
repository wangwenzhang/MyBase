package com.wangshen.base.base;

import java.util.List;

/**
 * 创建者： wangwenzhang 时间： 2017/12/11.
 * 所有列表视图的View 基类
 */

public interface BaseListView <P>{
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
    void setPresenter(P presenter);

    /**
     * 设置适配器
     */
    void onSetAdapter(List<?> list);

    /**
     * 加载完毕
     */
    void onShowNoMore();
}
