/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Producer_Consumer;

/**
 *
 * @author lanaa
 */
public class Producer_Consumer {

    int num;
    boolean valueSet = false;

    public synchronized void put(int num) {
        while (valueSet) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        System.out.println("Put : " + num);
        this.num = num;
        valueSet = true;
        notify();
    }

    public synchronized void get() {
        while (!valueSet) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        System.out.println("Get : " + num);
        valueSet = false;
        notify();
    }
}

class Producer implements Runnable {

    Producer_Consumer pc;

    public Producer(Producer_Consumer pc) {
        this.pc = pc;
        Thread thr = new Thread(this, "Producer");
        thr.start();
    }

    public void run() {
        int i = 0;
        while (true) {
            pc.put(i++);
            try {
                Thread.sleep(200);
            } catch (Exception e) {
            }
        }
    }
}

class Consumer implements Runnable {

    Producer_Consumer pc;

    public Consumer(Producer_Consumer pc) {
        this.pc = pc;
        Thread thr = new Thread(this, "Consumer");
        thr.start();
    }

    public void run() {
        while (true) {
            pc.get();
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
        }
    }
}
