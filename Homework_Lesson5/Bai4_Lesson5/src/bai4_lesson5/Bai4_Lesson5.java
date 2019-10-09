/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4_lesson5;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Bai4_Lesson5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Kiểm tra có đủ các chũ số từ 1 => 9 ko?
        int a[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Nhap a[%d][%d]: ", i, j);
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Ma tran vua nhap la: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }
        int count = 0;
        int p = 0;
        int[] X = new int[9];          //gan tung phan tu cho mang X
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                X[p] = a[i][j];
                p++;
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (X[i] == X[j]) {
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.println("true");
        } else if (count != 0) {
            System.out.println("false");
        }
    }

}
