package com.example.helloworld;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.os.Build;

public class AtoA_Activity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_ato_a_);
		
		//创建一个线性布局管理器
		LinearLayout layout = new LinearLayout(this);
		//设置该Activity显示layout
		super.setContentView(layout);
		layout.setOrientation(LinearLayout.VERTICAL);
		//创建一个textview
		final TextView show = new TextView(this);
		//创建一个按钮
		Button bn = new Button(this);
		bn.setText(R.string.ok);
		bn.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT));
		layout.addView(show);
		layout.addView(bn);
		bn.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				show.setText("HELLO,Android,"+ new java.util.Date());
			}
		});
			
		
		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ato_a_, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action barq will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_ato_a_,
					container, false);
			return rootView;
		}
	} 
	
	public class BookDetailFragment extends Fragment{
		public static final String ITEM_ID = "item_id";
		//保存该fragment显示的book对象
		BookContent.Book book;
		@Override
		public void onCreate(Bundle savedInstanceState){
			super.onCreate(savedInstanceState);
			//如果启动该Fragment时包含了ITEM_ID参数
			if(getArguments().containsKey(ITEM_ID)){
				book = BookContent.ITEM_MAP.get(getArguments().getInt(ITEM_ID));
			}
		}
		//重写该方法，该方法返回的View将作为Fragment显示的组件
		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_book_detail,
					container, false);
			if(book != null){
				//让book_title文本框显示book对象的title属性
				((TextView)rootView.findViewById(R.id.book_desc)).setText(book.desc);
				//让book_desc文本框显示book对象的desc属性
				((TextView)rootView.findViewById(R.id.book_desc)).setText(book.desc);
			}
			return rootView;
		}
		
	}
	
}
