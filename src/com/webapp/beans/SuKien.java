package com.webapp.beans;

import java.sql.Date;

public class SuKien {
	private int MASUKIEN;
	private String TENSUKIEN;
	private int MALOAI;
	private int SLTHAMGIA;
	private String KHACHMOI;
	private String NGAYTOCHUC;
	private String NGUOITOCHUC;
	private String DIADIEM;
	public SuKien() {
		
	}
	
	public SuKien(int mask,String tensk, int maloai, int slthamgia,String khachmoi,String nguoitochuc,String ngaytochuc,String diadiem) {
		this.setMASUKIEN(mask);
		this.setTENSUKIEN(tensk);
		this.setMALOAI(maloai);
		this.setSLTHAMGIA(slthamgia);
		this.setKHACHMOI(khachmoi);
		this.setNGUOITOCHUC(nguoitochuc);
		this.setNGAYTOCHUC(ngaytochuc);
		this.setDIADIEM(diadiem);
	}

	public String getNGUOITOCHUC() {
		return NGUOITOCHUC;
	}

	public void setNGUOITOCHUC(String nGUOITOCHUC) {
		NGUOITOCHUC = nGUOITOCHUC;
	}

	public String getNGAYTOCHUC() {
		return NGAYTOCHUC;
	}

	public void setNGAYTOCHUC(String nGAYTOCHUC) {
		NGAYTOCHUC = nGAYTOCHUC;
	}

	public String getKHACHMOI() {
		return KHACHMOI;
	}

	public void setKHACHMOI(String kHACHMOI) {
		KHACHMOI = kHACHMOI;
	}

	public int getSLTHAMGIA() {
		return SLTHAMGIA;
	}

	public void setSLTHAMGIA(int sLTHAMGIA) {
		SLTHAMGIA = sLTHAMGIA;
	}

	public int getMALOAI() {
		return MALOAI;
	}

	public void setMALOAI(int mALOAI) {
		MALOAI = mALOAI;
	}

	public String getTENSUKIEN() {
		return TENSUKIEN;
	}

	public void setTENSUKIEN(String tENSUKIEN) {
		TENSUKIEN = tENSUKIEN;
	}

	public int getMASUKIEN() {
		return MASUKIEN;
	}

	public void setMASUKIEN(int mASUKIEN) {
		MASUKIEN = mASUKIEN;
	}

	public String getDIADIEM() {
		return DIADIEM;
	}

	public void setDIADIEM(String dIADIEM) {
		DIADIEM = dIADIEM;
	}
}
