/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SleepingBarber;

/**
 *
 * @author lanaa
 */
public class SleepingBarberMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SleepingBarber.Barber barber = new SleepingBarber.Barber();
        barber.start();

        for (int i = 1; i <= 10; i++) {
            SleepingBarber.Customer customer = new SleepingBarber.Customer(i);
            customer.start();
            try {
                Thread.sleep(1000); // Simulate arrival time of customers
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
