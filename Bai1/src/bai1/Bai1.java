/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author hp
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 6;
        int b = 5;
        double x = Math.pow(a, b);
        double y = Math.pow(b, a);
        System.out.println("Tong a va b la: " + (a + b));
        System.out.println("Hieu a va b la: " + (a - b));
        System.out.println("Tich a va b la: " + (a * b));
        System.out.println("Thuong a chia cho b la: " + ((float) a / b));
        System.out.println("Thuong b chia cho a la: " + ((float) b / a));
        System.out.printf("a mu b bang: %.0f \n", x);
        System.out.printf("b mu a bang: %.0f \n", y);
    }

}
