package youTubeEgitim;

public class TeacherCreditManager extends BaseCreditManager implements ICreditManager {
	@Override               // abstract kullanırken override ederiz sürekli değişen methodu
	public void calculate() {
		System.out.println("Öğretmen Kredisi Hesaplandı");
	}

	/*public void save() {
		System.out.println("Kaydedildi");//save her yerde aynı oldugu için yazmaya gerek yok
	} */
}
