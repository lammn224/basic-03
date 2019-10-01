/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2.kho._lesson2;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Bai2Kho_lesson2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] number = new int[5]; // khởi tạo mảng
        
        // nhập các phần tử của mảng
        for (int i = 0; i < 5; i++) {
            System.out.printf("\nNhap a[%d] = ", i);
            number[i] = sc.nextInt();
        }
        
        // thuật toán sắp xếp
        int z;
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (number[i] < number[j]) {
                    // Hoán vị 2 số a[i] và a[j]
                    z = number[i];
                    number[i] = number[j];
                    number[j] = z;
                }
            }
        }
        System.out.printf("\nDay so da sap xep la: \n");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d, ", number[i]);
        }

    }
}
