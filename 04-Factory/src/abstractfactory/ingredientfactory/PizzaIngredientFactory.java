package abstractfactory.ingredientfactory;

import abstractfactory.cheese.Cheese;
import abstractfactory.clam.Clams;
import abstractfactory.dough.Dough;
import abstractfactory.pepperoni.Pepperoni;
import abstractfactory.sauce.Sauce;
import abstractfactory.veggies.Veggies;

public interface PizzaIngredientFactory {
 
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
 
}
