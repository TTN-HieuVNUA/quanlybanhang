package entity;

public class InvoiceDetail {

	private int id;
	
	private int quantity;
	
	private Double price;
	
	private Invoice invoice;
	
	private ProductDetail productDetail;

	public InvoiceDetail() {
		
	}

	public InvoiceDetail(int quantity, Double price) {
		this.quantity = quantity;
		this.price = price;
	}

	public InvoiceDetail(int id, int quantity, Double price) {
		this.id = id;
		this.quantity = quantity;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	public ProductDetail getProductDetail() {
		return productDetail;
	}

	public void setProductDetail(ProductDetail productDetail) {
		this.productDetail = productDetail;
	}

	@Override
	public String toString() {
		return "InvoiceDetail [id=" + id + ", quantity=" + quantity + ", price=" + price + ", invoice=" + invoice
				+ ", productDetail=" + productDetail + "]";
	}
	
	
}
