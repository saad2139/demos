package com.revature.Homework1.Q7;

import java.util.ArrayList;
import java.util.Collections;

public class Q7 {
	// sort employees based on comparator
	public static void main(String[] args) {
		String[] names = { "Bob", "Steve" };
		String[] departments = { "Sales", "HR" };
		int[] ages = { 30, 32 };

		ArrayList<Employee> employees = new ArrayList<Employee>();

		for (int i = 0; i < 2; i++) {
			employees.add(new Employee(names[i], departments[i], ages[i]));
		}

		System.out.println("Original List: \n");
		for (int i = 0; i < employees.size(); i++) {
			System.out.println(employees.get(i).toString() + "\n");
		}

		Collections.sort(employees, Employee.EmpNameComparator);

		System.out.println("Sorted by Name List: \n");
		for (int i = 0; i < employees.size(); i++) {
			System.out.println(employees.get(i).toString() + "\n");
		}

		Collections.sort(employees, Employee.EmpDepartmentComparator);

		System.out.println("Sorted by Department List: \n");
		for (int i = 0; i < employees.size(); i++) {
			System.out.println(employees.get(i).toString() + "\n");
		}

		Collections.sort(employees, Employee.EmpAgeComparator);

		System.out.println("Sorted by Age List: \n");
		for (int i = 0; i < employees.size(); i++) {
			System.out.println(employees.get(i).toString() + "\n");
		}
	}

}