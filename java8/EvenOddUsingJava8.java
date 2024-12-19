package basicInterviewProgames.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOddUsingJava8 {
	public static void main(String[] args) {
		
	
	List<Integer> num=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	
	Map<String,List<Integer>> result = num.stream().collect(Collectors.groupingBy(n->n%2==0?"Even":"Odd"));
	
	System.out.println("Even Numbers Are : "+result.get("Even"));
	System.out.println("Even Numbers Are : "+result.get("Odd"));
	
	int out = num.stream().reduce(0,(a,b)->a+b);
	int out1=num.stream().mapToInt(Integer::intValue).sum();

	System.out.println(out+" "+out1);
	
	}

}
