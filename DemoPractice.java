package basicInterviewProgames;

import java.lang.foreign.Linker.Option;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class DemoPractice {
	public static void main(String[] args) {
		// EVEN and Odd
			
//		List<Integer> listNum = Arrays.asList(1,2,3,4,5,56,67,7,8,9,9,5,18);
//		Map<String,List<Integer>> map = listNum.stream().collect(Collectors.groupingBy(n->n%2==0?"Even":"Odd"));
//		System.out.println("EvenNumber Are :"+map.get("Even"));
//		System.out.println("OddNumber Are :"+map.get("Odd"));
		
		// Fibonaccic
		
//		int n1=0,n2=1,n3,count=10;
//		System.out.print(n1+" "+n2);
//		for(int i=2;i<=count;i++) {
//			n3=n1+n2;
//			n1=n2;
//			n2=n3;
//			System.out.print(" "+n3);
		
		// LargestNumber
		
		//int a[]= {1,45,6,9,5,88,06,44,6},max=a[0];
//		for(int i=1;i<a.length;i++) {
//			if(a[i]>max) {
//				max=a[i];
//			}
//		}
//		System.out.println(max);
		
		// MINIMUM Number
		
//		int a[]= {1,45,6,9,5,88,06,44,6},min=a[0];
//		for(int i=1;i<a.length;i++) {
//			if(a[i]<min) {
//				min=a[i];
//			}
//		}
//		System.out.println(min);
		
		// PalindromeNumber
//		
//		int num=122,temp,sum=0;
//		temp=num;
//		while(num>0) {
//			sum=sum*10+num%10;
//			num=num/10;
//		}
//		String result = (temp==sum)?"palindrome":"NotAPalindrome";
//		System.out.println(sum+" is a "+result);
		
		// StarPatterns
		
//		int n=6;
//		for(int i=0;i<n;i++) {
//			for(int j=1;j<=i;j++) {
//			System.out.print("* ");
//			}
//			System.out.println();
//		}
//		for(int i=0;i<n;i++) {
//			for(int j=n;j>=i;j--) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		//PrimeNumber
		
//		int num =15,count=0;
//		for(int i =1;i<=num;i++) {
//			if(num%i==0) {
//				count++;
//			}
//		}
//		String result = (count==2)?"Prime":"NotAPrime";
//		System.out.println(num+" is a "+result);
//		
		
		//Remove Duplicates
		
		List <Integer> list =Arrays.asList(1,1,2,3,4,5,6,7,9,9,7,6,4,3,7,8);
//		list.stream().distinct().forEach(System.out::println);
//		list.stream().sorted().distinct().forEach(System.out::print);
		
		// SecondLargestNumber
		
		Optional<Integer> num=list.stream().distinct().sorted((a,b)->b-a).skip(1).findFirst();
		int SecondLargestNum=num.get();
		System.out.println(SecondLargestNum);
		
//		Integer a[]= {11,12,13,14,15,3,6,1,66,8},temp=0;
//		
//		for(int i=0;i<a.length;i++) {
//			for(int j=i+1;j<a.length;j++) {
//				if(a[i]>a[j]) {
//					temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			}
//		}
//		System.out.println(a[a.length-1]);
		
		
		//Sum Of Numbers
		
//		int sum=list.stream().reduce(0,(x,y)->x+y);
//		
//		int total=list.stream().mapToInt(Integer::intValue).sum();
//		System.out.println(sum+" "+total);
		
		// SingleTon Class
		
//		class Test{
//			private static Test t=null;
//			
//			private Test() {
//				
//			}
//			public static Test getTest() {
//				if(t==null) {
//					t=new Test();
//				}
//				return t;
//			}
//		}
//		Test t1=new Test();
//		Test t2=new Test();
//		Test t3=new Test();
//		
//		System.out.println(t1.getTest().hashCode());
//		System.out.println(t2.getTest().hashCode());
//		System.out.println(t3.getTest().hashCode());
		
		//Duplicates in String
		String s = "J a v a  D e v l o p e r ";
		s=s.replaceAll("\\s", "");
		System.out.println("Given String is :"+s);
		Map<Character, Integer> map = new HashMap<>();
		 
		
		for(int i=0;i<s.length();i++) {
			if(map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i),map.get(s.charAt(i))+1);
			}
			else
				map.put(s.charAt(i), 1);
		}
		
		System.out.println(map);
		
		
		// Reverse String
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		// Uppercase
		
		for(int i=0;i<s.length();i++){
			if(Character.isUpperCase(s.charAt(i))) {
				System.out.print(s.charAt(i)+" ");
			}
		}
	}

}
