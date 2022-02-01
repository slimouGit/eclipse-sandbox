package net.slimou.jsf;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Login {
	
	private String email;
	private String password;	
	private String welcome = "You are logged in";
	
	public Login() {
		super();
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return "password is hidden";
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getWelcome() {
		return welcome;
	}
	public void setWelcome(String welcome) {
		this.welcome = welcome;
	}
	
	
	

}
