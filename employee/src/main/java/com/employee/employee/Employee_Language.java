package com.employee.employee;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity 
public class Employee_Language implements Serializable {

	@Id @GeneratedValue
	private Long IdLanguage ;
	
	private String Language;
	private String Fluency ; 
	private String Competency;
	
	@OneToMany(mappedBy="id_Language",fetch=FetchType.LAZY)
	private Collection<Employee> employees;
	public Long getIdLanguage() {
		return IdLanguage;
	}
	public void setIdLanguage(Long idLanguage) {
		IdLanguage = idLanguage;
	}
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language) {
		Language = language;
	}
	public String getFluency() {
		return Fluency;
	}
	public void setFluency(String fluency) {
		Fluency = fluency;
	}
	public String getCompetency() {
		return Competency;
	}
	public void setCompetency(String competency) {
		Competency = competency;
	}
	public Collection<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Collection<Employee> employees) {
		this.employees = employees;
	}
	public Employee_Language(String language) {
		super();
		Language = language;
	}
	public Employee_Language() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}