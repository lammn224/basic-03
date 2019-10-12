
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hp
 */
public class Chua_bai {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        long conlai = Integer.valueOf(input);
        long sodu = 0;
        long heso = 1000;
        String kq = "";

        while (true) {
            System.out.println("== Vong lap ==");
            System.out.println("conlai: " + conlai);
            System.out.println("sodu: " + sodu);
            System.out.println("kq: " + kq);
            sodu = conlai % heso;
            kq = "," + sodu + kq;
            conlai = conlai / heso;
            if (conlai < heso) {
                kq = conlai + kq;
                break;
            }
        }
        System.out.println(kq + "vnd");
        
        
        int[][] a =  { 
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0},               
        };
        System.out.println("Nhap hang: ");
        int hang = sc.nextInt();
        System.out.println("Nhap cot: ");
        int cot =sc.nextInt(); 
        System.out.println("Nhap gia tri: ");
        int giatri = sc.nextInt();
        a[hang][cot] = giatri;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
