package com.example.helloworld;

import com.example.helloworld.contentFragment.myButtonListner;

import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class NewMainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.new_activity_main);
		 Button bn1 =  (Button) findViewById(R.id.btn_add_frag1);
		 bn1.setOnClickListener(new OnClickListener(){
			 @Override
			 public void onClick(View v){
				 NewFragment1 fragment1 = new NewFragment1();  
				 addFragment(fragment1, "fragment1");  
			 }
		 });
		 Button bn2 =  (Button) findViewById(R.id.btn_add_frag2);
		 bn2.setOnClickListener(new OnClickListener(){
			 @Override
			 public void onClick(View v){
				 NewFragment2 fragment2 = new NewFragment2();  
				 addFragment(fragment2, "fragment2");  
			 }
		 });
		 Button bn3 =  (Button) findViewById(R.id.btn_remove_frag2);
		 bn3.setOnClickListener(new OnClickListener(){
			 @Override
			 public void onClick(View v){
				 removeFragment2();
			 }
		 });
		 Button bn4 =  (Button) findViewById(R.id.btn_replace_frag1);
		 bn4.setOnClickListener(new OnClickListener(){
			 @Override
			 public void onClick(View v){
				 replaceFragment1();
			 }
		 });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.new_main, menu);
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
	
	private void addFragment(Fragment fragment,String tag) {
		FragmentManager manager = getSupportFragmentManager();
		FragmentTransaction transaction = manager.beginTransaction();
		transaction.add(R.id.fragment_container, fragment,tag);
		transaction.commit();
	}
	
	private void removeFragment2() {  
	    FragmentManager manager = getSupportFragmentManager();  
	    Fragment fragment = manager.findFragmentByTag("fragment2");  
	    FragmentTransaction transaction = manager.beginTransaction();  
	    transaction.remove(fragment);  
	    transaction.commit();  
	}  
	
	private void replaceFragment1() {  
	    FragmentManager manager = getSupportFragmentManager();  
	    NewFragment2 fragment2 = new NewFragment2();  
	    FragmentTransaction transaction = manager.beginTransaction();  
	    transaction.replace(R.id.fragment_container, fragment2);  
	    transaction.commit();  
	}  
	
	
}
