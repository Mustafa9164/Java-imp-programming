package proj1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
	
	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(35,56,7,34,89,90);
		List<Integer> collect = asList.stream().map((n)->n+3).collect(Collectors.toList());
		System.out.println(collect);
	}

}
