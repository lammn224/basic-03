/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson1;

/**
 *
 * @author hp
 */
public class Lesson1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int A = 7;
        int B = 2;
        int Tong;
        Tong = A + B;
        System.out.println("Tong A va B la: " + Tong);

        boolean dieu_kien;
        dieu_kien = false;
        dieu_kien = true;
        System.out.println("A co bang B ko");
        if (A == B) {
            System.out.println("Dung roi");

        } else {
            System.out.println("Sai roi");
        }
        if (B % 2 == 0) {
            System.out.println("B la so chan");

        } else {
            System.out.println("B la so le");
        }

        int a = 5;
        float b = 5;
        float x = -b / a;
        if (a == 0) {
            if (b == 0) {
                System.out.println("pt co vo so nghiem");
            } else {
                System.out.println("pt vo nghiem");
            }

        } else {
            System.out.println("pt co nghiem duy nhat la: " +x);
        }
    }

}
