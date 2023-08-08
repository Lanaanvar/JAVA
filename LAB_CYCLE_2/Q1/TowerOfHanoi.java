/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_CYCLE_2.Q1;

/**
 *
 * @author lanaa
 */
public class TowerOfHanoi {
    void recursion(int n, char src, char aux, char dest)
    {
        if(n==1)
        {
            System.out.println(src+" -> "+dest);
        }
        else
        {
            recursion(n-1,src,dest,aux);
            recursion(1,src,aux,dest);
            recursion(n-1,aux,src,dest);
        }
    }
}
