/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2_lesson8;

/**
 *
 * @author hp
 */
public class Point {

    double x;
    double y;
    double z;

    Point() {

    }

    Point(double a, double b, double c) {
        x = a;
        y = b;
        z = c;
    }

    void show() {
        System.out.println("Hoanh do la: " + x);
        System.out.println("Tung do la: " + y);
        System.out.println("Cao do la: " + z);
        System.out.println("");
    }
}
