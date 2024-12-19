package basicInterviewProgames.java8;

import java.util.Arrays;

public class SumOfListNum {
	public static void main(String[] args) {
		Integer a[]= {1,2,3,4,5,6,7,8,9,9,9};
		
		int sum = Arrays.asList(a).stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		
		int listSum = Arrays.asList(a).stream().reduce(0,(a1,b)->a1+b);
		System.out.println(listSum);
	}

}
