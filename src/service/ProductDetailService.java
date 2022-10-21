package service;

import java.util.List;

import entity.ProductDetail;

public interface ProductDetailService {

	public List<ProductDetail> findByProductId(int productId);
	
	public void save(ProductDetail productDetail);
	
	public void update(ProductDetail productDetail);
	
	public void delete(int id);
}
