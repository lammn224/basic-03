/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2_lesson5;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Bai2_Lesson5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so tien: ");
        int n = sc.nextInt();
        String s = Integer.toString(n);   // chuyển từ int sang dạng String
        int X = s.length();
        if (X < 4) {
            System.out.println(n + "vnd");
        } else if (X >= 4 && X <= 6) {
            String baso1 = s.substring(X - 3, X);
            String baso2 = s.substring(0, X - 3);
            String SoTien = baso2 + "," + baso1 + "vnd";
            System.out.println(SoTien);
            
        } else if (X > 6 && X <= 9) {
            String baso1 = s.substring(X - 3, X);
            String baso2 = s.substring(X - 6, X - 3);
            String baso3 = s.substring(0, X - 6);
            String SoTien = baso3 + "," + baso2 + "," + baso1 + "vnd";
            System.out.println(SoTien);
            
        } else if (X > 9 && X <= 12) {
            String baso1 = s.substring(X - 3, X);
            String baso2 = s.substring(X - 6, X - 3);
            String baso3 = s.substring(X - 9, X - 6);
            String baso4 = s.substring(0, X - 9);
            String SoTien = baso4 + "," + baso3 + "," + baso2 + "," + baso1 + "vnd";
            System.out.println(SoTien);
        }
    }
}
