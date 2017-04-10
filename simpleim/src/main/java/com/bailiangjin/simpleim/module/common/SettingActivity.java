package com.bailiangjin.simpleim.module.common;

import android.os.Bundle;
import android.view.View;

import com.bailiangjin.simpleim.R;
import com.bailiangjin.simpleim.appcommon.base.BaseActivity;
import com.bailiangjin.simpleim.utils.ActivityUtils;

import butterknife.OnClick;

/**
 * 关于页
 * Created by bailiangjin on 16/9/29.
 */
public class SettingActivity extends BaseActivity{
    @Override
    protected int getLayoutResId() {
        return R.layout.activity_setting;
    }

    @Override
    protected void beforeViewBind(Bundle savedInstanceState) {

    }

    @Override
    protected void initView(Bundle savedInstanceState) {
        titleBarBuilder.setTitleText("设置");
    }

    @Override
    protected void initData(Bundle savedInstanceState) {

    }


    @OnClick({R.id.tv_about})
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_about://登录成功
                ActivityUtils.startActivity(this,AboutActivity.class);
                break;
            default:
                break;

        }
    }


}
