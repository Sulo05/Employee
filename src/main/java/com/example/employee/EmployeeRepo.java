package com.example.employee;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	
	@Query(value = "select * from emp where salary >= ?" , nativeQuery = true)
	public List<Employee> getByPrice(int price);
	
	@Query(value = "select name from emp " , nativeQuery = true)
	public List<String> getname();
	
	@Query(value = " select * from emp where salary =(select min(salary) from emp)" , nativeQuery = true)
	public Employee getsal();
	
	@Query(value = " select count(name) from emp" , nativeQuery = true)
	public Employee getcnt();
	
	@Query(value = " select * from emp where gender = ?" , nativeQuery = true)
	public List<Employee> getgen(String gen);
	
	@Query(value = "select name, age from emp", nativeQuery = true) 
	public List<Object> getboth();
	
	@Query(value = "select age from emp order by(age) desc", nativeQuery = true) 
	public List<Integer> getage();
	
	@Query (value = "select e from Employee e where e.age >:a")
	public List<Employee> getag(@Param("a") int a);
	
	@Query (value = "select e.name, e.salary from Employee e where e.age >:a and e.age <:b")
	public List<Object> getsa(@Param("a") int a, @Param("b") int b);
	
	@Query(value = "select e.salary from Employee e where e.salary >:a")
	public List<Employee> sal(@Param("a") int a);
	
	@Query(value = "select * from emp where salary > ? and salary < ?" , nativeQuery = true)
	public List<Employee> getbysal(int s1, int s2);
	
	
	




}
