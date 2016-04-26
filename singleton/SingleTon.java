
public class SingleTon {
	private static SingleTon instance;
	public static SingleTon getInstance() {
		synchronized (instance) {
			if (null == instance) {
				instance = new SingleTon();
			}
		}
		return instance;
	}
}
enum EnumSingleTon {
	INSTANCE;
}
