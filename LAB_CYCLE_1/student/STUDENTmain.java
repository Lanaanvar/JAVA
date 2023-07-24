/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.student;

/**
 *
 * @author lanaa
 */
public class STUDENTmain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        STUDENT s1=new STUDENT();
        
        String name=s1.ReadName();
        int roll=s1.Readrollno();
        int[] marks=s1.ReadMarks();
        int total=s1.getTotal();
        System.out.println("NAME : "+name);
        System.out.println("ROLL NO. : "+roll);
        System.out.print("MARKS : ");
        for(int i=0; i<5; i++)
        {
            System.out.println(marks[i]+", ");
        }
        System.out.println("TOTAL : "+total);
    }
    
}
