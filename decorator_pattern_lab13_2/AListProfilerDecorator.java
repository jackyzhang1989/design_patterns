package decorator_pattern_lab13_2;

import java.util.ArrayList;
import java.util.List;

public abstract class AListProfilerDecorator<E> implements List<E>{
	List<List<E>> listTobeProfiled = new ArrayList<>();
	public AListProfilerDecorator (List<E>...lists) {
		for (List<E> list : lists) {
			this.listTobeProfiled.add(list);
		}
	}

}
