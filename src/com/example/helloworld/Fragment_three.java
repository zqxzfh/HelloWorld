package com.example.helloworld;


import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;  
import android.view.LayoutInflater;  
import android.view.View;  
import android.view.ViewGroup;  
import android.widget.Button;
import android.widget.Toast;
  
public class Fragment_three extends Fragment  
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
			Toast.makeText(getActivity(), "芳华", Toast.LENGTH_LONG).show();		
			Intent intent = new Intent(getActivity(),FtoA_Activity.class);
			intent.putExtra("fanghua","成功了");
			getActivity().startActivity(intent);
			
		}
 		
     }

  
}  
