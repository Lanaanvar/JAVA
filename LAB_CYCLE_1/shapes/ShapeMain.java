/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.shapes;

/**
 *
 * @author cusat
 */


public class ShapeMain
{
    public static void main(String[] args)
    {
        Cylinder cylinder=new Cylinder(25, 5);
        double cylVol=cylinder.printVolume();
        double cylArea=cylinder.printArea();
        
        System.out.println("Cylinder-> Area : "+cylArea+" Volume: "+cylVol);
        
        Sphere sphere=new Sphere(25);
        double sphVol=sphere.printVolume();
        double sphArea=sphere.printArea();
        System.out.println("sphere-> Area : "+sphArea+" Volume: "+sphVol);
    }
}

    /**
     * @param args the command line arguments
     */
    