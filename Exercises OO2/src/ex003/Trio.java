package ex003;
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

		return 0;
	}

}
