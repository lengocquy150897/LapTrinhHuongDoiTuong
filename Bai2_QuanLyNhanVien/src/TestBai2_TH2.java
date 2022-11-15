import java.util.Date;

public class TestBai2_TH2 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		
		//Khởi tạo đối tượng Nhân viên
		QuanLyNhanVien nhanVien1 = new QuanLyNhanVien
			("quy1", new Date("1/1/2001"), "Giám đốc", 3.5, 3500);
		QuanLyNhanVien nhanVien2 = new QuanLyNhanVien
			("quy2", new Date("2/2/2002"), "Phó giám đốc", 3.0, 3000);
		QuanLyNhanVien nhanVien3 = new QuanLyNhanVien
			("quy3", new Date("3/3/2003"), "Phó giám đốc", 3.0, 3000);
		QuanLyNhanVien nhanVien4 = new QuanLyNhanVien
			("quy4", new Date("4/4/2004"), "Phó phòng", 2.5, 2500);
		QuanLyNhanVien nhanVien5 = new QuanLyNhanVien
			("quy5", new Date("5/5/2005"), "Phó phòng", 2.5, 2500);
		
		//Tạo mảng chứa 5 nhân viên
		QuanLyNhanVien a[] = new QuanLyNhanVien[5];
		a[0] = nhanVien1;
		a[1] = nhanVien2;
		a[2] = nhanVien3;
		a[3] = nhanVien4;
		a[4] = nhanVien5;
		
		/*-	Hiển thị họ tên, lương, bảo hiểm xã hội, 
		bảo hiểm thất nghiệp và thực lĩnh của các nhân viên.*/
		for(int i = 0; i < a.length; i++)
			System.out.println("Nhân viên " + (i + 1) + "\n" + a[i].toString());
		
		System.out.println("---------------------------------");
		//-	Tính tổng lương của các nhân viên
		double tongLuong = 0;
		for(int i = 0; i < a.length; i++)
			tongLuong += a[i].tienLuong();
		System.out.println("Tổng lương của nhân viên: " + tongLuong);
		
		//-	Cho biết nhân viên có tuổi cao nhất.
		int max = 0, i, j = 0;
		for(i = 0; i < a.length; i++)
		{
			if(max < a[i].TinhTuoi())
			{
				max = a[i].TinhTuoi();
				j = i;
			}
		}
		System.out.println("Nhân viên có tuổi cao nhất: " + a[j].getHoTen());
		
		//-	Tính lương trung bình của danh sách
		double luongTrungBinh = tongLuong / a.length;
		System.out.println("Lương trung bình của nhân viên: " + luongTrungBinh);
		}
}
