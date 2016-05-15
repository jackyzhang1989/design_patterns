package interpreter_pattern_lab16_1;


public class Plus implements IExpression{
	IExpression leftOperand;
    IExpression rightOperand;
    
    public Plus(IExpression left, IExpression right) { 
        leftOperand = left; 
        rightOperand = right;
    }
		
    public int interpret()  { 
        return leftOperand.interpret() + rightOperand.interpret();
    }
}
