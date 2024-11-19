package day1;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		//add an object into the collection
		al.add(10);
		al.add(20.34);
		al.add(null);
		al.add(10);
		al.add("hello");
		System.out.println(al);
		System.out.println("used to get the object based on the index position "+al.get(4));
		System.out.println("check th index position of an object in case of duplication also "+al.indexOf(10));
		System.out.println("size of collection  ="+al.size());
		System.out.println("remave based on the index position "+al.remove(4));
		System.out.println("the object is present or not ="+al.contains(30));
		System.out.println("is check the collection is empty or not ="+al.isEmpty());
		al.clear();//it is used to remove all the object from the collection
		System.out.println("is check the collection is empty or not ="+al.isEmpty());
		

	}

}
