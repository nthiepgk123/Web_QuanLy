package com.webapp.beans;

public class ChiTieu {
	private int MACT;
	private long SOTIENCHI;
	private long TIENDU;
	private long TIENCHO;
	private String MONAN;
	private long TIENCAMHOA;
	private long TIENTROCHOI;
	private String CHITIEUKHAC;
	private int SUKIEN_MASK;
	
	
	public ChiTieu() {
		
	}
	
	public ChiTieu(int mact,long sotienchi, long tiendu, long tiencho, String monan, long tiencamhoa , long tientrochoi,String chitieukhac,int sukien_mask) {
		this.MACT = mact;
		this.SOTIENCHI = sotienchi;
		this.TIENDU = tiendu;
		this.TIENCHO = tiencho;
		this.MONAN = monan;
		this.TIENCAMHOA = tiencamhoa;
		this.TIENTROCHOI = tientrochoi;
		this.CHITIEUKHAC = chitieukhac;
		this.SUKIEN_MASK = sukien_mask;
	}
	public int getMACT() {
		return MACT;
	}
	public void setMACT(int mACT) {
		MACT = mACT;
	}
	public long getSOTIENCHI() {
		return SOTIENCHI;
	}
	public void setSOTIENCHI(long sOTIENCHI) {
		SOTIENCHI = sOTIENCHI;
	}
	public long getTIENDU() {
		return TIENDU;
	}
	public void setTIENDU(long tIENDU) {
		TIENDU = tIENDU;
	}
	public long getTIENCHO() {
		return TIENCHO;
	}
	public void setTIENCHO(long tIENCHO) {
		TIENCHO = tIENCHO;
	}
	public String getMONAN() {
		return MONAN;
	}
	public void setMONAN(String mONAN) {
		MONAN = mONAN;
	}
	public long getTIENCAMHOA() {
		return TIENCAMHOA;
	}
	public void setTIENCAMHOA(long tIENCAMHOA) {
		TIENCAMHOA = tIENCAMHOA;
	}
	public long getTIENTROCHOI() {
		return TIENTROCHOI;
	}
	public void setTIENTROCHOI(long tIENTROCHOI) {
		TIENTROCHOI = tIENTROCHOI;
	}
	public String getCHITIEUKHAC() {
		return CHITIEUKHAC;
	}
	public void setCHITIEUKHAC(String cHITIEUKHAC) {
		CHITIEUKHAC = cHITIEUKHAC;
	}
	public int getSUKIEN_MASK() {
		return SUKIEN_MASK;
	}
	public void setSUKIEN_MASK(int sUKIEN_MASK) {
		SUKIEN_MASK = sUKIEN_MASK;
	}
}
