/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3_lesson5;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Bai3_Lesson5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("String phep tinh vua nhap la: " + s);
        char[] c = s.toCharArray();
        int n = c.length;
        for (int i = 0; i < n; i++) {
            if (c[i] == '-') {
                int tru = s.indexOf("-");
                String so1 = s.substring(0, tru);
                String so2 = s.substring(tru + 1);

                int a = Integer.valueOf(so1);    //lay gia tri kieu nguyen cua so1
                int b = Integer.valueOf(so2);    //lay gia tri kieu nguyen cua so2

                System.out.println("Ket qua la:" + (a - b));
            } else if(c[i] == '+') {
                int cong = s.indexOf("+");
                String so1 = s.substring(0, cong);
                String so2 = s.substring(cong + 1);

                int a = Integer.valueOf(so1);    //lay gia tri kieu nguyen cua so1
                int b = Integer.valueOf(so2);    //lay gia tri kieu nguyen cua so2

                System.out.println("Ket qua la:" + (a + b));
            }
        }
    }
}
