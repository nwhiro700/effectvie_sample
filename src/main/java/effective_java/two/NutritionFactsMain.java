package effective_java.two;

public class NutritionFactsMain {

	public static void main(String[] args) {

		NutritionFacts aa = new NutritionFacts.Builder(10, 20)
													.calories(30)
													.fat(40)
													.carbohydrate(50)
													.build();

		System.out.println(aa);

	}

}
