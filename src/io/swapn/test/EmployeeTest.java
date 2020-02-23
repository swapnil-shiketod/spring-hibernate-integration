package io.swapn.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.swapn.dao.EmployeeDAO;
import io.swapn.model.Employee;

public class EmployeeTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDAO dao = (EmployeeDAO) context.getBean("empDao");
		Employee emp = new Employee();
		emp.setEno(105);
		emp.setName("smith");
		emp.setSalary(20000);
		emp.setAddress("Barshi");
		String status = dao.insertEmployee(emp);
		System.out.println("Employee save "+status+"with id - "+emp.getEno());
		
		System.out.println("search result...");
		Employee employee=dao.searchEmployee(101);
		System.out.println(employee);
	}
}
