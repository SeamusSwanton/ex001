package ex003;

import ex004.Cappuccino;
import ex004.ClubSandwich;
import ex004.SpinachSalad;

//sandwich, salad, and drink,
public class Trio implements MenuItem{
	
	private MenuItem sandwich;
	private MenuItem Salad;
	private MenuItem Drink;

	public Trio(MenuItem sandwich, MenuItem Salad, MenuItem Drink) {
		this.sandwich = sandwich;
		this.Salad = Salad;
		this.Drink = Drink;
	}
	
	public String getName() {

		return (sandwich.getName() + "/" + Salad.getName() + "/" + Drink.getName() + " Trio");
	}


	public double getPrice() {
		double x = sandwich.getPrice() + Salad.getPrice()  + Drink.getPrice();
		double y;
		if (sandwich.getPrice() < Salad.getPrice() && sandwich.getPrice() < Drink.getPrice()) {
			y = sandwich.getPrice();
		}
		else if(Salad.getPrice() < Drink.getPrice()) {
			y = Salad.getPrice();
		}
		else {
			y = Drink.getPrice();
		}	
		double z = x-y; 
		return z;
	}

}
