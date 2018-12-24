package effective_java.two;

import effective_java.two.MyPizza.Size;

public class Calzone extends Pizza {

	private final boolean sauceInside;

	public static class Builder extends Pizza.Builder<Builder> {

		private boolean sauceInside = false;

		public Builder sauceInside (Size size){
			this.sauceInside = true;
			return this;
		}

		@Override
		Calzone build() {
			return new Calzone(this);
		}

		@Override
		protected Builder self() {
			return this;
		}

	}

	private Calzone(Builder builder){
		super(builder);
		this.sauceInside = builder.sauceInside;

	}

	@Override
	public String toString() {
		return "Calzone [sauceInside=" + sauceInside + ", toppings=" + toppings + "]";
	}



}
