package youTubeEgitim;

public abstract class BaseCreditManager implements ICreditManager {

	public  void save() { // save fonk sabit artık.
		System.out.println("Kaydedildi");

	}

	public abstract void calculate(); // calculate değişken oldugundan abstract tanımlandı.

}
