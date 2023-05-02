package com.tek;

import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Employee madhu=new Employee();
        //madhu.empName="Madhu";
        madhu.setEmpName("Madhu");
        //madhu.empId="UST101";
        madhu.setEmpId("UST101");
        //madhu.dateOfJoining=new Date(); // date object
        madhu.setDateOfJoining(new Date());
        //madhu.salary=30000;
        madhu.setSalary(340000);
        //madhu.phone=455454545l;
        madhu.setPhone(787878877l);
        //madhu.email="madhu@gmail.com";
        madhu.setEmail("madhu@gmail.com");

        madhu.displayEmployeeDeatils();

        Employee teja=new Employee("UST102","Teja",new Date(),35000.00,5667788990l,"teja@gamil.com");
        teja.displayEmployeeDeatils();




    }
}
