
public class HCN {
	private Diem d1;
	private Diem d2;
	
	public HCN(Diem d1, Diem d2)
	{
		this.d1 = d1;
		this.d2 = d2;
	}
	
	public double chuVi()
	{
		return (d1.khoangCachDiem(d1.getX(), d2.getY()) + d2.khoangCachDiem(d1.getX(), d2.getY())) *2;
	}
	public double dienTich()
	{
		return d1.khoangCachDiem(d1.getX(), d2.getY()) * d2.khoangCachDiem(d1.getX(), d2.getY());
	}
	public String toString()
	{
		return "" + dienTich();
	}
	public String toString1()
	{
		return "[(" + d1.getX() + "," + d1.getY() + "), (" + d2.getX() + "," + d2.getY() + ")]";

	} 
}
