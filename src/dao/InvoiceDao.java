package dao;

import java.sql.Timestamp;
import java.util.List;

import entity.Invoice;
import service.InvoiceService;

public class InvoiceDao implements InvoiceService{

	@Override
	public void save(Invoice invoice) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Invoice invoice) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Invoice> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Invoice> findByDate(Timestamp startDate, Timestamp endDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Invoice> findByCustomerPhone(String phone) {
		// TODO Auto-generated method stub
		return null;
	}

}
