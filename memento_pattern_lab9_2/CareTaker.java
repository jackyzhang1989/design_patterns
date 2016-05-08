package memento_pattern_lab9_2;

import java.util.LinkedList;

public class CareTaker {
	private LinkedList<Memento> mementoList = new LinkedList<Memento>();

	public void add(Memento state) {
		mementoList.push(state);
	}

	public Memento get() {
		if (mementoList.size() > 0) {
			return mementoList.pop();
		}
		return null;
	}
}
