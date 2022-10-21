package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import Connect.ConnectJDBC;
import entity.Account;
import init.Contains;
import service.AccountService;

public class AccountDao implements AccountService {

	private Connection connection = ConnectJDBC.getConnect();
	PreparedStatement pre = null;
	ResultSet res = null;

	private RoleDao roleDao = new RoleDao();

	@Override
	public Account login(String username, String password) {
		String sql = "select * from account where username = ? and password = ?";
		try {
			pre = connection.prepareStatement(sql);
			pre.setString(1, username);
			pre.setString(2, password);
			res = pre.executeQuery();
			if (res.next()) {
				int id = res.getInt("id");
				Contains.accountLogged = new Account(res.getInt("id"), res.getString("username"),
						res.getString("password"), res.getInt("active"), res.getString("fullname"),
						res.getString("phone"));
				Contains.accountLogged.setRoles(roleDao.findByUserId(id));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Contains.accountLogged;
	}

	@Override
	public void save(Account account) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Account account) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int accountId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Account findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void blockAccount(int accountId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Account> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> search(String param) {
		// TODO Auto-generated method stub
		return null;
	}

}
