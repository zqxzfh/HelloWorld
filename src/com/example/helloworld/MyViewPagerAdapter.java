package com.example.helloworld;

import java.util.ArrayList;
import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

public class MyViewPagerAdapter extends FragmentStatePagerAdapter {
	private List<Fragment> mFragmentList;
	public MyViewPagerAdapter(FragmentManager fragmentManager, List<Fragment> mFragmentList){
		super(fragmentManager);
		this.mFragmentList = mFragmentList;
	}
	

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mFragmentList.size();
	}


	@Override
	public Fragment getItem(int arg0) {
		// TODO Auto-generated method stub
		return mFragmentList.get(arg0);
	}
	
	

}
