package com.example.helloworld;

import java.util.ArrayList;
import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;

public class TabsActivity extends ActionBarActivity implements OnClickListener {
    private ViewPager viewPager;
    private List<Fragment> fragmentList;
    private RelativeLayout tab1,tab2,tab3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tabs);
		viewPager = (ViewPager)findViewById(R.id.viewpager);
		tab1 = (RelativeLayout)findViewById(R.id.tab1);
		tab2 = (RelativeLayout)findViewById(R.id.tab2);
		tab3 = (RelativeLayout)findViewById(R.id.tab3);
		tab1.setOnClickListener(this);
		tab2.setOnClickListener(this);
		tab3.setOnClickListener(this);

		Fragment_one fragmentOne = new Fragment_one();
		Fragment_two fragmentTwo = new Fragment_two();
		Fragment_three fragmentThree = new Fragment_three();
		fragmentList = new ArrayList<Fragment>();
		fragmentList.add(fragmentOne);
		fragmentList.add(fragmentTwo);
		fragmentList.add(fragmentThree);



		MyViewPagerAdapter viewPagerAdapter = new MyViewPagerAdapter(getSupportFragmentManager(), fragmentList);
		viewPager.setAdapter(viewPagerAdapter);
		viewPager.setCurrentItem(1);

	}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tabs, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch (arg0.getId()) {
		case R.id.tab1:
			viewPager.setCurrentItem(0);
			break;
		case R.id.tab2:
			viewPager.setCurrentItem(1);
			break;
		case R.id.tab3:
			viewPager.setCurrentItem(2);
			break;
		default:
			break;
		}
	}

}
