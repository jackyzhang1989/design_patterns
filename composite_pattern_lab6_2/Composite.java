package composite_pattern_lab6_2;

public class Composite extends AComponent {
	public Composite(String title) {
		super(title);
	}

	public void print() {
		System.out.println("Composite name=" + title);
		for (AComponent item : list) {
			item.print();
		}
		System.out.println("Composite name=" + title + " end");
	}
}
