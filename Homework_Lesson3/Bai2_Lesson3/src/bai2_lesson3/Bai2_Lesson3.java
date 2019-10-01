/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2_lesson3;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Bai2_Lesson3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.printf("Nhap a[%d]: ", i);
            a[i] = sc.nextInt();
        }
        System.out.println("Các phân tử ở vị trí chẵn là: ");
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                System.out.print(" " + a[i]);
            }
        }
        System.out.println("\n");
        System.out.println("Các phân tử ở vị trí lẻ là: ");
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 1) {
                System.out.print(" " + a[i]);
            }
        }
        System.out.println("\n");
        System.out.println("Các phần tử chia hết cho 2 có giá trị là: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(" " + a[i]);
                sum += a[i];
            }
        }
        System.out.println("\n");
        System.out.println("Các phần tử chia 5 dư 1 có giá trị là: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 5 == 1) {
                System.out.print(" " + a[i]);
            }
        }
        System.out.println("\n");
        System.out.print("Tổng các phần tử chẵn là: ");
        System.out.println(sum);
    }
}
