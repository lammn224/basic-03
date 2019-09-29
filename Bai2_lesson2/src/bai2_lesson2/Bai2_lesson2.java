/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2_lesson2;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Bai2_lesson2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so: ");
        int count;
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("Khong co so nguyen to");
        } else {
            System.out.printf("Cac so nguyen to be hon %d la: \n", n);
            for (int i = 2; i < n; i++) {
                count = 0;
                for (int j = 1; j <= n; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    System.out.print("  " + i);
                }
            }
        }
    }
}
