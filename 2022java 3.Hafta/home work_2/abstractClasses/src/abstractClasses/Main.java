package abstractClasses;

public class Main {
	// bir oyunun kullanıcı bazlı puan hesaplamasını yapan bir program hazırlayalım
	// biz her kullanıcı için farklı bir hesap yapmasını istiyoruz mesela o zaman bu
	// işlem için iki yolumuz var
	// overriding yada abstract ikinci yolu kullanacağız

	public static void main(String[] args) {
		GameCalculator[] calculators = new GameCalculator[] { new KidsGameCalculator(), new WomanGameCalculator(),
				new ManGameCalculator() };
		for (GameCalculator calculator : calculators) {
			calculator.hesapla();
		}

	}

}
