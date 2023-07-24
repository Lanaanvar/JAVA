/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.shapes;

/**
 *
 * @author cusat
 */
public interface Shapes {

    
    double printVolume();
    double printArea();
}

class Cylinder implements Shapes
{
    double rad;
    double height;
    
    public Cylinder()
    {
        rad=0;
        height=0;
    }
    public Cylinder(double num1, double num2)
    {
        rad=num1;
        height=num2;
    }
    @Override
    public double printVolume(){
        return 3.14*rad*rad*height;
    }
    public double printArea(){
        return 2*3.14*rad*(rad+height);
    }
}

class Sphere implements Shapes
{
    double rad;
    
    public Sphere()
    {
        rad=0;
    }
    public Sphere(double num1)
    {
        rad=num1;
    }
    public double printVolume()
    {
        return (4/3)*3.14*rad*rad*rad;
    }
    public double printArea()
    {
        return 4*3.14*rad*rad;
    }
    
}
