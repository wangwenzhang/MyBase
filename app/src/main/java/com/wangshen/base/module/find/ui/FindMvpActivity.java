package com.wangshen.base.module.find.ui;

import android.graphics.Color;

import com.r0adkll.slidr.Slidr;
import com.r0adkll.slidr.model.SlidrConfig;
import com.r0adkll.slidr.model.SlidrPosition;
import com.wangshen.base.R;
import com.wangshen.base.base.BaseMvpActivity;
import com.wangshen.base.module.find.presenter.FindPresenter;
import com.wangshen.base.module.find.view.FindView;

/**
 * 所有Activity都应继承BaseActivity
 * Created by wangwenzhang on 2017/11/9.
 */

public class FindMvpActivity extends BaseMvpActivity<FindPresenter> implements FindView{
    SlidrConfig mSlidrConfig;
    SlidrConfig.Builder mBuilder;
    @Override
    public void initView() {
        int primary = getResources().getColor(R.color.primary_material_dark);
        int secondary = getResources().getColor(R.color.Pink);
        mBuilder = new SlidrConfig.Builder().primaryColor(primary)
                .secondaryColor(secondary)
                .scrimColor(Color.BLACK)
                .position(SlidrPosition.LEFT)
                .scrimStartAlpha(0.8f)
                .scrimEndAlpha(0f)
                .velocityThreshold(5f)
                .distanceThreshold(.35f);
        mSlidrConfig = mBuilder.build();
        Slidr.attach(this, mSlidrConfig);
    }

    @Override
    public void getData() {

    }

    @Override
    public int getLayout() {
        return R.layout.fragment_find;
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
    public void setPresenter() {
        if (null==presenter){
            this.presenter=new FindPresenter();
        }
    }

    @Override
    public void onShowNoMore() {

    }

}
