package kodlamaIODemo.business;

import java.util.List;

import kodlamaIODemo.core.logging.Logger;
import kodlamaIODemo.dataAccess.CategoryDao;
import kodlamaIODemo.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private List<Category> categories;
	private Logger[] loggers;

	public CategoryManager(List<Category> categories, CategoryDao categoryDao, Logger[] loggers) {

		this.categoryDao = categoryDao;
		this.categories = categories;
		this.loggers = loggers;
	}

	public void add(Category category) throws Exception {
		for (Category newCategoryName : categories) {
			if (category.getCategoryName() == newCategoryName.getCategoryName()) {
				throw new Exception("Kategori adı tekrar edemez.");
			}
		}

		categoryDao.add(category);
		categories.add(category);

		for (Logger logger : loggers)
			logger.log(category.getCategoryName());

	}

}