package com.example.TH4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.TH4.entity.NhanVien;
import com.example.TH4.reponsitory.NhanVienDAOImpl;

@RestController
@RequestMapping("/api/nhanvien")
public class NhanVienController {
	@Autowired
	NhanVienDAOImpl nhanVienDAOImpl ;
	
	@GetMapping("/cau3")
	public List<NhanVien> cau3(){
		return nhanVienDAOImpl.cau3();
		
	}
	@GetMapping("/sumLuongNV")
	public int sumLuongNV() {
		return nhanVienDAOImpl.sumLuongNV();
		
	}

	@GetMapping("/listLuongMax")
	public List<Object[]> listLuongMax(){
		return nhanVienDAOImpl.listLuongMax();
		
	}

	@GetMapping("/listNotPhiCong")
	public List<Object[]> listNotPhiCong(){
		return nhanVienDAOImpl.listNotPhiCong();
		
	}

}