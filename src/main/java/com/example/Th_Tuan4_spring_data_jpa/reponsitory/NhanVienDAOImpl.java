package com.example.Th_Tuan4_spring_data_jpa.reponsitory;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Th_Tuan4_spring_data_jpa.entity.NhanVien;

@Repository
public interface NhanVienDAOImpl extends CrudRepository<NhanVien, String>{
	
//	List<NhanVien> findNhanVienByName(String Ten);
	@Query(value = "select sum(Luong) from nhanvien",nativeQuery = true)
	public int sumLuongNV();

	@Query(value = "select top 1 MaNV,MAX(Luong) from nhanvien group by MaNV",nativeQuery = true)
	public List<Object[]> listLuongMax();

	@Query(value = "select nhanvien.MaNV,Ten,Luong from nhanvien full outer join chungnhan on nhanvien.MaNV=chungnhan.MaNV\r\n"
			+ "where chungnhan.MaNV is null",nativeQuery = true)
	public List<Object[]> listNotPhiCong();

	@Query(value = "select * from [dbo].[nhanvien] where [Luong]<10000",nativeQuery = true)
	public List<NhanVien> cau3();
}
