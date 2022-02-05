package net.slimou.dummies;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ViewScoped
public class DummyBean implements Serializable {
	
	private static final long serialVersionUID = 627399236624006517L;
	
	private String helloUser;
	
	@Inject
	private DummyService dummyService;
	
	public void helloBean() {
		System.out.println("Hallo from DummyBean");
		System.out.println(this.dummyService.helloFromService());
		this.helloUser = this.dummyService.helloFromService();
	}
	
	private String welcome;
	
	{
		this.welcome = "Welcome to your Dummy Project";
	}

	public String getWelcome() {
		return welcome;
	}

	public void setWelcome(String welcome) {
		this.welcome = welcome;
	}

	public String getHelloUser() {
		return helloUser;
	}

	public void setHelloUser(String helloUser) {
		this.helloUser = helloUser;
	}
	
	
	
	

}
