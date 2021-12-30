package entities;

import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {

	private String name;
	private WorkerLevel level;
	private double baseSalary;
	
	private	Department department;
	
	private List<HourContract> contracts;
}
