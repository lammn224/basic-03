/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Bai5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        String A, B;
        System.out.print("Nhap vao chuoi thu nhat: ");
        A = a.next();
        System.out.print("Nhap vao chuoi thu hai: ");
        B = b.next();
        System.out.println(comparison(A, B));
    }

    public static int comparison(String a, String b) {
        if (a.compareTo(b) > 0) {
            return 1;
        } else if (a.compareTo(b) < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
