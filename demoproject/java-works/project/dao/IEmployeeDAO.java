package project.dao;

import java.util.List;

import project.beans.Employee;

public interface IEmployeeDAO {
	public boolean insertEmployee(Employee employee); 
	public Employee getEmployee(int empId); 
	public boolean updateEmployee(int empId, double empSal); 
	public void deleteEmployee(int empId); 
	public List<Employee> getEmployees();
}