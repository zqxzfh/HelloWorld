package com.example.helloworld;

import android.R.integer;
import android.app.Activity;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class BookListFragment extends ListFragment{
    private Callbacks mCallbacks;
    
    //this fragment use this interface to communicate with its activity
    public interface Callbacks{
    	public void onItemSelected(Integer id);
    }
    @Override
    public void onCreate(Bundle savedIntanceStateBundle){
    	super.onCreate(savedIntanceStateBundle);
    	//set Adapter for this ListFragment
    	setListAdapter(new ArrayAdapter<BookContent.Book>(getActivity(),android.R.layout.simple_list_item_activated_1,android.R.id.text1,BookContent.ITEMS));
    }
    //if this Fragment is added��when show in Activity��callback this method
    @Override
    public void onAttach(Activity activity){
    	super.onAttach(activity);
    	if(!(activity instanceof Callbacks)){
    		throw new IllegalStateException(" the Activity of BookListFragment must realize Callbacks interface");
    	}
    	mCallbacks = (Callbacks)activity;
    }
    @Override
    public void onDetach(){
    	super.onDetach();
    	mCallbacks = null;
    }
   
    @Override
    public void onListItemClick(ListView listView,View view,int position,long id){
    	super.onListItemClick(listView, view, position, id);
    	//choose the onItemSeleted method of mCallbacks
    	mCallbacks.onItemSelected(BookContent.ITEMS.get(position).id);
    	
    }
    public void setActivateOnItemClick(boolean activateOnItemClick){
    	getListView().setChoiceMode(activateOnItemClick ? ListView.CHOICE_MODE_SINGLE : ListView.CHOICE_MODE_NONE);
    	
    }
	/**
	 * @param args
	 */
	

}
