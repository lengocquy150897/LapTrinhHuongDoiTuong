
public class Diem {
	private double x;
	private double y;
	
	public Diem(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	public double getX()
	{
		return this.x;
	}
	public double getY()
	{
		return this.y;
	}
	
	public double khoangCachDiem(double x1, double y1)
	{
		return Math.sqrt(Math.pow(x1 - x, 2) + Math.pow(y1 - y, 2));
	}
	
	public String toString()
	{
		return "(" + x + "," + y + ")";
	}
}
