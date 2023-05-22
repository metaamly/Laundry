/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laundry;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class JenisLaundry {

    private ArrayList<String> jenisLaundry = new ArrayList<String>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    private ArrayList<Integer> durasi = new ArrayList<Integer>();

    public JenisLaundry() {
        this.jenisLaundry.add("0 Ekspres");
        this.harga.add(15000);
        this.durasi.add(1);

        this.jenisLaundry.add("1 Medium");
        this.harga.add(10000);
        this.durasi.add(24);

        this.jenisLaundry.add("2 Slow");
        this.harga.add(5000);
        this.durasi.add(48);
    }

    public int getJmlJenisLaundry() {
        return this.jenisLaundry.size();
    }

    public void setJenisLaundry(String namaBarang) {
        this.jenisLaundry.add(namaBarang);
    }

    public String getJenisLaundry(int idBarang) {
        return this.jenisLaundry.get(idBarang);
    }

    public void setDurasi(int Durasi) {
        this.durasi.add(Durasi);
    }

    public int getDurasi(int idBarang) {
        return this.durasi.get(idBarang);
    }

    public void editDurasi(int idBarang, int Durasi) {
        this.durasi.set(idBarang, Durasi);
    }

    public void setHarga(int harga) {
        this.harga.add(harga);
    }

    public int getHarga(int idBarang) {
        return this.harga.get(idBarang);
    }
    
}
