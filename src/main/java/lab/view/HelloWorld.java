package lab.view;

import co.xideral.bean.RateTypes;

public class HelloWorld {
	private String name;
	private RateTypes rate = new RateTypes();
	
	
	public void setName(String name) {
		this.name = name;
	}

	public void printHello() {
		System.out.println("Hello ! " + name);
	}
}
