package ex005;

import ex003.MenuItem;
import ex003.Salad;
import ex003.Sandwich;
import ex004.Cappuccino;
import ex003.Drink;

public class UtensilCheck {
	
	public static boolean requireFork(MenuItem item) {
		if(item instanceof Salad || item instanceof Sandwich) {
			return true;
		}
		else {
			return false;
		}		
	}
	
	public static boolean requireKnife(MenuItem item) {
		if(item instanceof Sandwich) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean requireSpoon(MenuItem item) {
		if(item instanceof Cappuccino) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean requireStraw(MenuItem item) {
		if(item.getClass() == Drink.class) {
			return true;
		}
		else {
			return false;
		}
	}

}
