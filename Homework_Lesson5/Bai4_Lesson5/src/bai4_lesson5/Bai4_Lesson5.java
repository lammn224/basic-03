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
        int[] sapxep = new int[9];          //gan tung phan tu cho mang sapxep
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sapxep[p++] = a[i][j];
            }
        }
        for (int i = 0; i < 8; i++) {       //sap xep lai thu tu cac phan tu tang dan
            for (int j = i + 1; j < 9; j++) {
                if (sapxep[i] > sapxep[j]) {
                    int t = sapxep[i];
                    sapxep[i] = sapxep[j];
                    sapxep[j] = t;
                }
            }
        }
        for (int i = 0; i < 9; i++) {     //ktra cac chu so
            if (sapxep[i] == (i + 1)) {
                count++;
            }
        }
        if (count == 9) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

}
