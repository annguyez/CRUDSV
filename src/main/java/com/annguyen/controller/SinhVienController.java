package com.annguyen.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.annguyen.dao.SinhVienDao;
import com.annguyen.model.SinhVien;
@Controller
public class SinhVienController {
	@Autowired
	SinhVienDao sinhvienDao;
	
	@RequestMapping(value = "/danhsach", method = RequestMethod.GET)
	public String Danhsach(Model model) {
		List<SinhVien> list = sinhvienDao.getSinhVien();
		model.addAttribute("listSv",list);
		return "viewSv";
	}
	/*@RequestMapping(value = "/suasinhvien/{masv}" , method = R)
	public String SuaSinhVien(@PathVariable String masv,Model m) {
		SinhVien sv = sinhvienDao.sua(masv);
		m.addAttribute("sua", sv);
		return "suaSv;
	}*/
	@RequestMapping(value = "/themsv", method = RequestMethod.POST)
	public String ThemSV(Model m,HttpServletRequest req) {
		String masv = req.getParameter("masv");
		String hosv = req.getParameter("hosv");
		String tensv = req.getParameter("tensv");
		String ngaysinh = req.getParameter("ngaysinh");
		String gioitinh = req.getParameter("gioitinh");
		String makhoa = req.getParameter("makhoa");
		SinhVien sv = new SinhVien();
		sv.setMasv(masv);
		sv.setHosv(hosv);
		sv.setTensv(tensv);
		sv.setNgaysinh(ngaysinh);
		sv.setGioitinh(gioitinh);
		sv.setMakhoa(makhoa);
		sinhvienDao.them(sv);
		return "redirect:/danhsach";
	}
	/* Cach 2
	 * public String ThemSV(Model m,@RequestParam(name="masv") String
	 * masv,@RequestParam(name="tensv") String tensv) { return "ThemSV"; }
	 */
	@RequestMapping(value = ("/SuaSV"), method = RequestMethod.GET)
	public String SuaSV(Model m, HttpServletRequest req) {
		String masv = req.getParameter("macansua"); // chu y cho get Parameter phai dung phan name ben jsp
		System.out.println(masv);
		SinhVien sinhvien = sinhvienDao.laySVtheoMasv(masv);
		System.out.println("Ma "+sinhvien.getMasv());
		m.addAttribute("sv", sinhvien);
		return "formsua";
	}
	@RequestMapping(value = ("/SuaSV"), method = RequestMethod.POST)
	public String SuaSV(HttpServletRequest req) {
		String masv = req.getParameter("masv");
		String hosv = req.getParameter("hosv");
		String tensv = req.getParameter("tensv");
		String ngaysinh = req.getParameter("ngaysinh");
		String gioitinh = req.getParameter("gioitinh");
		String makhoa = req.getParameter("makhoa");
		SinhVien sv = new SinhVien();
		sv.setMasv(masv);
		sv.setHosv(hosv);
		sv.setTensv(tensv);
		sv.setNgaysinh(ngaysinh);
		sv.setGioitinh(gioitinh);
		sv.setMakhoa(makhoa);
		sinhvienDao.sua(sv);
		return "redirect:/danhsach";
	}
	@RequestMapping(value = ("/XoaSV"),method = RequestMethod.GET)
	public String XoaSV(HttpServletRequest req) {
		String masv = req.getParameter("macanxoa");
		sinhvienDao.xoa(masv);
		return "redirect:/danhsach";
	}
	
}
