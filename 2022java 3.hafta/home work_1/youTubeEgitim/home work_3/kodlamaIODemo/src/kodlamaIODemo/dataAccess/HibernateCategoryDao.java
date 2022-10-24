package kodlamaIODemo.dataAccess;

import kodlamaIODemo.entities.Category;

public class HibernateCategoryDao implements CategoryDao{
	public void add(Category category) {
		System.out.println("Hibernate ile kategory veritabanına eklendi");
	}

	
}
