
public class Test {
	public static void main(String[] args) {
		ATM taiKhoan1 = new ATM("1111111", 100);
		ATM taiKhoan2 = new ATM("2222222", 200);
		ATM taiKhoan3 = new ATM("3333333", 300);
		ATM taiKhoan4 = new ATM("4444444", 400);
		ATM taiKhoan5 = new ATM("5555555", 500);
		
		taiKhoan1.napTien(1000);
		taiKhoan1.chuyenTien(taiKhoan2, 500);
		taiKhoan2.rutTien(200);
		
		System.out.println("Số dư tài khoản 1: " + taiKhoan1.getsoDu());
		System.out.println("Số dư tài khoản 2: " + taiKhoan2.getsoDu());
		System.out.println("Số dư tài khoản 3: " + taiKhoan3.getsoDu());
		System.out.println("Số dư tài khoản 4: " + taiKhoan4.getsoDu());
		System.out.println("Số dư tài khoản 5: " + taiKhoan5.getsoDu());
		
		System.out.println("Tổng tiền của các tài khoản: " + (taiKhoan1.getsoDu()+taiKhoan2.getsoDu()
								+taiKhoan3.getsoDu()+taiKhoan4.getsoDu()+taiKhoan5.getsoDu()));
	}
}
