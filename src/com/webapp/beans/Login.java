package com.webapp.beans;

public class Login {
	private String USERNAME;	
	private String PASSWORD;
	private int LOAITK;
	
	public Login() {
		
	}
	
	public Login(String user, String pass , int loaitk) {
		this.setUSERNAME(user);
		this.setPASSWORD(pass);
		this.setLOAITK(loaitk);
	}

	public String getUSERNAME() {
		return USERNAME;
	}

	public void setUSERNAME(String uSERNAME) {
		USERNAME = uSERNAME;
	}

	public String getPASSWORD() {
		return PASSWORD;
	}

	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}

	public int getLOAITK() {
		return LOAITK;
	}

	public void setLOAITK(int lOAITK) {
		LOAITK = lOAITK;
	}
}
