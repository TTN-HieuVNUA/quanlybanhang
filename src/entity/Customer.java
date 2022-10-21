package entity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class Customer {

	private int id;
	
	private String name;
	
	private String phone;
	
	private Timestamp createdDate;
	
	private List<Invoice> invoices = new ArrayList<Invoice>();

	public Customer() {
		
	}

	public Customer(String name, String phone, Timestamp createdDate) {
		this.name = name;
		this.phone = phone;
		this.createdDate = createdDate;
	}

	public Customer(int id, String name, String phone, Timestamp createdDate) {
		this.id = id;
		this.name = name;
		this.phone = phone;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public List<Invoice> getInvoices() {
		return invoices;
	}

	public void setInvoices(List<Invoice> invoices) {
		this.invoices = invoices;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phone=" + phone + ", createdDate=" + createdDate
				+ ", invoices=" + invoices + "]";
	}
	
	
}
