/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.finalizemethod;

/**
 *
 * @author lanaa
 */
public class FinalizeMethod {
    
    int a,b,c;

    public FinalizeMethod(int a, int b, int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    
    public void printProduct()
    {
        System.out.println("Product : "+(a*b*c));
    }
    public void finalize()
    {
        System.out.println("Garbage collected");
    }
}
