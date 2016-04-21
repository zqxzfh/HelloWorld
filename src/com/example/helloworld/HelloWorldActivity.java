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
//	public void clickHandler(View source){
//		TextView tv = (TextView)findViewById(R.id.show);
//		tv.setText("Hello Android-"+ new java.util.Date());
//		
//	}
//	private boolean checkSN(String userName,String sn){
//		try{
//			if((userName == null) || (userName.length() == 0))
//				return false;
//			if((sn == null) || (sn.length() != 16))
//				return false;
//			MessageDigest digest = MessageDigest.getInstance("MD5");
//			digest.reset();
//			digest.update(userName.getBytes());
//			byte[] bytes = digest.digest();//采用MD5对用户名进行Hash
//			String hexstr = toHexString(bytes,"");//将计算结果转换成字符串
//			StringBuilder sb = new StringBuilder();
//			for(int i=0;i<hexstr.length();i += 2 ){
//				sb.append(hexstr.charAt(i));
//			}
//			String userSN = sb.toString();//计算出的SN
//			if(!userSN.equalsIgnoreCase(sn))
//				return false;
//		}catch(NoSuchAlgorithmException e){
//			e.printStackTrace();
//			return false;
//		}
//		return true;
//	}
//	private static String toHexString(byte[] bytes, String separator) { 
//		//转为十六进制 
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
