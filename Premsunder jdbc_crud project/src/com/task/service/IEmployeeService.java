package com.task.service;

import java.sql.SQLException;

import com.task.bean.EmployeeBean;

public interface IEmployeeService {
    public void insertEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException;
    public void selectEmployee(int empid) throws ClassNotFoundException, SQLException;
    public void updateEmployee(int empid)throws ClassNotFoundException, SQLException;
    public void deleteEmployee(int empid)throws ClassNotFoundException, SQLException;
}
