package com.tester.restapi.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@Table(name = "matakuliah")
public class Matakuliah {
//	@Id
//	private long id;
	@Id
	private long idmatkul;
	private String mataKuliah;
	private long idmhs;
	private int nilai;
	
	
	public long getIdmatkul() {
		return idmatkul;
	}


	public void setIdmatkul(long idmatkul) {
		this.idmatkul = idmatkul;
	}


	public String getMataKuliah() {
		return mataKuliah;
	}


	public void setMataKuliah(String mataKuliah) {
		this.mataKuliah = mataKuliah;
	}


	public long getIdmhs() {
		return idmhs;
	}


	public void setIdmhs(long idmhs) {
		this.idmhs = idmhs;
	}


	public int getNilai() {
		return nilai;
	}


	public void setNilai(int nilai) {
		this.nilai = nilai;
	}


	public Mahasiswa getMhs() {
		return mhs;
	}


	public void setMhs(Mahasiswa mhs) {
		this.mhs = mhs;
	}


	@ManyToOne(fetch= FetchType.LAZY , optional = false)
	@JoinColumns({
	@JoinColumn(name = "idmhs", insertable = false, updatable = false, referencedColumnName = "idmhs"),
	})
	
	@JsonIgnore
	private Mahasiswa mhs;
	

	@Override
	public String toString() {
		return "matakuliah [idMatakuliah=" + idmatkul + ", namaMatakuliah=" + mataKuliah
				+ ", idMahasiswa=" + idmhs +" , nilai=" + nilai +"]";
	}
}
