package LAB_CYCLE_2.Q4;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author lanaa
 */
class Emp{

    String EmpId, EmpName;
    double salary;
    
    public Emp()
    {
        EmpId=EmpName="";
        salary=0;
    }
    
    public void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of employee : ");
        EmpName=sc.nextLine();
        System.out.println("Enter employee ID : ");
        EmpId=sc.nextLine();
        System.out.println("Enter salary : ");
        salary=sc.nextDouble();
    }
    
    class EmpDate{
        String EmpDOB;
        String EmpDOJ;
        
        public void read()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter DOB of employee : ");
            EmpDOB=sc.nextLine();
            System.out.println("Enter date of joining : ");
            EmpDOJ=sc.nextLine();
        }
        
    }
}

class EmployeeList{
    int count;
    Emp[] employee;
    Emp.EmpDate[] empDate;
    
    public EmployeeList(int count)
    {
        this.count=count;
        employee=new Emp[count];
        empDate=new Emp.EmpDate[count];
    }
    
    public void readList()
    {
        for(int i=0; i<count; i++)
        {
            employee[i]=new Emp();
            employee[i].read();
            empDate[i]=employee[i].new EmpDate();
            empDate[i].read();
        }
    }
    public void sortList()
    {
        for(int i=0; i<count; i++)
        {
            Emp temp=employee[i];
            int j=i-1;
            
            while(j>=0 && temp.salary>employee[j].salary)
            {
                employee[j+1]=employee[j];
                j--;
            }
            employee[j+1]=temp;
        }
    }
    public void display()
    {
        System.out.println("\n");
        
        for (int k=0; k<count; k++)
        {
            
            System.out.println("EMPLOYEE NAME : "+employee[k].EmpName);
            System.out.println("EMPLOYEE ID : "+employee[k].EmpId);
            System.out.println("EMPLOYEE SALARY : "+employee[k].salary);
            System.out.println("EMPLOYEE DOB : "+empDate[k].EmpDOB);
            System.out.println("EMPLOYEE DOJ : "+empDate[k].EmpDOJ);
            
            System.out.println("\n");
        }
    }
    
}
public class EMPLOYEE{
    public static void main(String[] args) {
        EmployeeList empList=new EmployeeList(3);
        empList.readList();
        empList.sortList();
        empList.display();
    }
}
