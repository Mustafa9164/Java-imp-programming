package com;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionRunner {

	public static void main(String[] args) {
		
		Function<Integer, String> f2=(n)->{
			if(n%2==0) {
				n=n*100;
			}else {
				n=n*200;
			}
			return "Ans :"+n;
		};
		
		BiFunction<Integer, Double,String> f3=(n1,n2)->{return n1>n2?"hello":"bye";};
		
		
		System.out.println(f2.apply(25));
		System.out.println(f2.apply(10));
		System.out.println(f3.apply(450, 449.4));
		System.out.println(f3.apply(45, 449.4));

	}

}
