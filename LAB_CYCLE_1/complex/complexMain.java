/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.complex;
import java.util.Scanner;

/**
 *
 * @author lanaa
 */
public class complexMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter real part : ");
        double real1= sc.nextDouble();
        System.out.println("Enter imag part : ");
        double imag1= sc.nextDouble();
        
        Complex C1=new Complex();
        C1.setReal(real1);
        C1.getReal();
        
        C1.setImag(imag1);
        C1.getImag();
        
        C1.printComplex();
        
        Complex C2=new Complex();
        
        System.out.println("Enter real part : ");
        double real2= sc.nextDouble();
        System.out.println("Enter imag part : ");
        double imag2= sc.nextDouble();
        
        
        C2.setReal(real2);
        C2.getReal();
        
        C2.setImag(imag2);
        C2.getImag();
        
        C2.printComplex();
        
        Complex C3=complexOperations.add(C1,C2);
        C3.printComplex();
        
        Complex C4= complexOperations.multiply(C1, C2);
        C4.printComplex();
        
        double modulus=complexOperations.modulus(C1);
        System.out.print(modulus);
    }
    
}
