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
        int A1[][] = new int[3][3];

        System.out.println("Nhap cac phan tu cua ma tran A");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("A[" + (i + 1) + "]" + "[" + (j + 1) + "]: ");
                A1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Ma tran A: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(A1[(i)][(j)] + "\t");
            }
            System.out.print("\n");
        }
        int k = 0;
        int K[] = new int[9];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                K[k++] = A1[i][j];
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (K[i] > K[j]) {
                    int tt = K[i];
                    K[i] = K[j];
                    K[j] = tt;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < 9; i++) {
            if (K[i] == (i + 1)) {
                count++;
            }
        }
        if (count == 9) {
            System.out.println("Ma tran du 9 so tu 1 den 9");
        } else {
            System.out.println("Ma tran ko du 9 so tu 1-9");
        }
    }

}
