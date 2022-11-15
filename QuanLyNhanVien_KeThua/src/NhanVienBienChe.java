
public class NhanVienBienChe extends NhanVien{
	private double heSoLuong;
	private int soNamCongTac;
	
	public NhanVienBienChe()
	{
		super();
		this.heSoLuong = 0.0f;
		this.soNamCongTac = 0;
	}
	public NhanVienBienChe(String hoTen, String phong, double heSoLuong, int soNamCongTac)
	{
		super(hoTen, phong);
		this.heSoLuong = heSoLuong;
		this.soNamCongTac = soNamCongTac;
	}
	
	public void hienThi()
	{
		super.hienThi();
		System.out.println("Hệ số lương: " + heSoLuong);
		System.out.println("Số năm công tác: " + soNamCongTac);
		System.out.println();
	}
	
	public String loaiNhanVien()
	{
		return "Nhân viên biên chế";
	}
	
	public double layLuong()
	{
		return heSoLuong * soNamCongTac;
	}
	
	
}
