package observer_pattern_lab14_2;

import java.util.List;

public class NameCollection implements ISubjectNotifier {
	List<String> names;
	private List<NameCollectionObserver> observers;
	private final Object MUTEX = new Object();

	public NameCollection(List<String> names, List<NameCollectionObserver> observers) {
		this.names = names;
		this.observers = observers;
	}

	@Override
	public void notifyObservers() {
		synchronized (MUTEX) {
			int n = observers.size();
			for (int i = 0; i < n; ++i) {
				NameCollectionObserver observer = observers.get(i);
				observer.update(names);
			}
		}
	}

	public void addName(String name) {
		names.add(name);
		notifyObservers();
	}

	public void removeName(int index) {
		names.remove(index);
		notifyObservers();
	}

	@Override
	public void attach(NameCollectionObserver observer) {
		synchronized (MUTEX) {
			if (!observers.contains(observer))
				observers.add(observer);
		}
	}

	@Override
	public void detach(NameCollectionObserver observer) {
		synchronized (MUTEX) {
			int i = observers.indexOf(observer);
			if (i >= 0)
				observers.remove(i);
		}

	}

}
