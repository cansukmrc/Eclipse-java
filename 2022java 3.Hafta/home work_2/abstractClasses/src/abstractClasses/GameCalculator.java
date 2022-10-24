package abstractClasses;
//temel nesne (ana sınıf)
public abstract class GameCalculator {
	public abstract void hesapla();
		
	
	public final void gameOver() { //kullanıldığı hiç bir sınıfta değiştirilemesin(final)
		System.out.println("Oyun Bitti");
	}
}

// her kullanıcının farklı hesaplama yapabilmesi için
//abstract yolunu kullanacaktık
//bunun için ilk olarak ana classa abstract yazmalıyız sonrasında değişiklik yapılmasına izin veridiğimiz
//metota abstract yazmalıyız bu sayede tüm claslarca kullanılıp kullanıcıya yada işe göre
// değişiklik yapılabilecek.