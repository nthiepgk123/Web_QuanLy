package com.webapp.beans;

public class MonHoc {
	private String MAMONHOC;
	private String TENMONHOC;
	private int SOCHI;
	private float DIEM;
	private String SINHVIEN_KHOA_MAKHOA;
	private String SINHVIEN_ID;
	
	public MonHoc() {
		
	}
	public MonHoc(String mamonhoc, String tenmonhoc, int sochi, float diem,String sinhvien_khoa_makhoa,String sinhvien_id){
		this.setMAMONHOC(mamonhoc);
		this.setTENMONHOC(tenmonhoc);
		this.setSOCHI(sochi);
		this.setDIEM(diem);
		this.setSINHVIEN_KHOA_MAKHOA(sinhvien_khoa_makhoa);
		this.setSINHVIEN_ID(sinhvien_id);
	}
	public String getMAMONHOC() {
		return MAMONHOC;
	}
	public void setMAMONHOC(String mAMONHOC) {
		MAMONHOC = mAMONHOC;
	}
	public String getTENMONHOC() {
		return TENMONHOC;
	}
	public void setTENMONHOC(String tENMONHOC) {
		TENMONHOC = tENMONHOC;
	}
	public int getSOCHI() {
		return SOCHI;
	}
	public void setSOCHI(int sOCHI) {
		SOCHI = sOCHI;
	}
	public float getDIEM() {
		return DIEM;
	}
	public void setDIEM(float dIEM) {
		DIEM = dIEM;
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
