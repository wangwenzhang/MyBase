package com.wangshen.base.module.find.view;

import com.wangshen.base.base.BaseView;

import com.wangshen.base.module.find.presenter.FindPresenter;

/**
 * View都应该根据界面类型继承BaseView 跟 BaseListView,并且根据自身特点增加回调方法
 * Created by wangwenzhang on 2017/11/9.
 */

public interface FindView extends BaseView<FindPresenter> {
  
}
