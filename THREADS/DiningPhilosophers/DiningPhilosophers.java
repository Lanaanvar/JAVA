/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DiningPhilosophers;

import static DiningPhilosophers.DiningPhilosophers.chopsticks;
import static DiningPhilosophers.DiningPhilosophers.phil_num;
import java.util.concurrent.Semaphore;

/**
 *
 * @author lanaa
 */
public class DiningPhilosophers {

    static int phil_num = 5;
    static Semaphore[] chopsticks = new Semaphore[phil_num];
    static Semaphore table_control = new Semaphore(phil_num-1);

    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < phil_num; i++) {
            chopsticks[i] = new Semaphore(1);
        }

        for (int j = 0; j < phil_num; j++) {
            int philID = j;
            Thread PhilThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        think(philID);
                        eat(philID);
                    }
                }
            });
            PhilThread.start();
        }

    }

    static void think(int philID) {
        System.out.println("Philosopher " + philID + " is thinking.");
        try {
            Thread.sleep(1000);
        } catch (Exception ex) {
        }
    }

    static void eat(int philID) {
        try {
            table_control.acquire();
            chopsticks[philID].acquire();
            chopsticks[(philID + 1) % phil_num].acquire();

            System.out.println("Philosopher " + philID + " is eating.");
            Thread.sleep(1000);

            chopsticks[philID].release();
            chopsticks[(philID + 1) % phil_num].release();
            table_control.release();

        } catch (Exception e) {
        }
    }

}
