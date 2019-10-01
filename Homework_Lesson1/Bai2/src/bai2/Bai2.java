/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author hp
 */
public class Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 1, b = 2, c = 1;
        // gia pt bac 2 ax^2+bx+c=0

        float d = b * b - 4 * a * c;
        if (a == 0) {
            System.out.println("pt ko phai la pt bac hai");
        } else {
            if (d < 0) {
                System.out.println("pt vo nghiem");
            } else {
                if (d == 0) {
                    System.out.println("pt co nghiem kep x=" + (-b / (2 * a)));
                } else {
                    double u = Math.sqrt(d);
                    System.out.println("pt co hai nghiem phan biet:");
                    System.out.println("x1= " + (-b + u) / (2 * a));
                    System.out.println("x2= " + (-b - u) / (2 * a));

                }
            }

        }
    }
}    