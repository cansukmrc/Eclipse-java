package kodlamaIODemo.dataAccess;

import kodlamaIODemo.entities.Category;

public class JdbcCategoryDao implements CategoryDao{
	public void add(Category category) {
		System.out.println("JDBC ile kategory veri tabanına eklendi");
	}

	

}
