package com.lti.training.collection;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		List Mylist= new ArrayList();
		Mylist.add("dhanshree");
		Mylist.add("shikha");
		Mylist.add(0,"dikshita");
		/*Mylist.add(10);
		Mylist.add(5);
		Mylist.add(8);*/
		
		System.out.println(Mylist);
		Iterator iter= Mylist.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
			
		}
		
		
		
		Collections.sort(Mylist);
		System.out.println("Sorted List \n"+Mylist);
		
		while(iter.hasNext())
		{
			String x=(String) iter.next();
			if (x.equalsIgnoreCase("shikha") )
			iter.remove();
			System.out.println(Mylist);
		}
		
		
	}

}
