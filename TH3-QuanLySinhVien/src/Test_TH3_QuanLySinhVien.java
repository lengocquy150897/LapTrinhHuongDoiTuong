
public class Test_TH3_QuanLySinhVien {
	public static void main(String[] args) 
	{
		Diem d1 = new Diem("toan", 3, 8.0, 7.0, 10.0);
		Diem d2 = new Diem("tin", 2, 5.0, 6.0, 9.0);
		
		SinhVien sv1 = new SinhVien("cuong", d1, d2);
		System.out.println(sv1.toString());
	}
}
