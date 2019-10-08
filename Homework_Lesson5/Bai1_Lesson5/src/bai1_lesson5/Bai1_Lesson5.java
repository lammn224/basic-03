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
        System.out.print("Nhap vao chuoi ky tu bat ki: ");
        String s = sc.nextLine();
        boolean check = containSpecial(s);
        System.out.println(check);
    }

    public static boolean containSpecial(String s) {
        //String[] strArray = new String[] {s};  // chuyển từ String sang String array
        char[] c = s.toCharArray();
        int n = c.length;
        for (int i = 0; i < n; i++) {
            if (c[i] == '!' || c[i] == '@' || c[i] == '#' || c[i] == '$' || c[i] == '%' || c[i] == '^' || c[i] == '&' || c[i] == '*' || c[i] == '(' || c[i] == ')') {
                return true;
            }
        }
        return false;
    }
}
