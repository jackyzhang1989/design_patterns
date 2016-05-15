package visitor_pattern_lab15_1.freeMind.composite;

import visitor_pattern_lab15_1.freeMind.INodeVisitor;

public interface IComponent {
	public int accept(INodeVisitor visitor);
}
