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
        
        String s = "233-1525";
        System.out.println(s);
        
        int c = s.indexOf("-");
        String so1 = s.substring(0, c);
        String so2 = s.substring(c + 1);
        
        int a = Integer.valueOf(so1);    //lay gia tri kieu nguyen cua so1
        int b = Integer.valueOf(so2);    //lay gia tri kieu nguyen cua so2
        
        System.out.println("Ket qua la:" + (a - b));
    }
}
