package interfaces;

public class CustomerManager {
	//5-10 satıra kadar olan  ifade ICustomerDal içerisine erişip kullanabilmek için
	//customerDal adında nesne tanımladık ve yapıcı  metot içerisinde ICustomerDal nesnesini çağırdık,
	// gelen bilgiyi olusturmuş oldugumuz nesnenin içerisine atadık(11)
	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		
		this.customerDal = customerDal;
	}

	public void add() {
		//iş kodları yazılır.(müşterini adı girilmiş mi, bigileri doğru mu gibi kodlar)
		
		customerDal.add();
	}

}
