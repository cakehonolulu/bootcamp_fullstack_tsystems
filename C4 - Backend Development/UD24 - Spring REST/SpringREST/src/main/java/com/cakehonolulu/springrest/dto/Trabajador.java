package com.cakehonolulu.springrest.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trabajadores")
public class Trabajador {
	
	// Enumeration with possible, available jobs
	enum jobsList {
		programmer, designer, threathunter, datascientist
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// Autoincrementable ID
	private Long id;

	@Column(name = "nombre")
	// Name of the worker
	private String name;

	@Column(name = "apellido")
	// Surname of the worker
	private String surname;

	@Column(name = "salario")
	// Salary of the worker
	private Double salary;

	@Column(name = "trabajo")
	// Worker's current job
	private jobsList job;

	/**
	 * @param name
	 * @param surname
	 * @param job
	 */
	public Trabajador(String name, String surname, jobsList job) {
		this.name = name;
		this.surname = surname;
		this.setJob(job);
	}

	/**
	 * Default constructor for Hibernate JPA beans
	 */
	public Trabajador() {
		this.name = "name";
		this.surname = "surname";
		this.job = jobsList.datascientist;
		this.salary = 0.0;
	}
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @return the salary
	 */
	public Double getSalary() {
		return salary;
	}

	/**
	 * @return the job
	 */
	public jobsList getJob() {
		return job;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	/**
	 * @param job the job to set
	 */
	public void setJob(jobsList job) {
		this.job = job;
		this.salary = calculateSalary(job);
	}
	
	/**
	 * @param currentJob The job whose's salary will get calculated from
	 * @return Double The actual calculated salary
	 */
	public Double calculateSalary(jobsList currentJob) {
		Double salary = 0.0;
		
		// Based on the job, assign different types of salary
		if (currentJob.compareTo(jobsList.programmer) == 0)
		{
			salary = 20000.00;
		}
		else
		if (currentJob.compareTo(jobsList.designer) == 0)
		{
			salary = 18000.00;
		}
		else
		if (currentJob.compareTo(jobsList.threathunter) == 0)
		{
			salary = 19000.00;
		}
		else
		if (currentJob.compareTo(jobsList.datascientist) == 0)
		{
			salary = 22000.00;
		}

		// Return the assigned value
		return salary;
	}

	/**
	 * Function that lists all the currently available jobs
	 */
	public static String listJobs() {
		StringBuilder listJobs = new StringBuilder(); 
		jobsList jobs[] = jobsList.values();

		for (int i = 0; i < jobs.length; i++) {
			listJobs.append(jobs[i]);
			
			if ((i + 1) < jobs.length) {
				listJobs.append(", ");
			}
		}
		
		return listJobs.toString();
	}

}
