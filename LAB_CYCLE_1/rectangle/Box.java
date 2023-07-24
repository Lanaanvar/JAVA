/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rectangle;

/**
 *
 * @author lanaa
 */
public class Box extends Rectangle {
    protected double height;
    protected double vol;
    
    public Box()
    {
        super();
        this.height=0;
    }
    
    public Box(double l, double b, double h)
    {
        super(l,b);
        this.height=h;
    }
    public double getVol()
    {
        return length*breadth*height;
    }
}
