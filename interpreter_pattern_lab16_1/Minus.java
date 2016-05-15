package interpreter_pattern_lab16_1;



public class Minus implements IExpression{

    IExpression lOperator;
    IExpression rOperator;
    
    public Minus(IExpression left, IExpression right) { 
        lOperator = left; 
        rOperator = right;
    }
		
    public int interpret()  { 
        return lOperator.interpret() - rOperator.interpret();
    }

}
