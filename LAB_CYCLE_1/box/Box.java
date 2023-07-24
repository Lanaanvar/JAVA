/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.box;

/**
 *
 * @author lanaa
 */
public class Box {

    double l, b, h, area, volume;
    
    public Box()
    {
        l=0;
        b=0;
        h=0;
        area=0;
        volume=0;
    }
    public Box(double l, double b, double h)
    {
        this.l=l;
        this.b=b;
        this.h=h;
    }
    public Box(double s1, double s2)
    {
        this.l=s1;
        this.b=s1;
        this.h=s2;
    }
    public Box(double s)
    {
        this.l=s;
        this.b=s;
        this.h=s;
    }
    public double area()
    {
        this.area=2*((l*b)+(b*h)+(h*l));
        return area;
    }
    public double volume()
    {
        this.volume=l*b*h;
        return volume;
    }
    
}
