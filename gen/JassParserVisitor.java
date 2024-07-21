// Generated from /Users/nazarpunk/IdeaProjects/ANTLR/jass/JassParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JassParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JassParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JassParser#start_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_(JassParser.Start_Context ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#chunk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChunk(JassParser.ChunkContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(JassParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(JassParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#attnamelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttnamelist(JassParser.AttnamelistContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#attrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrib(JassParser.AttribContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#retstat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetstat(JassParser.RetstatContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(JassParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#funcname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncname(JassParser.FuncnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#varlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlist(JassParser.VarlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#namelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamelist(JassParser.NamelistContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#explist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplist(JassParser.ExplistContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(JassParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(JassParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#prefixexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixexp(JassParser.PrefixexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#functioncall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctioncall(JassParser.FunctioncallContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(JassParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#functiondef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctiondef(JassParser.FunctiondefContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#funcbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncbody(JassParser.FuncbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#parlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParlist(JassParser.ParlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#tableconstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableconstructor(JassParser.TableconstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#fieldlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldlist(JassParser.FieldlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(JassParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#fieldsep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldsep(JassParser.FieldsepContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(JassParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link JassParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(JassParser.StringContext ctx);
}