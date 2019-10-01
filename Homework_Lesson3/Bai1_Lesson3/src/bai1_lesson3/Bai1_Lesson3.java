/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1_lesson3;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Bai1_Lesson3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[10];
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.printf("Nhap a[%d]: ", i);
            a[i] = sc.nextInt();
            sum += a[i];
        }
        System.out.println("Tong cac phan tu la: " + sum);
    }
}
