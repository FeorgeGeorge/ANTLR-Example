// Generated from C:/Users/kanad/Demo/AntlerGrammar/src\MyGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyGrammarParser}.
 */
public interface MyGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code AddOp}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddOp(MyGrammarParser.AddOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddOp}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddOp(MyGrammarParser.AddOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inLiteral}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInLiteral(MyGrammarParser.InLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inLiteral}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInLiteral(MyGrammarParser.InLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrOp}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrOp(MyGrammarParser.OrOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrOp}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrOp(MyGrammarParser.OrOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inPar}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInPar(MyGrammarParser.InParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inPar}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInPar(MyGrammarParser.InParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulOp}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulOp(MyGrammarParser.MulOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulOp}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulOp(MyGrammarParser.MulOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Unary}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary(MyGrammarParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Unary}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary(MyGrammarParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link MyGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterInt(MyGrammarParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link MyGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitInt(MyGrammarParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code complexNumber}
	 * labeled alternative in {@link MyGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterComplexNumber(MyGrammarParser.ComplexNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code complexNumber}
	 * labeled alternative in {@link MyGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitComplexNumber(MyGrammarParser.ComplexNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#complex}.
	 * @param ctx the parse tree
	 */
	void enterComplex(MyGrammarParser.ComplexContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#complex}.
	 * @param ctx the parse tree
	 */
	void exitComplex(MyGrammarParser.ComplexContext ctx);
}