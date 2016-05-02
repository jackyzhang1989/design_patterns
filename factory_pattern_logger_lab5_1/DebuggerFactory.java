package factory_pattern_logger_lab5_1;

public enum DebuggerFactory implements IDebuggerFactory {
	instace;

	public static DebuggerFactory getFactory() {
		return instace;
	}

	@Override
	public ITrace getDebuggder(String type) {
		// TODO Auto-generated method stub
		ITrace debugger = null;
		if (type.equals("trace.log")) {
			debugger = new FileDebugger();
		} else if (type.equals("console")) {
			debugger = new ConsoleDebugger();
		}
		return debugger;
	}

}
