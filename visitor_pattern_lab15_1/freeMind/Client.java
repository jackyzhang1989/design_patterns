package visitor_pattern_lab15_1.freeMind;

import visitor_pattern_lab15_1.freeMind.composite.AComponent;
import visitor_pattern_lab15_1.freeMind.composite.Node;
import visitor_pattern_lab15_1.freeMind.composite.Root;

public class Client {
	public static Root getRoot() {

		AComponent nodeA = new Node("A");
		AComponent nodeA1 = new Node("A1");
		AComponent nodeA2 = new Node("A2");
		AComponent nodeAA1 = new Node("AA1");
		AComponent nodeAA2 = new Node("AA2");
		AComponent nodeAA3 = new Node("AA3");

		AComponent nodeB1 = new Node("B1");
		AComponent nodeB2 = new Node("B2");
		AComponent nodeB = new Node("B");

		AComponent nodeC = new Node("C");
		AComponent nodeC1 = new Node("C1");
		AComponent nodeC2 = new Node("C2");

		AComponent nodeD = new Node("D");
		AComponent nodeD1 = new Node("D1");
		AComponent nodeD2 = new Node("D2");

		AComponent nodeE = new Node("E");
		AComponent nodeE1 = new Node("E1");
		AComponent nodeE2 = new Node("E2");
		AComponent nodeE3 = new Node("E3");

		AComponent nodeF = new Node("F");
		AComponent nodeF1 = new Node("F1");
		AComponent nodeF2 = new Node("F2");

		nodeA1.addNode(nodeAA1);
		nodeA1.addNode(nodeAA2);
		nodeA1.addNode(nodeAA3);

		nodeA.addNode(nodeA1);
		nodeA.addNode(nodeA2);

		nodeB.addNode(nodeB1);
		nodeB.addNode(nodeB2);

		nodeC.addNode(nodeC1);
		nodeC.addNode(nodeC2);

		nodeD.addNode(nodeD1);
		nodeD.addNode(nodeD2);

		nodeE.addNode(nodeE1);
		nodeE.addNode(nodeE2);
		nodeE.addNode(nodeE3);

		nodeF.addNode(nodeF1);
		nodeF.addNode(nodeF2);

		Root root = new Root("Topic");
		root.addNode(nodeA, SideEnum.RIGHT);
		root.addNode(nodeB, SideEnum.RIGHT);
		root.addNode(nodeC, SideEnum.RIGHT);

		root.addNode(nodeD, SideEnum.LEFT);
		root.addNode(nodeE, SideEnum.LEFT);
		root.addNode(nodeF, SideEnum.LEFT);

		return root;
	}

	public static void main(String[] args) {
		Root root = getRoot();

		ObjectStructure objectStructure = new ObjectStructure(root);
		objectStructure.visit();
	}
}
