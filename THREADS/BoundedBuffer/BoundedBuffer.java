/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BoundedBuffer;

/**
 *
 * @author lanaa
 */
public class BoundedBuffer {

    int[] buffer;
    int size;
    int front;
    int rear;

    public BoundedBuffer(int len) {
        buffer = new int[len];
        size = 0;
        front = 0;
        rear = 0;
    }

    public synchronized void put(int num) {
        while (size == buffer.length) {
            try {
                wait();
            } catch (Exception e) {
            }
        }

        buffer[rear] = num;
        rear = (rear + 1) % buffer.length;
        size++;

        System.out.println("Put : " + num);
        notify();
    }

    public synchronized void get() {
        while (size == 0) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        int consumed = buffer[front];
        front = (front + 1) % buffer.length;
        size--;

        System.out.println("Get : " + consumed);
        notify();
    }
}

class Producer implements Runnable {

    BoundedBuffer bf;

    public Producer(BoundedBuffer bf) {
        this.bf = bf;
    }

    public void run() {
        for (int i = 0; i < 20; i++) {
            bf.put(i);
            try {
                Thread.sleep(200);
            } catch (Exception e) {
            }
        }
    }
}

class Consumer implements Runnable {

    BoundedBuffer bf;

    public Consumer(BoundedBuffer bf) {
        this.bf = bf;
    }

    public void run() {
        for (int i = 0; i < 20; i++) {
            bf.get();
            try {
                Thread.sleep(200);
            } catch (Exception e) {
            }
        }
    }
}
