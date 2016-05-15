package interpreter_pattern_lab16_1;

public class Main {
	public static void main(String[] args){
		String tokenString = "- + 10 5 - 8 2";
		Context context = new Context(tokenString);
		
		System.out.println(context.interpret());
	}
}
