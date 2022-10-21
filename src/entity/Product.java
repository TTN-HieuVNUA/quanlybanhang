package entity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class Product {

	private int id;
	
	private String name;
	
	private Double price;
	
	private String image;
	
	private int quantity;
	
	private Timestamp createdDate;

	private Category category;
	
	private Account createdBy;
	
	private List<ProductDetail> productDetails = new ArrayList<ProductDetail>();

	public Product() {
		
	}

	public Product(String name, Double price, String image, int quantity, Timestamp createdDate) {
		this.name = name;
		this.price = price;
		this.image = image;
		this.quantity = quantity;
		this.createdDate = createdDate;
	}

	public Product(int id, String name, Double price, String image, int quantity, Timestamp createdDate) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.image = image;
		this.quantity = quantity;
		this.createdDate = createdDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Account getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Account createdBy) {
		this.createdBy = createdBy;
	}

	public List<ProductDetail> getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(List<ProductDetail> productDetails) {
		this.productDetails = productDetails;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", image=" + image + ", quantity="
				+ quantity + ", createdDate=" + createdDate + ", category=" + category + ", createdBy=" + createdBy
				+ ", productDetails=" + productDetails + "]";
	}
	
	
}
