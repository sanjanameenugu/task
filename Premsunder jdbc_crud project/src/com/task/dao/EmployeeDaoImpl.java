package com.task.dao;
import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.task.bean.EmployeeBean;
import com.task.util.EmployeeUtil;

public class EmployeeDaoImpl implements IEmployeeDao{
	public static PreparedStatement pst=null;
	

	@Override
	public void insertEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {		
		int empId=bean.getEmpid();
		String empName=bean.getEmpname();
		String empAddress=bean.getEmpaddress();
		 Connection connection=EmployeeUtil.getDBConnection();
		 pst=connection.prepareStatement("insert into emp values(?,?,?)");
		 pst.setInt(1, empId);
		 pst.setString(2, empName);
		 pst.setString(3, empAddress);
		  pst.executeUpdate();
		  System.out.println("insert one record successfully");
		  
	}

 
	public void selectEmployee(int empid) throws ClassNotFoundException, SQLException {
		Connection connection=EmployeeUtil.getDBConnection();
		pst=connection.prepareStatement("select * from emp where empid=?");
		pst.setInt(1, empid);
		ResultSet rs=pst.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		
	}


	public void updateEmployee(int empid) throws ClassNotFoundException, SQLException {
		Connection connection=EmployeeUtil.getDBConnection();
		pst=connection.prepareStatement("select * from emp where empid=?");
		pst.setInt(1, empid);
		ResultSet rs=pst.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		System.out.println("what do you want to update name or address");
		Scanner sc=new Scanner(System.in);
		String value=sc.next();
		if(value.equals("name"))
		{
			System.out.println("enter the updated name");
			String nw=sc.next();
			pst=connection.prepareStatement("update emp set empname='"+nw+"'where empid="+empid);
			pst.executeUpdate();
			System.out.println("updated");
		}
		else if(value.equals("address"))
		{
			System.out.println("enter the updated address");
			String nw=sc.next();
			pst=connection.prepareStatement("update emp set empaddress='"+nw+"'where empid="+empid);
			pst.executeUpdate();
			System.out.println("updated");
			
		}
		else {
			System.out.println("invalid entery");
		}
		
		
	}


	public void deleteEmployee(int empid) throws ClassNotFoundException, SQLException {
		Connection connection=EmployeeUtil.getDBConnection();
		pst=connection.prepareStatement("select * from emp where empid=?");
		pst.setInt(1, empid);
		ResultSet rs=pst.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		System.out.println("deleting above records");
		pst=connection.prepareStatement("delete from emp where empid="+empid);
		pst.execute();
		System.out.println("deleted succesfully");
		
	}
}


