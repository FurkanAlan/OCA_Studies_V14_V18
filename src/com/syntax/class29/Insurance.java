package com.syntax.class29;

abstract class Coverage{
	
	public void method() {
		System.out.println("Method of coverage class");
	}
}

public abstract class Insurance extends Coverage{
	
	String insuranceName;

	Insurance(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public abstract void getQuote();

	public abstract void cancelInsurance();
}

class Car extends Insurance {
	String carModel;

	Car(String insuranceName, String carModel) {
		super(insuranceName);
		this.carModel = carModel;
	}

	public void display() {
		System.out.println("Car ="+carModel);
	}
	
	@Override
	public void getQuote() {
		System.out.println("1600$ offered for 6 months insurance from " + insuranceName + " for " + carModel);
	}

	@Override
	public void cancelInsurance() {
		System.out.println("Due to  other offers, " + insuranceName + "s offer for " + carModel + " is canceled");
	}
}

class Pet extends Insurance {
	String petType;

	Pet(String insuranceName, String petType) {
		super(insuranceName);
		this.petType = petType;
	}

	@Override
	public void getQuote() {
		System.out.println("Offers are too high for " + petType + " from " + insuranceName + " insurance company");
	}

	@Override
	public void cancelInsurance() {
		System.out.println("Canceled due to high prices");
	}
}

class Health extends Insurance {
	Health(String insuranceName) {
		super(insuranceName);
	}

	@Override
	public void getQuote() {
		System.out.println(
				"Brown family got 1500$ offer from " + insuranceName + " insurance company fro family health packed");
	}

	@Override
	public void cancelInsurance() {
		System.out.println("Please contact customer sevice " + insuranceName + "s insurance company for cancelation");
	}
}
