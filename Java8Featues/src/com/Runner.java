package com;

public class Runner {

	public static void main(String[] args) {
		FunDemo1 f1 = () -> {
			System.out.println("Hello Hi");
		};
		f1.display();

		FunDemo1 f2 = () -> {
			System.out.println("bye.....!!");
		};
		f2.display();

		FunDemo2 f3 = (x, y) -> {
			System.out.println("sum = " + (x + y));
		};
		f3.show(10, 20);

		FunDemo3 f4 = () -> "hello" + 64;
		System.out.println(f4.display());

	}

}
