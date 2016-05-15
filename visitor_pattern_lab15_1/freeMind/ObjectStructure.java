package visitor_pattern_lab15_1.freeMind;

import visitor_pattern_lab15_1.freeMind.composite.Root;

public class ObjectStructure {
	private Root root;

	public ObjectStructure(Root root) {
		super();
		this.root = root;
	} 

	public void visit() {
		// create a visitor
		DisplayNodeVisitor visitor = new DisplayNodeVisitor();

		// iterate through all items
		root.accept(visitor);

//		visitor.printVisitResults();
	}
}
