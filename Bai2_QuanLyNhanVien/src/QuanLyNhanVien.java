import java.util.Date;
import java.text.SimpleDateFormat;

public class QuanLyNhanVien {
	SimpleDateFormat ns = new SimpleDateFormat("dd/MM/yyyy");//Định dạng dd/MM/yyyy
	private static String hoTen;
	private static Date ngaySinh;
	private static String chucVu;
	private static double heSoLuong;
	private static int luongCoBan;
	
	public QuanLyNhanVien(String hoTen, Date ngaySinh, String chucVu, 
						  double heSoLuong, int luongCoBan)
	{
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.chucVu = chucVu;
		this.heSoLuong = heSoLuong;
		this.luongCoBan = luongCoBan;
	}
	public String getHoTen()
	{
		return this.hoTen;
	}
	//Tính tiền lương
	public static double tienLuong()
	{
		double tienLuong = 0;
		if(chucVu == "Giám đốc")
			tienLuong = (heSoLuong + 1.0)*luongCoBan;
		if(chucVu == "Phó giám đốc")
			tienLuong = (heSoLuong + 0.8)*luongCoBan;
		if(chucVu == "Phó phòng")
			tienLuong = (heSoLuong + 0.5)*luongCoBan;
		return tienLuong;
	}
	//Tính tiền Bảo hiểm xã hội
	public static double tienBaoHiemXaHoi()
	{
		double tienBaoHiemXaHoi = tienLuong() * 0.06;
		return tienBaoHiemXaHoi;
	}
	//Tính tiền Bảo hiểm thất nghiệp
	public static double tienBaoHiemThatNgiep()
	{
		double tienBaoHiemThatNghiep = tienLuong() * 0.01;
		return tienBaoHiemThatNghiep;
	}
	// Tính Tiền thực lĩnh
	public double tienConNhan()
	{
		double tienConNhan = tienLuong() - (tienBaoHiemXaHoi() + tienBaoHiemThatNgiep());
		return tienConNhan;
	}
	//Đổi ngày tháng năm --> tuổi
	@SuppressWarnings("deprecation")
	public static int TinhTuoi() {
		Date birthDay = ngaySinh;
        Date today = new Date();
        int age = today.getYear() - birthDay.getYear();
        if (today.getDate() <= birthDay.getDate())
              return -1;
        return age;
    }
	// Hiển thị
	public String toString()
	{
		return "Họ và tên: " + this.hoTen + 
				"\nNgày tháng năm sinh: " + this.ns.format(ngaySinh) +
				"\nTiền lương: " + tienLuong() +
				"\nTiền bảo hiểm thất nghiệp: " + this.tienBaoHiemThatNgiep() +
				"\nTiền bảo hiểm xã hội: " + this.tienBaoHiemXaHoi() + 
				"\nTiền thực lĩnh: " + tienConNhan() + "\n";
	}
}
