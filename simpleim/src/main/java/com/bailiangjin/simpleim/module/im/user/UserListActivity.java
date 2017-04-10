package com.bailiangjin.simpleim.module.im.user;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.bailiangjin.simpleim.R;
import com.bailiangjin.simpleim.appcommon.base.BaseActivity;
import com.kevin.baselibrary.activity.ItemClickListener;

/**
 * 用户列表页
 */
public class UserListActivity extends BaseActivity {

    public static void start(Activity activity){
        Intent intent = new Intent(activity,UserListActivity.class);
        activity.startActivity(intent);
    }


    @Override
    protected int getLayoutResId() {
        return R.layout.activity_userlist;
    }

    @Override
    protected void initIntentData(Bundle savedInstanceState) {

    }


    @Override
    protected void initView(Bundle savedInstanceState) {
        titleBarBuilder.setTitleText(getString(R.string.contacts));
        titleBarBuilder.addMenuItem("添加", new ItemClickListener() {
            @Override
            public void onClick() {
                AddFriendActivity.start(UserListActivity.this);
            }
        }).build();

    }

    @Override
    protected void initData(Bundle savedInstanceState) {

    }



}
