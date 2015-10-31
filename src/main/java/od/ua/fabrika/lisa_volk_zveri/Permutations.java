package od.ua.fabrika.lisa_volk_zveri;

import java.util.Collection;
import java.util.List;

import com.google.common.collect.Collections2;

public final class Permutations {
	
	
	public static Collection<List<Integer>> permutations(List<Integer> elements) {
		return Collections2.orderedPermutations(elements);
	}
}
