package visitor_pattern_lab15_1.freeMind;

import java.util.List;

import visitor_pattern_lab15_1.freeMind.composite.AComponent;
import visitor_pattern_lab15_1.freeMind.composite.Node;
import visitor_pattern_lab15_1.freeMind.composite.Root;

public class DisplayNodeVisitor implements INodeVisitor {

	@Override
	public void visit(Root root) {
		System.out.println(root.getName());
		List<AComponent> leftNodes = root.getLeftNodes();
		List<AComponent> rightNodes = root.getRightNodes();
//		int res = 0;
		System.out.println("Right nodes:");
		for (AComponent composite : rightNodes) {
			int tmp = composite.accept(this);
//			res += tmp;
			System.out.println(tmp + " " + composite.name + " nodes" );
		}
		System.out.println("Left nodes:");
		for (AComponent composite : leftNodes) {
			int tmp = composite.accept(this);
//			res += tmp;
			System.out.println(tmp + " " + composite.name + " nodes" );
		}
//		return res;
	}

	@Override
	public int visit(Node node) {
		int res = 1;//self
		List<AComponent> childNodes = node.getNodes();
		for (AComponent composite : childNodes) {
			res += composite.accept(this);
		}
		return res;
	}
}
