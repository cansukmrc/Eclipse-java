package abstractDemo;

public class CustomerManager {
	
	BaseDatabaseManager databaseManager;
	
	public void getCustomer() { // müşteri getir
//		OracleDatabaseManager oracleDatabaseManager = new OracleDatabaseManager();
//		oracleDatabaseManager.getData();
// bu ifade hatalı değil sadece kullanım mantığı yanlış bu ifadeyi yazarsak müşteri
//getirme işlemi sadece bir database tarafından yapılacak.
// bunun yerine 5. satırı yazdık,
		databaseManager.getData();
	}
}
