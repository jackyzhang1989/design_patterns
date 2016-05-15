package interpreter_pattern_lab16_1;

import java.util.Stack;

public class Context {
    private IExpression syntaxTree;
    
    public Context(String expression) {
        Stack<IExpression> expressions = new Stack<IExpression>();
        String[] tokens = expression.split(" ");
        for (int i = tokens.length - 1; i >= 0; i--) {
            if  (tokens[i].equals("+")) {
                IExpression subExpression = new Plus(expressions.pop(), expressions.pop());
                expressions.push(subExpression);
            }
            else if (tokens[i].equals("-")) {
                IExpression subExpression = new Minus(expressions.pop(), expressions.pop());
                expressions.push(subExpression);
            }
            else                        
                expressions.push( new Number(Integer.valueOf(tokens[i])));
        }
        syntaxTree = expressions.pop();
    }
 
    public int interpret() {
        return syntaxTree.interpret();
    }

}
