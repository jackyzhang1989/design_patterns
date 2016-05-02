package composite_pattern_lab6_2;

import java.io.File;

public abstract class ARenderEngine {
	public final void render(File file) {
		AComponent root = constructTree(file);
		layout(root);
		executePrint(root);
	}

	public abstract void executePrint(AComponent root);

	public abstract AComponent constructTree(File file);

	public abstract void layout(AComponent root);
}
