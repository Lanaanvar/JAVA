/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SleepingBarber;

/**
 *
 * @author lanaa
 */
import java.util.concurrent.Semaphore;

public class SleepingBarber {
    private static final int NUM_CHAIRS = 5;
    private static Semaphore barberSemaphore = new Semaphore(0);
    private static Semaphore customerSemaphore = new Semaphore(0);
    private static Semaphore waitingRoomMutex = new Semaphore(1);
    private static int customersWaiting = 0;

    static class Barber extends Thread {
        public void run() {
            try {
                while (true) {
                    barberSemaphore.acquire(); // Sleep if no customers
                    waitingRoomMutex.acquire();
                    customersWaiting--;
                    customerSemaphore.release(); // Signal that customer can be served
                    waitingRoomMutex.release();
                    
                    // Barber serves customer
                    System.out.println("Barber is cutting hair");
                    Thread.sleep(2000); // Simulating hair cutting
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Customer extends Thread {
        private int id;

        public Customer(int id) {
            this.id = id;
        }

        public void run() {
            try {
                waitingRoomMutex.acquire();
                if (customersWaiting < NUM_CHAIRS) {
                    customersWaiting++;
                    System.out.println("Customer " + id + " is waiting");
                    barberSemaphore.release(); // Wake up the barber if sleeping
                    waitingRoomMutex.release();
                    customerSemaphore.acquire(); // Wait until barber finishes
                    System.out.println("Customer " + id + " is getting a haircut");
                } else {
                    waitingRoomMutex.release();
                    System.out.println("Customer " + id + " left - no available chairs");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    
}

