package com.webapp.beans;

import java.sql.Date;

public class ViPham {
	private int MAVP;
	private String TENVP;
	private int TINHTRANG;
	private long TIENPHAT;
	private Date NGAYDONGPHAT;
	private String SINHVIEN_ID;
	private String SINHVIEN_KHOA_MAKHOA;
	
	public ViPham() {
		
	}
	
	public ViPham(int mavp , String tenvp,int tinhtrang,long tienphat,Date ngaydongphat,String sinhvien_id,String sinhvien_khoa_makhoa) {
		this.setMAVP(mavp);
		this.setTENVP(tenvp);
		this.setTINHTRANG(tinhtrang);
		this.setTIENPHAT(tienphat);
		this.setNGAYDONGPHAT(ngaydongphat);
		this.setSINHVIEN_ID(sinhvien_id);
		this.setSINHVIEN_KHOA_MAKHOA(sinhvien_khoa_makhoa);
	}

	public int getMAVP() {
		return MAVP;
	}

	public void setMAVP(int mAVP) {
		MAVP = mAVP;
	}

	public String getTENVP() {
		return TENVP;
	}

	public void setTENVP(String tENVP) {
		TENVP = tENVP;
	}

	public int getTINHTRANG() {
		return TINHTRANG;
	}

	public void setTINHTRANG(int tINHTRANG) {
		TINHTRANG = tINHTRANG;
	}

	public long getTIENPHAT() {
		return TIENPHAT;
	}

	public void setTIENPHAT(long tIENPHAT) {
		TIENPHAT = tIENPHAT;
	}

	public Date getNGAYDONGPHAT() {
		return NGAYDONGPHAT;
	}

	public void setNGAYDONGPHAT(Date nGAYDONGPHAT) {
		NGAYDONGPHAT = nGAYDONGPHAT;
	}

	public String getSINHVIEN_ID() {
		return SINHVIEN_ID;
	}

	public void setSINHVIEN_ID(String sINHVIEN_ID) {
		SINHVIEN_ID = sINHVIEN_ID;
	}

	public String getSINHVIEN_KHOA_MAKHOA() {
		return SINHVIEN_KHOA_MAKHOA;
	}

	public void setSINHVIEN_KHOA_MAKHOA(String sINHVIEN_KHOA_MAKHOA) {
		SINHVIEN_KHOA_MAKHOA = sINHVIEN_KHOA_MAKHOA;
	}
}
