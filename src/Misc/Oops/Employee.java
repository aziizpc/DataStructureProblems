package Misc.Oops;

public class Employee {
	
	private String employeeName;
	private int employeeId;
	private int salary;
	private int age;
	
	public Employee(String employeeName, int employeeId, int salary, int age) {
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.salary = salary;
		this.age = age;
	}

	public String getEmployeeName() {	// Getter function
		return employeeName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public int getSalary() {
		return salary;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {	// This is generated. With this 'for loop' print works.
		return "Employee [employeeName=" + employeeName + ", employeeId=" + employeeId + ", salary=" + salary + ", age="
				+ age + "]";
	}	
	
}