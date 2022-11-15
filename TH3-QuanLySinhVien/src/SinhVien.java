
public class SinhVien {
	private String hoTen;
	private Diem dm1;
	private Diem dm2;
	
	public SinhVien(String hoTen, Diem dm1, Diem dm2) 
	{
		this.hoTen = hoTen;
		this.dm1 = dm1;
		this.dm2 = dm2;
	}
	
	public double tinhDTB()
	{
		return (dm1.tinhDiem()*dm1.getSoTinChi() + dm2.tinhDiem()*dm2.getSoTinChi())/
				(dm1.getSoTinChi() + dm2.getSoTinChi());
	}
	
	public String toString()
	{
		return "Họ và tên: " + hoTen + "\nĐiểm trung bình: " + tinhDTB();
	}
}
