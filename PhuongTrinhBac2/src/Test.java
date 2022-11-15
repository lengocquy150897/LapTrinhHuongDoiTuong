
public class Test {
	public static void main(String[] args) {
		PhuongTrinhBac2 phuongTrinh1 = new PhuongTrinhBac2(2, -5, 3);
		PhuongTrinhBac2 phuongTrinh2 = new PhuongTrinhBac2(6, -5, 2);
		PhuongTrinhBac2 phuongTrinh3 = new PhuongTrinhBac2(4, 7, 3);
		PhuongTrinhBac2 phuongTrinh4 = new PhuongTrinhBac2(8, 6, 9);
		PhuongTrinhBac2 phuongTrinh5 = new PhuongTrinhBac2(5, 2, 7);
	
		System.out.println("Phương trình 1:\n" + phuongTrinh1.giaiPhuongTrinh());
		System.out.println("\nPhương trình 2:\n" + phuongTrinh2.giaiPhuongTrinh());
		System.out.println("\nPhương trình 3:\n" + phuongTrinh3.giaiPhuongTrinh());
		System.out.println("\nPhương trình 4:\n" + phuongTrinh4.giaiPhuongTrinh());
		System.out.println("\nPhương trình 5:\n" + phuongTrinh5.giaiPhuongTrinh());
	}
}
	