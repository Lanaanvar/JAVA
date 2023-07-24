/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rectangle;

/**
 *
 * @author lanaa
 */
public class Rectangle {

    protected double length;
    protected double breadth;
    protected double area;
    
    public Rectangle()
    {
        this.length=0;
        this.breadth=0;
        this.area=0;
    }
    public Rectangle(double l, double b)
    {
        this.length=l;
        this.breadth=b;
    }
    public double getArea()
    {
        return length*breadth;
    }
}
