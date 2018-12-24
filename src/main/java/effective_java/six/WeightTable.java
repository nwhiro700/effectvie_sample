package effective_java.six;

public class WeightTable {

	public static void main(String[] args) {

		double earthWeight = Double.parseDouble(args[0]);
		double mass = earthWeight / Planet.EARTH.getSurfaceGravity();
		for(Planet p : Planet.values()){
			System.out.printf("Weight on %s is %f5n", p, p.surfaceWeight(mass));

		}

	}

}
