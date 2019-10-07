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
        System.out.println("Nhap vao chuoi ki tu: ");
        String a = sc.next();

        char[] c = a.toCharArray();

        char[] kq = sap_xep(c);
        System.out.println("Ket qua sau khi sap xep lai cac ki tu: ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(kq[i] + " ");
        }
    }

    public static char[] sap_xep(char[] c) {
        for (int i = 0; i < c.length - 1; i++) {
            for (int j = i + 1; j < c.length; j++) {
                if (c[i] > c[j]) {
                    char t = c[i];
                    c[i] = c[j];
                    c[j] = t;
                }
            }
        }
        return c;
    }
}
