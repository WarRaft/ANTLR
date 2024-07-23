// Generated from /Users/nazarpunk/IdeaProjects/ANTLR/src/main/antlr/raft/war/antlr/jass/Jass.g4 by ANTLR 4.13.1
package raft.war.antlr.jass;
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
		RULE_varDef = 4, RULE_glob = 5, RULE_varDefGlob = 6, RULE_argList = 7, 
		RULE_funCall = 8, RULE_funName = 9, RULE_param = 10, RULE_paramList = 11, 
		RULE_funTake = 12, RULE_funRet = 13, RULE_fun = 14, RULE_funHead = 15, 
		RULE_funStmt = 16, RULE_nativ = 17, RULE_stmt = 18, RULE_varDefLoc = 19, 
		RULE_setStmt = 20, RULE_callStmt = 21, RULE_returnStmt = 22, RULE_ifStmt = 23, 
		RULE_elseIfStmt = 24, RULE_elseStmt = 25, RULE_loopStmt = 26, RULE_exitWhenStmt = 27, 
		RULE_expr = 28, RULE_prim = 29, RULE_arrayAccess = 30, RULE_funRef = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "typeDef", "typeName", "typeNameBase", "varDef", "glob", "varDefGlob", 
			"argList", "funCall", "funName", "param", "paramList", "funTake", "funRet", 
			"fun", "funHead", "funStmt", "nativ", "stmt", "varDefLoc", "setStmt", 
			"callStmt", "returnStmt", "ifStmt", "elseIfStmt", "elseStmt", "loopStmt", 
			"exitWhenStmt", "expr", "prim", "arrayAccess", "funRef"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137456123968L) != 0)) {
				{
				setState(68);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(64);
					typeDef();
					}
					break;
				case 2:
					{
					setState(65);
					nativ();
					}
					break;
				case 3:
					{
					setState(66);
					glob();
					}
					break;
				case 4:
					{
					setState(67);
					fun();
					}
					break;
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitTypeDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDefContext typeDef() throws RecognitionException {
		TypeDefContext _localctx = new TypeDefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_typeDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(TYPE);
			setState(76);
			typeName();
			setState(77);
			match(EXTENDS);
			setState(78);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_typeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitTypeNameBase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameBaseContext typeNameBase() throws RecognitionException {
		TypeNameBaseContext _localctx = new TypeNameBaseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeNameBase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
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
	public static class VarDefContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode ID() { return getToken(JassParser.ID, 0); }
		public TerminalNode ARRAY() { return getToken(JassParser.ARRAY, 0); }
		public TerminalNode EQ() { return getToken(JassParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).enterVarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).exitVarDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitVarDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			typeName();
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARRAY) {
				{
				setState(85);
				match(ARRAY);
				}
			}

			setState(88);
			match(ID);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(89);
				match(EQ);
				setState(90);
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
		public List<VarDefGlobContext> varDefGlob() {
			return getRuleContexts(VarDefGlobContext.class);
		}
		public VarDefGlobContext varDefGlob(int i) {
			return getRuleContext(VarDefGlobContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitGlob(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobContext glob() throws RecognitionException {
		GlobContext _localctx = new GlobContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_glob);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(GLOBALS);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18014407638909016L) != 0)) {
				{
				{
				setState(94);
				varDefGlob();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
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
	public static class VarDefGlobContext extends ParserRuleContext {
		public VarDefContext varDef() {
			return getRuleContext(VarDefContext.class,0);
		}
		public TerminalNode CONSTANT() { return getToken(JassParser.CONSTANT, 0); }
		public VarDefGlobContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefGlob; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).enterVarDefGlob(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).exitVarDefGlob(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitVarDefGlob(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefGlobContext varDefGlob() throws RecognitionException {
		VarDefGlobContext _localctx = new VarDefGlobContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varDefGlob);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTANT) {
				{
				setState(102);
				match(CONSTANT);
				}
			}

			setState(105);
			varDef();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			expr(0);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(108);
				match(COMMA);
				setState(109);
				expr(0);
				}
				}
				setState(114);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitFunCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunCallContext funCall() throws RecognitionException {
		FunCallContext _localctx = new FunCallContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			funName();
			setState(116);
			match(LPAREN);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1137088606054318080L) != 0)) {
				{
				setState(117);
				argList();
				}
			}

			setState(120);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitFunName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunNameContext funName() throws RecognitionException {
		FunNameContext _localctx = new FunNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_funName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_param);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_paramList);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitFunTake(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunTakeContext funTake() throws RecognitionException {
		FunTakeContext _localctx = new FunTakeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_funTake);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitFunRet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunRetContext funRet() throws RecognitionException {
		FunRetContext _localctx = new FunRetContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_funRet);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunContext fun() throws RecognitionException {
		FunContext _localctx = new FunContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fun);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitFunHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunHeadContext funHead() throws RecognitionException {
		FunHeadContext _localctx = new FunHeadContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_funHead);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitFunStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunStmtContext funStmt() throws RecognitionException {
		FunStmtContext _localctx = new FunStmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_funStmt);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitNativ(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NativContext nativ() throws RecognitionException {
		NativContext _localctx = new NativContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_nativ);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTANT) {
				{
				setState(166);
				match(CONSTANT);
				}
			}

			setState(169);
			match(NATIVE);
			setState(170);
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
		public VarDefLocContext varDefLoc() {
			return getRuleContext(VarDefLocContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_stmt);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				setStmt();
				}
				break;
			case CALL:
			case DEBUG:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				callStmt();
				}
				break;
			case BOOLEAN:
			case CODE:
			case HANDLE:
			case INTEGER:
			case LOCAL:
			case REAL:
			case STRING:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				varDefLoc();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(175);
				returnStmt();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(176);
				ifStmt();
				}
				break;
			case LOOP:
				enterOuterAlt(_localctx, 6);
				{
				setState(177);
				loopStmt();
				}
				break;
			case EXITWHEN:
				enterOuterAlt(_localctx, 7);
				{
				setState(178);
				exitWhenStmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class VarDefLocContext extends ParserRuleContext {
		public VarDefContext varDef() {
			return getRuleContext(VarDefContext.class,0);
		}
		public TerminalNode LOCAL() { return getToken(JassParser.LOCAL, 0); }
		public VarDefLocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefLoc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).enterVarDefLoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).exitVarDefLoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitVarDefLoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefLocContext varDefLoc() throws RecognitionException {
		VarDefLocContext _localctx = new VarDefLocContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_varDefLoc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCAL) {
				{
				setState(181);
				match(LOCAL);
				}
			}

			setState(184);
			varDef();
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
		public TerminalNode SET() { return getToken(JassParser.SET, 0); }
		public TerminalNode EQ() { return getToken(JassParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public TerminalNode ID() { return getToken(JassParser.ID, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitSetStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetStmtContext setStmt() throws RecognitionException {
		SetStmtContext _localctx = new SetStmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_setStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(SET);
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(187);
				arrayAccess();
				}
				break;
			case 2:
				{
				setState(188);
				match(ID);
				}
				break;
			}
			setState(191);
			match(EQ);
			setState(192);
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
		public TerminalNode CALL() { return getToken(JassParser.CALL, 0); }
		public FunCallContext funCall() {
			return getRuleContext(FunCallContext.class,0);
		}
		public TerminalNode DEBUG() { return getToken(JassParser.DEBUG, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitCallStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallStmtContext callStmt() throws RecognitionException {
		CallStmtContext _localctx = new CallStmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_callStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEBUG) {
				{
				setState(194);
				match(DEBUG);
				}
			}

			setState(197);
			match(CALL);
			setState(198);
			funCall();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(RETURN);
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(201);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(IF);
			setState(205);
			expr(0);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THEN) {
				{
				setState(206);
				match(THEN);
				}
			}

			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18014414095025080L) != 0)) {
				{
				setState(212);
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
					setState(209);
					stmt();
					}
					break;
				case ELSEIF:
					{
					setState(210);
					elseIfStmt();
					}
					break;
				case ELSE:
					{
					setState(211);
					elseStmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(217);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitElseIfStmt(this);
			else return visitor.visitChildren(this);
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
			setState(219);
			match(ELSEIF);
			setState(220);
			expr(0);
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THEN) {
				{
				setState(221);
				match(THEN);
				}
			}

			setState(227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(224);
					stmt();
					}
					} 
				}
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitElseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStmtContext elseStmt() throws RecognitionException {
		ElseStmtContext _localctx = new ElseStmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_elseStmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(ELSE);
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(231);
					stmt();
					}
					} 
				}
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitLoopStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStmtContext loopStmt() throws RecognitionException {
		LoopStmtContext _localctx = new LoopStmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_loopStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(LOOP);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18014414095024312L) != 0)) {
				{
				{
				setState(238);
				stmt();
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitExitWhenStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExitWhenStmtContext exitWhenStmt() throws RecognitionException {
		ExitWhenStmtContext _localctx = new ExitWhenStmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_exitWhenStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(EXITWHEN);
			setState(247);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
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
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUL:
				{
				setState(250);
				match(MUL);
				setState(251);
				expr(15);
				}
				break;
			case DIV:
				{
				setState(252);
				match(DIV);
				setState(253);
				expr(14);
				}
				break;
			case PLUS:
				{
				setState(254);
				match(PLUS);
				setState(255);
				expr(13);
				}
				break;
			case MINUS:
				{
				setState(256);
				match(MINUS);
				setState(257);
				expr(12);
				}
				break;
			case NOT:
				{
				setState(258);
				match(NOT);
				setState(259);
				expr(11);
				}
				break;
			case LPAREN:
				{
				setState(260);
				match(LPAREN);
				setState(261);
				expr(0);
				setState(262);
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
				setState(264);
				prim();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(305);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(303);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(267);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(268);
						match(PLUS);
						setState(269);
						expr(20);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(270);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(271);
						match(MINUS);
						setState(272);
						expr(19);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(273);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(274);
						match(MUL);
						setState(275);
						expr(18);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(276);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(277);
						match(DIV);
						setState(278);
						expr(17);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(279);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(280);
						match(EQ_EQ);
						setState(281);
						expr(11);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(282);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(283);
						match(NEQ);
						setState(284);
						expr(10);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(285);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(286);
						match(LT);
						setState(287);
						expr(9);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(288);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(289);
						match(LT_EQ);
						setState(290);
						expr(8);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(291);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(292);
						match(GT);
						setState(293);
						expr(7);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(294);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(295);
						match(GT_EQ);
						setState(296);
						expr(6);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(297);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(298);
						match(OR);
						setState(299);
						expr(5);
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(300);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(301);
						match(AND);
						setState(302);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(307);
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
		public FunRefContext funRef() {
			return getRuleContext(FunRefContext.class,0);
		}
		public TerminalNode FALSE() { return getToken(JassParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(JassParser.NULL, 0); }
		public TerminalNode TRUE() { return getToken(JassParser.TRUE, 0); }
		public TerminalNode HEXVAL() { return getToken(JassParser.HEXVAL, 0); }
		public TerminalNode REALVAL() { return getToken(JassParser.REALVAL, 0); }
		public TerminalNode INTVAL() { return getToken(JassParser.INTVAL, 0); }
		public TerminalNode RAWVAL() { return getToken(JassParser.RAWVAL, 0); }
		public TerminalNode STRVAL() { return getToken(JassParser.STRVAL, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitPrim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimContext prim() throws RecognitionException {
		PrimContext _localctx = new PrimContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_prim);
		try {
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				arrayAccess();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				funCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(310);
				funRef();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(311);
				match(FALSE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(312);
				match(NULL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(313);
				match(TRUE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(314);
				match(HEXVAL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(315);
				match(REALVAL);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(316);
				match(INTVAL);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(317);
				match(RAWVAL);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(318);
				match(STRVAL);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(319);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_arrayAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(ID);
			setState(323);
			match(LBRACK);
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1137088606054318080L) != 0)) {
				{
				setState(324);
				expr(0);
				}
			}

			setState(327);
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
	public static class FunRefContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(JassParser.FUNCTION, 0); }
		public FunNameContext funName() {
			return getRuleContext(FunNameContext.class,0);
		}
		public FunRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).enterFunRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JassListener ) ((JassListener)listener).exitFunRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JassVisitor ) return ((JassVisitor<? extends T>)visitor).visitFunRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunRefContext funRef() throws RecognitionException {
		FunRefContext _localctx = new FunRefContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_funRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(FUNCTION);
			setState(330);
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
		"\u0004\u0001>\u014d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000E\b\u0000\n\u0000\f\u0000H\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0003\u0004"+
		"W\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\\\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0005\u0005`\b\u0005\n\u0005\f\u0005c\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0003\u0006h\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007o\b\u0007\n\u0007"+
		"\f\u0007r\t\u0007\u0001\b\u0001\b\u0001\b\u0003\bw\b\b\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u0083\b\u000b\n\u000b\f\u000b\u0086\t\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0003\f\u008b\b\f\u0001\r\u0001\r\u0001\r\u0003\r\u0090"+
		"\b\r\u0001\u000e\u0003\u000e\u0093\b\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u009c"+
		"\b\u000f\u0001\u000f\u0003\u000f\u009f\b\u000f\u0001\u0010\u0005\u0010"+
		"\u00a2\b\u0010\n\u0010\f\u0010\u00a5\t\u0010\u0001\u0011\u0003\u0011\u00a8"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00b4"+
		"\b\u0012\u0001\u0013\u0003\u0013\u00b7\b\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00be\b\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0003\u0015\u00c4\b\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0003\u0016\u00cb\b\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u00d0\b\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0005\u0017\u00d5\b\u0017\n\u0017\f\u0017\u00d8"+
		"\t\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u00df\b\u0018\u0001\u0018\u0005\u0018\u00e2\b\u0018\n\u0018\f\u0018"+
		"\u00e5\t\u0018\u0001\u0019\u0001\u0019\u0005\u0019\u00e9\b\u0019\n\u0019"+
		"\f\u0019\u00ec\t\u0019\u0001\u001a\u0001\u001a\u0005\u001a\u00f0\b\u001a"+
		"\n\u001a\f\u001a\u00f3\t\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003"+
		"\u001c\u010a\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0005\u001c\u0130\b\u001c\n\u001c\f\u001c\u0133\t\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u0141\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u0146\b\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0000\u00018 \u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>\u0000\u0001\u0006"+
		"\u0000\u0003\u0004\u0013\u0013\u0015\u0015\u001d\u001d!!66\u016e\u0000"+
		"F\u0001\u0000\u0000\u0000\u0002K\u0001\u0000\u0000\u0000\u0004P\u0001"+
		"\u0000\u0000\u0000\u0006R\u0001\u0000\u0000\u0000\bT\u0001\u0000\u0000"+
		"\u0000\n]\u0001\u0000\u0000\u0000\fg\u0001\u0000\u0000\u0000\u000ek\u0001"+
		"\u0000\u0000\u0000\u0010s\u0001\u0000\u0000\u0000\u0012z\u0001\u0000\u0000"+
		"\u0000\u0014|\u0001\u0000\u0000\u0000\u0016\u007f\u0001\u0000\u0000\u0000"+
		"\u0018\u0087\u0001\u0000\u0000\u0000\u001a\u008c\u0001\u0000\u0000\u0000"+
		"\u001c\u0092\u0001\u0000\u0000\u0000\u001e\u0099\u0001\u0000\u0000\u0000"+
		" \u00a3\u0001\u0000\u0000\u0000\"\u00a7\u0001\u0000\u0000\u0000$\u00b3"+
		"\u0001\u0000\u0000\u0000&\u00b6\u0001\u0000\u0000\u0000(\u00ba\u0001\u0000"+
		"\u0000\u0000*\u00c3\u0001\u0000\u0000\u0000,\u00c8\u0001\u0000\u0000\u0000"+
		".\u00cc\u0001\u0000\u0000\u00000\u00db\u0001\u0000\u0000\u00002\u00e6"+
		"\u0001\u0000\u0000\u00004\u00ed\u0001\u0000\u0000\u00006\u00f6\u0001\u0000"+
		"\u0000\u00008\u0109\u0001\u0000\u0000\u0000:\u0140\u0001\u0000\u0000\u0000"+
		"<\u0142\u0001\u0000\u0000\u0000>\u0149\u0001\u0000\u0000\u0000@E\u0003"+
		"\u0002\u0001\u0000AE\u0003\"\u0011\u0000BE\u0003\n\u0005\u0000CE\u0003"+
		"\u001c\u000e\u0000D@\u0001\u0000\u0000\u0000DA\u0001\u0000\u0000\u0000"+
		"DB\u0001\u0000\u0000\u0000DC\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000"+
		"\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GI\u0001\u0000"+
		"\u0000\u0000HF\u0001\u0000\u0000\u0000IJ\u0005\u0000\u0000\u0001J\u0001"+
		"\u0001\u0000\u0000\u0000KL\u0005%\u0000\u0000LM\u0003\u0004\u0002\u0000"+
		"MN\u0005\u000e\u0000\u0000NO\u0003\u0006\u0003\u0000O\u0003\u0001\u0000"+
		"\u0000\u0000PQ\u0007\u0000\u0000\u0000Q\u0005\u0001\u0000\u0000\u0000"+
		"RS\u0003\u0004\u0002\u0000S\u0007\u0001\u0000\u0000\u0000TV\u0003\u0004"+
		"\u0002\u0000UW\u0005\u0002\u0000\u0000VU\u0001\u0000\u0000\u0000VW\u0001"+
		"\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000X[\u00056\u0000\u0000YZ\u0005"+
		"(\u0000\u0000Z\\\u00038\u001c\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001"+
		"\u0000\u0000\u0000\\\t\u0001\u0000\u0000\u0000]a\u0005\u0012\u0000\u0000"+
		"^`\u0003\f\u0006\u0000_^\u0001\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000"+
		"a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bd\u0001\u0000\u0000"+
		"\u0000ca\u0001\u0000\u0000\u0000de\u0005\r\u0000\u0000e\u000b\u0001\u0000"+
		"\u0000\u0000fh\u0005\u0006\u0000\u0000gf\u0001\u0000\u0000\u0000gh\u0001"+
		"\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0003\b\u0004\u0000j\r"+
		"\u0001\u0000\u0000\u0000kp\u00038\u001c\u0000lm\u0005&\u0000\u0000mo\u0003"+
		"8\u001c\u0000nl\u0001\u0000\u0000\u0000or\u0001\u0000\u0000\u0000pn\u0001"+
		"\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000q\u000f\u0001\u0000\u0000"+
		"\u0000rp\u0001\u0000\u0000\u0000st\u0003\u0012\t\u0000tv\u00052\u0000"+
		"\u0000uw\u0003\u000e\u0007\u0000vu\u0001\u0000\u0000\u0000vw\u0001\u0000"+
		"\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u00053\u0000\u0000y\u0011\u0001"+
		"\u0000\u0000\u0000z{\u00056\u0000\u0000{\u0013\u0001\u0000\u0000\u0000"+
		"|}\u0003\u0004\u0002\u0000}~\u00056\u0000\u0000~\u0015\u0001\u0000\u0000"+
		"\u0000\u007f\u0084\u0003\u0014\n\u0000\u0080\u0081\u0005&\u0000\u0000"+
		"\u0081\u0083\u0003\u0014\n\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083"+
		"\u0086\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0001\u0000\u0000\u0000\u0085\u0017\u0001\u0000\u0000\u0000\u0086"+
		"\u0084\u0001\u0000\u0000\u0000\u0087\u008a\u0005\"\u0000\u0000\u0088\u008b"+
		"\u0005\u001a\u0000\u0000\u0089\u008b\u0003\u0016\u000b\u0000\u008a\u0088"+
		"\u0001\u0000\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008b\u0019"+
		"\u0001\u0000\u0000\u0000\u008c\u008f\u0005\u001e\u0000\u0000\u008d\u0090"+
		"\u0005\u001a\u0000\u0000\u008e\u0090\u0003\u0004\u0002\u0000\u008f\u008d"+
		"\u0001\u0000\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u001b"+
		"\u0001\u0000\u0000\u0000\u0091\u0093\u0005\u0006\u0000\u0000\u0092\u0091"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0094"+
		"\u0001\u0000\u0000\u0000\u0094\u0095\u0005\u0011\u0000\u0000\u0095\u0096"+
		"\u0003\u001e\u000f\u0000\u0096\u0097\u0003 \u0010\u0000\u0097\u0098\u0005"+
		"\n\u0000\u0000\u0098\u001d\u0001\u0000\u0000\u0000\u0099\u009b\u0003\u0012"+
		"\t\u0000\u009a\u009c\u0003\u0018\f\u0000\u009b\u009a\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009e\u0001\u0000\u0000"+
		"\u0000\u009d\u009f\u0003\u001a\r\u0000\u009e\u009d\u0001\u0000\u0000\u0000"+
		"\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u001f\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a2\u0003$\u0012\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a4!\u0001\u0000\u0000\u0000\u00a5\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a8\u0005\u0006\u0000\u0000\u00a7\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a9"+
		"\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005\u0018\u0000\u0000\u00aa\u00ab"+
		"\u0003\u001e\u000f\u0000\u00ab#\u0001\u0000\u0000\u0000\u00ac\u00b4\u0003"+
		"(\u0014\u0000\u00ad\u00b4\u0003*\u0015\u0000\u00ae\u00b4\u0003&\u0013"+
		"\u0000\u00af\u00b4\u0003,\u0016\u0000\u00b0\u00b4\u0003.\u0017\u0000\u00b1"+
		"\u00b4\u00034\u001a\u0000\u00b2\u00b4\u00036\u001b\u0000\u00b3\u00ac\u0001"+
		"\u0000\u0000\u0000\u00b3\u00ad\u0001\u0000\u0000\u0000\u00b3\u00ae\u0001"+
		"\u0000\u0000\u0000\u00b3\u00af\u0001\u0000\u0000\u0000\u00b3\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b4%\u0001\u0000\u0000\u0000\u00b5\u00b7\u0005\u0016"+
		"\u0000\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00b9\u0003\b\u0004"+
		"\u0000\u00b9\'\u0001\u0000\u0000\u0000\u00ba\u00bd\u0005 \u0000\u0000"+
		"\u00bb\u00be\u0003<\u001e\u0000\u00bc\u00be\u00056\u0000\u0000\u00bd\u00bb"+
		"\u0001\u0000\u0000\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf"+
		"\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005(\u0000\u0000\u00c0\u00c1\u0003"+
		"8\u001c\u0000\u00c1)\u0001\u0000\u0000\u0000\u00c2\u00c4\u0005\u0007\u0000"+
		"\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005\u0005\u0000"+
		"\u0000\u00c6\u00c7\u0003\u0010\b\u0000\u00c7+\u0001\u0000\u0000\u0000"+
		"\u00c8\u00ca\u0005\u001f\u0000\u0000\u00c9\u00cb\u00038\u001c\u0000\u00ca"+
		"\u00c9\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb"+
		"-\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005\u0014\u0000\u0000\u00cd\u00cf"+
		"\u00038\u001c\u0000\u00ce\u00d0\u0005#\u0000\u0000\u00cf\u00ce\u0001\u0000"+
		"\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d5\u0003$\u0012\u0000\u00d2\u00d5\u00030\u0018\u0000"+
		"\u00d3\u00d5\u00032\u0019\u0000\u00d4\u00d1\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d8\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d9\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d9\u00da\u0005\u000b\u0000\u0000\u00da"+
		"/\u0001\u0000\u0000\u0000\u00db\u00dc\u0005\t\u0000\u0000\u00dc\u00de"+
		"\u00038\u001c\u0000\u00dd\u00df\u0005#\u0000\u0000\u00de\u00dd\u0001\u0000"+
		"\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e2\u0003$\u0012\u0000\u00e1\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e5\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e41\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e6\u00ea\u0005\b\u0000\u0000\u00e7"+
		"\u00e9\u0003$\u0012\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ec"+
		"\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb"+
		"\u0001\u0000\u0000\u0000\u00eb3\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001"+
		"\u0000\u0000\u0000\u00ed\u00f1\u0005\u0017\u0000\u0000\u00ee\u00f0\u0003"+
		"$\u0012\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f4\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f5\u0005\f\u0000\u0000\u00f55\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f7\u0005\u000f\u0000\u0000\u00f7\u00f8\u00038\u001c\u0000"+
		"\u00f87\u0001\u0000\u0000\u0000\u00f9\u00fa\u0006\u001c\uffff\uffff\u0000"+
		"\u00fa\u00fb\u00050\u0000\u0000\u00fb\u010a\u00038\u001c\u000f\u00fc\u00fd"+
		"\u00051\u0000\u0000\u00fd\u010a\u00038\u001c\u000e\u00fe\u00ff\u0005."+
		"\u0000\u0000\u00ff\u010a\u00038\u001c\r\u0100\u0101\u0005/\u0000\u0000"+
		"\u0101\u010a\u00038\u001c\f\u0102\u0103\u0005\u0019\u0000\u0000\u0103"+
		"\u010a\u00038\u001c\u000b\u0104\u0105\u00052\u0000\u0000\u0105\u0106\u0003"+
		"8\u001c\u0000\u0106\u0107\u00053\u0000\u0000\u0107\u010a\u0001\u0000\u0000"+
		"\u0000\u0108\u010a\u0003:\u001d\u0000\u0109\u00f9\u0001\u0000\u0000\u0000"+
		"\u0109\u00fc\u0001\u0000\u0000\u0000\u0109\u00fe\u0001\u0000\u0000\u0000"+
		"\u0109\u0100\u0001\u0000\u0000\u0000\u0109\u0102\u0001\u0000\u0000\u0000"+
		"\u0109\u0104\u0001\u0000\u0000\u0000\u0109\u0108\u0001\u0000\u0000\u0000"+
		"\u010a\u0131\u0001\u0000\u0000\u0000\u010b\u010c\n\u0013\u0000\u0000\u010c"+
		"\u010d\u0005.\u0000\u0000\u010d\u0130\u00038\u001c\u0014\u010e\u010f\n"+
		"\u0012\u0000\u0000\u010f\u0110\u0005/\u0000\u0000\u0110\u0130\u00038\u001c"+
		"\u0013\u0111\u0112\n\u0011\u0000\u0000\u0112\u0113\u00050\u0000\u0000"+
		"\u0113\u0130\u00038\u001c\u0012\u0114\u0115\n\u0010\u0000\u0000\u0115"+
		"\u0116\u00051\u0000\u0000\u0116\u0130\u00038\u001c\u0011\u0117\u0118\n"+
		"\n\u0000\u0000\u0118\u0119\u0005\'\u0000\u0000\u0119\u0130\u00038\u001c"+
		"\u000b\u011a\u011b\n\t\u0000\u0000\u011b\u011c\u0005)\u0000\u0000\u011c"+
		"\u0130\u00038\u001c\n\u011d\u011e\n\b\u0000\u0000\u011e\u011f\u0005+\u0000"+
		"\u0000\u011f\u0130\u00038\u001c\t\u0120\u0121\n\u0007\u0000\u0000\u0121"+
		"\u0122\u0005*\u0000\u0000\u0122\u0130\u00038\u001c\b\u0123\u0124\n\u0006"+
		"\u0000\u0000\u0124\u0125\u0005-\u0000\u0000\u0125\u0130\u00038\u001c\u0007"+
		"\u0126\u0127\n\u0005\u0000\u0000\u0127\u0128\u0005,\u0000\u0000\u0128"+
		"\u0130\u00038\u001c\u0006\u0129\u012a\n\u0004\u0000\u0000\u012a\u012b"+
		"\u0005\u001c\u0000\u0000\u012b\u0130\u00038\u001c\u0005\u012c\u012d\n"+
		"\u0003\u0000\u0000\u012d\u012e\u0005\u0001\u0000\u0000\u012e\u0130\u0003"+
		"8\u001c\u0004\u012f\u010b\u0001\u0000\u0000\u0000\u012f\u010e\u0001\u0000"+
		"\u0000\u0000\u012f\u0111\u0001\u0000\u0000\u0000\u012f\u0114\u0001\u0000"+
		"\u0000\u0000\u012f\u0117\u0001\u0000\u0000\u0000\u012f\u011a\u0001\u0000"+
		"\u0000\u0000\u012f\u011d\u0001\u0000\u0000\u0000\u012f\u0120\u0001\u0000"+
		"\u0000\u0000\u012f\u0123\u0001\u0000\u0000\u0000\u012f\u0126\u0001\u0000"+
		"\u0000\u0000\u012f\u0129\u0001\u0000\u0000\u0000\u012f\u012c\u0001\u0000"+
		"\u0000\u0000\u0130\u0133\u0001\u0000\u0000\u0000\u0131\u012f\u0001\u0000"+
		"\u0000\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u01329\u0001\u0000\u0000"+
		"\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0134\u0141\u0003<\u001e\u0000"+
		"\u0135\u0141\u0003\u0010\b\u0000\u0136\u0141\u0003>\u001f\u0000\u0137"+
		"\u0141\u0005\u0010\u0000\u0000\u0138\u0141\u0005\u001b\u0000\u0000\u0139"+
		"\u0141\u0005$\u0000\u0000\u013a\u0141\u0005:\u0000\u0000\u013b\u0141\u0005"+
		";\u0000\u0000\u013c\u0141\u00057\u0000\u0000\u013d\u0141\u00059\u0000"+
		"\u0000\u013e\u0141\u00058\u0000\u0000\u013f\u0141\u00056\u0000\u0000\u0140"+
		"\u0134\u0001\u0000\u0000\u0000\u0140\u0135\u0001\u0000\u0000\u0000\u0140"+
		"\u0136\u0001\u0000\u0000\u0000\u0140\u0137\u0001\u0000\u0000\u0000\u0140"+
		"\u0138\u0001\u0000\u0000\u0000\u0140\u0139\u0001\u0000\u0000\u0000\u0140"+
		"\u013a\u0001\u0000\u0000\u0000\u0140\u013b\u0001\u0000\u0000\u0000\u0140"+
		"\u013c\u0001\u0000\u0000\u0000\u0140\u013d\u0001\u0000\u0000\u0000\u0140"+
		"\u013e\u0001\u0000\u0000\u0000\u0140\u013f\u0001\u0000\u0000\u0000\u0141"+
		";\u0001\u0000\u0000\u0000\u0142\u0143\u00056\u0000\u0000\u0143\u0145\u0005"+
		"4\u0000\u0000\u0144\u0146\u00038\u001c\u0000\u0145\u0144\u0001\u0000\u0000"+
		"\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000"+
		"\u0000\u0147\u0148\u00055\u0000\u0000\u0148=\u0001\u0000\u0000\u0000\u0149"+
		"\u014a\u0005\u0011\u0000\u0000\u014a\u014b\u0003\u0012\t\u0000\u014b?"+
		"\u0001\u0000\u0000\u0000!DFV[agpv\u0084\u008a\u008f\u0092\u009b\u009e"+
		"\u00a3\u00a7\u00b3\u00b6\u00bd\u00c3\u00ca\u00cf\u00d4\u00d6\u00de\u00e3"+
		"\u00ea\u00f1\u0109\u012f\u0131\u0140\u0145";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}