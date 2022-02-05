package net.slimou.dummies;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DummyService {

	public String helloFromService() {
		return "Hello from Service";
	}

}
