/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.employee;

/**
 *
 * @author lanaa
 */
public class EmployeeMain{
    public static void main(String[] args){
        SalarySlip employee=new SalarySlip("Lana", "AB43GT", 20000);
        employee.print_info();
        employee.SalaryCalc();
        employee.print_slip();
    }
}
       
