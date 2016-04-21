package com.example.helloworld;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HelloWorldActivity extends Activity {
	@Override
	 protected void onCreate(Bundle savedInstanceState)  
    {  
        super.onCreate(savedInstanceState);  
        requestWindowFeature(Window.FEATURE_NO_TITLE);  
        setContentView(R.layout.hello_world);  
    }  
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.hello_world, menu);
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

//	private static String toHexString(byte[] bytes, String separator) { 
//		//16
//	    StringBuilder hexString = new StringBuilder(); 
//	    for (byte b : bytes) { 
//	        String hex = Integer.toHexString(0xFF & b); 
//	        if(hex.length() == 1){ 
//	            hexString.append('0'); 
//	        } 
//	        hexString.append(hex).append(separator); 
//	    } 
//	    return hexString.toString(); 
//	}
	
	
}
