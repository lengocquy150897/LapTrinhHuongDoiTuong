
public class Diem {
	private String tenHocPhan;
	private int soTinChi;
	private double chuyenCan;
	private double giuaKy;
	private double cuoiKy;
	
	public Diem(String tenHocPhan, int soTinChi, double chuyenCan, double giuaKy, double cuoiKy) 
	{
		this.tenHocPhan = tenHocPhan;
		this.soTinChi = soTinChi;
		this.chuyenCan = chuyenCan;
		this.giuaKy = giuaKy;
		this.cuoiKy = cuoiKy;
	}
	
	public int getSoTinChi()
	{
		return this.soTinChi;
	}
	
	public double tinhDiem()
	{
		return chuyenCan*0.1 + giuaKy*0.2 + cuoiKy*0.7;
	}

}
