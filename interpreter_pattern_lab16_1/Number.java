package interpreter_pattern_lab16_1;

public class Number implements IExpression{

	private int number;
    
	public Number(int number){ 
    	this.number = number; 
    }
    
	@Override
	public int interpret() {
		return number;
	}

}
