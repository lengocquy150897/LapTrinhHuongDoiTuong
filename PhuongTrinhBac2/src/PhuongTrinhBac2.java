
public class PhuongTrinhBac2 {
	private double a, b, c;
	public PhuongTrinhBac2(double a, double b, double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public String giaiPhuongTrinh()
	{
		String kq;
		double delta = Math.pow(b, 2) - 4*a*c;
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		double x2 = (-b - Math.sqrt(delta)) / (2 * a);
		if (this.a == 0)
			return "Nhập lỗi";
		if (delta < 0)
			kq = "Phương trình vô nghiệm";
		else if (delta == 0)
			kq = "Phương trình có nghiệm kép: \nx1 = x2 = " + -b / (2 * a);
		else 
			kq = "Phương trình có 2 nghiệm phân biệt: \n" + "x1 = " + x1 + "\nx2 = " + x2; 
		return kq;
		
	}
}
