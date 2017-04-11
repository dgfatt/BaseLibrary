package com.bailiangjin.building.demo.dynamic;

import android.os.Bundle;
import android.os.Message;

import com.bailiangjin.building.R;
import com.bailiangjin.building.base.BaseActivity;

/**
 * Author:  liangjin.bai
 * Email: bailiangjin@gmail.com
 * Create Time: 2015/12/29 11:14
 */
public class DetailActivity extends BaseActivity{
    @Override
    protected int getLayoutResId() {
        return R.layout.activity_dynamic;
    }

    @Override
    protected void beforeViewBind(Bundle savedInstanceState) {

    }

    @Override
    protected void initView(Bundle savedInstanceState) {
//        getIntent().getStringExtra("name");

        shortToast("detail page:" + getIntent().getStringExtra("name"));

    }

    @Override
    protected void initData(Bundle savedInstanceState) {

    }



    @Override
    protected void handleMsg(Message msg) {

    }
}