package com.syntax.class23;

public class WebDriver {

	public void open() {
		System.out.println("Opening browser");
	}

	public void get(String property) {
		//
		
	}
}

class FirefoxDriver extends WebDriver {
	public void open() {
		System.out.println("Opening firefox browser");
	}
}

class ChromeDriver extends WebDriver {

	public void open() {
		System.out.println("Opening chrome browser");
	}
}

class InternetExplorerDriver extends WebDriver {
	public void open() {
		System.out.println("Opening ie browser");
	}
}