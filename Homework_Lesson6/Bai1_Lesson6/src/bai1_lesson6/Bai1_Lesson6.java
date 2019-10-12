/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1_lesson6;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Bai1_Lesson6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen n: ");
        long n = sc.nextInt();
        long giaithua = 1;
        for (int i = 1; i <= n; i++) {
            giaithua *= i;
        }
        System.out.printf("%d! = %d\n", n, giaithua);

        char[] c = new char[100];
        c = String.valueOf(giaithua).toCharArray();
        int count = 0;
        if (c[c.length - 1] != '0') {
            System.out.println("0");
        } else {
            for (int i = c.length - 1; i >= 0; i--) {
                if (c[i] == '0' && c[i] == c[i - 1]) {
                    count++;
                }
                if (c[i] == '0' && c[i] != c[i - 1]) {
                    break;
                }
            }
            System.out.println(count+1);
        }
    }
}
