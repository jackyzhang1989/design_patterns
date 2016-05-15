package visitor_pattern_lab15_1.freeMind.composite;

import java.util.ArrayList;
import java.util.List;

import visitor_pattern_lab15_1.freeMind.INodeVisitor;
import visitor_pattern_lab15_1.freeMind.SideEnum;

public class Node extends AComponent {

	public Node(String name) {
		this.name = name;
		nodes = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	@Override
	public void setSide(SideEnum side) {
		this.side = side;
		for (AComponent composite : nodes) {
			composite.setSide(side);
		}
	}

	@Override
	public int accept(INodeVisitor visitor) {
		return visitor.visit(this);
	}

	public SideEnum getSide() {
		return side;
	}

	public List<AComponent> getNodes() {
		return nodes;
	}

}
