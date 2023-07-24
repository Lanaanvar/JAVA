/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.primenum;

/**
 *
 * @author lanaa
 */
public class PrimeNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        int count=0;
        int num=2;
        
        while(count<n)
        {
            if(CheckPrime(num)==true)
            {
                System.out.print(num+" ");
                count++;
            }
            num++;
        }
    }
    
    public static boolean CheckPrime(int num)
    {
        for(int i=2; i<num/2; i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
    
}
