/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LAB_CYCLE_2.Q3;

/**
 *
 * @author lanaa
 */
class Pascal
{
    public int fact(int n)
    {
        int factorial=1;
        if (n==1 || n==0)
        {
            factorial=1;
        }
        else
        {
            factorial=n*fact(n-1);
        }
        
        return factorial;
    }
    
    public void triangle(int m)
    {
        for(int i=0; i<m; i++)
        {
            for (int j=m-i-1; j>0; j--)
            {
                System.out.print(" ");
            }
            for(int k=0; k<i+1; k++)
            {
                System.out.print(fact(i)/(fact(((i)-k))*fact(k))+" ");
            }
//            if(i>=1 && i<m)
//            {
//                System.out.print("1");
//            }
            
            System.out.println();
        }
    }
}



public class PascalTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pascal pascalTri=new Pascal();
        pascalTri.triangle(5);
    }
    
}
