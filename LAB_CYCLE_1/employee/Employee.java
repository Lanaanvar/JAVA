/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employee;

/**
 *
 * @author lanaa
 */
public class Employee {

    protected String name;
    protected String code;
    protected double basic_pay;
    
    public Employee(String name, String code, double basic_pay)
    {
        this.name=name;
        this.code=code;
        this.basic_pay=basic_pay;
    }
    public void print_info()
    {
        System.out.println("Employee Name : "+name);
        System.out.println("Employee code : "+code);
        System.out.println("Basic Pay : "+basic_pay);
    }    
}

interface Salary{
    void SalaryCalc();
}

class SalarySlip extends Employee implements Salary{
    double salary, deductions;
    
    public SalarySlip(String name, String code, double basic_pay)
    {
        super(name, code, basic_pay);
        this.deductions=0;
        this.salary=0;
    }
    public void SalaryCalc(){
        deductions=0.5*basic_pay;
        salary=basic_pay-deductions;
    }
    public void print_slip()
    {
        System.out.println("Employee Salary : "+salary);
    }
}

 
