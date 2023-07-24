/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.student;
import java.util.Scanner;

/**
 *
 * @author lanaa
 */

public class STUDENT
{
    String name;
    int rollno;
    int[] marks=new int[5];
    
    int total;
    
    public String ReadName()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name of student : ");
        this.name=sc.next();
        return name;
    }
    
    public int Readrollno()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter roll number : ");
        this.rollno=sc.nextInt();
        
        return rollno;
    }
    
    public int[] ReadMarks()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter roll numbers of 5 subjects : ");
        for(int i=0; i<5; i++)
        {
            this.marks[i]=sc.nextInt();
        }
        
        return marks;
    }
    
    public int getTotal()
    {
        this.total=0;
        
        for(int i=0; i<5; i++)
        {
            this.total+=this.marks[i];
        }
        
        return total;
    }
}