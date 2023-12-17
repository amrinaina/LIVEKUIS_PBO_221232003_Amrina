/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.livekuis_pbo_221232003_amrina;

/**
 *
 * @author AMRINA
 */
public class LIVEKUIS_PBO_221232003_Amrina {

    public static void main(String[] args) {
        Mesin mesinHonda = new Mesin("Honda");
        Mesin mesinSuzuki = new Mesin("Suzuki");
        Mesin mesinNissan = new Mesin("Nissan");

        Mobil mobil1 = new Mobil(mesinHonda);
        Mobil mobil2 = new Mobil(mesinSuzuki);
        Mobil mobil3 = new Mobil(mesinNissan);

        mobil1.nyalakan();
        mobil1.tambahKecepatan(10);
        System.out.println(mobil1.infoKecepatan());
        mobil1.kurangKecepatan(5);

        mobil2.nyalakan();
        mobil2.tambahKecepatan(20);
        System.out.println(mobil2.infoKecepatan());
        mobil1.kurangKecepatan(5);

        mobil3.nyalakan();
        mobil3.tambahKecepatan(30);
        System.out.println(mobil3.infoKecepatan());
        mobil1.kurangKecepatan(5);
    }
}
