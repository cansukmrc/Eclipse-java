package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {
	public void add(Product product) {
		//db erişim kodları buraya yazılır.
		System.out.println("JDBC ile veritabanına eklendi");
	}
}
