/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LAB_CYCLE_2.Q6;

/**
 *
 * @author lanaa
 */
public class NullPointEx {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        String[] names=new String[3];
        names[0]= "Lana";
        names[1]="Neha";
        
        String str=names[2];
        
        
        
        try{
            int len=str.length();
            System.out.println(len);
        }
        catch(NullPointerException ex)
        {
            System.out.println("Error "+ex.getMessage());
        }
    }
    
}
