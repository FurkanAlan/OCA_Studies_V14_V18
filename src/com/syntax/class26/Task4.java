package com.syntax.class26;

interface WebDriver {

	void open();

	void close();

	String getTitle();
}

interface TakeScreenShot {
	void getScreenShot();
}

interface RemoteWebDriver extends WebDriver, TakeScreenShot {
	void navigate();
}

class ChromeDriver implements RemoteWebDriver {
	@Override
	public String getTitle() {
		String getTitle = "Chrome";
		return getTitle;
	}

	@Override
	public void open() {
		System.out.println("We can open browser in " + this.getTitle());
	}

	@Override
	public void close() {
		System.out.println("We can close browser in " + this.getTitle());
	}

	@Override
	public void getScreenShot() {
		System.out.println(this.getTitle() + " can take screenshot");
	}

	@Override
	public void navigate() {
		System.out.println(this.getTitle() + " can navigate");
	}
}

class FirefoxDriver implements RemoteWebDriver {

	@Override
	public void open() {
		System.out.println("Firefox Browser opens");
	}

	@Override
	public void close() {
		System.out.println("Firefox Browser has closed");
	}

	@Override
	public String getTitle() {
		String getTitle = "www.syntaxtechs.com";
		return getTitle;
	}

	@Override
	public void getScreenShot() {
		System.out.println("Screenshot has been taken");
	}

	@Override
	public void navigate() {
		System.out.println("Navigating web page");
	}
}

class SafariDriver implements RemoteWebDriver {

	@Override
	public void open() {
		System.out.println("Safari Browser opens");
	}

	@Override
	public void close() {
		System.out.println("Safari Browser has closed");
	}

	@Override
	public String getTitle() {
		String getTitle = "www.syntaxtechs.com";
		return getTitle;
	}

	@Override
	public void getScreenShot() {
		System.out.println("Screenshot has been taken");
	}

	@Override
	public void navigate() {
		System.out.println("Navigating web page");
	}
}

public class Task4 {

	public static void main(String[] args) {
		
		RemoteWebDriver[] browserArray={new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};
		
		for(RemoteWebDriver browser: browserArray) {
			browser.open();
			browser.close();
			browser.getScreenShot();
			System.out.println(browser.getTitle());
			browser.navigate();
			System.out.println(" -----------------   ");
		}
	}
}
