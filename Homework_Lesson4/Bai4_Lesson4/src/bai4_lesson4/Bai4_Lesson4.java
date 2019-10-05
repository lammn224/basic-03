/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4_lesson4;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Bai4_Lesson4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();

        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap a[%d]: ", i);
            a[i] = sc.nextInt();
        }
        System.out.println(check(a));
    }

    public static int check(int[] a) {
        int n = a.length;
        if (a[0] < a[n - 1]) {          // tang dan
            for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i + 1]) {
                    return 0;
                }
            }
            return 1;
        }
        if (a[0] > a[n - 1]) {          // giam dan
            for (int i = 0; i < n - 1; i++) {
                if (a[i] < a[i + 1]) {
                    return 0;
                }
            }
            return -1;
        }
        return n;
    }
}
