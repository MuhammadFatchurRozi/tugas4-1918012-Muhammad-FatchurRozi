package com.example.tugas4_recycler;

import android.net.Uri;

public class Mahasiswa {
    private String nama,pesan;
    public Mahasiswa(String nama, String pesan){
        this.nama = nama;
        this.pesan = pesan;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }public String getPesan(){
        return pesan;
    }
    public void setPesan(String pesan){
        this.pesan = pesan;
    }
}
