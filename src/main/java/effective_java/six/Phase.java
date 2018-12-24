package effective_java.six;

import java.util.EnumMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Phase {

	SOLID,
	LIQUID,
	GAS;

	public enum Transition {
		MELT(Phase.SOLID, Phase.LIQUID),
		FREEZE(Phase.LIQUID, Phase.SOLID),
		BOIL(Phase.LIQUID, Phase.GAS),
		CONDENSE(Phase.GAS, Phase.LIQUID),
		SUBLIME(Phase.SOLID, Phase.GAS),
		DEPOSIT(Phase.GAS, Phase.SOLID);

		private final Phase from;

		private final Phase to;


		private Transition(Phase from, Phase to) {
			this.from = from;
			this.to = to;
		}


		//相転移マップを初期化
		private static final Map<Phase, Map<Phase, Transition>> m = Stream.of(Transition.values())
                .collect(Collectors.groupingBy(t -> t.from, () -> new EnumMap<>(Phase.class),
                	     Collectors.toMap(t -> t.to, t -> t, (x, y) -> y, () -> new EnumMap<>(Phase.class))));

		public static Transition from (Phase from, Phase to){
			return m.get(from).get(to);
		}




	}
}
