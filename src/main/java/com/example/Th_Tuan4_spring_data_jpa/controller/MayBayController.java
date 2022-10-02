package com.example.Th_Tuan4_spring_data_jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Th_Tuan4_spring_data_jpa.entity.MayBay;
import com.example.Th_Tuan4_spring_data_jpa.reponsitory.MayBayDAOImpl;

@RestController
@RequestMapping("/api/maybay")
public class MayBayController {
	@Autowired
	MayBayDAOImpl mayBayDAOImpl ;
	
	@GetMapping("/listTamBay10000")
	public List<MayBay> listTamBay10000(int index){
		return mayBayDAOImpl.listTamBay10000(10000);
		
	}
	@GetMapping("/listLoaiBoeing")
	public List<MayBay> listLoaiBoeing(String loai){
		return mayBayDAOImpl.listLoaiBoeing("Boeing");
		
	}
	@GetMapping("/numMayBayBeoing")
	public int numMayBayBeoing() {
		return mayBayDAOImpl.numMayBayBeoing();
		
	}

	@GetMapping("/listNVOfMayBay")
	public List<Object[]> listNVOfMayBay(){
		return mayBayDAOImpl.listNVOfMayBay();
		
	}

	@GetMapping("/listMaMBMAX3AndTamBay")
	public List<Object[]> listMaMBMAX3AndTamBay(){
		return mayBayDAOImpl.listMaMBMAX3AndTamBay();
		
	}

}
