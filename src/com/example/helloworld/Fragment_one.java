package com.example.helloworld;


import android.support.v4.app.Fragment; 
import android.content.Intent;
import android.os.Bundle;  
import android.view.LayoutInflater;  
import android.view.View;  
import android.view.ViewGroup;  
import android.widget.Button;
import android.widget.Toast;
  
public class Fragment_one extends Fragment  
{  
	private Button contentFragBtn;
	private View view;
    @Override  
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  
            Bundle savedInstanceState)  
    {  
        view = inflater.inflate(R.layout.fragment_content, container, false);
        contentFragBtn =  (Button) view.findViewById(R.id.contentFragBtn);
    	contentFragBtn.setOnClickListener(new myButtonListner());
        return view;  
       
    }  
    class myButtonListner implements View.OnClickListener{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Toast.makeText(getActivity(), "fanghua", Toast.LENGTH_LONG).show();		
			Intent intent = new Intent(getActivity(),NewMainActivity.class);
			intent.putExtra("fanghua","success");
			getActivity().startActivity(intent);
			
		}
 		
     }

  
}  
