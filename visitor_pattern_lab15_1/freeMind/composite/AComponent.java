package visitor_pattern_lab15_1.freeMind.composite;

import java.util.ArrayList;
import java.util.List;

import visitor_pattern_lab15_1.freeMind.SideEnum;

public abstract class AComponent implements IComponent {
	public SideEnum side;
	public String name;	
	List<AComponent> nodes = new ArrayList<>();
	
	public void addNode(AComponent composite){
		nodes.add(composite);
	}

	public abstract void setSide(SideEnum side);

}
