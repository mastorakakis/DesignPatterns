package abstractfactory.ingredientfactory;

import abstractfactory.cheese.Cheese;
import abstractfactory.cheese.MozzarellaCheese;
import abstractfactory.clam.Clams;
import abstractfactory.clam.FrozenClams;
import abstractfactory.dough.Dough;
import abstractfactory.dough.ThickCrustDough;
import abstractfactory.pepperoni.Pepperoni;
import abstractfactory.pepperoni.SlicedPepperoni;
import abstractfactory.sauce.PlumTomatoSauce;
import abstractfactory.sauce.Sauce;
import abstractfactory.veggies.BlackOlives;
import abstractfactory.veggies.Eggplant;
import abstractfactory.veggies.Spinach;
import abstractfactory.veggies.Veggies;

public class ChicagoPizzaIngredientFactory
	implements PizzaIngredientFactory 
{

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = { new BlackOlives(),
		                      new Spinach(),
		                      new Eggplant() };
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FrozenClams();
	}
}
