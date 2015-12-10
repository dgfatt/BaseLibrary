package com.kevin.building.ui.activity;

import android.os.Bundle;
import android.os.Message;
import android.view.View;

import com.kevin.building.R;
import com.kevin.building.base.BaseActivity;

/**
 * 注册
 */
public class RegistActivity extends BaseActivity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

	}

	@Override
	protected void initView() {
		titleView.setTitleText(getString(R.string.register));
		titleView.setRightBtnVisibility(View.GONE);
		findViewById(R.id.btn_regist).setOnClickListener(this);
	}

	@Override
	protected void initLogic() {

	}


	@Override
	protected int getLayoutResId()
	{
		return R.layout.activity_regist;
	}

	@Override
	protected void handleMsg(Message msg)
	{
		// TODO Auto-generated method stub

	}

	@Override
	protected void onViewClick(View v)
	{
		switch (v.getId())
		{
			case R.id.btn_regist:
				show("点击了注册");

				break;

			default:
				break;
		}

	}

}