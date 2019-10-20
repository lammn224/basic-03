/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1_lesson8;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class TestComplex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Complex a = new Complex();

        Complex a1 = new Complex(5);

        Complex a2 = new Complex(1, -1);

        Complex a3 = new Complex(45, 11);

        a.Show();
        a1.Show();
        a2.Show();
        a3.Show();
        System.out.println("kq phep cong: ");
        Complex cong = Phepcong(a3, a2);
        cong.Show();
        System.out.println("kq phep tru: ");
        Complex tru = Pheptru(a3, a2);
        tru.Show();
        System.out.println("kq phep nhan: ");
        Complex nhan = Phepnhan(a3, a2);
        nhan.Show();
        System.out.println("kq phep chia: ");
        Complex chia = Phepchia(a3, a2);
        chia.Show();
    }

    static Complex Phepcong(Complex a, Complex b) {
        double congphanthuc = a.phanthuc + b.phanthuc;
        double congphanao = a.phanao + b.phanao;

        Complex kq = new Complex();
        kq.phanthuc = congphanthuc;
        kq.phanao = congphanao;

        return kq;
    }

    static Complex Pheptru(Complex a, Complex b) {
        double truphanthuc = a.phanthuc - b.phanthuc;
        double truphanao = a.phanao - b.phanao;

        Complex kq = new Complex();
        kq.phanthuc = truphanthuc;
        kq.phanao = truphanao;

        return kq;
    }

    static Complex Phepnhan(Complex a, Complex b) {
        double nhanphanthuc = a.phanthuc * b.phanthuc - a.phanao * b.phanao;
        double nhanphanao = a.phanthuc * b.phanao + a.phanao * b.phanthuc;

        Complex kq = new Complex();
        kq.phanthuc = nhanphanthuc;
        kq.phanao = nhanphanao;

        return kq;
    }

    static Complex Phepchia(Complex a, Complex b) {
        double chiaphanthuc =  (a.phanthuc * b.phanthuc + a.phanao * b.phanao) / (Math.pow(b.phanthuc, 2) + Math.pow(b.phanao, 2));
        double chiaphanao = (a.phanao * b.phanthuc - a.phanthuc * b.phanao) / (Math.pow(b.phanthuc, 2) + Math.pow(b.phanao, 2));

        Complex kq = new Complex();
        kq.phanthuc = chiaphanthuc;
        kq.phanao = chiaphanao;

        return kq;
    }
}
