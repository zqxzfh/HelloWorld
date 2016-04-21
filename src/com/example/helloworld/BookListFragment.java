package com.example.helloworld;

import android.R.integer;
import android.app.Activity;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class BookListFragment extends ListFragment{
    private Callbacks mCallbacks;
    //����һ���ص��ӿڣ���fragment����Activity��Ҫʵ�ָýӿ�
    //��fragment��ͨ���ýӿ��������ڵ�Activity����
    public interface Callbacks{
    	public void onItemSelected(Integer id);
    }
    @Override
    public void onCreate(Bundle savedIntanceStateBundle){
    	super.onCreate(savedIntanceStateBundle);
    	//Ϊ��ListFragment����Adapter
    	setListAdapter(new ArrayAdapter<BookContent.Book>(getActivity(),android.R.layout.simple_list_item_activited_1,android.R.id.text1,BookContent.ITEMS));
    }
    //����Fragment����ӣ���ʾ��Activityʱ���ص��÷���
    @Override
    public void onAttach(Activity activity){
    	super.onAttach(activity);
    	//���Activityû��ʵ��Callbacks�ӿڣ��׳��쳣
    	if(!(activity instanceof Callbacks)){
    		throw new IllegalStateException("BookListFragment���ڵ�Activity����ʵ��Callbacks�ӿ�");
    	}
    	//�Ѹ�Activity����Callbacks����
    	mCallbacks = (Callbacks)activity;
    }
    //����Fragment����������Activity�б�ɾ��ʱ�ص��÷���
    @Override
    public void onDetach(){
    	super.onDetach();
    	//��mCallbacks��Ϊnull
    	mCallbacks = null;
    }
    //���û�����ĳ�б���ʱ�����ûص�����
    @Override
    public void onListItemClick(ListView listView,View view,int position,long id){
    	super.onListItemClick(listView, view, position, id);
    	//����mCallbacks��onItemSeleted����
    	mCallbacks.onItemSelected(BookContent.ITEMS.get(position).id);
    	
    }
    public void setActivateOnItemClick(boolean activateOnItemClick){
    	getListView().setChoiceMode(activateOnItemClick ? ListView.CHOICE_MODE_SINGLE : ListView.CHOICE_MODE_NONE);
    	
    }
	/**
	 * @param args
	 */
	

}
