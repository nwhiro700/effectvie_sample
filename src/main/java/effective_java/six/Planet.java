package effective_java.six;

public enum Planet {

	MERCURY(3.302e+23, 2.439e6),
	VENUS(3.302e+23, 2.439e6),
	EARTH(3.302e+23, 2.439e6),
	MARS(3.302e+23, 2.439e6),
	JUPITER(3.302e+23, 2.439e6),
	SATURN(3.302e+23, 2.439e6),
	URANUS(3.302e+23, 2.439e6),
	NEPTUNE(3.302e+23, 2.439e6);

	private final double mass;

	private final double radius;

	private final double surfaceGravity;

	private static final double G = 6.67300E-11;

	private Planet(double mass, double radius) {
		this.mass = mass;
		this.radius = radius;
		this.surfaceGravity = G * mass / (radius * radius);

	}

	public double getMass() {
		return mass;
	}

	public double getRadius() {
		return radius;
	}

	public double getSurfaceGravity() {
		return surfaceGravity;
	}


	public double surfaceWeight(double mass){
		return mass * surfaceGravity;
	}


}
