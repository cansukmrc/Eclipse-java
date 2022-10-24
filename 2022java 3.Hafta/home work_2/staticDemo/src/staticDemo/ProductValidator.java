package staticDemo;

public class ProductValidator {
//bi ürünü kayıt ederken ürünün kurallara uygun olup olmadıgını kontroleder
	public static  boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
}
