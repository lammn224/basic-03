/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2_lesson2;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Bai2_lesson2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n = ");
        int n = sc.nextInt();
        System.out.printf("Cac so nguyen to be hon %d la: \n", n);
        if (n > 2) {
            System.out.print(2);
        }
        for (int i = 3; i < n; i++ ) {
            if (so_nguyen_to(i)) {
                System.out.print(", " + i);
            }
        // end point    
        }
    }
   
    public static boolean so_nguyen_to(int a) {  //hàm ktra so nguyen to
        // so nguyen n < 2 khong phai la so nguyen to
        if (a < 2) {
            return false;
        }
        // ktra so nguyen to khi n >= 2
        for (int b = 2; b <= (int) Math.sqrt(a); b++) {
            if (a % b == 0) {
                return false;
            }
        }
        return true;
    // end point    
    }
}
