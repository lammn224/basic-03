/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1_lesson2;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Bai1_lesson2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Mô phỏng phép nhân tay
        
        System.out.print("Nhap so a co 3 chu so: ");
        int a = sc.nextInt();
        System.out.print("Nhap so b co 3 chu so: ");
        int b = sc.nextInt();

        int don_vi, chuc, tram;
        don_vi = b % 10;
        chuc = b % 100 / 10;
        tram = b / 100;

        System.out.println("Mo phong phep nhan tay");

        System.out.printf("%20d\n", a);
        System.out.printf("%15c%5d\n", 'x', b);
        System.out.printf("%20s\n" , "---------");
        System.out.printf("%20d\n", a * don_vi);
        System.out.printf("%19d\n", a * chuc);
        System.out.printf("%18d\n", a * tram);
        System.out.printf("%20s\n" , "---------");
        System.out.printf("%20d\n", a*b);

        // end point   
    }
}
