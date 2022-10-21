package entity;

import java.util.ArrayList;
import java.util.List;

public class ProductDetail {

	private int id;
	
	private String color;
	
	private String size;
	
	private int quantity;
	
	private Product product;
	
	private List<InvoiceDetail> invoiceDetails = new ArrayList<InvoiceDetail>();

	public ProductDetail() {
		
	}

	public ProductDetail(String color, String size, int quantity) {
		this.color = color;
		this.size = size;
		this.quantity = quantity;
	}

	public ProductDetail(int id, String color, String size, int quantity) {
		this.id = id;
		this.color = color;
		this.size = size;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public List<InvoiceDetail> getInvoiceDetails() {
		return invoiceDetails;
	}

	public void setInvoiceDetails(List<InvoiceDetail> invoiceDetails) {
		this.invoiceDetails = invoiceDetails;
	}

	@Override
	public String toString() {
		return "ProductDetail [id=" + id + ", color=" + color + ", size=" + size + ", quantity=" + quantity
				+ ", product=" + product + ", invoiceDetails=" + invoiceDetails + "]";
	}
	
	
}
