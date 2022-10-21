package entity;

import java.util.ArrayList;
import java.util.List;

public class Account {

	private int id;
	
	private String username;
	
	private String password;
	
	private int active;
	
	private String fullname;
	
	private String phone;

	private List<Roles> roles = new ArrayList<Roles>();
	
	public Account() {
		
	}

	public Account(String username, String password, int active, String fullname, String phone) {
		this.username = username;
		this.password = password;
		this.active = active;
		this.fullname = fullname;
		this.phone = phone;
	}

	public Account(int id, String username, String password, int active, String fullname, String phone) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.active = active;
		this.fullname = fullname;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Roles> getRoles() {
		return roles;
	}

	public void setRoles(List<Roles> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", username=" + username + ", password=" + password + ", active=" + active
				+ ", fullname=" + fullname + ", phone=" + phone + ", roles=" + roles + "]";
	}
	
	
	
}
