/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.livekuis_pbo_221232003_amrina;

/**
 *
 * @author AMRINA
 */
public class Mobil {

    Mesin mesin;

    public Mobil(Mesin mesin) {
        this.mesin = mesin;
    }

    public void nyalakan() {
        this.mesin.nyalakan();
    }

    public void matikan() {
        this.mesin.matikan();
    }

    public void tambahKecepatan(int tambah) {
        mesin.tambahKecepatan(tambah);
    }

    public void kurangKecepatan(int kurang) {
        mesin.kurangKecepatan(kurang);
    }

    public String infoKecepatan() {
        return "Kecepatan Mobil: " + mesin.kecepatan + " Km/jam";
    }
}
