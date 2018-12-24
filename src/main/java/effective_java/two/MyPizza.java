package effective_java.two;

import java.util.Objects;

public class MyPizza extends Pizza {

	public enum Size {
		SMALL, MEDIUM, LARGE
	}

	private final Size size;

	public static class Builder extends Pizza.Builder<Builder> {

		private final Size size;

		public Builder(Size size){
			this.size = Objects.requireNonNull(size);
		}

		@Override
		MyPizza build() {
			return new MyPizza(this);
		}

		@Override
		protected Builder self() {
			return this;
		}

	}

	public MyPizza(Builder builder){
		super(builder);
		this.size = builder.size;
	}

	@Override
	public String toString() {
		return "MyPizza [size=" + size + ", toppings=" + toppings + "]";
	}



}
