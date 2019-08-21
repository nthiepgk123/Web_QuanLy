package com.webapp.beans;

public class Nganh {
	private String MANGANH;
	private String TENNGANH;
	private int NAMBATDAU;
	private int NAMKETTHUC;
	
	public Nganh() {
		
	}
	
	public Nganh(String manganh,String tennganh,int nambatdau , int namketthuc) {
		this.MANGANH = manganh;
		this.TENNGANH = tennganh;
		this.NAMBATDAU = nambatdau;
		this.NAMKETTHUC = namketthuc;
	}
	
	public String getMANGANH() {
		return MANGANH;
	}
	public void setMANGANH(String mANGANH) {
		MANGANH = mANGANH;
	}
	public String getTENNGANH() {
		return TENNGANH;
	}
	public void setTENNGANH(String tENNGANH) {
		TENNGANH = tENNGANH;
	}
	public int getNAMBATDAU() {
		return NAMBATDAU;
	}
	public void setNAMBATDAU(int nAMBATDAU) {
		NAMBATDAU = nAMBATDAU;
	}
	public int getNAMKETTHUC() {
		return NAMKETTHUC;
	}
	public void setNAMKETTHUC(int nAMKETTHUC) {
		NAMKETTHUC = nAMKETTHUC;
	}
}
