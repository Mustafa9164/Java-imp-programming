package com;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerRunner {
	
	public static void main(String[] args) {
		
		Consumer c1=(n)-> {System.out.println("Hello "+n); };
		c1.accept("Rahul");
		
		Consumer c2=(n)->{System.out.println("Hello "+n);};
		c2.accept(100);
		
		Consumer c3=(n)->{System.out.println("Bye "+n);};
		c3.accept("Byeee");
		
		BiConsumer c4=(n1,n2)->{System.out.println("sum:"+n1+n2);};
		c4.accept(10, "bye");
		
		BiConsumer<Integer,Integer> c5=(n1,n2)->{System.out.println("sum:"+(n1+n2));};
		c5.accept(10, 20);
	}

}
