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
		
		//����һ�����Բ��ֹ�����
		LinearLayout layout = new LinearLayout(this);
		//���ø�Activity��ʾlayout
		super.setContentView(layout);
		layout.setOrientation(LinearLayout.VERTICAL);
		//����һ��textview
		final TextView show = new TextView(this);
		//����һ����ť
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
		//�����fragment��ʾ��book����
		BookContent.Book book;
		@Override
		public void onCreate(Bundle savedInstanceState){
			super.onCreate(savedInstanceState);
			//���������Fragmentʱ������ITEM_ID����
			if(getArguments().containsKey(ITEM_ID)){
				book = BookContent.ITEM_MAP.get(getArguments().getInt(ITEM_ID));
			}
		}
		//��д�÷������÷������ص�View����ΪFragment��ʾ�����
		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_book_detail,
					container, false);
			if(book != null){
				//��book_title�ı�����ʾbook�����title����
				((TextView)rootView.findViewById(R.id.book_desc)).setText(book.desc);
				//��book_desc�ı�����ʾbook�����desc����
				((TextView)rootView.findViewById(R.id.book_desc)).setText(book.desc);
			}
			return rootView;
		}
		
	}
	
}
