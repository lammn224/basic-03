/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1_lesson8;

/**
 *
 * @author hp
 */
public class Complex {

    double phanthuc;
    double phanao;

    Complex() {

    }

    Complex(int a) {
        phanthuc = a;
    }

    Complex(int a, int b) {
        phanthuc = a;
        phanao = b;
    }

    void Show() {
        System.out.println("Phan thuc la: " + phanthuc);
        System.out.println("Phan ao la: " + phanao);
        System.out.println(phanthuc + "+" + phanao + "i");
        System.out.println("");
    }
}
