/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2_lesson4;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Bai2_lesson4 {

    /**
     * @param args the command line arguments
     */
    //Viết 1 hàm đầu vào là 1 số nguyên 
    //nếu số đó là số nguyên tố thì trả về true. nếu không thì trả về false
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so: ");
        int a = sc.nextInt();
        boolean check = check(a);
        System.out.println(check);

    }

    public static boolean check(int a) {
        int count = 0;
        if (a == 0 || a == 1) {
            return false;
        }
        for (int i = 1; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                count++;
            }
        }
        if (count == 1) {
            return true;
        }
        return false;
    }

}
