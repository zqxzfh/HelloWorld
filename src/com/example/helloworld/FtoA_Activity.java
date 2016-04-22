package com.example.helloworld;

import com.example.helloworld.contentFragment.myButtonListner;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FtoA_Activity extends Activity  {
    private TextView myMessage;
    private Button contentFragBtn1;
	private View view;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ftoa);
		Intent intent = getIntent();
		String message = intent.getStringExtra("fanghua");
		myMessage = (TextView)findViewById(R.id.ftoa_text1);
		//Toast.makeText(this,"from f to a"+message,Toast.LENGTH_LONG).show();
		myMessage.setText("from F to A"+message);
		

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.fto_a_, menu);
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
	public void clickHandler(View source){
		Intent intent1 = new Intent(this,TabsActivity.class);
		this.startActivity(intent1);
	}
}
