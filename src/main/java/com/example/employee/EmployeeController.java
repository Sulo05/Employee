package com.example.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeController {
	@Autowired
	EmployeeService es;
//	@PostMapping(value = "/update")
//	public String update(@RequestBody Employee e) {
//		return es.update(e);
//	}
//	@Autowired
	EmployeeService ev;
//	@GetMapping(value = "/get")
//	public List<Employee> get() {
//		return ev.get();
//	}
//	
//	@Autowired
//	EmployeeService ev;
//	@PostMapping(value = "/yes")
//	public String up(@RequestBody List<Employee> e) {
//		return ev.up(e);
//	}
//	
		@PutMapping(value = "/no")
	public String up( Employee e) {
		return ev.up(e);
	}
//	@GetMapping(value = "/hen/{num}")
//	public Employee get(@PathVariable int num) {
//		return ev.get(num);
//	}
//	
	
	@GetMapping(value = "/getbyprice/{price}")
	public List<Employee> getByPrice(@PathVariable int price) {
		return ev.getByPrice(price);
	}
	
//	@GetMapping(value = "/getname")
//	public List<String> getname() {
//		return ev.getname();
//	}
//	
	@GetMapping(value = "/getsal")
	public Employee getsal() {
		return ev.getsal();
	}
//	@GetMapping(value = "/getcnt")
//	public int getcnt() {
//		return ev.getcnt();
//	}
	@GetMapping(value = "/getgen/{gen}")
    public List<Employee> getgen(@PathVariable String gen) {
 	return ev.getgen(gen);
}
	@GetMapping(value = "/getboth")
    public List<Object> getboth() {
 	return ev.getboth();
}
	@GetMapping(value = "/getage")
    public List<Integer> getage() {
 	return ev.getage();
}
	
//	@GetMapping(value = "/getag/{a}")
//	public List<Employee> getag(@PathVariable int a) {
//		return ev.getag(a);
//	}
//	
	
	@GetMapping(value = "/getsa/{a}/{b}")
	public List<Object> getsa(@PathVariable int a,@PathVariable int b) {
		return ev.getsa(a,b);
	}
	
	@GetMapping("/getBySalary/{a}")
	public List<Employee> getBySalary(@PathVariable int a) {
		return ev.getBySalary(a);
	}
	
	@GetMapping("/getmax")
	public Employee getSalary() {
		return ev.getSalary();
	}
	
	@GetMapping("/getmin")
	public Employee getSal() {
		return ev.getSal();
	}
	@GetMapping("/getname")
	public List<String> getName() {
		return ev.getName();
	}
	@GetMapping("/setsal")
	public String setSalary() {
		return ev.setSalary();
	}
	@GetMapping("/getnam/{letter}")
	public List<String> getnam(@PathVariable String letter) {
		return ev.getnam(letter);
	}
//	@GetMapping("/name")
//	public List<String> name() {
//		return ev.name();
//	}

	@GetMapping(value = "/getsal/{s1}/{s2}")
	public List<Object> getsal(@PathVariable int s1,@PathVariable int s2) {
		return ev.getsa(s1,s2);
	}
	
	@GetMapping(value = "/getag/s")
	public List<Employee> getag(@PathVariable int s) throws AgeNotEligible{
			return ev.getag(s);
		}
	
	//assigning value using @value annotation
	
	@Value("${my.name}")
	String name;
	@GetMapping(value = "/getnames")
	public String getThis() {
		return name;
	}
	
	
	int age;
	@Value("${my.age}")
	public void setAge(int age) {
		this.age = age;
	}
	
	@GetMapping(value = "/getAge")
	public int getThat() {
		return age;
	}
	
	@GetMapping(value = "/getss")
	public String name(@RequestParam String user, @RequestParam int password) {
		if(user.equalsIgnoreCase("Swathy") && password == 28) {
			return "login Successfully";
		}
		else {
			return "invalid password";
		}
	}
		
	
	
	
	

}
