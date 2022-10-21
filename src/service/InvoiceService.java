package service;

import java.sql.Timestamp;
import java.util.List;

import entity.Invoice;

public interface InvoiceService {

	public void save(Invoice invoice);
	
	public void update(Invoice invoice);
	
	public void delete(int id);
	
	public List<Invoice> findAll();
	
	public List<Invoice> findByDate(Timestamp startDate, Timestamp endDate);
	
	public List<Invoice> findByCustomerPhone(String phone);
	
	
}
