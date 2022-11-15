import java.text.SimpleDateFormat;
import java.util.Date;

public class SV {
	SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
	private String hoTen;
	private Date ngaySinh;
	private double diemTrungBinh;
	public SV(String hoTen, Date ngaySinh, double diemTrungBinh) 
	{
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.diemTrungBinh = diemTrungBinh;
	}
	
	public String getHoTen() 
	{
		return hoTen;
	}
	public void setHoTen(String hoTen) 
	{
		this.hoTen = hoTen;
	}
	public Date getNgaySinh() 
	{
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) 
	{
		this.ngaySinh = ngaySinh;
	}
	public double getDiemTrungBinh() 
	{
		return diemTrungBinh;
	}
	public void setDiemTrungBinh(double diemTrungBinh) 
	{
		this.diemTrungBinh = diemTrungBinh;
	}
	
	public void hienThi()
	{
		System.out.println("Họ và tên: " + hoTen);
		System.out.println("Ngày sinh: " + f.format(ngaySinh));
		System.out.println("Điểm trung bình: " + diemTrungBinh);
		System.out.println();
	}
	
	public String layHo()
	{
		//String ho = "";
		int firstSpace = this.hoTen.indexOf(" "); //le ngoc quy
		return this.hoTen.substring(0, firstSpace);
		//return ho;
	}
	
	public String layTen()
	{
		String ten = "";
		int lastSpace = this.hoTen.lastIndexOf(" ");
		ten = this.hoTen.substring(lastSpace + 1);
		return ten;
	}
	
	public String layDem()
	{
		String dem = "";
		int firstSpace = this.hoTen.indexOf(" ");
		int lastSpace = this.hoTen.lastIndexOf(" ");
		dem = this.hoTen.substring(firstSpace + 1, lastSpace);
		return dem;
	}
	
	public int layTuoi()
	{
		Date today = new Date();
		return today.getYear() - ngaySinh.getYear();
	}
	
	//+ Giỏi nếu đtb>=8, Khá: 8> đtb>=7, Trung bình: 7> đtb>=5, Yếu: đtb<5
	public String layXepLoai()
	{
		if(diemTrungBinh >= 8.0)
			return "Giỏi";
		else if(diemTrungBinh >= 7.0)
			return "Khá";
		else if(diemTrungBinh >= 5.0)
			return "Trung bình";
		else
			return "Yếu";
	}
	
	public void lonHon(SV a, SV b)
	{
		if(a.layTuoi() > b.layTuoi())
			System.out.println(a + " lớn hơn " + b);
		else if(a.layTuoi() == b.layTuoi())
			System.out.println(a + " bằng tuổi " + b);
		else
			System.out.println(a + " bé hơn " + b);
	}
	
	public void gioiHon(SV a, SV b)
	{
		if(a.getDiemTrungBinh() > b.getDiemTrungBinh())
			System.out.println(a + " giỏi hơn " + b);
		else if(a.getDiemTrungBinh() == b.getDiemTrungBinh())
			System.out.println(a + " bằng " + b);
		else
			System.out.println(a + " giỏi thua " + b);
	}
	
	public boolean giongNhau(SV orther)
	{
		return this.hoTen.equalsIgnoreCase(orther.getHoTen());
	}
}
