/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1_lesson5;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Bai1_Lesson5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String special = "!@#$%^&*()}";
        System.out.print("Nhap vao chuoi ky tu bat ki: ");
        String s = sc.nextLine();
        boolean check = containSpecial(s, special);
        System.out.println(check);
    }

    public static boolean containSpecial(String s, String special) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < special.length(); j++) {
                if(s.charAt(i) == special.charAt(j)) {
                    return true;
                }
            }
        }
        
       
        return false;
    }
}
