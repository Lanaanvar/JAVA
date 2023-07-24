/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.account;
import java.util.Scanner;

/**
 *
 * @author lanaa
 */
public class AccountMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        // Create savings account
        SavingAccount s1 = new SavingAccount("Lana", "SAV001", 2000);

        // Create current account
        CurrentAccount c1 = new CurrentAccount("Amal", "CUR001", 5000);
        
        do {
            System.out.println("Menu:");
            System.out.println("1. Deposit to Savings Account");
            System.out.println("2. Withdraw from Savings Account");
            System.out.println("3. Deposit to Current Account");
            System.out.println("4. Withdraw from Current Account");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to deposit : ");
                    double savingDeposit = sc.nextDouble();
                    s1.deposit(savingDeposit);
                    break;
                case 2:
//                    System.out.print("Enter the amount to withdraw : ");
//                    double SavWithdraw = sc.nextDouble();
                    s1.withdrawal();
                    break;
                case 3:
                    System.out.print("Enter the amount to deposit: ");
                    double currentDeposit = sc.nextDouble();
                    c1.deposit(currentDeposit);
                    break;
                case 4:
//                    System.out.print("Enter the amount to withdraw : ");
//                    double CurrWithdraw = sc.nextDouble();
                    c1.withdrawal();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        } while (choice != 5);

        sc.close();
    }

    
}
