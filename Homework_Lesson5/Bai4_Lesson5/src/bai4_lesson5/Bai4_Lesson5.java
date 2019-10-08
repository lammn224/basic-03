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
        int a[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Nhap a[%d][%d]: ", i, j);
                a[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        int count7 = 0;
        int count8 = 0;
        int count9 = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3 ; j++) {
                if (a[i][j] == 1) {
                    count++;
                }
                if (a[i][j] == 2) {
                    count2++;
                }
                if (a[i][j] == 3) {
                    count3++;
                }
                if (a[i][j] == 4) {
                    count4++;
                }
                if (a[i][j] == 5) {
                    count5++;
                }
                if (a[i][j] == 6) {
                    count6++;
                }
                if (a[i][j] == 7) {
                    count7++;
                }
                if (a[i][j] == 8) {
                    count8++;
                }
                if (a[i][j] == 9) {
                    count9++;
                }
            }
        }
        if (count == 1 && count2 == 1 && count3 == 1 && count4 == 1 && count5 == 1 && count6 == 1 && count7 == 1 && count8 == 1 && count9 == 1) {
            System.out.println("true");
        }else System.out.println("false");
    }

}
