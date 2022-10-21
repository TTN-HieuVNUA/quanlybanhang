package service;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.List;

import entity.Customer;

public interface CustomerService {

	public void save(Customer customer);
	
	public void update(Customer customer);
	
	public void delete(int id);
	
	public List<Customer> findAll();
	
	public List<Customer> search(String param);
	
	public List<Customer> filterByDate(Timestamp startDate, Timestamp endDate, List<Customer> listCustomers);
	
}
