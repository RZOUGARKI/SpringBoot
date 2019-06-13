package com.employee.employee;



import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.employee.employee.dao.EmployeeRepository;



@SpringBootApplication
public class EmployeeApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(EmployeeApplication.class, args);
	
		EmployeeRepository employeedao= ctx.getBean(EmployeeRepository.class);
		
	employeedao.save(new Employee("Zayneb","Bousselmi","female", 99));
	employeedao.save(new Employee("Basma","Bousselmi","female",  99));
	employeedao.save(new Employee("Abderrazak","Bousselmi","male",  99));
	List<Employee> emp1 = employeedao.employeeParLastname("Bousselmi");
for(Employee e:emp1)
{System.out.println(e.getLastName());
System.out.println(e.getName());
System.out.println(e.getGender());

}
}}
