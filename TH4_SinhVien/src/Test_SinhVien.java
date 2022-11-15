import java.util.Date;

public class Test_SinhVien {
	public static void main(String[] args) {
		SV sv1 = new SV("ne Ngoc a", new Date("9/19/1970"), 8.2);
		SV sv2 = new SV("de Ngoc a", new Date("8/5/2000"), 7.2);
		SV sv3 = new SV("de Ngoc a", new Date("12/15/2003"), 5.2);
		SV sv4 = new SV("ne Ngoc d", new Date("6/10/1978"), 6.2);
		SV sv5 = new SV("ne Ngoc d", new Date("3/25/1973"), 9.2);
		//sv1.hienThi();
		
		DSSV list = new DSSV(5);
		list.themSV(sv1);
		list.themSV(sv2);
		list.themSV(sv3);
		list.themSV(sv4);
		list.themSV(sv5);
//		System.out.println("-----------------");
//		System.out.println("Họ sinh viên 1: " + sv1.layHo());
//		System.out.println("Tên đệm sinh viên 1: " + sv1.layDem());
//		System.out.println("Tên Sinh viên 1: " + sv1.layTen());
//		System.out.println("Tuổi sinh viên 1: " + sv1.layTuoi());
//		System.out.println("Xếp loại sinh viên 1: " + sv1.layXepLoai());
//		System.out.println("------------");
//		
//		list.lietKeSVTheoHang("Giỏi");
//		list.timTen("nam");
//		System.out.println("Tuổi trung bình: " + list.tinhTuoiTB());
//		list.tangDTB(33);
//		list.hienThi();
//		list.laySV(4);
//		list.sapTen();
//		list.xoa("a");
//		list.hienThi();
//		System.out.println(sv1.giongNhau(sv5));
		list.trungSV();
	}
}
