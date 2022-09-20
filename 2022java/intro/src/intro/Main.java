package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!");

		String ortaMetin = "İlginizi Çekebilir";
		String altMetin = "Vade Süresi";

		System.out.println(ortaMetin);
		System.out.println(altMetin);

		int vade = 12;
		double dolarDun = 18.21;
		double dolarBugun = 18.20;

		// boolean dolarDustuMu = false;

		String okYonu = ""; // variable empty

		if (dolarBugun < dolarDun) { // true
			okYonu = "down.svg"; // veri şarta göre değer kazandı
			System.out.println(okYonu);
		} else if (dolarBugun > dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);
		} else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}

		String[] krediler = { "Hızlı Kredi", "Maaşını Halkbank'tan Al", "Mutlu Emekli" };

		System.out.println(krediler[0]);
		System.out.println(krediler[1]); // for bu işlemi daha kısa tutar
		System.out.println(krediler[2]);

		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}

	}

}
