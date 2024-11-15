package proj1;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class EmployeeRunner {

	public static void main(String[] args) {
		
		List<Employee> list = EmployeeService.getAll();
		list.forEach((ele)->System.out.println(ele.getEname()));
		
		System.out.println("=========================");
		list.forEach((ele)->System.out.println(ele.getAge()));
		System.out.println("============");
		
		Consumer<Employee> c1=(c)->System.out.println(c.getEid());
		list.forEach(c1);
		System.out.println("============");
		
		Consumer<Employee> c2=(c)->System.out.println(c);
		list.forEach(c2);
		
		System.out.println("============");
		
		Predicate<Employee> p1=(e)->e.getAge()>21;
		list.forEach((ele)->{
			if(p1.test(ele)) {
				c2.accept(ele);
			}
		});
		
		
		
	}

}
