/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3_lesson4;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Bai3_Lesson4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so phan tu: ");
        int n = sc.nextInt();

        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap kí tự thứ %d: ", i + 1);
            a[i] = sc.next();
        }

        String[] kq = sap_xep(a);
        System.out.println("Kq sau khi sap xep: ");
        for (int i = 0; i < n; i++) {
            System.out.print(kq[i] + " ");
        }
    }

    public static String[] sap_xep(String[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i].compareTo(a[j]) > 0) {
                    String t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        return a;
    }
}
