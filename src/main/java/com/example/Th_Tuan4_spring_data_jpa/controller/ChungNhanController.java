package com.example.Th_Tuan4_spring_data_jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Th_Tuan4_spring_data_jpa.reponsitory.ChungNhanDAOImpl;

@RestController
@RequestMapping("/api/chungnhan")
public class ChungNhanController {
	
	@Autowired
	ChungNhanDAOImpl chungNhanDAOImpl;
	
	@GetMapping("/listChuyenBayDenVaDi")
	public List<Object[]> listChuyenBayDenVaDi(){
		return chungNhanDAOImpl.listChuyenBayDenVaDi();
		
	}
	@GetMapping("/listNV747")
	public List<Object[]> listNV747(){
		return chungNhanDAOImpl.listNV747();
		
	}
	@GetMapping("/listMaMBOfNguyen")
	public List<Object[]> listMaMBOfNguyen(String name){
		return chungNhanDAOImpl.listMaMBOfNguyen(name);
		
	}

	@GetMapping("/listMaMVOfLoaiMB")
	public List<Object[]> listMaMVOfLoaiMB(String loai1,String loai2){
		return chungNhanDAOImpl.listMaMVOfLoaiMB(loai1, loai2);
		
	}
	@GetMapping("/listLoaiByMaCB")
	public List<Object[]> listLoaiByMaCB(String maCB){
		return chungNhanDAOImpl.listLoaiByMaCB(maCB);
		
	}
	@GetMapping("/listChuyenBayByLoai")
	public List<Object[]> listChuyenBayByLoai(String loai){
		return chungNhanDAOImpl.listChuyenBayByLoai(loai);
		
	}

	@GetMapping("/listTenNVByLoai")
	public List<Object[]> listTenNVByLoai(String loai){
		return chungNhanDAOImpl.listTenNVByLoai(loai);
		
	}

	@GetMapping("/listMayBayAndCountNV")
	public List<Object[]> listMayBayAndCountNV(){
		return chungNhanDAOImpl.listMayBayAndCountNV();
		
	}
	@GetMapping("/listNVHavingMaMB3")
	public List<Object[]> listNVHavingMaMB3(){
		return chungNhanDAOImpl.listNVHavingMaMB3();
		
	}

}
