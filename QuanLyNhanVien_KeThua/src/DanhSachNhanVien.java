
public class DanhSachNhanVien {
	private NhanVien DanhSachNhanVien[];
	private int soNhanVien;
	
	public DanhSachNhanVien(int n)
	{
		DanhSachNhanVien = new NhanVien[n];
		soNhanVien = 0;
	}
	
	public void themNhanVien(NhanVien a)
	{
		if(soNhanVien < DanhSachNhanVien.length)
		{
			DanhSachNhanVien[this.soNhanVien] = a;
			this.soNhanVien++;
		}
	}
	
	public void lietKeSinhVien()
	{
		for(int i = 0; i < this.soNhanVien; i++)
			DanhSachNhanVien[i].hienThi();
	}
	
	public void lietKeNhanVienTheoLoai(String NhanVienKhac)
	{
		for(int i = 0; i < DanhSachNhanVien.length; i++)
		{
			if(DanhSachNhanVien[i].loaiNhanVien().equals(NhanVienKhac))
				DanhSachNhanVien[i].hienThi();
		}
	}
	
	public void tongLuong()
	{
		double tongLuong = 0;
		for(int i = 0; i < this.soNhanVien; i++)
		{
			tongLuong += DanhSachNhanVien[i].layLuong();
		}
		System.out.println("Tổng lương của các nhân viên: " + tongLuong);
	}

	public void laNhanVienHopDongDaiHan()
	{
		for(int i = 0; i < DanhSachNhanVien.length; i++)
		{
			if(DanhSachNhanVien[i].laNhanVienHopDongDaiHan())
				DanhSachNhanVien[i].hienThi();
		}
	}
}
