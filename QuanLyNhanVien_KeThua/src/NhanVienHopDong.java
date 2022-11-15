
public class NhanVienHopDong extends NhanVien{
	private double luong;
	private String loaiHopDong;
	
	public NhanVienHopDong()
	{
		super();
		this.luong = 0.0f;
		this.loaiHopDong = "";
	}
	
	public NhanVienHopDong(String hoTen, String phong, double luong, String loaiHopDong)
	{
		super(hoTen, phong);
		this.luong = luong;
		this.loaiHopDong = loaiHopDong;
	}
	
	public void hienThi()
	{
		super.hienThi();
		System.out.println("Lương: " + luong);
		System.out.println("Loại hợp đồng: " + loaiHopDong);
		System.out.println();
	}
	
	public String loaiNhanVien() 
	{
		return "Nhân viên hợp đồng";
	}
	
	public double layLuong() 
	{
		return luong;
	}
	
	public boolean laNhanVienHopDongDaiHan()
	{
		if(loaiHopDong == "Dài hạn")
			return true;
		return false;
	}
}
