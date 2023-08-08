/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LAB_CYCLE_2.Q2;

import java.util.Scanner;

/**
 *
 * @author lanaa
 */
public class DynamicArrayMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int len=sc.nextInt();
        DynamicArray arr=new DynamicArray(len);
        arr.arrayRead();
        arr.printArray();
        arr.addElement(20, 4);
        System.out.println("\nAfter addition of element : ");
        arr.printArray();
        arr.removeElement(13);
        System.out.println("\nAfter removal of element : ");
        arr.printArray();
        arr.searchArray(24);
        arr.printArray();
    }
    
}
