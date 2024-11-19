package proj1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo {
	
	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(35,56,7,34,89,90);
		List<Integer> collect = asList.stream().map((n)->n+3).collect(Collectors.toList());
		System.out.println(collect);
		
		List<Integer> collect2 = asList.stream().map((s)->s+10).collect(Collectors.toList());
		System.out.println(collect2);
		
		List<String> names = Arrays.asList("virat","rohit","dhoni","gambhir","sachin");
		
		Map<Character, String> name = names.stream().map((s)->s.toLowerCase()).collect(Collectors.toMap((s)->s.charAt(0), s->s));
		System.out.println(name);
	}

}
