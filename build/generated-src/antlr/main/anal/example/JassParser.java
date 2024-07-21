// Generated from anal/example/Jass.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class JassParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, ARRAY=2, BOOLEAN=3, CODE=4, CALL=5, CONSTANT=6, DEBUG=7, ELSE=8, 
		ELSEIF=9, ENDFUNCTION=10, ENDIF=11, ENDLOOP=12, ENDGLOBALS=13, EXTENDS=14, 
		EXITWHEN=15, FALSE=16, FUNCTION=17, GLOBALS=18, HANDLE=19, IF=20, INTEGER=21, 
		LOCAL=22, LOOP=23, NATIVE=24, NOT=25, NOTHING=26, NULL=27, OR=28, REAL=29, 
		RETURNS=30, RETURN=31, SET=32, STRING=33, TAKES=34, THEN=35, TRUE=36, 
		TYPE=37, COMMA=38, EQ_EQ=39, EQ=40, NEQ=41, LT_EQ=42, LT=43, GT_EQ=44, 
		GT=45, PLUS=46, MINUS=47, MUL=48, DIV=49, LPAREN=50, RPAREN=51, LBRACK=52, 
		RBRACK=53, ID=54, INTVAL=55, STRVAL=56, RAWVAL=57, HEXVAL=58, REALVAL=59, 
		WS=60, NL=61, LINE_COMMENT=62;
	public static final int
		RULE_root = 0, RULE_typeDef = 1, RULE_typeName = 2, RULE_typeNameBase = 3, 
		RULE_var = 4, RULE_glob = 5, RULE_gvar = 6, RULE_argList = 7, RULE_funCall = 8, 
		RULE_param = 9, RULE_paramList = 10, RULE_funTake = 11, RULE_funRet = 12, 
		RULE_fun = 13, RULE_funHead = 14, RULE_funStmt = 15, RULE_funName = 16, 
		RULE_nativ = 17, RULE_stmt = 18, RULE_lvarStmt = 19, RULE_setStmt = 20, 
		RULE_callStmt = 21, RULE_returnStmt = 22, RULE_ifStmt = 23, RULE_elseIfStmt = 24, 
		RULE_elseStmt = 25, RULE_loopStmt = 26, RULE_exitWhenStmt = 27, RULE_expr = 28, 
		RULE_prim = 29, RULE_str = 30, RULE_arrayAccess = 31, RULE_funcAsCode = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "typeDef", "typeName", "typeNameBase", "var", "glob", "gvar", 
			"argList", "funCall", "param", "paramList", "funTake", "funRet", "fun", 
			"funHead", "funStmt", "funName", "nativ", "stmt", "lvarStmt", "setStmt", 
			"callStmt", "returnStmt", "ifStmt", "elseIfStmt", "elseStmt", "loopStmt", 
			"exitWhenStmt", "expr", "prim", "str", "arrayAccess", "funcAsCode"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'and'", "'array'", "'boolean'", "'code'", "'call'", "'constant'", 
			"'debug'", "'else'", "'elseif'", "'endfunction'", "'endif'", "'endloop'", 
			"'endglobals'", "'extends'", "'exitwhen'", "'false'", "'function'", "'globals'", 
			"'handle'", "'if'", "'integer'", "'local'", "'loop'", "'native'", "'not'", 
			"'nothing'", "'null'", "'or'", "'real'", "'returns'", "'return'", "'set'", 
			"'string'", "'takes'", "'then'", "'true'", "'type'", "','", "'=='", "'='", 
			"'!='", "'<='", "'<'", "'>='", "'>'", "'+'", "'-'", "'*'", "'/'", "'('", 
			"')'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND", "ARRAY", "BOOLEAN", "CODE", "CALL", "CONSTANT", "DEBUG", 
			"ELSE", "ELSEIF", "ENDFUNCTION", "ENDIF", "ENDLOOP", "ENDGLOBALS", "EXTENDS", 
			"EXITWHEN", "FALSE", "FUNCTION", "GLOBALS", "HANDLE", "IF", "INTEGER", 
			"LOCAL", "LOOP", "NATIVE", "NOT", "NOTHING", "NULL", "OR", "REAL", "RETURNS", 
			"RETURN", "SET", "STRING", "TAKES", "THEN", "TRUE", "TYPE", "COMMA", 
			"EQ_EQ", "EQ", "NEQ", "LT_EQ", "LT", "GT_EQ", "GT", "PLUS", "MINUS", 
			"MUL", "DIV", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "ID", "INTVAL", 
			"STRVAL", "RAWVAL", "HEXVAL", "REALVAL", "WS", "NL", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Jass.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JassParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JassParser.EOF, 0); }
		public List<TypeDefContext> typeDef() {
			return getRuleContexts(TypeDefContext.class);
		}
		public TypeDefContext typeDef(int i) {
			return getRuleContext(TypeDefContext.class,i);
		}
		public List<NativContext> nativ() {
			return getRuleContexts(NativContext.class);
		}
		public NativContext nativ(int i) {
			return getRuleContext(NativContext.class,i);
		}
		public List<GlobContext> glob() {
			return getRuleContexts(GlobContext.class);
		}
		public GlobContext glob(int i) {
			return getRuleContext(GlobContext.class,i);
		}
		public List<FunContext> fun() {
			return getRuleContexts(FunContext.class);
		}
		public FunContext fun(int i) {
			return getRuleContext(FunContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).exitRoot(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137456123968L) != 0)) {
				{
				setState(70);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(66);
					typeDef();
					}
					break;
				case 2:
					{
					setState(67);
					nativ();
					}
					break;
				case 3:
					{
					setState(68);
					glob();
					}
					break;
				case 4:
					{
					setState(69);
					fun();
					}
					break;
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeDefContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(JassParser.TYPE, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(JassParser.EXTENDS, 0); }
		public TypeNameBaseContext typeNameBase() {
			return getRuleContext(TypeNameBaseContext.class,0);
		}
		public TypeDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).enterTypeDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).exitTypeDef(this);
		}
	}

	public final TypeDefContext typeDef() throws RecognitionException {
		TypeDefContext _localctx = new TypeDefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_typeDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(TYPE);
			setState(78);
			typeName();
			setState(79);
			match(EXTENDS);
			setState(80);
			typeNameBase();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode HANDLE() { return getToken(JassParser.HANDLE, 0); }
		public TerminalNode INTEGER() { return getToken(JassParser.INTEGER, 0); }
		public TerminalNode REAL() { return getToken(JassParser.REAL, 0); }
		public TerminalNode BOOLEAN() { return getToken(JassParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(JassParser.STRING, 0); }
		public TerminalNode CODE() { return getToken(JassParser.CODE, 0); }
		public TerminalNode ID() { return getToken(JassParser.ID, 0); }
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_typeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 18014407638908952L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeNameBaseContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TypeNameBaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeNameBase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).enterTypeNameBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).exitTypeNameBase(this);
		}
	}

	public final TypeNameBaseContext typeNameBase() throws RecognitionException {
		TypeNameBaseContext _localctx = new TypeNameBaseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeNameBase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			typeName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode ID() { return getToken(JassParser.ID, 0); }
		public TerminalNode ARRAY() { return getToken(JassParser.ARRAY, 0); }
		public TerminalNode EQ() { return getToken(JassParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			typeName();
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARRAY) {
				{
				setState(87);
				match(ARRAY);
				}
			}

			setState(90);
			match(ID);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(91);
				match(EQ);
				setState(92);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GlobContext extends ParserRuleContext {
		public TerminalNode GLOBALS() { return getToken(JassParser.GLOBALS, 0); }
		public TerminalNode ENDGLOBALS() { return getToken(JassParser.ENDGLOBALS, 0); }
		public List<GvarContext> gvar() {
			return getRuleContexts(GvarContext.class);
		}
		public GvarContext gvar(int i) {
			return getRuleContext(GvarContext.class,i);
		}
		public GlobContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glob; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).enterGlob(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).exitGlob(this);
		}
	}

	public final GlobContext glob() throws RecognitionException {
		GlobContext _localctx = new GlobContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_glob);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(GLOBALS);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18014407638909016L) != 0)) {
				{
				{
				setState(96);
				gvar();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
			match(ENDGLOBALS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GvarContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode CONSTANT() { return getToken(JassParser.CONSTANT, 0); }
		public GvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).enterGvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).exitGvar(this);
		}
	}

	public final GvarContext gvar() throws RecognitionException {
		GvarContext _localctx = new GvarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_gvar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTANT) {
				{
				setState(104);
				match(CONSTANT);
				}
			}

			setState(107);
			var();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JassParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JassParser.COMMA, i);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).enterArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).exitArgList(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			expr(0);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(110);
				match(COMMA);
				setState(111);
				expr(0);
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunCallContext extends ParserRuleContext {
		public FunNameContext funName() {
			return getRuleContext(FunNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JassParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JassParser.RPAREN, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public FunCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).enterFunCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).exitFunCall(this);
		}
	}

	public final FunCallContext funCall() throws RecognitionException {
		FunCallContext _localctx = new FunCallContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			funName();
			setState(118);
			match(LPAREN);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1137088606054318080L) != 0)) {
				{
				setState(119);
				argList();
				}
			}

			setState(122);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode ID() { return getToken(JassParser.ID, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			typeName();
			setState(125);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamListContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JassParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JassParser.COMMA, i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).exitParamList(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			param();
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(128);
				match(COMMA);
				setState(129);
				param();
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunTakeContext extends ParserRuleContext {
		public TerminalNode TAKES() { return getToken(JassParser.TAKES, 0); }
		public TerminalNode NOTHING() { return getToken(JassParser.NOTHING, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public FunTakeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funTake; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).enterFunTake(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).exitFunTake(this);
		}
	}

	public final FunTakeContext funTake() throws RecognitionException {
		FunTakeContext _localctx = new FunTakeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_funTake);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(TAKES);
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOTHING:
				{
				setState(136);
				match(NOTHING);
				}
				break;
			case BOOLEAN:
			case CODE:
			case HANDLE:
			case INTEGER:
			case REAL:
			case STRING:
			case ID:
				{
				setState(137);
				paramList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunRetContext extends ParserRuleContext {
		public TerminalNode RETURNS() { return getToken(JassParser.RETURNS, 0); }
		public TerminalNode NOTHING() { return getToken(JassParser.NOTHING, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public FunRetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funRet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).enterFunRet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).exitFunRet(this);
		}
	}

	public final FunRetContext funRet() throws RecognitionException {
		FunRetContext _localctx = new FunRetContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_funRet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(RETURNS);
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOTHING:
				{
				setState(141);
				match(NOTHING);
				}
				break;
			case BOOLEAN:
			case CODE:
			case HANDLE:
			case INTEGER:
			case REAL:
			case STRING:
			case ID:
				{
				setState(142);
				typeName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(JassParser.FUNCTION, 0); }
		public FunHeadContext funHead() {
			return getRuleContext(FunHeadContext.class,0);
		}
		public FunStmtContext funStmt() {
			return getRuleContext(FunStmtContext.class,0);
		}
		public TerminalNode ENDFUNCTION() { return getToken(JassParser.ENDFUNCTION, 0); }
		public TerminalNode CONSTANT() { return getToken(JassParser.CONSTANT, 0); }
		public FunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).enterFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).exitFun(this);
		}
	}

	public final FunContext fun() throws RecognitionException {
		FunContext _localctx = new FunContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_fun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTANT) {
				{
				setState(145);
				match(CONSTANT);
				}
			}

			setState(148);
			match(FUNCTION);
			setState(149);
			funHead();
			setState(150);
			funStmt();
			setState(151);
			match(ENDFUNCTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunHeadContext extends ParserRuleContext {
		public FunNameContext funName() {
			return getRuleContext(FunNameContext.class,0);
		}
		public FunTakeContext funTake() {
			return getRuleContext(FunTakeContext.class,0);
		}
		public FunRetContext funRet() {
			return getRuleContext(FunRetContext.class,0);
		}
		public FunHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).enterFunHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).exitFunHead(this);
		}
	}

	public final FunHeadContext funHead() throws RecognitionException {
		FunHeadContext _localctx = new FunHeadContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_funHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			funName();
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAKES) {
				{
				setState(154);
				funTake();
				}
			}

			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNS) {
				{
				setState(157);
				funRet();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunStmtContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public FunStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).enterFunStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).exitFunStmt(this);
		}
	}

	public final FunStmtContext funStmt() throws RecognitionException {
		FunStmtContext _localctx = new FunStmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_funStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18014414095024312L) != 0)) {
				{
				{
				setState(160);
				stmt();
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JassParser.ID, 0); }
		public FunNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).enterFunName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).exitFunName(this);
		}
	}

	public final FunNameContext funName() throws RecognitionException {
		FunNameContext _localctx = new FunNameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_funName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NativContext extends ParserRuleContext {
		public TerminalNode NATIVE() { return getToken(JassParser.NATIVE, 0); }
		public FunHeadContext funHead() {
			return getRuleContext(FunHeadContext.class,0);
		}
		public TerminalNode CONSTANT() { return getToken(JassParser.CONSTANT, 0); }
		public NativContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nativ; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).enterNativ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).exitNativ(this);
		}
	}

	public final NativContext nativ() throws RecognitionException {
		NativContext _localctx = new NativContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_nativ);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTANT) {
				{
				setState(168);
				match(CONSTANT);
				}
			}

			setState(171);
			match(NATIVE);
			setState(172);
			funHead();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public SetStmtContext setStmt() {
			return getRuleContext(SetStmtContext.class,0);
		}
		public CallStmtContext callStmt() {
			return getRuleContext(CallStmtContext.class,0);
		}
		public LvarStmtContext lvarStmt() {
			return getRuleContext(LvarStmtContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public LoopStmtContext loopStmt() {
			return getRuleContext(LoopStmtContext.class,0);
		}
		public ExitWhenStmtContext exitWhenStmt() {
			return getRuleContext(ExitWhenStmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_stmt);
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				setStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				callStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				lvarStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
				returnStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(178);
				ifStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(179);
				loopStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(180);
				exitWhenStmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LvarStmtContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode LOCAL() { return getToken(JassParser.LOCAL, 0); }
		public LvarStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvarStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).enterLvarStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).exitLvarStmt(this);
		}
	}

	public final LvarStmtContext lvarStmt() throws RecognitionException {
		LvarStmtContext _localctx = new LvarStmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_lvarStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCAL) {
				{
				setState(183);
				match(LOCAL);
				}
			}

			setState(186);
			var();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetStmtContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(JassParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public TerminalNode ID() { return getToken(JassParser.ID, 0); }
		public TerminalNode SET() { return getToken(JassParser.SET, 0); }
		public SetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).enterSetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).exitSetStmt(this);
		}
	}

	public final SetStmtContext setStmt() throws RecognitionException {
		SetStmtContext _localctx = new SetStmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_setStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SET) {
				{
				setState(188);
				match(SET);
				}
			}

			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(191);
				arrayAccess();
				}
				break;
			case 2:
				{
				setState(192);
				match(ID);
				}
				break;
			}
			setState(195);
			match(EQ);
			setState(196);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CallStmtContext extends ParserRuleContext {
		public TerminalNode DEBUG() { return getToken(JassParser.DEBUG, 0); }
		public FunCallContext funCall() {
			return getRuleContext(FunCallContext.class,0);
		}
		public TerminalNode CALL() { return getToken(JassParser.CALL, 0); }
		public CallStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).enterCallStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).exitCallStmt(this);
		}
	}

	public final CallStmtContext callStmt() throws RecognitionException {
		CallStmtContext _localctx = new CallStmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_callStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEBUG) {
				{
				setState(198);
				match(DEBUG);
				}
			}

			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				{
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CALL) {
					{
					setState(201);
					match(CALL);
					}
				}

				setState(204);
				funCall();
				}
				}
				break;
			case 2:
				{
				{
				setState(205);
				match(CALL);
				setState(207);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(206);
					funCall();
					}
					break;
				}
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(JassParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).exitReturnStmt(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(RETURN);
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(212);
				expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(JassParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ENDIF() { return getToken(JassParser.ENDIF, 0); }
		public TerminalNode THEN() { return getToken(JassParser.THEN, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<ElseIfStmtContext> elseIfStmt() {
			return getRuleContexts(ElseIfStmtContext.class);
		}
		public ElseIfStmtContext elseIfStmt(int i) {
			return getRuleContext(ElseIfStmtContext.class,i);
		}
		public List<ElseStmtContext> elseStmt() {
			return getRuleContexts(ElseStmtContext.class);
		}
		public ElseStmtContext elseStmt(int i) {
			return getRuleContext(ElseStmtContext.class,i);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).exitIfStmt(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(IF);
			setState(216);
			expr(0);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THEN) {
				{
				setState(217);
				match(THEN);
				}
			}

			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18014414095025080L) != 0)) {
				{
				setState(223);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BOOLEAN:
				case CODE:
				case CALL:
				case DEBUG:
				case EXITWHEN:
				case HANDLE:
				case IF:
				case INTEGER:
				case LOCAL:
				case LOOP:
				case REAL:
				case RETURN:
				case SET:
				case STRING:
				case ID:
					{
					setState(220);
					stmt();
					}
					break;
				case ELSEIF:
					{
					setState(221);
					elseIfStmt();
					}
					break;
				case ELSE:
					{
					setState(222);
					elseStmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(228);
			match(ENDIF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseIfStmtContext extends ParserRuleContext {
		public TerminalNode ELSEIF() { return getToken(JassParser.ELSEIF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(JassParser.THEN, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ElseIfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).enterElseIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).exitElseIfStmt(this);
		}
	}

	public final ElseIfStmtContext elseIfStmt() throws RecognitionException {
		ElseIfStmtContext _localctx = new ElseIfStmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_elseIfStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(ELSEIF);
			setState(231);
			expr(0);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THEN) {
				{
				setState(232);
				match(THEN);
				}
			}

			setState(238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(235);
					stmt();
					}
					} 
				}
				setState(240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseStmtContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(JassParser.ELSE, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ElseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).enterElseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).exitElseStmt(this);
		}
	}

	public final ElseStmtContext elseStmt() throws RecognitionException {
		ElseStmtContext _localctx = new ElseStmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_elseStmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(ELSE);
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(242);
					stmt();
					}
					} 
				}
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LoopStmtContext extends ParserRuleContext {
		public TerminalNode LOOP() { return getToken(JassParser.LOOP, 0); }
		public TerminalNode ENDLOOP() { return getToken(JassParser.ENDLOOP, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public LoopStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).enterLoopStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).exitLoopStmt(this);
		}
	}

	public final LoopStmtContext loopStmt() throws RecognitionException {
		LoopStmtContext _localctx = new LoopStmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_loopStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(LOOP);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18014414095024312L) != 0)) {
				{
				{
				setState(249);
				stmt();
				}
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(255);
			match(ENDLOOP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExitWhenStmtContext extends ParserRuleContext {
		public TerminalNode EXITWHEN() { return getToken(JassParser.EXITWHEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExitWhenStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exitWhenStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).enterExitWhenStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).exitExitWhenStmt(this);
		}
	}

	public final ExitWhenStmtContext exitWhenStmt() throws RecognitionException {
		ExitWhenStmtContext _localctx = new ExitWhenStmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_exitWhenStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(EXITWHEN);
			setState(258);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(JassParser.MUL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DIV() { return getToken(JassParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(JassParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(JassParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(JassParser.NOT, 0); }
		public TerminalNode LPAREN() { return getToken(JassParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JassParser.RPAREN, 0); }
		public PrimContext prim() {
			return getRuleContext(PrimContext.class,0);
		}
		public TerminalNode EQ_EQ() { return getToken(JassParser.EQ_EQ, 0); }
		public TerminalNode NEQ() { return getToken(JassParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(JassParser.LT, 0); }
		public TerminalNode LT_EQ() { return getToken(JassParser.LT_EQ, 0); }
		public TerminalNode GT() { return getToken(JassParser.GT, 0); }
		public TerminalNode GT_EQ() { return getToken(JassParser.GT_EQ, 0); }
		public TerminalNode OR() { return getToken(JassParser.OR, 0); }
		public TerminalNode AND() { return getToken(JassParser.AND, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUL:
				{
				setState(261);
				match(MUL);
				setState(262);
				expr(15);
				}
				break;
			case DIV:
				{
				setState(263);
				match(DIV);
				setState(264);
				expr(14);
				}
				break;
			case PLUS:
				{
				setState(265);
				match(PLUS);
				setState(266);
				expr(13);
				}
				break;
			case MINUS:
				{
				setState(267);
				match(MINUS);
				setState(268);
				expr(12);
				}
				break;
			case NOT:
				{
				setState(269);
				match(NOT);
				setState(270);
				expr(11);
				}
				break;
			case LPAREN:
				{
				setState(271);
				match(LPAREN);
				setState(272);
				expr(0);
				setState(273);
				match(RPAREN);
				}
				break;
			case FALSE:
			case FUNCTION:
			case NULL:
			case TRUE:
			case ID:
			case INTVAL:
			case STRVAL:
			case RAWVAL:
			case HEXVAL:
			case REALVAL:
				{
				setState(275);
				prim();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(316);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(314);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(278);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(279);
						match(PLUS);
						setState(280);
						expr(20);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(281);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(282);
						match(MINUS);
						setState(283);
						expr(19);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(284);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(285);
						match(MUL);
						setState(286);
						expr(18);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(287);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(288);
						match(DIV);
						setState(289);
						expr(17);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(290);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(291);
						match(EQ_EQ);
						setState(292);
						expr(11);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(293);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(294);
						match(NEQ);
						setState(295);
						expr(10);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(296);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(297);
						match(LT);
						setState(298);
						expr(9);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(299);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(300);
						match(LT_EQ);
						setState(301);
						expr(8);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(302);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(303);
						match(GT);
						setState(304);
						expr(7);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(305);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(306);
						match(GT_EQ);
						setState(307);
						expr(6);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(308);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(309);
						match(OR);
						setState(310);
						expr(5);
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(311);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(312);
						match(AND);
						setState(313);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(318);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimContext extends ParserRuleContext {
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public FunCallContext funCall() {
			return getRuleContext(FunCallContext.class,0);
		}
		public FuncAsCodeContext funcAsCode() {
			return getRuleContext(FuncAsCodeContext.class,0);
		}
		public TerminalNode FALSE() { return getToken(JassParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(JassParser.NULL, 0); }
		public TerminalNode TRUE() { return getToken(JassParser.TRUE, 0); }
		public TerminalNode HEXVAL() { return getToken(JassParser.HEXVAL, 0); }
		public TerminalNode REALVAL() { return getToken(JassParser.REALVAL, 0); }
		public TerminalNode INTVAL() { return getToken(JassParser.INTVAL, 0); }
		public TerminalNode RAWVAL() { return getToken(JassParser.RAWVAL, 0); }
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public TerminalNode ID() { return getToken(JassParser.ID, 0); }
		public PrimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).enterPrim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).exitPrim(this);
		}
	}

	public final PrimContext prim() throws RecognitionException {
		PrimContext _localctx = new PrimContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_prim);
		try {
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				arrayAccess();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				funCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(321);
				funcAsCode();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(322);
				match(FALSE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(323);
				match(NULL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(324);
				match(TRUE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(325);
				match(HEXVAL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(326);
				match(REALVAL);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(327);
				match(INTVAL);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(328);
				match(RAWVAL);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(329);
				str();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(330);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StrContext extends ParserRuleContext {
		public TerminalNode STRVAL() { return getToken(JassParser.STRVAL, 0); }
		public StrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).enterStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).exitStr(this);
		}
	}

	public final StrContext str() throws RecognitionException {
		StrContext _localctx = new StrContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_str);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(STRVAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAccessContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JassParser.ID, 0); }
		public TerminalNode LBRACK() { return getToken(JassParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(JassParser.RBRACK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).exitArrayAccess(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_arrayAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(ID);
			setState(336);
			match(LBRACK);
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1137088606054318080L) != 0)) {
				{
				setState(337);
				expr(0);
				}
			}

			setState(340);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncAsCodeContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(JassParser.FUNCTION, 0); }
		public FunNameContext funName() {
			return getRuleContext(FunNameContext.class,0);
		}
		public FuncAsCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcAsCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).enterFuncAsCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).exitFuncAsCode(this);
		}
	}

	public final FuncAsCodeContext funcAsCode() throws RecognitionException {
		FuncAsCodeContext _localctx = new FuncAsCodeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_funcAsCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(FUNCTION);
			setState(343);
			funName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 28:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 19);
		case 1:
			return precpred(_ctx, 18);
		case 2:
			return precpred(_ctx, 17);
		case 3:
			return precpred(_ctx, 16);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001>\u015a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000G\b\u0000\n\u0000\f\u0000J\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0003\u0004Y\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"^\b\u0004\u0001\u0005\u0001\u0005\u0005\u0005b\b\u0005\n\u0005\f\u0005"+
		"e\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0003\u0006j\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007q\b"+
		"\u0007\n\u0007\f\u0007t\t\u0007\u0001\b\u0001\b\u0001\b\u0003\by\b\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0005\n\u0083"+
		"\b\n\n\n\f\n\u0086\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u008b\b\u000b\u0001\f\u0001\f\u0001\f\u0003\f\u0090\b\f\u0001\r\u0003"+
		"\r\u0093\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u009c\b\u000e\u0001\u000e\u0003\u000e\u009f\b\u000e"+
		"\u0001\u000f\u0005\u000f\u00a2\b\u000f\n\u000f\f\u000f\u00a5\t\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0003\u0011\u00aa\b\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00b6\b\u0012\u0001\u0013\u0003"+
		"\u0013\u00b9\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0003\u0014\u00be"+
		"\b\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00c2\b\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0003\u0015\u00c8\b\u0015\u0001\u0015"+
		"\u0003\u0015\u00cb\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u00d0\b\u0015\u0003\u0015\u00d2\b\u0015\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u00d6\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u00db"+
		"\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u00e0\b\u0017"+
		"\n\u0017\f\u0017\u00e3\t\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u00ea\b\u0018\u0001\u0018\u0005\u0018\u00ed"+
		"\b\u0018\n\u0018\f\u0018\u00f0\t\u0018\u0001\u0019\u0001\u0019\u0005\u0019"+
		"\u00f4\b\u0019\n\u0019\f\u0019\u00f7\t\u0019\u0001\u001a\u0001\u001a\u0005"+
		"\u001a\u00fb\b\u001a\n\u001a\f\u001a\u00fe\t\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u0115\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u013b\b\u001c\n\u001c"+
		"\f\u001c\u013e\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0003\u001d\u014c\b\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0153\b\u001f\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0000\u00018!\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@\u0000\u0001\u0006\u0000\u0003\u0004\u0013\u0013\u0015"+
		"\u0015\u001d\u001d!!66\u017e\u0000H\u0001\u0000\u0000\u0000\u0002M\u0001"+
		"\u0000\u0000\u0000\u0004R\u0001\u0000\u0000\u0000\u0006T\u0001\u0000\u0000"+
		"\u0000\bV\u0001\u0000\u0000\u0000\n_\u0001\u0000\u0000\u0000\fi\u0001"+
		"\u0000\u0000\u0000\u000em\u0001\u0000\u0000\u0000\u0010u\u0001\u0000\u0000"+
		"\u0000\u0012|\u0001\u0000\u0000\u0000\u0014\u007f\u0001\u0000\u0000\u0000"+
		"\u0016\u0087\u0001\u0000\u0000\u0000\u0018\u008c\u0001\u0000\u0000\u0000"+
		"\u001a\u0092\u0001\u0000\u0000\u0000\u001c\u0099\u0001\u0000\u0000\u0000"+
		"\u001e\u00a3\u0001\u0000\u0000\u0000 \u00a6\u0001\u0000\u0000\u0000\""+
		"\u00a9\u0001\u0000\u0000\u0000$\u00b5\u0001\u0000\u0000\u0000&\u00b8\u0001"+
		"\u0000\u0000\u0000(\u00bd\u0001\u0000\u0000\u0000*\u00c7\u0001\u0000\u0000"+
		"\u0000,\u00d3\u0001\u0000\u0000\u0000.\u00d7\u0001\u0000\u0000\u00000"+
		"\u00e6\u0001\u0000\u0000\u00002\u00f1\u0001\u0000\u0000\u00004\u00f8\u0001"+
		"\u0000\u0000\u00006\u0101\u0001\u0000\u0000\u00008\u0114\u0001\u0000\u0000"+
		"\u0000:\u014b\u0001\u0000\u0000\u0000<\u014d\u0001\u0000\u0000\u0000>"+
		"\u014f\u0001\u0000\u0000\u0000@\u0156\u0001\u0000\u0000\u0000BG\u0003"+
		"\u0002\u0001\u0000CG\u0003\"\u0011\u0000DG\u0003\n\u0005\u0000EG\u0003"+
		"\u001a\r\u0000FB\u0001\u0000\u0000\u0000FC\u0001\u0000\u0000\u0000FD\u0001"+
		"\u0000\u0000\u0000FE\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000\u0000"+
		"HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IK\u0001\u0000\u0000"+
		"\u0000JH\u0001\u0000\u0000\u0000KL\u0005\u0000\u0000\u0001L\u0001\u0001"+
		"\u0000\u0000\u0000MN\u0005%\u0000\u0000NO\u0003\u0004\u0002\u0000OP\u0005"+
		"\u000e\u0000\u0000PQ\u0003\u0006\u0003\u0000Q\u0003\u0001\u0000\u0000"+
		"\u0000RS\u0007\u0000\u0000\u0000S\u0005\u0001\u0000\u0000\u0000TU\u0003"+
		"\u0004\u0002\u0000U\u0007\u0001\u0000\u0000\u0000VX\u0003\u0004\u0002"+
		"\u0000WY\u0005\u0002\u0000\u0000XW\u0001\u0000\u0000\u0000XY\u0001\u0000"+
		"\u0000\u0000YZ\u0001\u0000\u0000\u0000Z]\u00056\u0000\u0000[\\\u0005("+
		"\u0000\u0000\\^\u00038\u001c\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000"+
		"\u0000\u0000^\t\u0001\u0000\u0000\u0000_c\u0005\u0012\u0000\u0000`b\u0003"+
		"\f\u0006\u0000a`\u0001\u0000\u0000\u0000be\u0001\u0000\u0000\u0000ca\u0001"+
		"\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000df\u0001\u0000\u0000\u0000"+
		"ec\u0001\u0000\u0000\u0000fg\u0005\r\u0000\u0000g\u000b\u0001\u0000\u0000"+
		"\u0000hj\u0005\u0006\u0000\u0000ih\u0001\u0000\u0000\u0000ij\u0001\u0000"+
		"\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0003\b\u0004\u0000l\r\u0001"+
		"\u0000\u0000\u0000mr\u00038\u001c\u0000no\u0005&\u0000\u0000oq\u00038"+
		"\u001c\u0000pn\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001"+
		"\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000s\u000f\u0001\u0000\u0000"+
		"\u0000tr\u0001\u0000\u0000\u0000uv\u0003 \u0010\u0000vx\u00052\u0000\u0000"+
		"wy\u0003\u000e\u0007\u0000xw\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000"+
		"\u0000yz\u0001\u0000\u0000\u0000z{\u00053\u0000\u0000{\u0011\u0001\u0000"+
		"\u0000\u0000|}\u0003\u0004\u0002\u0000}~\u00056\u0000\u0000~\u0013\u0001"+
		"\u0000\u0000\u0000\u007f\u0084\u0003\u0012\t\u0000\u0080\u0081\u0005&"+
		"\u0000\u0000\u0081\u0083\u0003\u0012\t\u0000\u0082\u0080\u0001\u0000\u0000"+
		"\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0015\u0001\u0000\u0000"+
		"\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u008a\u0005\"\u0000\u0000"+
		"\u0088\u008b\u0005\u001a\u0000\u0000\u0089\u008b\u0003\u0014\n\u0000\u008a"+
		"\u0088\u0001\u0000\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008b"+
		"\u0017\u0001\u0000\u0000\u0000\u008c\u008f\u0005\u001e\u0000\u0000\u008d"+
		"\u0090\u0005\u001a\u0000\u0000\u008e\u0090\u0003\u0004\u0002\u0000\u008f"+
		"\u008d\u0001\u0000\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090"+
		"\u0019\u0001\u0000\u0000\u0000\u0091\u0093\u0005\u0006\u0000\u0000\u0092"+
		"\u0091\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093"+
		"\u0094\u0001\u0000\u0000\u0000\u0094\u0095\u0005\u0011\u0000\u0000\u0095"+
		"\u0096\u0003\u001c\u000e\u0000\u0096\u0097\u0003\u001e\u000f\u0000\u0097"+
		"\u0098\u0005\n\u0000\u0000\u0098\u001b\u0001\u0000\u0000\u0000\u0099\u009b"+
		"\u0003 \u0010\u0000\u009a\u009c\u0003\u0016\u000b\u0000\u009b\u009a\u0001"+
		"\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009e\u0001"+
		"\u0000\u0000\u0000\u009d\u009f\u0003\u0018\f\u0000\u009e\u009d\u0001\u0000"+
		"\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u001d\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a2\u0003$\u0012\u0000\u00a1\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u001f\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a7\u00056\u0000\u0000"+
		"\u00a7!\u0001\u0000\u0000\u0000\u00a8\u00aa\u0005\u0006\u0000\u0000\u00a9"+
		"\u00a8\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005\u0018\u0000\u0000\u00ac"+
		"\u00ad\u0003\u001c\u000e\u0000\u00ad#\u0001\u0000\u0000\u0000\u00ae\u00b6"+
		"\u0003(\u0014\u0000\u00af\u00b6\u0003*\u0015\u0000\u00b0\u00b6\u0003&"+
		"\u0013\u0000\u00b1\u00b6\u0003,\u0016\u0000\u00b2\u00b6\u0003.\u0017\u0000"+
		"\u00b3\u00b6\u00034\u001a\u0000\u00b4\u00b6\u00036\u001b\u0000\u00b5\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b5\u00af\u0001\u0000\u0000\u0000\u00b5\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b1\u0001\u0000\u0000\u0000\u00b5\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b6%\u0001\u0000\u0000\u0000\u00b7\u00b9\u0005"+
		"\u0016\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001"+
		"\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bb\u0003"+
		"\b\u0004\u0000\u00bb\'\u0001\u0000\u0000\u0000\u00bc\u00be\u0005 \u0000"+
		"\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000"+
		"\u0000\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf\u00c2\u0003>\u001f\u0000"+
		"\u00c0\u00c2\u00056\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c4\u0005(\u0000\u0000\u00c4\u00c5\u00038\u001c\u0000\u00c5)\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c8\u0005\u0007\u0000\u0000\u00c7\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00d1\u0001"+
		"\u0000\u0000\u0000\u00c9\u00cb\u0005\u0005\u0000\u0000\u00ca\u00c9\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001"+
		"\u0000\u0000\u0000\u00cc\u00d2\u0003\u0010\b\u0000\u00cd\u00cf\u0005\u0005"+
		"\u0000\u0000\u00ce\u00d0\u0003\u0010\b\u0000\u00cf\u00ce\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d1\u00ca\u0001\u0000\u0000\u0000\u00d1\u00cd\u0001\u0000\u0000"+
		"\u0000\u00d2+\u0001\u0000\u0000\u0000\u00d3\u00d5\u0005\u001f\u0000\u0000"+
		"\u00d4\u00d6\u00038\u001c\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d6-\u0001\u0000\u0000\u0000\u00d7\u00d8"+
		"\u0005\u0014\u0000\u0000\u00d8\u00da\u00038\u001c\u0000\u00d9\u00db\u0005"+
		"#\u0000\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000"+
		"\u0000\u0000\u00db\u00e1\u0001\u0000\u0000\u0000\u00dc\u00e0\u0003$\u0012"+
		"\u0000\u00dd\u00e0\u00030\u0018\u0000\u00de\u00e0\u00032\u0019\u0000\u00df"+
		"\u00dc\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df"+
		"\u00de\u0001\u0000\u0000\u0000\u00e0\u00e3\u0001\u0000\u0000\u0000\u00e1"+
		"\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2"+
		"\u00e4\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e5\u0005\u000b\u0000\u0000\u00e5/\u0001\u0000\u0000\u0000\u00e6\u00e7"+
		"\u0005\t\u0000\u0000\u00e7\u00e9\u00038\u001c\u0000\u00e8\u00ea\u0005"+
		"#\u0000\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000"+
		"\u0000\u0000\u00ea\u00ee\u0001\u0000\u0000\u0000\u00eb\u00ed\u0003$\u0012"+
		"\u0000\u00ec\u00eb\u0001\u0000\u0000\u0000\u00ed\u00f0\u0001\u0000\u0000"+
		"\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000"+
		"\u0000\u00ef1\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f5\u0005\b\u0000\u0000\u00f2\u00f4\u0003$\u0012\u0000\u00f3"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f7\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6"+
		"3\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f8\u00fc"+
		"\u0005\u0017\u0000\u0000\u00f9\u00fb\u0003$\u0012\u0000\u00fa\u00f9\u0001"+
		"\u0000\u0000\u0000\u00fb\u00fe\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u00ff\u0001"+
		"\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00ff\u0100\u0005"+
		"\f\u0000\u0000\u01005\u0001\u0000\u0000\u0000\u0101\u0102\u0005\u000f"+
		"\u0000\u0000\u0102\u0103\u00038\u001c\u0000\u01037\u0001\u0000\u0000\u0000"+
		"\u0104\u0105\u0006\u001c\uffff\uffff\u0000\u0105\u0106\u00050\u0000\u0000"+
		"\u0106\u0115\u00038\u001c\u000f\u0107\u0108\u00051\u0000\u0000\u0108\u0115"+
		"\u00038\u001c\u000e\u0109\u010a\u0005.\u0000\u0000\u010a\u0115\u00038"+
		"\u001c\r\u010b\u010c\u0005/\u0000\u0000\u010c\u0115\u00038\u001c\f\u010d"+
		"\u010e\u0005\u0019\u0000\u0000\u010e\u0115\u00038\u001c\u000b\u010f\u0110"+
		"\u00052\u0000\u0000\u0110\u0111\u00038\u001c\u0000\u0111\u0112\u00053"+
		"\u0000\u0000\u0112\u0115\u0001\u0000\u0000\u0000\u0113\u0115\u0003:\u001d"+
		"\u0000\u0114\u0104\u0001\u0000\u0000\u0000\u0114\u0107\u0001\u0000\u0000"+
		"\u0000\u0114\u0109\u0001\u0000\u0000\u0000\u0114\u010b\u0001\u0000\u0000"+
		"\u0000\u0114\u010d\u0001\u0000\u0000\u0000\u0114\u010f\u0001\u0000\u0000"+
		"\u0000\u0114\u0113\u0001\u0000\u0000\u0000\u0115\u013c\u0001\u0000\u0000"+
		"\u0000\u0116\u0117\n\u0013\u0000\u0000\u0117\u0118\u0005.\u0000\u0000"+
		"\u0118\u013b\u00038\u001c\u0014\u0119\u011a\n\u0012\u0000\u0000\u011a"+
		"\u011b\u0005/\u0000\u0000\u011b\u013b\u00038\u001c\u0013\u011c\u011d\n"+
		"\u0011\u0000\u0000\u011d\u011e\u00050\u0000\u0000\u011e\u013b\u00038\u001c"+
		"\u0012\u011f\u0120\n\u0010\u0000\u0000\u0120\u0121\u00051\u0000\u0000"+
		"\u0121\u013b\u00038\u001c\u0011\u0122\u0123\n\n\u0000\u0000\u0123\u0124"+
		"\u0005\'\u0000\u0000\u0124\u013b\u00038\u001c\u000b\u0125\u0126\n\t\u0000"+
		"\u0000\u0126\u0127\u0005)\u0000\u0000\u0127\u013b\u00038\u001c\n\u0128"+
		"\u0129\n\b\u0000\u0000\u0129\u012a\u0005+\u0000\u0000\u012a\u013b\u0003"+
		"8\u001c\t\u012b\u012c\n\u0007\u0000\u0000\u012c\u012d\u0005*\u0000\u0000"+
		"\u012d\u013b\u00038\u001c\b\u012e\u012f\n\u0006\u0000\u0000\u012f\u0130"+
		"\u0005-\u0000\u0000\u0130\u013b\u00038\u001c\u0007\u0131\u0132\n\u0005"+
		"\u0000\u0000\u0132\u0133\u0005,\u0000\u0000\u0133\u013b\u00038\u001c\u0006"+
		"\u0134\u0135\n\u0004\u0000\u0000\u0135\u0136\u0005\u001c\u0000\u0000\u0136"+
		"\u013b\u00038\u001c\u0005\u0137\u0138\n\u0003\u0000\u0000\u0138\u0139"+
		"\u0005\u0001\u0000\u0000\u0139\u013b\u00038\u001c\u0004\u013a\u0116\u0001"+
		"\u0000\u0000\u0000\u013a\u0119\u0001\u0000\u0000\u0000\u013a\u011c\u0001"+
		"\u0000\u0000\u0000\u013a\u011f\u0001\u0000\u0000\u0000\u013a\u0122\u0001"+
		"\u0000\u0000\u0000\u013a\u0125\u0001\u0000\u0000\u0000\u013a\u0128\u0001"+
		"\u0000\u0000\u0000\u013a\u012b\u0001\u0000\u0000\u0000\u013a\u012e\u0001"+
		"\u0000\u0000\u0000\u013a\u0131\u0001\u0000\u0000\u0000\u013a\u0134\u0001"+
		"\u0000\u0000\u0000\u013a\u0137\u0001\u0000\u0000\u0000\u013b\u013e\u0001"+
		"\u0000\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013c\u013d\u0001"+
		"\u0000\u0000\u0000\u013d9\u0001\u0000\u0000\u0000\u013e\u013c\u0001\u0000"+
		"\u0000\u0000\u013f\u014c\u0003>\u001f\u0000\u0140\u014c\u0003\u0010\b"+
		"\u0000\u0141\u014c\u0003@ \u0000\u0142\u014c\u0005\u0010\u0000\u0000\u0143"+
		"\u014c\u0005\u001b\u0000\u0000\u0144\u014c\u0005$\u0000\u0000\u0145\u014c"+
		"\u0005:\u0000\u0000\u0146\u014c\u0005;\u0000\u0000\u0147\u014c\u00057"+
		"\u0000\u0000\u0148\u014c\u00059\u0000\u0000\u0149\u014c\u0003<\u001e\u0000"+
		"\u014a\u014c\u00056\u0000\u0000\u014b\u013f\u0001\u0000\u0000\u0000\u014b"+
		"\u0140\u0001\u0000\u0000\u0000\u014b\u0141\u0001\u0000\u0000\u0000\u014b"+
		"\u0142\u0001\u0000\u0000\u0000\u014b\u0143\u0001\u0000\u0000\u0000\u014b"+
		"\u0144\u0001\u0000\u0000\u0000\u014b\u0145\u0001\u0000\u0000\u0000\u014b"+
		"\u0146\u0001\u0000\u0000\u0000\u014b\u0147\u0001\u0000\u0000\u0000\u014b"+
		"\u0148\u0001\u0000\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014b"+
		"\u014a\u0001\u0000\u0000\u0000\u014c;\u0001\u0000\u0000\u0000\u014d\u014e"+
		"\u00058\u0000\u0000\u014e=\u0001\u0000\u0000\u0000\u014f\u0150\u00056"+
		"\u0000\u0000\u0150\u0152\u00054\u0000\u0000\u0151\u0153\u00038\u001c\u0000"+
		"\u0152\u0151\u0001\u0000\u0000\u0000\u0152\u0153\u0001\u0000\u0000\u0000"+
		"\u0153\u0154\u0001\u0000\u0000\u0000\u0154\u0155\u00055\u0000\u0000\u0155"+
		"?\u0001\u0000\u0000\u0000\u0156\u0157\u0005\u0011\u0000\u0000\u0157\u0158"+
		"\u0003 \u0010\u0000\u0158A\u0001\u0000\u0000\u0000%FHX]cirx\u0084\u008a"+
		"\u008f\u0092\u009b\u009e\u00a3\u00a9\u00b5\u00b8\u00bd\u00c1\u00c7\u00ca"+
		"\u00cf\u00d1\u00d5\u00da\u00df\u00e1\u00e9\u00ee\u00f5\u00fc\u0114\u013a"+
		"\u013c\u014b\u0152";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}