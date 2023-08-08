/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LAB_CYCLE_2.Q6;

/**
 *
 * @author lanaa
 */
public class NumFormatEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String invalidString= "Exception";
        
        try{
            
            int number = Integer.parseInt(invalidString);
            System.out.println("number = "+invalidString);
        }
        catch(NumberFormatException ex)
        {
            System.out.println("Error "+ex.getMessage());
        }
    }
    
}
