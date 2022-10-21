package service;

import entity.InvoiceDetail;

public interface InvoiceDetailService {

	public void save(InvoiceDetail invoiceDetail);
	
	public void delete(int id);
	
	public void deleteByInvoiceId(int invoiceId);
	
	
}
