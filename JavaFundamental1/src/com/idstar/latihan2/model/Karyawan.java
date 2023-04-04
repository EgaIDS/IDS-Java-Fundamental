package com.idstar.latihan2.model;

public class Karyawan {
	private String nama;
    private String nik;
    private String gender;
    private String status;
    
    public Karyawan() {}

    public Karyawan(String nama, String nik, String gender, String status) {
        this.nama = nama;
        this.nik = nik;
        this.gender = gender;
        this.status = status;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
