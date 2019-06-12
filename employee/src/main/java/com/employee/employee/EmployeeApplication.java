package com.employee.employee;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.employee.dao.EntityRepository;

@SpringBootApplication
public class EmployeeApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(EmployeeApplication.class, args);
	
	EntityRepository<Employee> employeedao= ctx.getBean(EntityRepository.class);
	employeedao.save(new Employee("Zayneb","Bousselmi","female", 99));
	employeedao.save(new Employee("Basma","Bousselmi","female",  99));
	employeedao.save(new Employee("Abderrazak","Bousselmi","male",  99));
	}

}
