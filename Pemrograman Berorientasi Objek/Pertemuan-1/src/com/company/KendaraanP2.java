package com.company;

public class KendaraanP2 {
//    attribute
    int roda,kecepatan;
    String warna,merk;

    public void berjalan(String arah)
    {
        System.out.println("\nbergerak ke "+arah);
    }

    public void berhenti()
    {
        System.out.println("berhenti");
    }

    public void infoKendaraan()
    {
        System.out.printf("\n\nKendaraan beroda "+roda);
        System.out.printf("\nKendaraan berwarna "+warna);
        System.out.printf("\nKendaraan bermerk "+merk);
    }

    public int kecepatanSekarang(int speed, String tipe)
    {
        int x = 0;
        if(tipe == "cepat")
        {
            x = kecepatan + speed;
        }
        else if(tipe == "lambat")
        {
            x = kecepatan - speed;
        }
        return x;
    }

    public void mundur()
    {
        int x = 5;
        kecepatan -= x;
    }
}
