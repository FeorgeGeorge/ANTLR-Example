public class MyVisitor extends MyGrammarBaseVisitor<GaussianInteger> {
    @Override
    public GaussianInteger visitAddOp(MyGrammarParser.AddOpContext ctx) {
        GaussianInteger x = visit(ctx.expr(0));
        GaussianInteger y = visit(ctx.expr(1));

        if (ctx.ADD() != null) {
           return GaussianInteger.add(x, y);
        }
        if (ctx.SUB() != null) {
            return GaussianInteger.sub(x, y);
        }
        return null;
    }

    @Override
    public GaussianInteger visitOrOp(MyGrammarParser.OrOpContext ctx) {
        GaussianInteger x = visit(ctx.expr(0));
        GaussianInteger y = visit(ctx.expr(1));

        if (ctx.OR() != null) {
            return new GaussianInteger(x.real | y.real, x.imaginary | y.imaginary);
        }
        if (ctx.XOR() != null) {
            return new GaussianInteger(x.real ^ y.real, x.imaginary ^ y.imaginary);
        }
        return null;
    }

    @Override
    public GaussianInteger visitMulOp(MyGrammarParser.MulOpContext ctx) {
        GaussianInteger x = visit(ctx.expr(0));
        GaussianInteger y = visit(ctx.expr(1));

        return new GaussianInteger(x.real | y.real, x.imaginary | y.imaginary);
    }

    @Override
    public GaussianInteger visitInLiteral(MyGrammarParser.InLiteralContext ctx) {
        return visit(ctx.literal());
    }

    @Override
    public GaussianInteger visitInt(MyGrammarParser.IntContext ctx) {
        int x = Integer.parseInt(ctx.INT().getText());
        return GaussianInteger.realFromInt(x);
    }

    @Override
    public GaussianInteger visitComplexNumber(MyGrammarParser.ComplexNumberContext ctx) {
        return super.visitComplexNumber(ctx);
    }

    @Override
    public GaussianInteger visitComplex(MyGrammarParser.ComplexContext ctx) {
        int y = Integer.parseInt(ctx.INT().getText());
        return GaussianInteger.imaginaryFromInt(y);
    }

    @Override
    public GaussianInteger visitInPar(MyGrammarParser.InParContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public GaussianInteger visitUnary(MyGrammarParser.UnaryContext ctx) {
        return visit(ctx.expr()).neg();
    }
}
