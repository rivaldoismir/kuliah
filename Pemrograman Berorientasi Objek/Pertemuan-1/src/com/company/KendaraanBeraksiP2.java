package com.company;

public class KendaraanBeraksiP2 {
    public static void main(String[] args)
    {
//        membuat objek
        KendaraanP2 mobil = new KendaraanP2();
        KendaraanP2 motor = new KendaraanP2();
        KendaraanP2 sepeda = new KendaraanP2();
        motor.warna = "Hitam";
        motor.merk = "Yamaha Mio";
        motor.roda = 2;
        motor.infoKendaraan();
        mobil.warna = "Merah";
        mobil.merk = "Toyota Innova";
        mobil.roda = 4;
        mobil.infoKendaraan();
        mobil.berjalan("Depan");
        mobil.berhenti();
        mobil.kecepatan = 20;
        int kecepatan = mobil.kecepatanSekarang(10,"cepat");
        System.out.printf("Kecepatan kendaraan adalah "+kecepatan);
    }
}
