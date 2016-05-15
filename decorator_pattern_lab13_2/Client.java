package decorator_pattern_lab13_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		List<Integer> profiler = new Profiler<>(new ArrayList<Integer>(), new LinkedList<Integer>());
		profiler.add(1);
		profiler.size();
		profiler.contains(2);
		profiler.contains(1);
		profiler.remove(new Integer(1));
		profiler.remove(new Integer(2));
		
	}
}
