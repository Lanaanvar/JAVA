/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LAB_CYCLE_2.Q1;

/**
 *
 * @author lanaa
 */
public class TowerOfHanoiMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TowerOfHanoi toh= new TowerOfHanoi();
        toh.recursion(3, 'A', 'B', 'C');
    }
    
}
