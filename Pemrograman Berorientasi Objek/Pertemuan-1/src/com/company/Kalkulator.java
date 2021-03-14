package com.company;
import java.util.Scanner;

public class Kalkulator {
    static float total = 0, nom1 = 1, nom2 = 2;

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(nom2 != 0 & nom1 != 0){
            total=0;
            System.out.println("\n====================");
            System.out.println("Kalkulator Sederhana");
            System.out.println("1.Penjumlahan");
            System.out.println("2.Pengurangan");
            System.out.println("3.Perkalian");
            System.out.println("4.Pembagian");
            System.out.print("Masukan Pilihan Anda = ");
            int pilihan = input.nextInt();

            if(pilihan >0 & pilihan <5)
            {
                System.out.print("Masukan Bilangan Ke-1 = ");
                nom1 = input.nextFloat();
                System.out.print("Masukan Bilangan Ke-2 = ");
                nom2 = input.nextFloat();

                switch (pilihan) {

                    case 1:
                        System.out.println(+nom1 + " + " + nom2);
                        System.out.print("Hasilnya = ");
                        total = nom1 + nom2;
                        break;
                    case 2:
                        System.out.println(+nom1 + " - " + nom2);
                        System.out.print("Hasilnya = ");
                        total = nom1 - nom2;
                        break;
                    case 3:
                        System.out.println(+nom1 + " x " + nom2);
                        System.out.print("Hasilnya = ");
                        total = nom1 * nom2;
                        break;
                    case 4:
                        System.out.println(+nom1 + " : " + nom2);
                        System.out.print("Hasilnya = ");
                        total = nom1 / nom2;
                        break;
                    default:
                        System.out.println("Anda harus mengisi angka");

                }
                System.out.println(total);
            }
        }
    }
}
