package proj2;

import java.util.Arrays;
import java.util.List;

public class EmployeList {
	
	public static  List<Employee> getAll(){
		Employee e1=new Employee(1, "rohit", 34, 800000);
		Employee e2=new Employee(2, "virat", 24, 700000);
		Employee e3=new Employee(3, "dhoni", 54, 500000);
		Employee e4=new Employee(4, "gam", 74, 300000);
		Employee e5=new Employee(5, "abd", 34, 200000);
		Employee e6=new Employee(6, "pandya", 32, 10000);
		return (List<Employee>) Arrays.asList(e1,e2,e3,e4,e5,e6);
	}


}
