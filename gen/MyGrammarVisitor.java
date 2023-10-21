// Generated from C:/Users/kanad/Demo/AntlerGrammar/src\MyGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code AddOp}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOp(MyGrammarParser.AddOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inLiteral}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInLiteral(MyGrammarParser.InLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrOp}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrOp(MyGrammarParser.OrOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inPar}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInPar(MyGrammarParser.InParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulOp}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulOp(MyGrammarParser.MulOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Unary}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(MyGrammarParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link MyGrammarParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(MyGrammarParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code complexNumber}
	 * labeled alternative in {@link MyGrammarParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexNumber(MyGrammarParser.ComplexNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#complex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplex(MyGrammarParser.ComplexContext ctx);
}