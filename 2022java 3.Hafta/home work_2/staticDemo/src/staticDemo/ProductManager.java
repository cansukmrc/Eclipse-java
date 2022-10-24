package staticDemo;

//ürün ekleyecek ortam
public class ProductManager {
	public void add(Product product) {
		//ProductValidator validator = new ProductValidator(); //validator sınıfında ürün var mı yok mu diye kontrol etmiştik
		if(ProductValidator.isValid(product)) {   //bu arada eger doluysa bunu yap değilse else yap dedik
			System.out.println("Eklendi");
		}else {
			System.out.println("Ürün eklenmedi");
		}
		
	}
}
