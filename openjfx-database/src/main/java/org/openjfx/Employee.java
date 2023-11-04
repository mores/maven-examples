package org.openjfx;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;

	private java.time.LocalDateTime created;
	private String name;
	private double salary;
	private String deg;

	public Employee() {
		super();
		this.created = java.time.LocalDateTime.now();
	}

	public Employee(int eid, String name, double salary, String deg) {
		super();
		this.created = java.time.LocalDateTime.now();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		this.deg = deg;
	}

	public java.time.LocalDateTime getCreated() {
		return created;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDeg() {
		return deg;
	}

	public void setDeg(String deg) {
		this.deg = deg;
	}
}
