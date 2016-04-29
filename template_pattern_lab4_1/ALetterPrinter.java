package template_pattern_lab4_1;

public abstract class ALetterPrinter {
	public static final int HEIGHT = 20;
	public static final int WIDTH = 10;
	public static final int VERTICAL = 0;
	public static final int NONE = 1;
	public static final int HORIZONTAL = 2;
	public final void processPrint(Character[][] matrix) {
		int type = identifySymmetryType(matrix);
		Character[][] newMatrix = reconstruct(matrix, type);
		executePrint(newMatrix);
	}

	public abstract void executePrint(Character[][] newMatrix);

	public abstract Character[][] reconstruct(Character[][] matrix, int type);

	public abstract int identifySymmetryType(Character[][] matrix);


}
