/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LAB_CYCLE_2.Q8;

/**
 *
 * @author lanaa
 */
public class UserException extends Exception{

    /**
     * @param args the command line arguments
     */
    public UserException(String str)
    {
        super(str);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            throw new UserException("This is user exception ");
        }
        catch(UserException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    
}
