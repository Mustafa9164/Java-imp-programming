package com;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateRunner {

	public static void main(String[] args) {
		
		Predicate<String> p1=(x)->x=="hello";
		System.out.println(p1.test("hi"));
		
		Predicate<Integer> p2=(x)->x>20;
		System.out.println(p2.test(12));
		System.out.println(p2.test(30));
		
		BiPredicate<Integer, Integer> p3=(n1,n2)->n1%3==0 &&n2%7==0;
		System.out.println(p3.test(6, 5));
		System.out.println(p3.test(12, 35));
		
		BiPredicate<Integer, Character> p4=(age,gen)->age>=21 && gen=='M';
		System.out.println(p4.test(24, 'M'));
		System.out.println(p4.test(21, 'F'));

	}

}