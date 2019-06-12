package com.annguyen.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.annguyen.model.SinhVien;
  
public interface SinhVienDao {
	/*
	 * @Autowired JdbcTemplate template;
	 * 
	 * public void setTemplate(JdbcTemplate template) { this.template = template; }
	 * public List<SinhVien> getSinhVien() { // TODO Auto-generated method stub
	 * String sql = "select * from sinhvien"; return template.query(sql, new
	 * RowMapper<SinhVien>() {
	 * 
	 * @Override public SinhVien mapRow(ResultSet rs, int rowNum) throws
	 * SQLException { // TODO Auto-generated method stub SinhVien sv = new
	 * SinhVien(); sv.setMasv(rs.getString(1)); sv.setHosv(rs.getString(2));
	 * sv.setTensv(rs.getString(3)); sv.setNgaysinh(rs.getString(4));
	 * sv.setGioitinh(rs.getString(5)); sv.setMakhoa(rs.getString(6)); return sv; }
	 * }); }
	 */
	/*
	 * public void sua(SinhVien sv) { String sql =
	 * "update sinhvien set hosv=? , tensv=? , ngaysinh=?,gioitinh=? makhoa =? where masv=? "
	 * ; template.update(sql,
	 * sv.getHosv(),sv.getTensv(),sv.getNgaysinh(),sv.getGioitinh(),sv.getMakhoa(),
	 * sv.getMasv()); } public void them(SinhVien sv) { String sql =
	 * "insert into sinhvien(masv,hosv,tensv,ngaysinh,gioitinh,makhoa) value (?,?,?,?,?,?) "
	 * ;
	 * template.update(sql,sv.getMasv(),sv.getHosv(),sv.getTensv(),sv.getNgaysinh(),
	 * sv.getGioitinh(),sv.getMakhoa()); }
	 */
	public List<SinhVien> getSinhVien();
	public void them(SinhVien sv);
	public void sua(SinhVien sv);
	public SinhVien laySVtheoMasv(String masv);
	public void xoa(String id);
}
