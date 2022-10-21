package service;

import java.util.List;

import entity.Product;

public interface ProductService {

	public void save(Product product);
	
	public void update(Product product);
	
	public void delete(int id);
	
	public List<Product> findAll();
	
	public List<Product> search(String param);
	
	public List<Product> findByCategoryId(int categoryId);
	
	public List<Product> searchAdvance(Integer category, String param, Double price_small, Double price_large, String color, String size);
	
	//lay ra list sp co so luong nho hon
	public List<Product> listProductLess(Integer quantity);
	
	// lay ra danh sach san pham ban chay theo thang, nam, so luong san pham muon lay
	public List<Product> getBestSellingProduct(Integer month, Integer year, Integer quantity);
}
