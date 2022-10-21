package service;


import java.util.List;

import entity.Roles;

public interface RolesService {

	public void save(Roles roles);
	
	public void deleteByAccountId(int accountId);
	
	public List<Roles> findByUserId(int userId);
}
