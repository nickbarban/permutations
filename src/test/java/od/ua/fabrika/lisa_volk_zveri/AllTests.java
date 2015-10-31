package od.ua.fabrika.lisa_volk_zveri;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.List;

import org.junit.Test;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.ContiguousSet;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.Range;

public class AllTests {

	@Test
	public void testPermutations() {
		List<Integer> values = ContiguousSet.create(Range.closedOpen(0, 10), DiscreteDomain.integers()).asList();
		Collection<List<Integer>> permutations = Collections2.orderedPermutations(values);
		
		List<List<Integer>> results = FluentIterable.from(permutations).filter(new Predicate<List<Integer>>() {

			public boolean apply(List<Integer> input) {
				// TODO Auto-generated method stub
				return checkEquation(input);
			}
		}).toList();
		
		System.out.println(results.size());
		System.out.println(results);
	}

	protected boolean checkEquation(List<Integer> input) {
		Integer[] digits = input.toArray(new Integer[input.size()]);
		return (toInteger(input.get(0), input.get(1), input.get(2), input.get(3))
				+ toInteger(input.get(4), input.get(5), input.get(0), input.get(6))) == toInteger(input.get(7),
						input.get(4), input.get(8), input.get(9), input.get(1));
	}

	private int toInteger(Integer...digits) {
		int result = 0;
		for (Integer integer : digits) {
			result = result * 10 + integer;
		}
		return result;
	}
}
