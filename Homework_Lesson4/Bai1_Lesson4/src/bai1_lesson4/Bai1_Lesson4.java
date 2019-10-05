/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1_lesson4;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Bai1_Lesson4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so phan tu cua mang: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d]: ", i);
            a[i] = sc.nextInt();
        }
        boolean check = check(a);
        System.out.println(check);
    }

    public static boolean check(int a[]) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            if (a[i] == a[n - 1 - i]) {
                return true;
            }
        }
        return false;
    }

}
