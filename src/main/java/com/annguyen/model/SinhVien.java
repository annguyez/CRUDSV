package com.annguyen.model;

public class SinhVien {
	private String masv;
	private String hosv;
	private String tensv;
	private String ngaysinh;
	private String gioitinh;
	private String makhoa;
	public SinhVien(String masv, String hosv, String tensv, String ngaysinh, String gioitinh, String makhoa) {
		super();
		this.masv = masv;
		this.hosv = hosv;
		this.tensv = tensv;
		this.ngaysinh = ngaysinh;
		this.gioitinh = gioitinh;
		this.makhoa = makhoa;
	}
	public SinhVien() {
		super();
	}
	public String getMasv() {
		return masv;
	}
	public void setMasv(String masv) {
		this.masv = masv;
	}
	public String getHosv() {
		return hosv;
	}
	public void setHosv(String hosv) {
		this.hosv = hosv;
	}
	public String getTensv() {
		return tensv;
	}
	public void setTensv(String tensv) {
		this.tensv = tensv;
	}
	public String getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(String ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public String getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
	public String getMakhoa() {
		return makhoa;
	}
	public void setMakhoa(String makhoa) {
		this.makhoa = makhoa;
	}
	
}
