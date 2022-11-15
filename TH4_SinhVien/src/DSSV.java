import java.util.Date;

public class DSSV {
	private SV DSSV[];
	private int soSinhVien;
	
	public DSSV(int n)
	{
		DSSV = new SV[n];
		soSinhVien = 0;
	}
	
	public void themSV(SV a)
	{
		if(soSinhVien < DSSV.length)
		{
			DSSV[soSinhVien] = a;
			soSinhVien++;
		}	
	}
	
	public void laySV(int i)
	{
		DSSV[i-1].hienThi();
	}
	
	public void hienThi() 
	{
		for(int i = 0; i < soSinhVien; i++)
			DSSV[i].hienThi();
	}
	
	public void sapTen()
	{
		int i,j;
		SV trungGian;
	    for( i = 0 ; i < soSinhVien - 1 ; i++) 
	    {
	        for( j = i + 1 ; j < soSinhVien; j++) 
	        {
	        	String sv1 = DSSV[i].layTen() + " " + DSSV[i].layHo() + " " + DSSV[i].layDem();
	    		String sv2= DSSV[j].layTen() + " " + DSSV[j].layHo() + " " + DSSV[j].layDem();
	            if(sv1.compareToIgnoreCase(sv2) > 0) 
	            {
	                trungGian = DSSV[i];
	                DSSV[i] = DSSV[j];
	                DSSV[j] = trungGian;
	            }
	        }
	    }
	}
	
	public void  sapTuoi () 
	{ 
	    SV trungGian;
	    for(int i = 0; i < soSinhVien; i++) 
	    {
	        for(int j = 0; j < soSinhVien - 1 - i; j++) 
	        {
	            if(DSSV[j].layTuoi() > DSSV[j + 1].layTuoi()) 
	            {
	                trungGian = DSSV[j];
	                DSSV[j] = DSSV[j + 1];
	                DSSV[j + 1] = trungGian;
	            }
	        }
	    }
	} 
	
	public void  sapDTB () 
	{ 
	    SV trungGian;
	    for(int i = 0 ; i < soSinhVien ; i++) 
	    {
	        for(int j = 0 ; j < soSinhVien - 1 - i; j++) 
	        {
	            if(DSSV[j].getDiemTrungBinh() > DSSV[j + 1].getDiemTrungBinh()) 
	            {
	                trungGian = DSSV[j];
	                DSSV[j] = DSSV[j + 1];
	                DSSV[j + 1] = trungGian;
	            }
	        }
	    }
	} 
	
	public void lietKeSVTheoHang(String a)
	{
		for(int i = 0; i < soSinhVien; i++)		
			if(DSSV[i].layXepLoai().equals(a))
				DSSV[i].hienThi();
	}
	
	public void timTen(String a)
	{
		for(int i = 0; i < soSinhVien; i++)
			if(DSSV[i].layTen().equals(a))
				DSSV[i].hienThi();
	}
	
	public double tinhTuoiTB() 
	{
		double tuoiTB = 0;
		for(int i = 0; i < soSinhVien; i++)
			tuoiTB += DSSV[i].layTuoi();
		tuoiTB = tuoiTB / soSinhVien;
		return tuoiTB;
	}
	
	public void tangDTB(int a)
	{
		for(int i = 0; i < soSinhVien; i++)
			if(DSSV[i].layTuoi() >= a)
			{
				DSSV[i].setDiemTrungBinh(DSSV[i].getDiemTrungBinh() + 0.5);
			}
	}
	
	public void xoa(String a)
	{
		int dem = 0;
		for(int i = 0; i < soSinhVien; i++)
		{
			if(DSSV[i].layTen().equalsIgnoreCase(a));
			{
				for(int j = 0; j < soSinhVien - 1 - i; j++)
					 {
						 DSSV[j] = DSSV[j+1];
						 dem++;
					 }
				soSinhVien--;
			}
			break;
		}
		if(dem == 0)
			 System.out.println("Không có ai tên " + a);
		else
			System.out.println("Đã xóa " + a + " vị trí đầu tiên");
	}
	
	public void trungSV()
	{
		int dem = 0;
		for(int i = 0 ; i < soSinhVien - 1; i++)
		{
			for(int j = 0; j < soSinhVien - 1 - i; j++)
				if(DSSV[i].getHoTen().equals(DSSV[j].getHoTen()))
				{
					DSSV[i].hienThi();
					dem++;
					break;
				}
		}
		if(dem == 0)
		System.out.println("Không có 2 sinh viên trùng họ tên!");
	}
	
	public void giongNhau()
	{
		for(int i = 0 ; i < soSinhVien - 1; i++)
		{
			for(int j = 0; j < soSinhVien - 1 - i; j++)
			{
				if(DSSV[i].giongNhau(DSSV))
			}
		}
		
	}
}
