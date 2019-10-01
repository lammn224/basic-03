/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_kho_lesson3;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Bai_Kho_Lesson3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhập kích thước ma trận vuông: ");
        n = sc.nextInt();
        int a[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Nhap a[%d][%d]: ", i, j);
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Ma trận vừa nhập là: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d   ", a[i][j]);
            }
            System.out.print("\n");
        }
        int tong = 0;
        System.out.print("Tông các phần tử trên đường chéo chính là: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==j) {
                    tong += a[i][j];
                }
            }
        }
        System.out.println(tong);
        
    }
}
