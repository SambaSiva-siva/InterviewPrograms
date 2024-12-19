package basicInterviewProgames.java8;

import java.lang.foreign.Linker.Option;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Employee {
	
	public static void main(String[] args) {
		
		List<EmpDetails> list = Arrays.asList(
				new EmpDetails(1, "101", "Samba", 50000),
				new EmpDetails(2, "102", "Krishna", 95000),
				new EmpDetails(3, "103", "RamKrishna", 50000),
				new EmpDetails(4, "104", "Lokesh", 100000),
				new EmpDetails(5, "105", "Kiran", 100000)
				);
		//Count the No Of Emp
		long totalCountEmp=list.stream().count();
		System.out.println("Total Count Of Employees are :"+totalCountEmp);
		//Calculate the Total Salary
		double totalSalary =list.stream().mapToDouble(EmpDetails::getEmpSalary).sum();
		System.out.println("Total Salary of Employees are :"+totalSalary);
		//Find the HighestSalary
		Optional<EmpDetails> maxSalaryinEmpList = list.stream()
													.max(Comparator.comparingDouble(EmpDetails::getEmpSalary));
		System.out.println("The maximum salary is :"+maxSalaryinEmpList.map(EmpDetails::getEmpName).orElse("N/A"));
		Optional<EmpDetails>minimamsalary =list.stream().min(Comparator.comparingDouble(EmpDetails::getEmpSalary));
		System.out.println("The minimum salary is :"+minimamsalary.map(EmpDetails::getEmpName).orElse("N/A"));
		//Average salary
		OptionalDouble avgSalary =list.stream().mapToDouble(EmpDetails::getEmpSalary).average();
		System.out.println("Average salary is :"+avgSalary.getAsDouble());
		//GreterThan > 50000
		List<EmpDetails> highEarner=list.stream().filter(e->e.getEmpSalary()>50000).collect(Collectors.toList());
		System.out.println("Employee is >50000 list is :"+highEarner.stream().map(EmpDetails::getEmpName).collect(Collectors.joining(", ")));
		//sorting Order
		List<EmpDetails>  sortedBysalary =list.stream().sorted(Comparator.comparingDouble(EmpDetails::getEmpSalary).reversed()).collect(Collectors.toList());
		System.out.println("sorting By Salary is :"+sortedBysalary.stream().map(EmpDetails::getEmpName).collect(Collectors.joining(", ")));
		List<EmpDetails> sortedByNames =list.stream().sorted(Comparator.comparing(EmpDetails::getEmpName).reversed())
										.collect(Collectors.toList());
		System.out.println("Custmized sorting Order :"+sortedByNames.stream().map(EmpDetails::getEmpId).collect(Collectors.joining(", ")));
	}}
	
	
	
	
	

