package com.webapp.beans;

import java.sql.Date;

public class TienNha {
	private int MATN;
	private long TIENLAPTOP;
	private long TIENNHA;
	private long TIENAN;
	private long TIENGIAVI;
	private Date NGAYDONG;
	private int TENTHANG;
	private String SINHVIEN_KHOA_MAKHOA;
	private String SINHVIEN_ID;
	
	public TienNha() {
		
	}
	
	public TienNha(int matn, long tienlaptop, long tiennha, long tienan , long tiengiavi, Date ngaydong, int tenthang, String sinhvien_khoa_makhoa ,String sinhvien_id) {
		this.setMATN(matn);
		this.setTIENLAPTOP(tienlaptop);
		this.setTIENNHA(tiennha);
		this.setTIENAN(tienan);
		this.setTIENGIAVI(tiengiavi);
		this.setNGAYDONG(ngaydong);
		this.setTENTHANG(tenthang);
		this.setSINHVIEN_KHOA_MAKHOA(sinhvien_khoa_makhoa);
		this.setSINHVIEN_ID(sinhvien_id);
	}

	public int getMATN() {
		return MATN;
	}

	public void setMATN(int mATN) {
		MATN = mATN;
	}

	public long getTIENLAPTOP() {
		return TIENLAPTOP;
	}

	public void setTIENLAPTOP(long tIENLAPTOP) {
		TIENLAPTOP = tIENLAPTOP;
	}

	public long getTIENNHA() {
		return TIENNHA;
	}

	public void setTIENNHA(long tIENNHA) {
		TIENNHA = tIENNHA;
	}

	public long getTIENAN() {
		return TIENAN;
	}

	public void setTIENAN(long tIENAN) {
		TIENAN = tIENAN;
	}

	public long getTIENGIAVI() {
		return TIENGIAVI;
	}

	public void setTIENGIAVI(long tIENGIAVI) {
		TIENGIAVI = tIENGIAVI;
	}

	public Date getNGAYDONG() {
		return NGAYDONG;
	}

	public void setNGAYDONG(Date nGAYDONG) {
		NGAYDONG = nGAYDONG;
	}

	public int getTENTHANG() {
		return TENTHANG;
	}

	public void setTENTHANG(int tENTHANG) {
		TENTHANG = tENTHANG;
	}

	public String getSINHVIEN_KHOA_MAKHOA() {
		return SINHVIEN_KHOA_MAKHOA;
	}

	public void setSINHVIEN_KHOA_MAKHOA(String sINHVIEN_KHOA_MAKHOA) {
		SINHVIEN_KHOA_MAKHOA = sINHVIEN_KHOA_MAKHOA;
	}

	public String getSINHVIEN_ID() {
		return SINHVIEN_ID;
	}

	public void setSINHVIEN_ID(String sINHVIEN_ID) {
		SINHVIEN_ID = sINHVIEN_ID;
	}
}
