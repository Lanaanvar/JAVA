/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.finalizemethod;

/**
 *
 * @author lanaa
 */
public class FinalizeMethodMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FinalizeMethod fm1= new FinalizeMethod(2,3,4);
        FinalizeMethod fm2= new FinalizeMethod(1,3,5);
        fm1.printProduct();
        fm2.printProduct();
        fm1=null;
        System.gc();
    }
    
}
