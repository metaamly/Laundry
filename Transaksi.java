/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laundry;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Transaksi {

    private ArrayList<Integer> idClient = new ArrayList<Integer>();
    private ArrayList<Integer> idjenisLaundry = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();

    public JenisLaundry laundry = new JenisLaundry();

    public Transaksi() {
        this.idClient.add(2);
        this.idjenisLaundry.add(0);
        this.banyak.add(1);

        this.idClient.add(0);
        this.idjenisLaundry.add(1);
        this.banyak.add(2);

        this.idClient.add(1);
        this.idjenisLaundry.add(2);
        this.banyak.add(3);
    }

    @SuppressWarnings("empty-statement")
    public void prosesTransaksi(Client member, Transaksi transaksi, JenisLaundry barang) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Silahkan menikmati pelayanan kami");

        System.out.print("Masukkan ID Pelanggan :");
        int idMember = myObj.nextInt();
        System.out.println("Selamat datang di Engene Laundry " + member.getNama(idMember));
        ArrayList<Integer> idBarang = new ArrayList<Integer>();
        ArrayList<Integer> banyak = new ArrayList<Integer>();
        int i = 0;
        int temp = 0;
        
            System.out.print("Masukkan jenis laundry :");
            temp = myObj.nextInt();
            if (temp != 99) {
                idBarang.add(temp);
                System.out.print(barang.getJenisLaundry(idBarang.get(i)) + "sebanyak (kg): ");
                banyak.add(myObj.nextInt());
                i++;
            }
        
        System.out.println("Transaksi laundry " + member.getNama(idMember) + " sebagai berikut");
        System.out.println("Jenis Laundry \tTotal\tHarga\tJumlah\t");

        int total = 0;
        int x = idBarang.size();
        for (int j = 0; j < x; j++) {
            int jumlah = banyak.get(j) * barang.getHarga(idBarang.get(j));
            total += jumlah;
            System.out.println(barang.getJenisLaundry(idBarang.get(j)) + "\t"
                    + banyak.get(j) + "\t" + barang.getHarga(idBarang.get(j)) + "\t" + jumlah);
            transaksi.setTransaksi(barang, idMember, idBarang.get(j), banyak.get(j));

        }
        System.out.println("Total Laundry : " + total);
        member.editSaldo(idMember, member.getSaldo(idMember) - total);
    }

    public void setTransaksi(JenisLaundry barang, int idMember, int idBarang, int banyaknya) {
        this.idClient.add(idMember);
        this.idjenisLaundry.add(idBarang);
        this.banyak.add(banyaknya);
        barang.editDurasi(idBarang, barang.getDurasi(idBarang) + 24 * banyaknya);
    }

    public int getIdBarang(int id) {
        return this.idjenisLaundry.get(id);
    }

    public int getBanyaknya(int id) {
        return this.banyak.get(id);
    }

    public int getIdMember(int id) {
        return this.idClient.get(id);
    }

    public int getJmlTransaksi() {
        return this.idClient.size();
    }
}
