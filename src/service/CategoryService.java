package service;

import java.util.List;

import entity.Category;

public interface CategoryService {

	public void save(Category category);
	
	public List<Category> findAll();
	
	public void update(Category category);
	
	public void delete(int id);
	
	public List<Category> search(String param);
}
