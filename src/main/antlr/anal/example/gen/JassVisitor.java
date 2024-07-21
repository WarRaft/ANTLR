// Generated from /Users/nazarpunk/IdeaProjects/ANTLR/src/main/antlr/anal/example/Jass.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JassParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JassVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JassParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(JassParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#typeDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDef(JassParser.TypeDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(JassParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#typeNameBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeNameBase(JassParser.TypeNameBaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(JassParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#glob}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlob(JassParser.GlobContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#gvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGvar(JassParser.GvarContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(JassParser.ArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#funCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunCall(JassParser.FunCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(JassParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(JassParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#funTake}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunTake(JassParser.FunTakeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#funRet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunRet(JassParser.FunRetContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#fun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun(JassParser.FunContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#funHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunHead(JassParser.FunHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#funStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunStmt(JassParser.FunStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#funName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunName(JassParser.FunNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#nativ}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNativ(JassParser.NativContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(JassParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#lvarStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvarStmt(JassParser.LvarStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#setStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetStmt(JassParser.SetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#callStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallStmt(JassParser.CallStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(JassParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(JassParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#elseIfStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfStmt(JassParser.ElseIfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#elseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStmt(JassParser.ElseStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#loopStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStmt(JassParser.LoopStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#exitWhenStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExitWhenStmt(JassParser.ExitWhenStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(JassParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#prim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrim(JassParser.PrimContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#str}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStr(JassParser.StrContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(JassParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#funcAsCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncAsCode(JassParser.FuncAsCodeContext ctx);
}