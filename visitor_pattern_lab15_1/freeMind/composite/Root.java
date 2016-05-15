package visitor_pattern_lab15_1.freeMind.composite;

import java.util.ArrayList;
import java.util.List;

import visitor_pattern_lab15_1.freeMind.INodeVisitor;
import visitor_pattern_lab15_1.freeMind.SideEnum;

public class Root extends AComponent {
	private List<AComponent> leftNodes, rightNodes;

	public Root(String name) {
		this.side = SideEnum.NONE;
		this.name = name;
		leftNodes = new ArrayList<AComponent>();
		rightNodes = new ArrayList<AComponent>();
	}

	@Override
	public int accept(INodeVisitor visitor) {
		visitor.visit(this);
		return 0;
	}

	@Override
	public void addNode(AComponent composite) {

	}

	public void addNode(AComponent composite, SideEnum sideEnum) {
		if (sideEnum == SideEnum.LEFT) {
			addLeftNode(composite);
		} else {
			addRightNode(composite);
		}
	}

	@Override
	public void setSide(SideEnum side) {
	}

	public String getName() {
		return name;
	}

	public List<AComponent> getLeftNodes() {
		return leftNodes;
	}

	public List<AComponent> getRightNodes() {
		return rightNodes;
	}

	public SideEnum getSide() {
		return side;
	}

	private void addLeftNode(AComponent node) {
		leftNodes.add(node);
		node.setSide(side);
	}

	private void addRightNode(AComponent node) {
		rightNodes.add(node);
	}

}
