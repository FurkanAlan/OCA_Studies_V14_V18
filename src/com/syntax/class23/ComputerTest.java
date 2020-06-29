package com.syntax.class23;

public class ComputerTest {

	public static void main(String[] args) {
		
		Computer [] comps={new Apple("Apple"), new HP("HP"), new Lenovo("Lenovo")};
		
		for(Computer c:comps) {
			c.run();
			c.save();
			c.storage();
			c.transfer();
			System.out.println(" -----------   ----------  ");
		}
		
		Apple app=new Apple("Apple");
		app.safe();
		
		SmartMachine sm=new HP("HP");
		sm.smart();
		
		//downcasting
		//Apple computer=new Computer("Comp");
		//Apple applec=(Apple)new Computer("Computer");
	}
}
