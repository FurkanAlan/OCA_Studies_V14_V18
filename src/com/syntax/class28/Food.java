package com.syntax.class28;

public abstract class Food {
	
	String foodType;
	String ingredient;
	int calories;

	public Food(String foodType, String ingredient, int calories) {
		this.foodType = foodType;
		this.calories = calories;
		this.ingredient = ingredient;
	}

	public abstract void foodType();

	public abstract void ingredient();

	public abstract void calories();
}

class Soup extends Food {
	public Soup(String foodType, String ingredient, int calories) {
		super(foodType, ingredient, calories);

	}

	@Override
	public void foodType() {
		System.out.println(foodType + " is a common appetizer in Turkey");

	}

	@Override
	public void ingredient() {
		System.out.println(foodType + " has the main ingredient of " + ingredient);

	}

	@Override
	public void calories() {
		System.out.println("1 serving of " + foodType + " has " + calories + " calories");
	}
}

class Salad extends Food {
	public Salad(String foodType, String ingredient, int calories) {
		super(foodType, ingredient, calories);
	}

	@Override
	public void foodType() {
		System.out.println(foodType + " is a common sidedish in Turkey");

	}

	@Override
	public void ingredient() {
		System.out.println(foodType + " has the main ingredient of " + ingredient);

	}

	@Override
	public void calories() {
		System.out.println("1 serving of " + foodType + " has " + calories + " calories");
	}
}

class MainDish extends Food {
	public MainDish(String foodType, String ingredient, int calories) {
		super(foodType, ingredient, calories);
	}

	@Override
	public void foodType() {
		System.out.println(foodType + " is a common maindish in Turkey");

	}

	@Override
	public void ingredient() {
		System.out.println(foodType + " has the main ingredient of " + ingredient);

	}

	@Override
	public void calories() {
		System.out.println("1 serving of " + foodType + " has " + calories + " calories");
	}
}

class Dessert extends Food {
	public Dessert(String foodType, String ingredient, int calories) {
		super(foodType, ingredient, calories);
	}

	@Override
	public void foodType() {
		System.out.println(foodType + " is a common dessert in Turkey");

	}

	@Override
	public void ingredient() {
		System.out.println(foodType + " has the main ingredient of " + ingredient);

	}

	@Override
	public void calories() {
		System.out.println("1 serving of " + foodType + " has " + calories + " calories");
	}
}
