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
public class Client implements User {

    private ArrayList<String> namaClient = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();

    public Client() {

        this.namaClient.add("0 Jay");
        this.alamat.add("Jaksel");
        this.telepon.add("082040222153");
        this.saldo.add(1000000);

        this.namaClient.add("1 Heeseung");
        this.alamat.add("Jogja");
        this.telepon.add("081053679153");
        this.saldo.add(500000);

        this.namaClient.add("2 Sunghoon");
        this.alamat.add("Bandung");
        this.telepon.add("082253679153");
        this.saldo.add(500000);

     }

    public void setSaldo(int saldo) {
        this.saldo.add(saldo);
    }

    public int getSaldo(int idMember) {
        return this.saldo.get(idMember);
    }

    public void editSaldo(int idMember, int saldo) {
        this.saldo.set(idMember, saldo);
    }

    public int getJmlClient() {
        return this.saldo.size();
    }

    @Override
    public void setNama(String nama) {
        this.namaClient.add(nama);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int idCLient) {
        return this.namaClient.get(idCLient);
    }

    @Override
    public String getAlamat(int idCLient) {
        return this.alamat.get(idCLient);
    }

    @Override
    public String getTelepon(int idCLient) {
        return this.telepon.get(idCLient);
    }

}
