package ASTNodes.ExpressionNodes;

import AST.Visitor;

/**
 * Created by Ruben on 06.05.2017.
 */
public class CountNode extends ExpressionNode
{
    @Override
    public void Accept(Visitor nodevisitor) {
        nodevisitor.Visit(this);
    }
}
