/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2_lesson6;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Bai2_Lesson6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen N = ");
        int N = sc.nextInt();
        int K = N;
        int k = 0;
        while (N != 0) {
            k = k + N % 10;
            N = N / 10;
        }
        if (K % k == 0) {
            System.out.println(K + " la so dac biet!");
        } else {
            System.out.println(K + " khong phai la so dac biet");
        }
    }

}
