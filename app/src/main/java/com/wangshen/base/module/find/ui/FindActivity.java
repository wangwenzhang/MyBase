package com.wangshen.base.module.find.ui;

import com.wangshen.base.base.BaseActivity;
import com.wangshen.base.module.find.presenter.FindPresenter;
import com.wangshen.base.module.find.view.FindView;

/**
 * 所有Activity都应继承BaseActivity
 * Created by wangwenzhang on 2017/11/9.
 */

public class FindActivity extends BaseActivity<FindPresenter> implements FindView{
    @Override
    public void initView() {

    }

    @Override
    public void getData() {

    }

    @Override
    public int getLayout() {
        return 0;
    }


    @Override
    public void onShowLoading() {

    }

    @Override
    public void onHideLoading() {

    }

    @Override
    public void onShowNetError() {

    }

    @Override
    public void setPresenter(FindPresenter presenter) {
        if (null==presenter){
            this.presenter=new FindPresenter();
        }
    }

    @Override
    public void onShowNoMore() {

    }

}
