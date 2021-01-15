package EmployeePayrollService;

public class EmployeePayrollData {
	public int id;
	public String name;
	public double salary;

	//Constructor for employee data
	public EmployeePayrollData(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	//ToString method declaration
	@Override
	public String toString() {
		return "id= " + id + ", name= " + name + ", salary= " + salary;
	}
}
