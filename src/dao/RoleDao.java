package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Connect.ConnectJDBC;
import entity.Roles;
import service.RolesService;

public class RoleDao implements RolesService{

	private Connection connection = ConnectJDBC.getConnect();
	PreparedStatement pre = null;
	ResultSet res = null;
	
	@Override
	public void save(Roles roles) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteByAccountId(int accountId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Roles> findByUserId(int userId) {
		List<Roles> list = new ArrayList<Roles>();
		String sql = "select * from roles where account_id = ?";
		try {
			pre = connection.prepareStatement(sql);
			pre.setInt(1, userId);
			res = pre.executeQuery();
			while(res.next()) {
				list.add(new Roles(res.getInt("id"), res.getString("role_name")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

}
