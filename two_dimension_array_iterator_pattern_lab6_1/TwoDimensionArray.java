package two_dimension_array_iterator_pattern_lab6_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TwoDimensionArray implements IAggregate {
	private int size = 6;
	private String names[][] = { {"Rob", "Jon", "Jul", "Lor", "Pat", "Ken"},
			{}};

	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}

	private class NameIterator implements Iterator {
		int index;
		List<String> copy = Arrays.stream(names).flatMap(x->Arrays.stream(x)).filter(x-> !x.equals("-")).collect(Collectors.toList());
		@Override
		public boolean hasNext() {
			
			if (index < copy.size()) {
				return true;
			}
			return false;
		}

		@Override
		public String next() {

			if (this.hasNext()) {
				copy.get(index++);
			}
			return null;
		}
	}
}
