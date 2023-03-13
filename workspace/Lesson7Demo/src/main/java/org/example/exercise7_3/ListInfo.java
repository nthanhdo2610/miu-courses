package org.example.exercise7_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ListInfo {
	List<String> list = new ArrayList<>();
	MyStringList strList = new MyStringList();
	public static void main(String[] args) {
		ListInfo li = new ListInfo();
		li.process();
		System.out.println(li.strList);
	}
	
	public void process() {
		list.add("A");
		list.add("W");
		list.add("K");
		list.add("C");
		
		//use java8 foreach to copy all list elements into strList
		list.forEach(
				new Consumer<String>() {
					@Override
					public void accept(String s) {
						strList.add(s);
					}
				}
		);
	}
}
