package com.example.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class EmployeeDao {
	@Autowired
	EmployeeRepo er;
	public String up(Employee e) {
		er.save(e);
		return "Saved";
	}

	public Employee get(int num) {
		return er.findById(num).get();
		
	}
	public List<Employee> get() {
		return er.findAll();
	}
    public List<Employee> getByPrice(int price) {
    	return er.getByPrice(price);
    }

    public Employee getsal() {
    	return er.getsal();
    }
    public List<Employee> getgen(String gen) {
    	return er.getgen(gen);
    }
    public List<Object> getboth() {
    	return er.getboth();
    }
    public List<Integer> getage() {
    	return er.getage();
    }
    public List<Employee> getag(int a) {
    	return er.getag(a);
    }
    public List<Object> getsa(int a, int b) {
    	return er.getsa(a,b);
    }
    public List<Employee> sal(int a) {
    	return er.sal(a);
    }
    
    public List<Object> getsal(int s1, int s2) {
    	return er.getsa(s1,s2);
    }
    
    public List<String> getname() {
		return er.getname();
	}
	
    


    
    

}
