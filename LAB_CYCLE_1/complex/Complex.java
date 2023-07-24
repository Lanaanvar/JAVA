/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.complex;


/**
 *
 * @author lanaa
 */
class Complex{
    private double real;
    private double imag;
    
    public void setReal(double real)
    {
        this.real=real;
    }
    public double getReal()
    {
        return real;
    }
    
    public void setImag(double imag)
    {
        this.imag=imag;
    }
    public double getImag()
    {
        return imag;
    }
    
    public void printComplex()
    {
        System.out.println(real+" + "+imag+"i");
    }
}

