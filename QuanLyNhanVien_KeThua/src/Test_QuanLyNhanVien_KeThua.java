
public class Test_QuanLyNhanVien_KeThua {
	public static void main(String[] args) {
		NhanVien nvbc1 = new NhanVienBienChe("Quý", "Nhân sự", 3.5, 5);
		NhanVien nvbc2 = new NhanVienBienChe("Hậu", "Kinh Doanh", 3.5, 8);
		NhanVien nvbc3 = new NhanVienBienChe("Duy", "Marketing", 3.5, 4);
		//nvbc1.hienThi();
		NhanVien nvhd1 = new NhanVienHopDong("Uyên", "Đào tạo", 1000, "Dài hạn");
		NhanVien nvhd2 = new NhanVienHopDong("Xuyến", "Kỹ Thuật", 5000, "Dài hạn");
		NhanVien nvhd3 = new NhanVienHopDong("Nghĩa", "Hành chính", 2000, "Ngắn hạn");
		//nvhd1.hienThi();
		
		DanhSachNhanVien list = new DanhSachNhanVien(5);
		list.themNhanVien(nvbc1);
		list.themNhanVien(nvbc2);
		list.themNhanVien(nvbc3);
		list.themNhanVien(nvhd1);
		list.themNhanVien(nvhd2);
		//list.lietKeSinhVien();
		list.lietKeNhanVienTheoLoai("Nhân viên hợp đồng");
		//list.laNhanVienHopDongDaiHan();
		list.tongLuong();
	}
}
