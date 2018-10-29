package com.company;
/**
 * Yogie Alfin Salim
 * 10117100
 * IF-3
 */

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Karyawan kry = new Karyawan();
        Manager mng = new Manager();
        Scanner scn = new Scanner(System.in);
        Scanner scn1 = new Scanner(System.in);

        System.out.println("=====Program Perhitungan Gaji Karyawan=====");
        System.out.print("Masukkan NIK : ");
        kry.setNik(scn.nextLine());
        System.out.print("Masukkan Nama : ");
        kry.setNama(scn.nextLine());
        System.out.print("Masukkan Golongan (1/2/3) : ");
        kry.setGolongan(scn1.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        kry.setJabatan(scn.nextLine());
        System.out.print("Masukkan Jumlah Kehadiran : ");
        mng.setKehadiran(scn1.nextInt());

        System.out.println("\n=====Hasil Perhitungan======");
        System.out.println("NIK : " +kry.getNik());
        System.out.println("Nama : " +kry.getNama());
        System.out.println("GOLONGAN : " +kry.getGolongan());
        System.out.println("JABATAN : " +kry.getJabatan());

        System.out.println("\nTUNJANGAN GOLONGAN : " +mng.TunjanganGolongan(kry.getGolongan()));
        System.out.println("TUNJANGAN JABATAN : " +mng.tunjanganJabatan(kry.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN : " +mng.tunjanganKehadiran(mng.getKehadiran()));

        System.out.println("\nGAJI TOTAL : " +mng.gajiTotal());


    }
}
