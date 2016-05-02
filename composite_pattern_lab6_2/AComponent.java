package composite_pattern_lab6_2;

import java.util.ArrayList;
import java.util.Collection;

public abstract class AComponent {
	public Collection<AComponent> list = new ArrayList<AComponent>();
	protected String title;
	
	//layout attribute
	protected String style;
	public AComponent(String title) {
		this.title = title;
	}
	public abstract void print();

	public void add(AComponent item) {
		list.add(item);
	}
	public void setStyle(String style) {
		this.style = style;
	}
	
}
