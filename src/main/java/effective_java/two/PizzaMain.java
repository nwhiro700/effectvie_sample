package effective_java.two;

import effective_java.two.MyPizza.Size;
import effective_java.two.Pizza.Topping;

public class PizzaMain {


	public static void main(String[] args) {



		MyPizza mp = new MyPizza.Builder(Size.SMALL)
				.addTopping(Topping.SAUSAGE).addTopping(Topping.ONION).build();

		Calzone cl = new Calzone.Builder()
		                          .addTopping(Topping.HAM).sauceInside(Size.LARGE).build();


		System.out.println(mp);
		System.out.println(cl);



	}






}
