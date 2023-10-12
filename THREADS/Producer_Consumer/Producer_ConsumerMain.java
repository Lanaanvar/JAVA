/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Producer_Consumer;

/**
 *
 * @author lanaa
 */
public class Producer_ConsumerMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Producer_Consumer pc=new Producer_Consumer();
        new Producer(pc);
        new Consumer(pc);
    }
    
}
