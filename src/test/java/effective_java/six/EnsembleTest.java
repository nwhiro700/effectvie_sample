package effective_java.six;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EnsembleTest {

	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	public static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	public void setUp() throws Exception {
	}

	@AfterEach
	public void tearDown() throws Exception {
	}

	@Test
	@DisplayName("列挙クラスの列挙子の数テスト")
	public void test1() {

		Map<Ensemble, Integer> ensembleMap = new HashMap<>();
		for(Ensemble ensemble : Ensemble.values()){

			ensembleMap.put(ensemble, ensemble.getNumberOfMusicians());
		}

		Assertions.assertEquals(12, ensembleMap.size());
	}


	@Test
	@DisplayName("列挙クラスのうち重複している列挙子テスト")
	public void test2() {

		List<Ensemble> ensembleList = Stream.of(Ensemble.values())
										.filter(s -> s.getNumberOfMusicians() == 8)
										.collect(Collectors.toList());

		Assertions.assertEquals(2, ensembleList.size());
	}

}
