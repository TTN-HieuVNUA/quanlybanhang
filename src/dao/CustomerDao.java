package dao;

import java.sql.Timestamp;
import java.util.List;

import entity.Customer;
import service.CustomerService;

public class CustomerDao implements CustomerService{

	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> search(String param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> filterByDate(Timestamp startDate, Timestamp endDate, List<Customer> listCustomers) {
		// TODO Auto-generated method stub
		return null;
	}

}
