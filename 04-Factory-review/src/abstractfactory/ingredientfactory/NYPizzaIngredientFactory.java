package abstractfactory.ingredientfactory;

import abstractfactory.cheese.Cheese;
import abstractfactory.cheese.ReggianoCheese;
import abstractfactory.clam.Clams;
import abstractfactory.clam.FreshClams;
import abstractfactory.dough.Dough;
import abstractfactory.dough.ThinCrustDough;
import abstractfactory.pepperoni.Pepperoni;
import abstractfactory.pepperoni.SlicedPepperoni;
import abstractfactory.sauce.MarinaraSauce;
import abstractfactory.sauce.Sauce;
import abstractfactory.veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
 
	public Dough createDough() {
		return new ThinCrustDough();
	}
 
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
 
	public Cheese createCheese() {
		return new ReggianoCheese();
	}
 
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}
 
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FreshClams();
	}
}
