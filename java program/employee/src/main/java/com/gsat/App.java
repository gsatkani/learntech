package com.gsat;

import com.model.Employee;
import com.service.EmployeeServiceImpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ParseException {
        Scanner scan=new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        EmployeeServiceImpl service=new EmployeeServiceImpl();
        do {
            System.out.println("Press 1 Add Employee 2.List Employee 3.Delete By Id");
            switch (scan.nextInt()){
                case 1:
                    Employee employee=new Employee();
                    employee.setId(scan.next());
                    employee.setName(scan.next());
                    employee.setMobile(scan.nextLong());
                    employee.setSalary(scan.nextDouble());
                    employee.setEmail(scan.next());

                    Date doj= simpleDateFormat.parse(scan.next());
                    employee.setDateOfJoining(doj);

                    boolean status=service.addEmployeeDetail(employee);
                    if(status){
                        System.out.println("Employee Data Added sucessfully");
                    }
                    else{
                        System.out.println("No Data Added");
                    }
                    break;
                case 2:
                    List<Employee> empList= service.getEmployeeList();
                    if(empList.isEmpty()){
                        System.out.println("Employee List is Empty");
                    }
                    else{
                        System.out.format("%s\t%s\t%s\t\t%s\t\t%s%n","Id","Name","Mobile","Salary","DateOfJoining");
                        for( Employee emp :empList){
                            System.out.format("%s\t%s\t%d\t%f\t%s%n",emp.getId(),emp.getName(),emp.getMobile(),emp.getSalary(), simpleDateFormat.format(emp.getDateOfJoining()));
                        }
                    }
                    break;
                case 3:
                    // get id
                    // service

                    break;
                default:
                    System.exit(0);
                    break;

            }
        }while(true);

    }
}
