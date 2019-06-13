package com.employee.employee;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity 
public class Employee_Language implements Serializable {

	@Id @GeneratedValue
	private Long IdLanguage ;
	
	private String Language;
	private String Fluency ; 
	private String Competency;
	public Employee_Language(String language, String fluency, String competency) {
		super();
		Language = language;
		Fluency = fluency;
		Competency = competency;
	}
	public Employee_Language() {
		super();
		// TODO Auto-generated constructor stub
	} 
	
	
}
