package com.webapp.beans;

import java.sql.Date;

public class SinhVien {
	private String ID;
	private String HOTEN;
	private String GIOITINH;
	private String DIACHI;
	private String TENTRUONGHOC;
	private String NGAYSINH;
	private String KHOA_MAKHOA;
	private String SDT;
	private String AVATAR;
	
	public SinhVien() {
		
	}
	
	public SinhVien(String id, String hoten , String gioitinh, String diachi ,String tentruonghoc,String ngaysinh,String sdt , String khoa_makhoa,String avatar) {
		this.ID = id;
		this.HOTEN = hoten;
		this.GIOITINH = gioitinh;
		this.DIACHI = diachi;
		this.TENTRUONGHOC = tentruonghoc;
		this.NGAYSINH = ngaysinh;
		this.KHOA_MAKHOA = khoa_makhoa;
		this.SDT = sdt;
		this.AVATAR = avatar;
	}
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getHOTEN() {
		return HOTEN;
	}
	public void setHOTEN(String hOTEN) {
		HOTEN = hOTEN;
	}
	public String getGIOITINH() {
		return GIOITINH;
	}
	public void setGIOITINH(String gIOITINH) {
		GIOITINH = gIOITINH;
	}
	public String getDIACHI() {
		return DIACHI;
	}
	public void setDIACHI(String dIACHI) {
		DIACHI = dIACHI;
	}
	public String getTENTRUONGHOC() {
		return TENTRUONGHOC;
	}
	public void setTENTRUONGHOC(String tENTRUONGHOC) {
		TENTRUONGHOC = tENTRUONGHOC;
	}
	public String getNGAYSINH() {
		return NGAYSINH;
	}
	public void setNGAYSINH(String nGAYSINH) {
		NGAYSINH = nGAYSINH;
	}
	public String getKHOA_MAKHOA() {
		return KHOA_MAKHOA;
	}
	public void setKHOA_MAKHOA(String kHOA_MAKHOA) {
		KHOA_MAKHOA = kHOA_MAKHOA;
	}

	public String getSDT() {
		return SDT;
	}

	public void setSDT(String sDT) {
		SDT = sDT;
	}

	public String getAVATAR() {
		return AVATAR;
	}

	public void setAVATAR(String aVATAR) {
		AVATAR = aVATAR;
	}
}
