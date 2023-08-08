/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_CYCLE_2.Q2;

import java.util.Scanner;

/**
 *
 * @author lanaa
 */
public class DynamicArray {

    private int[] array;
    private int len;

    public DynamicArray() {
        this.len = 0;
        array = new int[len];
    }

    public DynamicArray(int len) {
        this.len = len;
        this.array = new int[len];
    }

    public void arrayRead() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements in the array : ");
        for (int i = 0; i < array.length-1; i++) {
            array[i] = sc.nextInt();
        }
    }

    public void printArray() {
        for (int i = 0; i < array.length-1; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public void addElement(int element, int pos) {
        if (pos < 0 || pos > len) {
            System.out.println("Invalid position to add the element.");
            return;
        }

        for (int i = len - 1; i >= pos; i--) {
            array[i + 1] = array[i];
        }
        array[pos] = element;
        len++;
    }

    public void removeElement(int element) {
        boolean bool = false;
        for (int i = 0; i < len; i++) {
            if (array[i] == element) {
                for (int j = i; j < len - 1; j++) {
                    array[j] = array[j + 1];
                }
                bool = true;
                break;
            }
        }

        if (bool == true) {
            len--;
        } else {
            System.out.println("The element is not present in the array ");
        }
    }

    public void searchArray(int element) {
        boolean bool = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                bool = true;
                break;
            }
        }
        if (bool == true) {
            System.out.println("The element is present in the array ");
        } else {
            System.out.println("The element is not present in the array ");
        }
    }
}
