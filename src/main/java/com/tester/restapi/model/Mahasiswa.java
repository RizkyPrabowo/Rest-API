package com.tester.restapi.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "mahasiswa")
public class Mahasiswa {
	@Id
	private long idmhs;
	private String nama;
	private String alamat;
	
	
	
//	@OneToMany( mappedBy = "mahasiswa",fetch = FetchType.LAZY,
//            cascade = CascadeType.ALL)
//	private Set<Matakuliah> matakuliah;
	
	public long getIdmhs() {
		return idmhs;
	}

	public void setIdmhs(long idmhs) {
		this.idmhs = idmhs;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public Matakuliah getMatkul() {
		return matkul;
	}

	public void setMatkul(Matakuliah matkul) {
		this.matkul = matkul;
	}

	@OneToOne(fetch= FetchType.EAGER)
	@JoinColumns({
	@JoinColumn(name = "idmhs", insertable = false, updatable = false, referencedColumnName = "idmhs" , nullable = true),
	})
	
	private Matakuliah matkul;
	
	@Override
	public String toString() {
		return "Mahasiswa [idmhs=" + idmhs + ", nama=" + nama + ", alamat=" + alamat  + "]";
	}
}
