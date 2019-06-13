package com.employee.employee.dao;

import java.util.List;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.employee.employee.Employee;
//on a juste créer une interface sans une implélmentation et spring
//data va créer une implémentation de cette interface qui hérite de JPArepo
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
@Query("select e from Employee e where e.LastName like:x")
public List<Employee> employeeParLastname(@Param("x")String ln);

}
