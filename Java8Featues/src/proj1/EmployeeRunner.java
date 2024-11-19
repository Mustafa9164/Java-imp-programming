package proj1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeRunner {

	public static void main(String[] args) {
		
		List<Employee> list = EmployeeService.getAll();
		
		Comparator<Employee> com=(obj1,obj2)->obj1.getAge()-obj2.getAge();
		Collections.sort(list,com);
		list.forEach(ele->System.out.println(ele));
		
//		list.forEach((ele)->System.out.println(ele.getEname()));
//		
//		System.out.println("=========================");
//		list.forEach((ele)->System.out.println(ele.getAge()));
//		System.out.println("============");
//		
//		Consumer<Employee> c1=(c)->System.out.println(c.getEid());
//		list.forEach(c1);
//		System.out.println("============");
//		
//		Consumer<Employee> c2=(c)->System.out.println(c);
//		list.forEach(c2);
//		
//		System.out.println("============");
//		
//		Predicate<Employee> p1=(e)->e.getAge()>21;
//		list.forEach((ele)->{
//			if(p1.test(ele)) {
//				c2.accept(ele);
//			}
//		});
		
		
		
	}

}
