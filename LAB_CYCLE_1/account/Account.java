/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.account;
import java.util.Scanner;

/**
 *
 * @author lanaa
 */
abstract public class Account {

    String name;
    String accNo;
    double bal;
    
//    public Account()
//    {
//        this.name="";
//        this.accNo=0;
//        this.bal=0;
//    }
    
    public Account(String name, String accNo, double bal)
    {
        this.name=name;
        this.accNo=accNo;
        this.bal=bal;
    }
    public void deposit(double b)
    {
        this.bal=this.bal+b;
        System.out.println("Current Balance in bank : "+bal);
    }
    abstract void withdrawal();
}

class SavingAccount extends Account
{
    public SavingAccount(String name, String accNo, double bal)
    {
        super(name, accNo, bal);
    }
    @Override
    public void withdrawal()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter amount to withdraw : ");
        double w=sc.nextDouble();
        
        if(this.bal<1000)
        {
            System.out.println("Balance is less than Rs. 1000. Withdrawal not possible. ");
        }
        else
        {
            this.bal=this.bal-w;
        }
        
        System.out.println("Current balance : "+bal);
    }
}

class CurrentAccount extends Account
{
    public CurrentAccount(String name, String accNo, double bal)
    {
        super(name, accNo, bal);
    }
    @Override
    public void withdrawal()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter amount to withdraw : ");
        double w=sc.nextDouble();
        
        if(bal<w)
        {
            System.out.println("Balance is less than Rs. 1000. Withdrawal not possible. Overdraft transaction on the way. ");
            w=0.05*bal;
            bal=bal-w;
        }
        else
        {
            bal=bal-w;
        }
        
        System.out.println("Current balance : "+bal);
        
    }
}
