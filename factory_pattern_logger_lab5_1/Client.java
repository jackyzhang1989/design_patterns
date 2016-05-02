package factory_pattern_logger_lab5_1;

public class Client {
	public static void main(String[] args) {
		DebuggerFactory factory = DebuggerFactory.getFactory();
		ITrace pizza = factory.getDebuggder(args[0]);
		
//		//different from below on when the decision has to be made -
//		runtime or compile time?
//		//which is one difference between framework and application
//		development
//		Pizza pizza1 = new CheesePizza();
//		System.out.println(pizza.getClass().getSimpleName());
		}

}
