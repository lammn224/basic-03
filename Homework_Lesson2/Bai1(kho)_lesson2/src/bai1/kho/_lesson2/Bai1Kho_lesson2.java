/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1.kho._lesson2;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Bai1Kho_lesson2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dv, chuc, tram, nghin, chuc_nghin, tram_nghin;
        System.out.print("Nhap so a bat ki: ");
        int a = sc.nextInt();
        System.out.print("Nhap so b bat ki: ");
        int b = sc.nextInt();
        if (b >= 10 && b < 100) {
            dv = b % 10;
            chuc = b % 100 / 10;
            System.out.println("Mô phỏng phép nhân tay");
            System.out.printf("\n%20d", a);
            System.out.printf("\n%15c%5d", 'x', b);
            System.out.printf("\n%21s", "------------");
            System.out.printf("\n%20d", a * dv);
            System.out.printf("\n%19d", a * chuc);
            System.out.printf("\n%21s", "-----------");
            System.out.printf("\n%20d\n", a * b);
        }
        if (b >= 100 && b < 1000) {
            dv = b % 10;
            chuc = b % 100 / 10;
            tram = b % 1000 / 100;
            System.out.println("Mô phỏng phép nhân tay");
            System.out.printf("\n%20d", a);
            System.out.printf("\n%15c%5d", 'x', b);
            System.out.printf("\n%21s", "------------");
            System.out.printf("\n%20d", a * dv);
            System.out.printf("\n%19d", a * chuc);
            System.out.printf("\n%18d", a * tram);
            System.out.printf("\n%21s", "-----------");
            System.out.printf("\n%20d\n", a * b);
        }
        if (b >= 1000 && b < 10000) {
            dv = b % 10;
            chuc = b % 100 / 10;
            tram = b % 1000 / 100;
            nghin = b % 10000 / 1000;
            System.out.println("Mô phỏng phép nhân tay");
            System.out.printf("\n%20d", a);
            System.out.printf("\n%15c%5d", 'x', b);
            System.out.printf("\n%21s", "------------");
            System.out.printf("\n%20d", a * dv);
            System.out.printf("\n%19d", a * chuc);
            System.out.printf("\n%18d", a * tram);
            System.out.printf("\n%17d", a * nghin);
            System.out.printf("\n%21s", "-----------");
            System.out.printf("\n%20d\n", a * b);
        }
        if (b >= 10000) {
            dv = b % 10;
            chuc = b % 100 / 10;
            tram = b % 1000 / 100;
            nghin = b % 10000 / 1000;
            chuc_nghin = b / 10000;
            System.out.println("Mô phỏng phép nhân tay");
            System.out.printf("\n%22d", a);
            System.out.printf("\n%15c%7d", 'x', b);
            System.out.printf("\n%23s", "---------------");
            System.out.printf("\n%22d", a * dv);
            System.out.printf("\n%20d", a * chuc);
            System.out.printf("\n%19d", a * tram);
            System.out.printf("\n%18d", a * nghin);
            System.out.printf("\n%17d", a * chuc_nghin);
            System.out.printf("\n%23s", "----------------");
            System.out.printf("\n%23d\n", a * b);
        }
    // end point    
    }
}
