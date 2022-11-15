
abstract public class NhanVien {
	protected String hoTen;
	protected String phong;
	
	public NhanVien()
	{
		this.hoTen ="";
		this.phong = "";
	}
	public NhanVien(String hoTen, String phong)
	{
		this.hoTen = hoTen;
		this.phong = phong;
	}
	
	public void hienThi()
	{
		System.out.println("Họ và tên: " + hoTen);
		System.out.println("Phòng: " + phong);
	}
	
	abstract public String loaiNhanVien();
	abstract public double layLuong();
	public boolean laNhanVienHopDongDaiHan()
	{
		return false;
	}
}
