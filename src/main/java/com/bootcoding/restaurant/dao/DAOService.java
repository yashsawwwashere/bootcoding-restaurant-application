package com.bootcoding.restaurant.dao;

import java.sql.*;

public class DAOService {
    public static void main(String[] args) {
        DAOService d=new DAOService();
        d.getEmp();
    }
    public void getEmp(){
       try{
            Class.forName("org.postgresql.Driver");

            Connection con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                "postgres","postgres");
            Statement stmt=con.createStatement();
           ResultSet resultSet = stmt.executeQuery("select * from emp where deptno in(10,20)");
           while(resultSet.next()){
               String ename = resultSet.getString("ename");
               String job = resultSet.getString("job");
               int managerId = resultSet.getInt("manager");
               int empNumber = resultSet.getInt("empno");
               int salary = resultSet.getInt("sal");
               int commission = resultSet.getInt("comm");
               int deptNo = resultSet.getInt("deptno");
               System.out.println("****************************************");

               System.out.println("Employee Name : "+ename);
               System.out.println("Employee Manager No : "+managerId);
               System.out.println("Employee Employee No : "+empNumber);
               System.out.println("Employee Salary : "+salary);
               System.out.println("Employee Commission : "+commission);
               System.out.println("Employee Dept No : "+deptNo);
               System.out.println("Employee Job : "+ job);
           }

       }catch(Exception ex){
          ex.getStackTrace();
      }
    }

    //getEmployeeBySalary(){}


}
