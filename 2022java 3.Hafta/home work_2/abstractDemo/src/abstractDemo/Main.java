package abstractDemo;

public class Main {
//bir müşterinin veri tabanına kaydedilmesini işliyor olacağız,
	//bu işlem için farklı veri tabanları kullanıyor olablir
	
	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		//customerManager.databaseManager = new OracleDatabaseManager();
		customerManager.databaseManager = new SqlServerDatabaseManager();
		customerManager.getCustomer();
		
		

	}

}
