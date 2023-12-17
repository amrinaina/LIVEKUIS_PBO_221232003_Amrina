/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.livekuis_pbo_221232003_amrina;

/**
 *
 * @author AMRINA
 */
public class Mesin {
    public String merk;
    public int kecepatan;
    public boolean menyala;
    
    public Mesin(String merk){
        this.merk = merk;
        this.kecepatan = 0;
        this.menyala = false;
    }
    
    public void nyalakan(){
        this.menyala = true;
        System.out.println("Nyalakan Mesin");
    }
    
    public void matikan(){
        this.menyala = false;
        System.out.println("Matikan Mesin");
    }
    
    public void tambahKecepatan(int tambah){
        if(this.menyala = true){
            this.kecepatan = Math.min(this.kecepatan + tambah, 300);
            if(this.merk.equals("Suzuki")){
                this.kecepatan = Math.min(this.kecepatan, 150);
            }
        }
    }
    
    public void kurangKecepatan(int kurang){
        if(menyala == true){
            this.kecepatan = Math.max(this.kecepatan - kurang, 0);
        }
    }
}
