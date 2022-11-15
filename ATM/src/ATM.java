
public class ATM 
{
	private String soTaiKhoan;	//Biến lưu trữ số tài khoản
	private double soDu;	//Biến lưu trữ số dư tài khoản
	public ATM(String soTaiKhoan, double soDu)
	{
		this.soTaiKhoan = soTaiKhoan;
		this.soDu = soDu;
	}
	
	public String getsoTk()			// Hàm trả về số tài khoản
	{
		return this.soTaiKhoan;
	}
	public double getsoDu()			// Hàm trả về số dư tài khoản
	{
		return this.soDu;
	}
	
	public void napTien(double soTien)		// Hàm nạp tiền
	{
		this.soDu += soTien;
	}
	public boolean rutTien(double soTien)	// Hàm rút tiền
	{
		if(soTien <= this.soDu)
		{
			this.soDu -= soTien;
			return true;
		}
		else return false;
	}
	public boolean chuyenTien(ATM taiKhoan, double soTien)	// Hàm chuyển tiền
	{
		if(soTien <= this.soDu)
		{
			taiKhoan.napTien(soTien);	// Dùng hàm nạp tiền
			this.soDu -= soTien;
			return true;
		}
		else return false;
	}
}
