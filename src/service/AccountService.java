package service;

import java.util.List;

import entity.Account;

public interface AccountService {

	public Account login(String username, String password);
	
	public void save(Account account);

	public void update(Account account);
	
	public void delete(int accountId);
	
	public Account findById(int id);
	
	public void blockAccount(int accountId);
	
	public List<Account> findAll();
	
	public List<Account> search(String param);
	
}
