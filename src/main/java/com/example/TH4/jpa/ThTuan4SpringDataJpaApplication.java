package com.example.TH4.jpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.TH4.reponsitory.ChungNhanDAOImpl;
import com.example.TH4.reponsitory.ChuyenBayDAOImpl;
import com.example.TH4.reponsitory.MayBayDAOImpl;
import com.example.TH4.reponsitory.NhanVienDAOImpl;




@SpringBootApplication
@org.springframework.transaction.annotation.Transactional
public class ThTuan4SpringDataJpaApplication {
	@Bean
	public CommandLineRunner run(ChuyenBayDAOImpl chuyenBayDAOImpl, MayBayDAOImpl mayBayDAOImpl, NhanVienDAOImpl nhanVienDAOImpl,
			ChungNhanDAOImpl chungNhanDAOImpl) {
		return (ArgsAnnotationPointcut -> {
		});
	}

	public static void main(String[] args) {
		SpringApplication.run(ThTuan4SpringDataJpaApplication.class, args);
	}

}