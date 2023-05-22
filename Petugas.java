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
public class Petugas implements User {

    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<String> jabatan = new ArrayList<String>();

    public Petugas() {
        this.namaPetugas.add("Fall");
        this.alamat.add("Mars");
        this.telepon.add("085604434243");
        this.jabatan.add("Pemilik toko");
     
    }
    

    public void setJabatan(String jabatan) {
        this.jabatan.add(jabatan);
    }

    public String getJabatan(int id) {
        return this.jabatan.get(id);
    }

    public int getJmlPetugas() {
        return this.namaPetugas.size();
    }

    @Override
    public void setNama(String namaKaryawan) {
        this.namaPetugas.add(namaKaryawan);
    }

    @Override
    public void setAlamat(String alamat) {
        this.namaPetugas.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.namaPetugas.add(telepon);
    }

    @Override
    public String getNama(int idKaryawan) {
        return this.namaPetugas.get(idKaryawan);
    }

    @Override
    public String getTelepon(int idKaryawan) {
        return this.telepon.get(idKaryawan);
    }

    @Override
    public String getAlamat(int idKaryawan) {
        return this.alamat.get(idKaryawan);
    }
}
