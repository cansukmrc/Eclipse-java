package youTubeEgitim;

public class CustomerManager  {
	
	private Customer _customer;
	private ICreditManager _creditManager;
	
	public CustomerManager(Customer customer, ICreditManager creditManager) {
		_customer = customer;
		_creditManager = creditManager;
	}

	public void save() {
		System.out.println("Müsteri  kayıt edildi " );
	}

	public void delete() {
		System.out.println("Müsteri  silindi " );
	}
	
	public void giveCredit() {
		_creditManager.calculate();
		System.out.println("Kredi Verildi"); 
	}

}
