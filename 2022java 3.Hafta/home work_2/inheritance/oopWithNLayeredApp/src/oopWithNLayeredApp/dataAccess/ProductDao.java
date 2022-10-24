package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;
//hibernate ve jdbc birbirinin alternatifi oldugundan interface yaptık
public interface ProductDao {
	void add(Product product);
}
