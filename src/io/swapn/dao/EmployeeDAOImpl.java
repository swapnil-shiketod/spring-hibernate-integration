package io.swapn.dao;

import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import io.swapn.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	String status="";
	private HibernateTemplate hibernateTemplate;
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	@Override
	public String insertEmployee(Employee emp) {
     Integer id=(Integer) hibernateTemplate.save(emp);
     if(id==emp.getEno()){
    	 status="success";
     }else status="failure";
     
		return status;
	}

	@Transactional
	@Override
	public Employee searchEmployee(int eno) {
		Employee emp=hibernateTemplate.get(Employee.class, eno);
		return emp;
	}

	@Transactional
	@Override
	public String updateEmployee(Employee emp) {

		return null;
	}

	@Transactional
	@Override
	public String deleteEmployee(int eno) {

		return null;
	}

}
