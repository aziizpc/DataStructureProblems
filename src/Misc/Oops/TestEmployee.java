package Misc.Oops;

import java.util.ArrayList;
import java.util.List;

public class TestEmployee {

	public static void main(String[] args) {

		Employee e1 = new Employee("Tom", 10081, 67000, 35);
		Employee e2 = new Employee("James", 10054, 88000, 45);
		Employee e3 = new Employee("Ryan", 10067, 99000, 52);
		Employee e4 = new Employee("Eric", 10031, 100000, 40);
		Employee e5 = new Employee("Freddy", 10042, 60000, 25);

		// Add all the Employees to ArrayList:
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);

		System.out.println("Students count: " + employeeList.size());

		System.out.println("----------------------------------------------------------");

		// Printing Employee details with for loop
		for (Employee e : employeeList) {
			System.out.println(e);
		}

		System.out.println("----------------------------------------------------------");

		// Printing Employee details with stream()
		employeeList.stream().forEach(e -> System.out.println(e));

		System.out.println("----------------------------------------------------------");

		// Employee with Salary > 90000
		System.out.println("Employee with Salary > 90000");
		employeeList.stream().filter(e -> e.getSalary() > 90000)
				.forEach(e -> System.out.println(e.getEmployeeName() + " " + e.getEmployeeId() + " " + e.getSalary()));

		System.out.println("----------------------------------------------------------");

		System.out.println("Highest salary");
		int highestSalary = employeeList.stream().map(e -> e.getSalary()).max(Integer::compare).get();
		// Integer var = list.stream().max(Integer::compare).get(); // In the case of
		// normal ArrayList with integers
		System.out.println(highestSalary);

		System.out.println("----------------------------------------------------------");

		System.out.println("Employee with Highest salary"); // Put the above one after e.getSalary ==
		employeeList.stream()
				.filter(e -> e.getSalary() == employeeList.stream().map(f -> f.getSalary()).max(Integer::compare).get())
				.forEach(e -> System.out.println(e));
	}

}