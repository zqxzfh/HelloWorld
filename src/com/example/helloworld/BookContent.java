package com.example.helloworld;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookContent {

	/**
	 * @param args
	 */
	public static class Book{
		public Integer id;
		public String title;
		public String desc;
		public Book(Integer id,String title,String desc){
			this.id = id;
			this.title = title;
			this.desc = desc;
		}
		@Override
		public String toString(){
			return title;
		}
	}
		//ʹ��List���ϼ�¼ϵͳ��������Book����
		public static List<Book> ITEMS = new ArrayList<Book>();
		//ʹ��Map���ϼ�¼ϵͳ��������Book����
		public static Map<Integer, Book> ITEM_MAP = new HashMap<Integer,Book>();
		static{
			//ʹ�þ�̬��ʼ�����룬��book������ӵ�List���ϣ�map������
			addItem(new Book(1, "���java����", "һ��ȫ�������javaѧϰͼ�飬�ѱ���Ҹ�Уѡ���̲ġ�"));
			addItem(new Book(2,"���Android����","Androidѧϰ�ߵ���ѡͼ�飬����ռ�ݾ�����������"+"����ѷ3����վAndroid�������а���װ�"));
			addItem(new Book(3, "������java EE��ҵӦ��ʵս", "ȫ�����java EE������Struts 2��Spring 3,Hibernate 4 ���"));
		}
		private static void addItem(Book book){
			ITEMS.add(book);
			ITEM_MAP.put(book.id, book);
		}
	}


