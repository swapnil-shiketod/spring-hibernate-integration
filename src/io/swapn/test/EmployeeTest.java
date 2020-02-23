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
		emp.setEno(101);
		emp.setName("swapnil");
		emp.setSalary(50000);
		emp.setAddress("Barshi");
		String status = dao.insertEmployee(emp);
		System.out.println(status);
	}
}
