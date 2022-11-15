import java.util.Arrays;

public class DSHCN {
	private HCN[] danhSach;
	private int soPhanTu;
	
	public DSHCN(int n) 
	{
		danhSach = new HCN[n];
		soPhanTu = 0;
	}
	
	public void add(HCN a) 
	{
		if (soPhanTu < danhSach.length)
			danhSach[soPhanTu++] = a;
	}
	
	public void hienThi()
	{

		for(int i = 0; i < danhSach.length; i++)
		{
			System.out.println("Hình chữ nhật " + (i+1) + ":" + danhSach[i].toString1());
			System.out.println("Chu vi: " + danhSach[i].chuVi());
			System.out.println("Diện tích: " + danhSach[i].dienTich());
			System.out.println("\n");
		}	
	}
	
	public void  sapXep () { 
	    HCN  temp ;
	    for  ( int  i =  0 ; i < danhSach.length; i ++) {
	        for  ( int  j =  0 ; j < danhSach.length -  1  - i; j ++) {
	            if  (danhSach[j].dienTich() > danhSach[j +  1 ].dienTich()) {
	                temp = danhSach[j];
	                danhSach[j] = danhSach[j + 1];
	                danhSach[j + 1 ] = temp;
	            }
	        }
	    }
	    System.out.println (Arrays.toString (danhSach));
	}
}
