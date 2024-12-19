package basicInterviewProgames.java8;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;

public class SecondLargestNum {
	public static void main(String[] args) {
		List<Integer> number= Arrays.asList(1,4,7,9,2,3,73,3,6,99,7,1);
		
//		Integer sum = number.stream().reduce(0,(a,b)->a+b);
//		System.out.println(sum);
//		
//		int out = number.stream().reduce(0,(a,b)->a+b);
//		System.out.println(out);
//		System.out.println("=============");
//		int sum = number.stream().mapToInt(Integer::intValue).sum();
//		System.out.println(sum);
		
		Optional<Integer> num=number.stream().distinct().sorted((a,b)->b-a).skip(1).findFirst();
		 
		Optional<Integer> option=number.stream().distinct().sorted((a,b)->b-a).skip(1).findFirst();
		Integer secondLargest=option.get();
		System.out.println(secondLargest);
	}

	
}
