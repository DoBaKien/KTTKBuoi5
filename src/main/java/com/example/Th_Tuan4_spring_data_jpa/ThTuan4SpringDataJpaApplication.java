package com.example.Th_Tuan4_spring_data_jpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.Th_Tuan4_spring_data_jpa.reponsitory.ChungNhanDAOImpl;
import com.example.Th_Tuan4_spring_data_jpa.reponsitory.ChuyenBayDAOImpl;
import com.example.Th_Tuan4_spring_data_jpa.reponsitory.MayBayDAOImpl;
import com.example.Th_Tuan4_spring_data_jpa.reponsitory.NhanVienDAOImpl;




@SpringBootApplication
@org.springframework.transaction.annotation.Transactional
public class ThTuan4SpringDataJpaApplication {
	@Bean
	public CommandLineRunner run(ChuyenBayDAOImpl chuyenBayDAOImpl, MayBayDAOImpl mayBayDAOImpl, NhanVienDAOImpl nhanVienDAOImpl,
			ChungNhanDAOImpl chungNhanDAOImpl) {
		return (ArgsAnnotationPointcut -> {
			
//			// 1. Cho biet cac chuyen bay di Da Lat (DAD).
//			System.out.println(" 1. Cho biet cac chuyen bay di Da Lat (DAD).");
//			System.out.println((chuyenBayDAOImpl.listChuyenBayDAD("DAD")));
//			
//			// 2. Cho biet cac loai may bay co tam bay lon hon 10,000km
//			System.out.println(" 2. Cho biet cac loai may bay co tam bay lon hon 10,000km.");
//			System.out.println((mayBayDAOImpl.listTamBay10000(10000)));
//			
//			// 3. Tim cac nhan vien co Luong nhỏ hon 10,000
//			System.out.println("3. Tim cac nhan vien co Luong nhỏ hon 10,000");
//			System.out.println((mayBayDAOImpl.listLoaiBoeing("Boeing")));
//			
//			// 4. Cho biet cac chuyen bay co Do dai đường bay nhỏ hon 10.000km và lon hon 8.000km.
//			System.out.println("4. Cho biet cac chuyen bay co Do dai đường bay nhỏ hon 10.000km và lon hon 8.000km.");
//			System.out.println((chuyenBayDAOImpl.listChuyenBay10To8()));
//			
//			//5. Cho biet cac chuyen bay xuat phat từ Sài Gòn (SGN) di Ban Mê Thuộc (BMV).
//			System.out.println("5.	Cho biet cac chuyen bay xuat phat từ Sài Gòn (SGN) di Ban Mê Thuộc (BMV).");
//			System.out.println((chuyenBayDAOImpl.listChuyenBayDenVaDi("SGN", "BMV")));
//			
//			//6. co bao nhieu chuyen bay xuat phat từ Sài Gòn (SGN).
//			System.out.println("6.	co bao nhieu chuyen bay xuat phat từ Sài Gòn (SGN).");
//			System.out.println(("so chuyen bay xuat phat từ SGN: " + chuyenBayDAOImpl.numChuyenBaySGN()));
//			
//			//7. co bao nhieu loai may bay Boeing.
//			System.out.println("7.	co bao nhieu loai may báy Boeing.");
//			System.out.println(("so loai may bay Boeing: " + mayBayDAOImpl.numMayBayBeoing()));
//			
//			//8.Cho biet tong so Luong phai tra cho cac nhan vien.
//			System.out.println(" 8.	Cho biet tong so Luong phai tra cho cac nhan vien.");
//			System.out.println(("tong Luong phai tra cho nhan vien NV: " + nhanVienDAOImpl.sumLuongNV()));
//			
//			//9.Cho biet ma so của cac phi cong lai may báy Boeing.
//			System.out.println(" 9.	Cho biet ma so của cac phi cong lai may bay Boeing.");
//			List<Object[]> pr_list = new ArrayList<Object[]>();
//			pr_list.addAll(chungNhanDAOImpl.listChuyenBayDenVaDi());
//			for (Object[] objects : pr_list) {
//			System.out.println("ma so phi cong: " + objects[0]);
//						}
//			//10. Cho biet cac nhan vien co the lai may bay co ma so 747.
//			System.out.println("10.	Cho biet cac nhan vien co the lai may bay co ma so 747.");
//			for (Object[] objects : chungNhanDAOImpl.listNV747()) {
//				System.out.println("ma nhan vien: " + objects[0] + ", ma may bay: " + objects[1] + ", Ten: " + objects[2]
//						+ ", Luong: " + objects[3]);
//			}
//			//11. Cho biet ma so của cac loai may bay ma nhan vien co ho Nguyen co the lai.
//			System.out.println("11.	Cho biet ma so của cac loai may bay ma nhan vien co ho Nguyen co the lai.");
//			for (Object[] objects : chungNhanDAOImpl.listMaMBOfNguyen("Nguyen")) {
//				System.out.println("ma may bay la: " + objects[0]);
//			}
//			//12. Cho biet ma so của cac phi cong vua lai duoc Boeing vua lai duoc Airbus.
//			System.out.println("12.	Cho biet ma so của cac phi cong vừa lai duoc Boeing vừa lai duoc Airbus.");
//			for (Object[] objects : chungNhanDAOImpl.listMaMVOfLoaiMB("Boeing", "Airbus")) {
//				System.out.println("ma phi cong la: " + objects[0]);
//			}
//			//13. Cho biet cac loai may bay co the thuc hien chuyen bay VN280.
//			System.out.println("13.	Cho biet cac loai may bay co the thuc hien chuyen bay VN280.");
//			for (Object[] objects : chungNhanDAOImpl.listLoaiByMaCB("VN280")) {
//				System.out.println("loai may bay : " + objects[0]);
//			}
//			//14. Cho biet cac chuyen bay co the duoc thuc hien boi may bay Airbus A320.
//			System.out.println(" 14.Cho biet cac chuyen bay co the duoc thuc hien boi may bay Airbus A320.");
//			for (Object[] objects : chungNhanDAOImpl.listChuyenBayByLoai("Airbus A320")) {
//				System.out.println("ma chuyen bay: " + objects[0] + ", Ga di: " + objects[1] + ", Ga den: " + objects[2]
//						+ ", Do dai: " + objects[3] + ", Gio di: " + objects[4] + ", Gio den: " + objects[5] + ", Chi phi: "
//						+ objects[6]);
//			}
//			//15. Cho biet Ten của cac phi cong lai may bay Boeing.
//			System.out.println("15.	Cho biet Ten của cac phi cong lai may bay Boeing.");
//			for (Object[] objects : chungNhanDAOImpl.listTenNVByLoai("Boeing")) {
//				System.out.println("Ten phi cong : " + objects[0]);
//			}
//			//16. Voi moi loai may bay co phi cong lai cho biet ma so, loai may báy và tong so phi cong co the lai loai may bay đó.
//			System.out.println(" 16.Voi moi loai may bay co phi cong lai cho biet ma so, loai may báy và tong so phi cong co the lai loai may bay đó.");
//			for (Object[] objects : chungNhanDAOImpl.listMayBayAndCountNV()) {
//				System.out.println("ma may bay: " + objects[0] + ", loai: " + objects[1] + ", tong so phi cong co the lai: " + objects[2]);
//			}
//			// 17.	Giả sử một hanh khách muốn di thẳng từ ga A den ga B rồi quay trở về ga A. Cho biet cac đường bay nào co the đáp ứng yêu cầu này.
//			System.out.println("17.	Gia su 1 hanh khach muon di thang tu ga A den tu ga Broi quay tro ve ga A. Cho biet cac đường bay nào co the đáp ứng yêu cầu này.");
//			System.out.println((chuyenBayDAOImpl.listABA()));
//			// 18. Voi moi ga co chuyen bay xuat phat từ đó cho biet co bao nhieu chuyen bay khoi hanh tu ga do.
//			System.out.println("18. Voi moi ga co chuyen bay xuat phat tu do cho biet co bao nhieu chuyen bay khoi hanh tu ga đó.");
//			for (Object[] objects : chuyenBayDAOImpl.listGroupGaDi()) {
//				System.out.println("Ga di: " + objects[0] + ", so luong chuyen khoi hanh: " + objects[1]);
//			}
//			//19. Voi moi ga co chuyen bay xuat phat từ đó cho biet tong chi phi phai tra cho phi cong lai cac chuyen bay khoi hanh tu ga do.
//			System.out.println("19.	Voi moi ga co chuyen  bay xuat phat từ đó cho biet tong chi phi phai tra cho phi cong lai cac chuyen bay khoi hanh từ ga đó.");
//			for (Object[] objects : chuyenBayDAOImpl.listSumChiPhi()) {
//				System.out.println("Ga di: " + objects[0] + ", tong chi phi: " + objects[1]);
//			}
//			// 20.	Cho biet danh sach cac chuyen bay co the khoi hanh truoc 12:00 ??? 12pm or 12am
//			System.out.println(" 20.Cho biet danh sach cac chuyen bay co the khoi hanh truoc 12:00 ??? 12pm or 12am.");
//			System.out.println((chuyenBayDAOImpl.list1200()));
//			// 21. Voi moi dia diem xuat phat cho biet co bao nhieu chuyen bay co the khoi hanh truoc 12:00.
//			System.out.println(" 21. Voi moi dia diem xuat phat cho biet co bao nhieu chuyen bay co the khoi hanh truoc 12:00.");
//			for (Object[] objects : chuyenBayDAOImpl.list1200GroupGaDi()) {
//				System.out.println("Ga di: " + objects[0] + ", so lượng chuyen khoi hanh " + objects[1]);
//			}
//			//22. Cho biet ma so của cac phi cong chỉ lai duoc 3 loai may bay
//			System.out.println(" 22.Cho biet ma so của cac phi cong chỉ lai duoc 3 loai may bay");
//			for (Object[] objects : chungNhanDAOImpl.listNVHavingMaMB3()) {
//				System.out.println("Ma phi cong: " + objects[0] );
//			}
//			//23. Voi moi phi cong co the lai nhieu hon 3 loai may bay, cho biet ma so phi cong và tam bay lon nhat của cac loai may bay ma phi cong đó co the lai.
//			System.out.println(" 23.Voi moi phi cong co the lai nhieu hon 3 loai may bay, cho biet ma so phi cong và tam bay lon nhat của cac loai may bay ma phi cong đó co the lai.");
//			for (Object[] objects : mayBayDAOImpl.listMaMBMAX3AndTamBay()) {
//				System.out.println("ma phi cong: " + objects[0] + ", tam bay lon nhat: " + objects[1]);
//			}
//			//24. Voi moi phi cong cho biet ma so phi cong và tong so loai may bay ma phi cong đó co the lai.
//			System.out.println("24.	Voi moi phi cong cho biet ma so phi cong va tong so loai may bay ma phi cong đó co the lai.");
//			for (Object[] objects : mayBayDAOImpl.listNVOfMayBay()) {
//				System.out.println("ma phi cong: " + objects[0] + ", tong loai may bay co the lai: " + objects[1]);
//			}
//			//25. Tim cac nhan vien không phai la phi cong.
//			System.out.println(" 25.Tim cac nhan vien không phai la phi cong.");
//			for (Object[] objects : nhanVienDAOImpl.listNotPhiCong()) {
//				System.out.println("ma nhan vien: " + objects[0] + ", Ten: " + objects[1] + ", Luong: " + objects[2]);
//			}
//			//26. Cho biet ma so của cac nhan vien co Luong cao nhat.
//			System.out.println(" 26.Cho biet ma so của cac nhan vien co Luong cao nhat.");
//			for (Object[] objects : nhanVienDAOImpl.listLuongMax()) {
//				System.out.println("ma NV co Luong cao nhat la: " + objects[0]);
//			}
//			//27. Cho biet tong so Luong phai tra cho cac phi cong.
//			System.out.println("27.Cho biet tong so Luong phai tra cho cac phi cong.");
//			System.out.println(("tong Luong phai tra cho phi cong la: " + nhanVienDAOImpl.sumLuongNV()));
//			//28. Tim cac chuyen bay co the duoc thuc hien boi tat ca cac loai may bay Boeing.
//			System.out.println("28.	Tim cac chuyen bay co the duoc thuc hien boi tat ca cac loai may bay Boeing.");
//			for (Object[] objects : chuyenBayDAOImpl.listMaxTamBayOfBoeing("Boeing")) {
//				System.out.println("ma chuyen bay: " + objects[0] + ", Ga di: " + objects[1] + ", Ga den: " + objects[2]+ ", Do dai: " + objects[3]+ ", Gio di: " + objects[4]+ ", Gio den: " + objects[5]+ ", Chi phi: " + objects[6]);
//			}
//			
		});
	}

	public static void main(String[] args) {
		SpringApplication.run(ThTuan4SpringDataJpaApplication.class, args);
	}

}