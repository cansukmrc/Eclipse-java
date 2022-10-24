package interfaces;

public class Main {
	//bir müşterinin veri tabanına kaydedilmesini işliyor olacağız,
		//bu işlem için farklı veri tabanları kullanıyor olablir
		
	public static void main(String[] args) {
		//ICustomerDal customerDal = new ICustomer(); interfaceler newlenemez.
		// bu sebepten ötürü interface den bir nesne oluşturduk customerDal
		//bu nesne interfacelerin implements edildiği sınıfları newleyerek
		// istenilen işlemleri yapıyor
		
		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
		customerManager.add();
		

	}

}
