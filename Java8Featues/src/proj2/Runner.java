package proj2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Runner {

	public static void main(String[] args) {
		List<Employee> list = EmployeList.getAll();
		
		
		//converting ename int
		List<Employee> collect = list.stream().map((obj)->{
			obj.setName(obj.getName().toUpperCase());
			return obj;
		}).collect(Collectors.toList());
		
		collect.forEach(ele->System.out.println(ele));
		System.out.println("====================");
		
		Map<Integer, Double> collect2 = list.stream().map((obj)->{
			obj.setName(obj.getName().toUpperCase());
			obj.setSalary(obj.getSalary()+10000);
			return obj;
		}).collect(Collectors.toMap(obj->obj.getId(), obj->obj.getSalary()));
		System.out.println(collect2);
		
		list.stream().filter((e)->e.getAge()>25).forEach((ele)->System.out.println(ele));
	}

}
