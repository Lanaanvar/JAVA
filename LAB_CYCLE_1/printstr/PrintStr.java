/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.printstr;

/**
 *
 * @author lanaa
 */
public class PrintStr {

    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        String str=args[1];
        
        for(int i=0; i<n; i++)
        {
            System.out.print(str+" ");
        }
    }
}
