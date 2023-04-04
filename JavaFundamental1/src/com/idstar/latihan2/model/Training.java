package com.idstar.latihan2.model;

public class Training {
	private String pengajar;
	private String tema;
	private String judul;
	private String durasi;
	
	public Training() {}

	public Training(String pengajar, String tema, String judul, String durasi) {
		this.pengajar = pengajar;
		this.tema = tema;
		this.judul = judul;
		this.durasi = durasi;
	}

	public String getPengajar() {
		return pengajar;
	}

	public void setPengajar(String pengajar) {
		this.pengajar = pengajar;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public String getJudul() {
		return judul;
	}

	public void setJudul(String judul) {
		this.judul = judul;
	}

	public String getDurasi() {
		return durasi;
	}

	public void setDurasi(String durasi) {
		this.durasi = durasi;
	}

}
