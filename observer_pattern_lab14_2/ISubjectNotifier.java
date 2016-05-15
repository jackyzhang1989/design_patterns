package observer_pattern_lab14_2;

public interface ISubjectNotifier {
	public void attach(NameCollectionObserver observer);
	public void detach(NameCollectionObserver observer);	
	public void notifyObservers();
}
