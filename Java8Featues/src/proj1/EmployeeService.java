package proj1;

import java.util.Arrays;
import java.util.List;

public class EmployeeService {
	
	public static List<Employee> getAll(){
		Employee e1=new Employee(1, "ajju", "engg", 30000.00, 28, Arrays.asList("java,spring,hibernate"));
		Employee e2=new Employee(365,"def","dev",54521, 27,Arrays.asList("Java","c++","Git","django"));
		Employee e3=new Employee(456,"ghi","test",23564.56, 22,Arrays.asList("Zest","Sel"));
		Employee e4=new Employee(789,"klmn","dev",56231, 23,Arrays.asList("Java","Python","Git","Spring"));
		Employee e5=new Employee(741,"opq","test",42631.56, 33,Arrays.asList("Sel","Jsunit"));
		Employee e6=new Employee(963,"rst","test",58632.56, 21,Arrays.asList("Sel","Zest","Junit"));
		return Arrays.asList(e1,e2,e3,e4,e5,e6);
	}

}
