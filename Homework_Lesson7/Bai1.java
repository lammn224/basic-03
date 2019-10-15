/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gio, phut, giay;
        String str;
        System.out.println("Nhap vao gio phut giay (AM/PM): ");

        do {
            System.out.print("Nhap gio: ");
            gio = sc.nextInt();
        } while (gio > 12 || gio < 0);

        do {
            System.out.print("Nhap phut: ");
            phut = sc.nextInt();
        } while (phut < 0 || phut >= 60);

        do {
            System.out.print("Nhap giay: ");
            giay = sc.nextInt();
        } while (giay < 0 || giay >= 60);

        System.out.print("AM / PM : ");
        str = sc.next();
        System.out.printf("%dh %dm %ds " + str + "\n", gio, phut, giay);

        System.out.print("Tong so giay la: ");
        int T0 = gio * 3600 + phut * 60 + giay;
        System.out.println(T0);

        Tinhtoan1s(gio, phut, giay, str, T0);
        Tinhtoan1000s(gio, phut, giay, str, T0);
    }

    public static void Tinhtoan1s(int gio, int phut, int giay, String str, int T0) {
        System.out.print("Sau 1s so giay la: ");
        int T1 = T0 + 1;
        System.out.println(T1);

        //System.out.print("Gio moi la: ");
        int gio1 = T1 / 3600;

        //System.out.print("Phut moi la: ");
        int phut1 = T1 / 60 - gio1 * 60;

        //System.out.print("Giay moi la: ");
        int giay1 = T1 - gio1 * 3600 - phut1 * 60;

        if (gio1 >= 12 && "PM".equals(str)) {
            gio1 = gio1 - 12;
            str = "AM";
        }
        if (gio1 >= 12 && "AM".equals(str)) {
            gio1 = gio1 - 12;
            str = "PM";
        }
        System.out.print("Thoi gian sau 1s la: ");
        System.out.printf("%dh %dm %ds " + str + "\n", gio1, phut1, giay1);

    }

    private static void Tinhtoan1000s(int gio, int phut, int giay, String str, int T0) {
        System.out.print("Sau 1000s so giay la: ");
        int T1000 = T0 + 1000;
        System.out.println(T1000);
        //System.out.print("Gio moi la: ");
        int gio1000 = T1000 / 3600;

        //System.out.print("Phut moi la: ");
        int phut1000 = T1000 / 60 - gio1000 * 60;

        //System.out.print("Giay moi la: ");
        int giay1000 = T1000 - gio1000 * 3600 - phut1000 * 60;

        if (gio1000 >= 12 && "PM".equals(str)) {
            gio1000 = gio1000 - 12;
            str = "AM";
        }
        if (gio1000 >= 12 && "AM".equals(str)) {
            gio1000 = gio1000 - 12;
            str = "PM";
        }
        System.out.print("Thoi gian sau 1000s la: ");
        System.out.printf("%dh %dm %ds " + str + "\n", gio1000, phut1000, giay1000);
    }
}
