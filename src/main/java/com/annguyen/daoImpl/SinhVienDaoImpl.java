package com.annguyen.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.annguyen.dao.SinhVienDao;
import com.annguyen.model.SinhVien;
@Repository
public class SinhVienDaoImpl implements SinhVienDao{
	@Autowired
	JdbcTemplate template;
	@Override
	public List<SinhVien> getSinhVien() {
		// TODO Auto-generated method stub
		String sql = "select * from sinhvien";
		return template.query(sql, new RowMapper<SinhVien>() {

			@Override
			public SinhVien mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				SinhVien sv = new SinhVien();
				sv.setMasv(rs.getString(1));
				sv.setHosv(rs.getString(2));
				sv.setTensv(rs.getString(3));
				sv.setNgaysinh(rs.getString(4));
				sv.setGioitinh(rs.getString(5));
				sv.setMakhoa(rs.getString(6));
				return sv;
			}
		});
	}
	@Override
	public void them(SinhVien sv) {
		// TODO Auto-generated method stub
		String sql = "insert into sinhvien values(?,?,?,?,?,?)";
		template.update(sql,sv.getMasv(),sv.getHosv(),sv.getTensv(),sv.getNgaysinh(),sv.getGioitinh(),sv.getMakhoa());
	}
	@Override
	public void sua(SinhVien sv) {
		// TODO Auto-generated method stub
		String sql = "update sinhvien set hosv=?, tensv=?,ngaysinh=?,gioitinh=?,makhoa=? where masv =?";
		template.update(sql,sv.getHosv(),sv.getTensv(),sv.getNgaysinh(),sv.getGioitinh(),sv.getMakhoa(),sv.getMasv());
	}
	@Override
	public void xoa(String id) {
		// TODO Auto-generated method stub
		String sql = "delete from sinhvien where masv =?";
		template.update(sql,id);
	}
	@Override
	public SinhVien laySVtheoMasv(String masv) {
		// TODO Auto-generated method stub
		String sql ="select * from sinhvien where masv= ?";
		return template.queryForObject(sql, new Object[] {masv},new RowMapper<SinhVien>() {

			@Override
			public SinhVien mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				SinhVien sv = new SinhVien();
				sv.setMasv(rs.getString(1));
				sv.setHosv(rs.getString(2));
				sv.setTensv(rs.getString(3));
				sv.setNgaysinh(rs.getString(4));
				sv.setGioitinh(rs.getString(5));
				sv.setMakhoa(rs.getString(6));
				return sv;
			}
		});
	}
}
