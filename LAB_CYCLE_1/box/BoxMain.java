/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.box;

/**
 *
 * @author lanaa
 */
public class BoxMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Box b1=new Box(5);
        System.out.println("Cube -> volume : "+b1.volume()+" area : "+b1.area());
        
        Box b2=new Box(10,20);
        System.out.println("Square Prism -> volume : "+b2.volume()+" area : "+b2.area());
        
        Box b3=new Box(3,4,5);
        System.out.println("Reactangular Prism -> volume : "+b3.volume()+" area : "+b3.area());
    }
    
}
