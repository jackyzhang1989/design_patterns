package visitor_pattern_lab15_1.freeMind;

import visitor_pattern_lab15_1.freeMind.composite.Node;
import visitor_pattern_lab15_1.freeMind.composite.Root;

public interface INodeVisitor {

	public void visit(Root root);

	public int visit(Node node);

}
