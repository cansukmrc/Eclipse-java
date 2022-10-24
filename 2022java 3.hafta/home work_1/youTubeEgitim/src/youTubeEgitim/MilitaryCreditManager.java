package youTubeEgitim;

public class MilitaryCreditManager extends BaseCreditManager implements ICreditManager {

	@Override
	public void calculate() {
		System.out.println("Esnaf Kredisi Hesaplandı");
	}

	/*
	 * public void save() { System.out.println("Kaydedildi"); // abstract sayesinde
	 * bu fonk yazmamıza gerek kalmayacak.
	 * 
	 * }
	 */
}
