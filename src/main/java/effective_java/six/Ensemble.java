package effective_java.six;

public enum Ensemble {

	SOLO(1),
	DUET(2),
	TRIO(3),
	QUARTET(4),
	QUINTET(5),
	SEXTET(6),
	SEPTET(7),
	OCTET(8),
	DOUBLE_QUARTET(8),
	NONEWT(9),
	DECTET(10),
	TRIPLE_QUARTET(11);

	private final int numberOfMusicians;

	private Ensemble(int numberOfMusicians) {
		this.numberOfMusicians = numberOfMusicians;
	}

	public int getNumberOfMusicians() {
		return numberOfMusicians;
	}



}
