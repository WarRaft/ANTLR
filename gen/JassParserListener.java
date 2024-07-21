// Generated from /Users/nazarpunk/IdeaProjects/ANTLR/jass/JassParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JassParser}.
 */
public interface JassParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JassParser#start_}.
	 * @param ctx the parse tree
	 */
	void enterStart_(JassParser.Start_Context ctx);
	/**
	 * Exit a parse tree produced by {@link JassParser#start_}.
	 * @param ctx the parse tree
	 */
	void exitStart_(JassParser.Start_Context ctx);
	/**
	 * Enter a parse tree produced by {@link JassParser#chunk}.
	 * @param ctx the parse tree
	 */
	void enterChunk(JassParser.ChunkContext ctx);
	/**
	 * Exit a parse tree produced by {@link JassParser#chunk}.
	 * @param ctx the parse tree
	 */
	void exitChunk(JassParser.ChunkContext ctx);
	/**
	 * Enter a parse tree produced by {@link JassParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JassParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JassParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JassParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JassParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(JassParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link JassParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(JassParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link JassParser#attnamelist}.
	 * @param ctx the parse tree
	 */
	void enterAttnamelist(JassParser.AttnamelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link JassParser#attnamelist}.
	 * @param ctx the parse tree
	 */
	void exitAttnamelist(JassParser.AttnamelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link JassParser#attrib}.
	 * @param ctx the parse tree
	 */
	void enterAttrib(JassParser.AttribContext ctx);
	/**
	 * Exit a parse tree produced by {@link JassParser#attrib}.
	 * @param ctx the parse tree
	 */
	void exitAttrib(JassParser.AttribContext ctx);
	/**
	 * Enter a parse tree produced by {@link JassParser#retstat}.
	 * @param ctx the parse tree
	 */
	void enterRetstat(JassParser.RetstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link JassParser#retstat}.
	 * @param ctx the parse tree
	 */
	void exitRetstat(JassParser.RetstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link JassParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(JassParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link JassParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(JassParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link JassParser#funcname}.
	 * @param ctx the parse tree
	 */
	void enterFuncname(JassParser.FuncnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JassParser#funcname}.
	 * @param ctx the parse tree
	 */
	void exitFuncname(JassParser.FuncnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JassParser#varlist}.
	 * @param ctx the parse tree
	 */
	void enterVarlist(JassParser.VarlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link JassParser#varlist}.
	 * @param ctx the parse tree
	 */
	void exitVarlist(JassParser.VarlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link JassParser#namelist}.
	 * @param ctx the parse tree
	 */
	void enterNamelist(JassParser.NamelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link JassParser#namelist}.
	 * @param ctx the parse tree
	 */
	void exitNamelist(JassParser.NamelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link JassParser#explist}.
	 * @param ctx the parse tree
	 */
	void enterExplist(JassParser.ExplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link JassParser#explist}.
	 * @param ctx the parse tree
	 */
	void exitExplist(JassParser.ExplistContext ctx);
	/**
	 * Enter a parse tree produced by {@link JassParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(JassParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link JassParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(JassParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link JassParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(JassParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link JassParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(JassParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link JassParser#prefixexp}.
	 * @param ctx the parse tree
	 */
	void enterPrefixexp(JassParser.PrefixexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link JassParser#prefixexp}.
	 * @param ctx the parse tree
	 */
	void exitPrefixexp(JassParser.PrefixexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link JassParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void enterFunctioncall(JassParser.FunctioncallContext ctx);
	/**
	 * Exit a parse tree produced by {@link JassParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void exitFunctioncall(JassParser.FunctioncallContext ctx);
	/**
	 * Enter a parse tree produced by {@link JassParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(JassParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JassParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(JassParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JassParser#functiondef}.
	 * @param ctx the parse tree
	 */
	void enterFunctiondef(JassParser.FunctiondefContext ctx);
	/**
	 * Exit a parse tree produced by {@link JassParser#functiondef}.
	 * @param ctx the parse tree
	 */
	void exitFunctiondef(JassParser.FunctiondefContext ctx);
	/**
	 * Enter a parse tree produced by {@link JassParser#funcbody}.
	 * @param ctx the parse tree
	 */
	void enterFuncbody(JassParser.FuncbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JassParser#funcbody}.
	 * @param ctx the parse tree
	 */
	void exitFuncbody(JassParser.FuncbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JassParser#parlist}.
	 * @param ctx the parse tree
	 */
	void enterParlist(JassParser.ParlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link JassParser#parlist}.
	 * @param ctx the parse tree
	 */
	void exitParlist(JassParser.ParlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link JassParser#tableconstructor}.
	 * @param ctx the parse tree
	 */
	void enterTableconstructor(JassParser.TableconstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JassParser#tableconstructor}.
	 * @param ctx the parse tree
	 */
	void exitTableconstructor(JassParser.TableconstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JassParser#fieldlist}.
	 * @param ctx the parse tree
	 */
	void enterFieldlist(JassParser.FieldlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link JassParser#fieldlist}.
	 * @param ctx the parse tree
	 */
	void exitFieldlist(JassParser.FieldlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link JassParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(JassParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link JassParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(JassParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link JassParser#fieldsep}.
	 * @param ctx the parse tree
	 */
	void enterFieldsep(JassParser.FieldsepContext ctx);
	/**
	 * Exit a parse tree produced by {@link JassParser#fieldsep}.
	 * @param ctx the parse tree
	 */
	void exitFieldsep(JassParser.FieldsepContext ctx);
	/**
	 * Enter a parse tree produced by {@link JassParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(JassParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link JassParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(JassParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link JassParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(JassParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link JassParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(JassParser.StringContext ctx);
}