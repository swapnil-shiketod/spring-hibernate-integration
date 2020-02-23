package io.swapn.dao;

import io.swapn.model.Employee;

public interface EmployeeDAO {
public String insertEmployee(Employee emp);
public Employee searchEmployee(int eno);
public String updateEmployee(Employee emp);
public String deleteEmployee(int eno);
}
