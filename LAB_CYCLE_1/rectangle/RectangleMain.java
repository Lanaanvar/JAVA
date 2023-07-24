/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.rectangle;

/**
 *
 * @author lanaa
 */
public class RectangleMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle r=new Rectangle(5,4);
        System.out.println("Area of rectange : "+r.getArea());
        
        Box b= new Box(4,5,6);
        System.out.println("Volume of box : "+b.getVol());
    }
    
}
