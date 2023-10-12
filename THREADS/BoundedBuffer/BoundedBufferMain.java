/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BoundedBuffer;

/**
 *
 * @author lanaa
 */
public class BoundedBufferMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BoundedBuffer bf = new BoundedBuffer(10);
        Thread producerThread = new Thread(new Producer(bf));
        Thread consumerThread = new Thread(new Consumer(bf));
        producerThread.start();
        consumerThread.start();
    }

}
