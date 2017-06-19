package trng.imcs.JsonApp.model;

import java.util.ArrayList;

public class Department {
	private String deptName;
	private int deptNo;
	private ArrayList<Employee> Employees;
	
	public Department(){
		
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	@Override
	public String toString() {
		return "Department [deptName=" + deptName + ", deptNo=" + deptNo + ", Employees=" + Employees + "]";
	}
	public Department(String deptName, int deptNo, ArrayList<Employee> employees) {
		super();
		this.deptName = deptName;
		this.deptNo = deptNo;
		Employees = employees;
	}
	public ArrayList<Employee> getEmployees() {
		return Employees;
	}
	public void setEmployees(ArrayList<Employee> employees) {
		Employees = employees;
	}
	

}
