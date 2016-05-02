package factory_pattern_logger_lab5_1;

public interface ITrace {
	// turn on and off debugging
	public void setDebug(boolean debug);

	// write out a debug message
	public void debug(String message);

	// write out an error message
	public void error(String message);
}
