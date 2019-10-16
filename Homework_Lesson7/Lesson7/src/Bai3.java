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
public class Bai3 {

    
    public static int x, y, n;
    public static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        n = inputN();
        intialize();
        while (true) {

            Show();
            String Huong_di = Huong();
            Move(Huong_di);

        }
    }

    public static int inputN() {
        int N;
        do {
            System.out.print("Nhap kich thuoc n (0 < n < 20): ");
            N = sc.nextInt();
            System.out.println("");
        } while (N <= 0 || N >= 20);
        return N;
    }

    private static void intialize() {
        do {
            System.out.println("Nhap toa do x ban dau: ");
            x = sc.nextInt();
        } while (x < 0 || x > n);

        do {
            System.out.println("Nhap toa do y ban dau: ");
            y = sc.nextInt();
        } while (x < 0 || x > n);
    }

    public static void Show() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == x && j == y) {
                    System.out.print("* ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println("");
        }
    }

    public static String Huong() {
        String s = sc.next();
        while (true) {
            if ("U".equals(s)
                    || "D".equals(s)
                    || "L".equals(s)
                    || "R".equals(s)
                    || "EXIT".equals(s)) {
                return s;
            } else {
                System.out.print("Nhap lai: ");
                s = sc.next();
            }
        }
    }

    public static void Move(String Huong_di) {
        switch (Huong_di.toUpperCase()) {
            case "U":
                if (x == 0) {
                    x = n - 1;
                } else {
                    x--;
                }
                break;
            case "D":
                if (x == (n - 1)) {
                    x = 0;
                } else {
                    x++;
                }
                break;
            case "L":
                if (y == 0) {
                    y = n - 1;
                } else {
                    y--;
                }
                break;
            case "R":
                if (y == (n - 1)) {
                    y = 0;
                } else {
                    y++;
                }
                break;
            case "EXIT":
                System.out.println("DUNG CHUONG TRINH");
                System.exit(0);
        }
    }
}