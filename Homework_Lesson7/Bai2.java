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
public class Bai2 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Dodaimang();
        int[] a = new int[n];
        NhapMang(a, n);
        XuatMang(a, n);
        Fourth(a, n);
        Second(a, n);
        KQ(a, n);
    }

    private static int Dodaimang() {
        int N;
        do {
            System.out.print("Nhap so luong phan tu (n>5): ");
            N = sc.nextInt();
        } while (N <= 5);
        return N;
    }

    private static void NhapMang(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap a[%d]: ", i);
            a[i] = sc.nextInt();
        }
    }

    private static void XuatMang(int[] a, int n) {
        System.out.println("Mang ban dau: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

    private static void Fourth(int[] a, int n) {
        System.out.print("=====================\n");
        int t = a[3];
        for (int i = 3; i < n - 1; i++) {
            a[i] = a[i + 1];
        }
        a[n - 1] = t;
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

    }

    private static void Second(int[] a, int n) {
        System.out.println("");
        int t = a[1];
        a[1] = a[0];
        a[0] = t;
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    private static void KQ(int[] a, int n) {
        System.out.println("\nKQ cuoi cung: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
