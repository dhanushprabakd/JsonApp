package trng.imcs.JsonApp.model;

import java.util.ArrayList;

public class Employee {
	private int empNumber;
	private String employeeName;
	private ArrayList<Address> addresses;
	public int getEmpNumber() {
		return empNumber;
	}
	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [empNumber=" + empNumber + ", employeeName=" + employeeName + ", addresses=" + addresses
				+ ", salary=" + salary + "]";
	}
	public Employee(int empNumber, String employeeName, ArrayList<Address> addresses, double salary) {
		super();
		this.empNumber = empNumber;
		this.employeeName = employeeName;
		this.addresses = addresses;
		this.salary = salary;
	}
	public ArrayList<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(ArrayList<Address> addresses) {
		this.addresses = addresses;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	private double salary;

}
