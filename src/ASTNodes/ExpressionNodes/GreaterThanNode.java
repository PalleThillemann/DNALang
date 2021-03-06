package ASTNodes.ExpressionNodes;

import AST.Visitor;

public class GreaterThanNode extends ExpressionNode
{
    @Override
    public void Accept(Visitor nodevisitor)
    {
        nodevisitor.Visit(this);
    }
}
