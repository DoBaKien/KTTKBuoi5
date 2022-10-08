package com.example.TH4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.TH4.reponsitory.ChungNhanDAOImpl;

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
		return chungNhanDAOImpl.listMaMBOfNguyen("Nguyen");
		
	}

	@GetMapping("/listMaMVOfLoaiMB")
	public List<Object[]> listMaMVOfLoaiMB(String loai1,String loai2){
		return chungNhanDAOImpl.listMaMVOfLoaiMB("Boeing", "Airbus");
		
	}
	@GetMapping("/listLoaiByMaCB")
	public List<Object[]> listLoaiByMaCB(String maCB){
		return chungNhanDAOImpl.listLoaiByMaCB("VN280");
		
	}
	@GetMapping("/listChuyenBayByLoai")
	public List<Object[]> listChuyenBayByLoai(String loai){
		return chungNhanDAOImpl.listChuyenBayByLoai("Airbus A320");
		
	}

	@GetMapping("/listTenNVByLoai")
	public List<Object[]> listTenNVByLoai(String loai){
		return chungNhanDAOImpl.listTenNVByLoai("Boeing");
		
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
