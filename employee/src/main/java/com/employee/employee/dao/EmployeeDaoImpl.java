package com.employee.employee.dao;

import java.util.List;

import javax.annotation.ManagedBean;
import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;



import org.springframework.stereotype.Repository;

import com.employee.employee.Employee;
// pour que spring instancie la classe EmployeeDaoImpl(injection de dependance) @repository
@Repository
@Transactional

public class EmployeeDaoImpl implements EntityRepository<Employee>{
	@PersistenceContext
	private EntityManager em ;

	@Override
	public Employee save(Employee p) {
		em.persist(p);
		return p;
	}

	@Override
	public List<Employee> findAll() {
		javax.persistence.Query req = em.createQuery("select p from Employee");


		return req.getResultList();
	}

	@Override
	public Employee findOne(Long emplyeeId) {
		Employee p =em.find(Employee.class, emplyeeId);


		return p;
	}

	@Override
	public Employee update(Employee p) {
		em.merge(p)		;
		return p;
	}

	@Override
	public void delete(Long emplyeeId) {
		// TODO Auto-generated method stub

	}

}