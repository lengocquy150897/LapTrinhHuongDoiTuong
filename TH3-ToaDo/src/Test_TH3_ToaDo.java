
public class Test_TH3_ToaDo {
	public static void main(String[] args) {
		DSHCN list = new DSHCN(5);
		
		HCN hcn1 = new HCN(new Diem(1, 1), new Diem(15, 9));
		list.add(hcn1);
		HCN hcn2 = new HCN(new Diem(1, 1), new Diem(8, 4));
		list.add(hcn2);
		HCN hcn3 = new HCN(new Diem(1, 1), new Diem(10, 5));
		list.add(hcn3);
		HCN hcn4 = new HCN(new Diem(1, 1), new Diem(11, 6));
		list.add(hcn4);
		HCN hcn5 = new HCN(new Diem(1, 1), new Diem(7, 4));
		list.add(hcn5);
		
		list.hienThi();
		list.sapXep();
		
	}
}
