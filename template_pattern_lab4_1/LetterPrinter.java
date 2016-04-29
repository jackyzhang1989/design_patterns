package template_pattern_lab4_1;

import java.util.Arrays;

public class LetterPrinter extends ALetterPrinter{

	public static void main(String... args) {
		Character[][] newMatrix = new Character[][]{
			{'-','-','-','-','-'},
			{'-','-','-','-','+'},
			{'-','-','-','+','+'},
			{'-','-','+','+','-'},
			{'-','-','+','+','-'},
			{'-','+','+','-','-'},
			{'-','+','+','-','-'},
			{'-','+','+','-','-'},
			{'-','+','+','+','+'},
			{'-','+','+','-','-'},
			{'-','+','+','-','-'},
			{'-','+','+','-','-'},
			{'-','+','+','-','-'},
			{'-','+','+','-','-'}
};
		ALetterPrinter ins = new LetterPrinter();
		ins.processPrint(newMatrix);
//		Character[][] result = new Character[ALetterPrinter.HEIGHT][ALetterPrinter.WIDTH];
//		for (Character[] t: result) {
//			System.out.println(Arrays.toString(t));
//		}
	}
	@Override
	public void executePrint(Character[][] newMatrix) {
		for (Character[] t: newMatrix) {
			System.out.println(Arrays.toString(t));
		}		
	}

	@Override
	public Character[][] reconstruct(Character[][] matrix, int type) {
		// TODO Auto-generated method stub
		if (type == ALetterPrinter.NONE) {
			return matrix;
		} else if (type == ALetterPrinter.VERTICAL) {
			Character[][] result = new Character[ALetterPrinter.HEIGHT][ALetterPrinter.WIDTH];
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					result[i][j] = matrix[i][j];
				}
				for (int j = 0; j < matrix[i].length; j++) {
					result[i][matrix[i].length + j] = matrix[i][matrix[i].length - j - 1];
				}
			}			
			return result;
		} else {
			Character[][] result = new Character[ALetterPrinter.HEIGHT][ALetterPrinter.WIDTH];
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					result[i][j] = matrix[i][j];
				}
			}
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					result[i + matrix.length][j] = matrix[matrix.length - i - 1][j];
				}
			}			
			return result;			
		}
	}

	@Override
	public int identifySymmetryType(Character[][] matrix) {
		if (matrix == null) {
			return ALetterPrinter.NONE;
		} else if (matrix.length >= (ALetterPrinter.HEIGHT / 2) &&
				matrix[0].length > (ALetterPrinter.WIDTH / 2)) {
			return ALetterPrinter.NONE;
		} else if (matrix.length >= (ALetterPrinter.HEIGHT / 2) &&
				matrix[0].length <= (ALetterPrinter.WIDTH / 2)) {
			return ALetterPrinter.VERTICAL;
		} else {
			return ALetterPrinter.HORIZONTAL;
		}
	}

}
