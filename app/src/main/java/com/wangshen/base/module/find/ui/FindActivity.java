package com.wangshen.base.module.find.ui;

import com.wangshen.base.base.BaseActivity;
import com.wangshen.base.base.BaseModle;
import com.wangshen.base.module.find.model.FindModle;
import com.wangshen.base.module.find.presenter.FindPresenter;
import com.wangshen.base.module.find.view.FindView;

/**
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
    public void setPresenter() {
        presenter=new FindPresenter();
    }


    @Override
    public void success(FindModle model) {

    }

    @Override
    public void loading() {

    }

    @Override
    public void error() {

    }
}
