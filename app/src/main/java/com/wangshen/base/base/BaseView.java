package com.wangshen.base.base;

/**
 * Created by wangwenzhang on 2017/11/9.
 * 所有的View都必须实现该接口
 */

public interface BaseView<M extends BaseModle> {
    void success(M model);//获取数据成功
    void loading();//正在获取数据
    void error();//获取失败ToastUtils
}
