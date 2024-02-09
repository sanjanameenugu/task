package com.task.ui;
import com.task.bean.EmployeeBean;
import com.task.service.*;

import java.sql.SQLException;
import java.util.Scanner;


public class DemoEmployee {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("select your option");
		System.out.println("1. insert employee data");//create
		System.out.println("2. update employee data");//update
		System.out.println("3  select employee data");//read
		System.out.println("4  delete employee data");//delete
		int option=sc.nextInt();
		switch(option) {
		case 1:
		{
			insertEmployee();
			break;
		}
		case 2:
		{
			updateEmployee();
			break;
		}
		case 3:
		{
			selectEmployee();
			break;
		}
		case 4:
		{
			deleteEmployee();
			break;
		}
		default:
		{
		System.out.println("your entered option is not match");	
		}
		}
		
	}

	private static void deleteEmployee() throws ClassNotFoundException, SQLException {
		System.out.println("enter the empolyee id to delete record");
		Scanner sc=new Scanner(System.in);
		int empid=sc.nextInt();
		EmployeeServiceImpl service=new EmployeeServiceImpl();
		service.deleteEmployee(empid);
		
	}

	private static void selectEmployee() throws ClassNotFoundException, SQLException {
		System.out.println("enter the empolyee id to get results");
		Scanner sc=new Scanner(System.in);
		int empid=sc.nextInt();
		EmployeeServiceImpl service=new EmployeeServiceImpl();
		service.selectEmployee(empid);
		
	}

	private static void updateEmployee() throws ClassNotFoundException, SQLException {
		System.out.println("enter the employee id whom to update");
		Scanner sc=new Scanner(System.in);
		int empid=sc.nextInt();
		EmployeeServiceImpl service=new EmployeeServiceImpl();
		service.updateEmployee(empid);
	}

	private static void insertEmployee() throws ClassNotFoundException, SQLException {	
		EmployeeServiceImpl service=new EmployeeServiceImpl();
		EmployeeBean bean=new EmployeeBean();
		bean.setEmpid(1001);
		bean.setEmpname("ajay");
		bean.setEmpaddress("hyderabad");
		service.insertEmployee(bean);
		
	}

}
