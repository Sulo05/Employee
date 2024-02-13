package com.example.employee;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;


@Service

public class EmployeeService {
	@Autowired
	EmployeeDao ed;
	public List<Employee> get() {
		return ed.get();
	}
	public String up(Employee e) {
		return ed.up(e);
	}
	
	public Employee get(int num) {
		return ed.get(num);
	
	}
	public List<Employee> getByPrice(int price) {
		return ed.getByPrice(price);
	}
	//public List<String> getname() {
	//	return ed.getname();
	//}
	public Employee getsal() {
		return ed.getsal();
	}
	
//	public int getcnt() {
//		return ed.getcnt();
//	}
	public List<Employee> getgen (String gen) {
		return ed.getgen(gen);
	}
	
	public List<Object> getboth () {
		return ed.getboth();
	}
	
	public List<Integer> getage () {
		return ed.getage();
	}
	
//	public List<Employee> getag(int a) {
//		return ed.getag(a);
//	}
	public List<Object> getsa(int a, int b) {
		return ed.getsa(a,b);
	}
	public List<Employee> getBySalary(int a) {
		List<Employee> b = this.get();
		return b.stream().filter(x-> x.getSalary() >= 30000).collect(Collectors.toList());
		
	}
	public Employee getSalary() {
		List<Employee> b = this.get();
		return b.stream().max(Comparator.comparingInt(Employee :: getSalary)).get();
		
	}
	
	public Employee getSal() {
		List<Employee> b = this.get();
		return b.stream().min(Comparator.comparingInt(Employee :: getSalary)).get();
		
	}
	
	public List<String> getName() {
		List<Employee> b = this.get();
		return b.stream().filter(x -> x.getAge() > 26).map(x -> x.getName()).collect(Collectors.toList());
		
	}
	public String setSalary() {
		List<Employee> b = this.get().stream().filter(x -> x.getAge() >= 24).peek(x -> x.setSalary(x.getSalary()+(x.getSalary()*10/100))).collect(Collectors.toList());
		return "salary updated";
	}
	
	public List<String> getnam(String letter) {
		List<Employee> b = this.get();
		return b.stream().filter(x -> x.getName().contains(letter)).map(x -> x.getName()).collect(Collectors.toList());
	}
//	public List<String> name() {
//		List<Employee> b = this.get();
//		return b.getName();
//	}
//	
	
	public List<Object> getsal(int s1, int s2) {
		return ed.getsa(s1,s2);
	}
	
//	public String update(Employee e) {
//		try {
//			if(e.getAge() < 15)   {
//				throw new AgeNotEligible("Age is not Eligible");
//			}
//			else {
//				return ed.update(e);
//				
//			}
//		}
//		catch(AgeNotEligible ae) {
//			return ae.getMessage();
//		}
//		
//		}
	
	@GetMapping(value = "/getag/s")
	public List<Employee> getag(int age) throws AgeNotEligible{
		if(ed.getag(age).isEmpty()) {
			throw new AgeNotEligible("age is not present here");
		}
		else {
			return ed.getag(age);
		}
		
	}
	
	
	public List<String> getname() {
		return ed.getname();
	}
	
	
	
	
	

}
