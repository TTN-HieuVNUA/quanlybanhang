package dao;

import java.util.List;

import entity.Product;
import service.ProductService;

public class ProductDao implements ProductService{

	@Override
	public void save(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> search(String param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findByCategoryId(int categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> searchAdvance(Integer category, String param, Double price_small, Double price_large,
			String color, String size) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> listProductLess(Integer quantity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getBestSellingProduct(Integer month, Integer year, Integer quantity) {
		// TODO Auto-generated method stub
		return null;
	}

}
