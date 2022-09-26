package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();

	}

	public static void sayiBulmaca() {
		int[] sayilar = { 1, 2, 3, 4, 5, 6, 7, 9, 0 };
		int aranacak = 6;
		boolean varMı = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMı = true;
				break;
			}
		}

		if (varMı) {
			// System.out.println("Sayı Mevcuttur:" + aranacak);
			mesajVer("Sayı Mevcuttur:" + aranacak);
		} else {
			mesajVer("Sayı Mevcut Değildir:" + aranacak);
		}
	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
