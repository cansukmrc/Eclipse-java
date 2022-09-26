package methods2;

public class Main {

	public static void main(String[] args) {
		int sayi = topla(5, 7);
		System.out.println(sayi);
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);

		int topla = topla2(2, 3, 6);
		System.out.println(topla);

	}

	public static void ekle() {

	}

	public static void sil() {

	}

	public static void güncelle() {

	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;

	}

	public static String sehirVer() {
		return "Ankara";
	}

	public static int topla2(int... sayilar) { // variable arguments
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam += sayi;
		}
		return toplam;
	}

}
