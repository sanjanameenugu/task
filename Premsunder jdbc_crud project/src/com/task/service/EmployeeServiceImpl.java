package com.task.service;

import java.sql.SQLException;

import com.task.bean.EmployeeBean;
import com.task.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements IEmployeeService{

	@Override
	public void insertEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		EmployeeDaoImpl dao=new EmployeeDaoImpl();
		dao.insertEmployee(bean);
		
	}

	public void selectEmployee(int empid) throws ClassNotFoundException, SQLException {
		EmployeeDaoImpl dao=new EmployeeDaoImpl();
		dao.selectEmployee(empid);
		
	}

	public void updateEmployee(int empid) throws ClassNotFoundException, SQLException {
		EmployeeDaoImpl dao=new EmployeeDaoImpl();
		dao.updateEmployee(empid);
		
	}

	public void deleteEmployee(int empid) throws ClassNotFoundException, SQLException {
		EmployeeDaoImpl dao=new EmployeeDaoImpl();
		dao.deleteEmployee(empid);
	}}
