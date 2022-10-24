package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;

	public ProductManager(ProductDao productDao,Logger[] loggers) {//productManager newlendiğinde bana bir productdao ver(dataAccess içindeki interface) 
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception {//bu method çağırıldığında böyle bir hata fırlatılabilir.

		if (product.getUnitPrice() < 10) {
			throw new Exception("Ürün fiyatı 10 dan küçük olamaz");//hata fırlatır.
		}

		// HibernateProductDao productDao = new HibernateProductDao();//bağımlılığa sebep olur
		productDao.add(product);

		for (Logger logger : loggers) {//[db,file]
			logger.log(product.getName());

		}

	}
}
