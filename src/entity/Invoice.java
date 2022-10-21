package entity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class Invoice {

	private int id;
	
	private Timestamp createdDate;
	
	private Double amount;
	
	private Account createdBy;
	
	private Customer customer;
	
	private List<InvoiceDetail> invoiceDetails = new ArrayList<InvoiceDetail>();

	public Invoice() {
		
	}

	public Invoice(Timestamp createdDate, Double amount, Account createdBy) {
		this.createdDate = createdDate;
		this.amount = amount;
		this.createdBy = createdBy;
	}

	public Invoice(int id, Timestamp createdDate, Double amount, Account createdBy) {
		this.id = id;
		this.createdDate = createdDate;
		this.amount = amount;
		this.createdBy = createdBy;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Account getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Account createdBy) {
		this.createdBy = createdBy;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<InvoiceDetail> getInvoiceDetails() {
		return invoiceDetails;
	}

	public void setInvoiceDetails(List<InvoiceDetail> invoiceDetails) {
		this.invoiceDetails = invoiceDetails;
	}

	@Override
	public String toString() {
		return "Invoice [id=" + id + ", createdDate=" + createdDate + ", amount=" + amount + ", createdBy=" + createdBy
				+ ", customer=" + customer + ", invoiceDetails=" + invoiceDetails + "]";
	}
	
	
}
