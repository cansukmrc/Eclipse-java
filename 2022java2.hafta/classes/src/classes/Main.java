package classes;

public class Main {

	public static void main(String[] args) {
		//classes reference type
	 CustomerManager customerMenager = new CustomerManager();	 
	 CustomerManager customerMenager2 = new CustomerManager();	
	
	 customerMenager = customerMenager2;
	 
	 customerMenager.Add();
	 customerMenager.Remove();
	 customerMenager.Update();
	 
	 int sayi1 = 10;
	 int sayi2 = 20;
	 sayi2 = sayi1;
	 sayi1 = 30;
	 System.out.println(sayi1);
	 System.out.println(sayi2);
	 
	 int[] sayilar1 = new int[] {1, 2, 3};
	 int[] sayilar2= new int[] {4, 5, 6};
	 sayilar1 = sayilar2;
	 sayilar1[0]=10;
	 System.out.println(sayilar2[0]);
	 
	 

	}
	
}
