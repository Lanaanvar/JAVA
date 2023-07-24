/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.complex;
//import static com.mycompany.complex.Complex.imag;
//import static com.mycompany.complex.Complex.real;
import java.lang.Math;
/**
 *
 * @author lanaa
 */
class complexOperations {
    public static Complex add(Complex c1, Complex c2) {
        Complex c = new Complex();
        c.setReal(c1.getReal()+c2.getReal());
        c.setImag(c1.getImag()+c2.getImag());
        return c;
//        System.out.println(c.getReal()+" + "+ c.getImag()+" i ");
    }
    public static Complex multiply(Complex c1, Complex c2)
    {
        Complex c = new Complex();
        double real=(c1.getReal()*c2.getReal())-(c1.getImag()*c2.getImag());
        c.setReal(real);
        double imag=(c1.getReal()*c2.getImag())+(c2.getReal()*c1.getImag());
        c.setImag(imag);
        return c;
    }
    public static double modulus(Complex c)
    {
        double mod=0;
        mod=(c.getReal()*c.getReal())+((c.getImag()*c.getImag()));
        mod=Math.sqrt(mod);
        
        return mod;
    }
}
