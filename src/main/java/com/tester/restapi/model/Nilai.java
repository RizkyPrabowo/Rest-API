package com.tester.restapi.model;

import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.Data;

@Data
@Entity
@Table(name = "nilai")
public class Nilai {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private long id;
	
	private long idmhs;
	private long idmatkul;
	private Integer nilai;
	private String keterangan;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getIdmhs() {
		return idmhs;
	}

	public void setIdmhs(long idmhs) {
		this.idmhs = idmhs;
	}

	public long getIdmatkul() {
		return idmatkul;
	}

	public void setIdmatkul(long idmatkul) {
		this.idmatkul = idmatkul;
	}

	public Integer getNilai() {
		return nilai;
	}

	public void setNilai(Integer nilai) {
		this.nilai = nilai;
	}

	public String getKeterangan() {
		return keterangan;
	}

	public void setKeterangan(String keterangan) {
		this.keterangan = keterangan;
	}

	public Mahasiswa getMhs() {
		return mhs;
	}

	public void setMhs(Mahasiswa mhs) {
		this.mhs = mhs;
	}

	public Matakuliah getMatkul() {
		return matkul;
	}

	public void setMatkul(Matakuliah matkul) {
		this.matkul = matkul;
	}

	@ManyToOne(fetch= FetchType.EAGER)
	@JoinColumns({
	@JoinColumn(name = "idmhs", insertable = false, updatable = false, referencedColumnName = "idmhs"),
	})
	
	@JsonIgnore
	private Mahasiswa mhs;
	
	@ManyToOne(fetch= FetchType.EAGER)
	@JoinColumns({
	@JoinColumn(name = "idmatkul", insertable = false, updatable = false, referencedColumnName = "idmatkul"),
	})
	
	@JsonIgnore
	private Matakuliah matkul;

	public Nilai orElseThrow(Object object) {
		// TODO Auto-generated method stub
		return null;
	}
}


