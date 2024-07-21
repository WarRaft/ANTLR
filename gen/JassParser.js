// Generated from /Users/nazarpunk/IdeaProjects/ANTLR/jass/JassParser.g4 by ANTLR 4.13.1
// jshint ignore: start
import antlr4 from 'antlr4';
import JassParserListener from './JassParserListener.js';
import JassParserVisitor from './JassParserVisitor.js';

const serializedATN = [4,1,62,346,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,
4,2,5,7,5,2,6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,
2,13,7,13,2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,19,2,
20,7,20,2,21,7,21,2,22,7,22,2,23,7,23,2,24,7,24,2,25,7,25,2,26,7,26,2,27,
7,27,2,28,7,28,2,29,7,29,2,30,7,30,2,31,7,31,2,32,7,32,1,0,1,0,1,0,1,0,5,
0,71,8,0,10,0,12,0,74,9,0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,2,1,2,1,3,1,3,1,
4,1,4,3,4,89,8,4,1,4,1,4,1,4,3,4,94,8,4,1,5,1,5,5,5,98,8,5,10,5,12,5,101,
9,5,1,5,1,5,1,6,3,6,106,8,6,1,6,1,6,1,7,1,7,1,7,5,7,113,8,7,10,7,12,7,116,
9,7,1,8,1,8,1,8,3,8,121,8,8,1,8,1,8,1,9,1,9,1,9,1,10,1,10,1,10,5,10,131,
8,10,10,10,12,10,134,9,10,1,11,1,11,1,11,3,11,139,8,11,1,12,1,12,1,12,3,
12,144,8,12,1,13,3,13,147,8,13,1,13,1,13,1,13,1,13,1,13,1,14,1,14,3,14,156,
8,14,1,14,3,14,159,8,14,1,15,5,15,162,8,15,10,15,12,15,165,9,15,1,16,1,16,
1,17,3,17,170,8,17,1,17,1,17,1,17,1,18,1,18,1,18,1,18,1,18,1,18,1,18,3,18,
182,8,18,1,19,3,19,185,8,19,1,19,1,19,1,20,3,20,190,8,20,1,20,1,20,3,20,
194,8,20,1,20,1,20,1,20,1,21,3,21,200,8,21,1,21,3,21,203,8,21,1,21,1,21,
1,21,3,21,208,8,21,3,21,210,8,21,1,22,1,22,3,22,214,8,22,1,23,1,23,1,23,
3,23,219,8,23,1,23,1,23,1,23,5,23,224,8,23,10,23,12,23,227,9,23,1,23,1,23,
1,24,1,24,1,24,3,24,234,8,24,1,24,5,24,237,8,24,10,24,12,24,240,9,24,1,25,
1,25,5,25,244,8,25,10,25,12,25,247,9,25,1,26,1,26,5,26,251,8,26,10,26,12,
26,254,9,26,1,26,1,26,1,27,1,27,1,27,1,28,1,28,1,28,1,28,1,28,1,28,1,28,
1,28,1,28,1,28,1,28,1,28,1,28,1,28,1,28,1,28,3,28,277,8,28,1,28,1,28,1,28,
1,28,1,28,1,28,1,28,1,28,1,28,1,28,1,28,1,28,1,28,1,28,1,28,1,28,1,28,1,
28,1,28,1,28,1,28,1,28,1,28,1,28,1,28,1,28,1,28,1,28,1,28,1,28,1,28,1,28,
1,28,1,28,1,28,1,28,5,28,315,8,28,10,28,12,28,318,9,28,1,29,1,29,1,29,1,
29,1,29,1,29,1,29,1,29,1,29,1,29,1,29,1,29,3,29,332,8,29,1,30,1,30,1,31,
1,31,1,31,3,31,339,8,31,1,31,1,31,1,32,1,32,1,32,1,32,0,1,56,33,0,2,4,6,
8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,40,42,44,46,48,50,52,54,56,
58,60,62,64,0,1,6,0,3,4,19,19,21,21,29,29,33,33,54,54,382,0,72,1,0,0,0,2,
77,1,0,0,0,4,82,1,0,0,0,6,84,1,0,0,0,8,86,1,0,0,0,10,95,1,0,0,0,12,105,1,
0,0,0,14,109,1,0,0,0,16,117,1,0,0,0,18,124,1,0,0,0,20,127,1,0,0,0,22,135,
1,0,0,0,24,140,1,0,0,0,26,146,1,0,0,0,28,153,1,0,0,0,30,163,1,0,0,0,32,166,
1,0,0,0,34,169,1,0,0,0,36,181,1,0,0,0,38,184,1,0,0,0,40,189,1,0,0,0,42,199,
1,0,0,0,44,211,1,0,0,0,46,215,1,0,0,0,48,230,1,0,0,0,50,241,1,0,0,0,52,248,
1,0,0,0,54,257,1,0,0,0,56,276,1,0,0,0,58,331,1,0,0,0,60,333,1,0,0,0,62,335,
1,0,0,0,64,342,1,0,0,0,66,71,3,2,1,0,67,71,3,34,17,0,68,71,3,10,5,0,69,71,
3,26,13,0,70,66,1,0,0,0,70,67,1,0,0,0,70,68,1,0,0,0,70,69,1,0,0,0,71,74,
1,0,0,0,72,70,1,0,0,0,72,73,1,0,0,0,73,75,1,0,0,0,74,72,1,0,0,0,75,76,5,
0,0,1,76,1,1,0,0,0,77,78,5,37,0,0,78,79,3,4,2,0,79,80,5,14,0,0,80,81,3,6,
3,0,81,3,1,0,0,0,82,83,7,0,0,0,83,5,1,0,0,0,84,85,3,4,2,0,85,7,1,0,0,0,86,
88,3,4,2,0,87,89,5,2,0,0,88,87,1,0,0,0,88,89,1,0,0,0,89,90,1,0,0,0,90,93,
5,54,0,0,91,92,5,40,0,0,92,94,3,56,28,0,93,91,1,0,0,0,93,94,1,0,0,0,94,9,
1,0,0,0,95,99,5,18,0,0,96,98,3,12,6,0,97,96,1,0,0,0,98,101,1,0,0,0,99,97,
1,0,0,0,99,100,1,0,0,0,100,102,1,0,0,0,101,99,1,0,0,0,102,103,5,13,0,0,103,
11,1,0,0,0,104,106,5,6,0,0,105,104,1,0,0,0,105,106,1,0,0,0,106,107,1,0,0,
0,107,108,3,8,4,0,108,13,1,0,0,0,109,114,3,56,28,0,110,111,5,38,0,0,111,
113,3,56,28,0,112,110,1,0,0,0,113,116,1,0,0,0,114,112,1,0,0,0,114,115,1,
0,0,0,115,15,1,0,0,0,116,114,1,0,0,0,117,118,3,32,16,0,118,120,5,50,0,0,
119,121,3,14,7,0,120,119,1,0,0,0,120,121,1,0,0,0,121,122,1,0,0,0,122,123,
5,51,0,0,123,17,1,0,0,0,124,125,3,4,2,0,125,126,5,54,0,0,126,19,1,0,0,0,
127,132,3,18,9,0,128,129,5,38,0,0,129,131,3,18,9,0,130,128,1,0,0,0,131,134,
1,0,0,0,132,130,1,0,0,0,132,133,1,0,0,0,133,21,1,0,0,0,134,132,1,0,0,0,135,
138,5,34,0,0,136,139,5,26,0,0,137,139,3,20,10,0,138,136,1,0,0,0,138,137,
1,0,0,0,139,23,1,0,0,0,140,143,5,30,0,0,141,144,5,26,0,0,142,144,3,4,2,0,
143,141,1,0,0,0,143,142,1,0,0,0,144,25,1,0,0,0,145,147,5,6,0,0,146,145,1,
0,0,0,146,147,1,0,0,0,147,148,1,0,0,0,148,149,5,17,0,0,149,150,3,28,14,0,
150,151,3,30,15,0,151,152,5,10,0,0,152,27,1,0,0,0,153,155,3,32,16,0,154,
156,3,22,11,0,155,154,1,0,0,0,155,156,1,0,0,0,156,158,1,0,0,0,157,159,3,
24,12,0,158,157,1,0,0,0,158,159,1,0,0,0,159,29,1,0,0,0,160,162,3,36,18,0,
161,160,1,0,0,0,162,165,1,0,0,0,163,161,1,0,0,0,163,164,1,0,0,0,164,31,1,
0,0,0,165,163,1,0,0,0,166,167,5,54,0,0,167,33,1,0,0,0,168,170,5,6,0,0,169,
168,1,0,0,0,169,170,1,0,0,0,170,171,1,0,0,0,171,172,5,24,0,0,172,173,3,28,
14,0,173,35,1,0,0,0,174,182,3,40,20,0,175,182,3,42,21,0,176,182,3,38,19,
0,177,182,3,44,22,0,178,182,3,46,23,0,179,182,3,52,26,0,180,182,3,54,27,
0,181,174,1,0,0,0,181,175,1,0,0,0,181,176,1,0,0,0,181,177,1,0,0,0,181,178,
1,0,0,0,181,179,1,0,0,0,181,180,1,0,0,0,182,37,1,0,0,0,183,185,5,22,0,0,
184,183,1,0,0,0,184,185,1,0,0,0,185,186,1,0,0,0,186,187,3,8,4,0,187,39,1,
0,0,0,188,190,5,32,0,0,189,188,1,0,0,0,189,190,1,0,0,0,190,193,1,0,0,0,191,
194,3,62,31,0,192,194,5,54,0,0,193,191,1,0,0,0,193,192,1,0,0,0,194,195,1,
0,0,0,195,196,5,40,0,0,196,197,3,56,28,0,197,41,1,0,0,0,198,200,5,7,0,0,
199,198,1,0,0,0,199,200,1,0,0,0,200,209,1,0,0,0,201,203,5,5,0,0,202,201,
1,0,0,0,202,203,1,0,0,0,203,204,1,0,0,0,204,210,3,16,8,0,205,207,5,5,0,0,
206,208,3,16,8,0,207,206,1,0,0,0,207,208,1,0,0,0,208,210,1,0,0,0,209,202,
1,0,0,0,209,205,1,0,0,0,210,43,1,0,0,0,211,213,5,31,0,0,212,214,3,56,28,
0,213,212,1,0,0,0,213,214,1,0,0,0,214,45,1,0,0,0,215,216,5,20,0,0,216,218,
3,56,28,0,217,219,5,35,0,0,218,217,1,0,0,0,218,219,1,0,0,0,219,225,1,0,0,
0,220,224,3,36,18,0,221,224,3,48,24,0,222,224,3,50,25,0,223,220,1,0,0,0,
223,221,1,0,0,0,223,222,1,0,0,0,224,227,1,0,0,0,225,223,1,0,0,0,225,226,
1,0,0,0,226,228,1,0,0,0,227,225,1,0,0,0,228,229,5,11,0,0,229,47,1,0,0,0,
230,231,5,9,0,0,231,233,3,56,28,0,232,234,5,35,0,0,233,232,1,0,0,0,233,234,
1,0,0,0,234,238,1,0,0,0,235,237,3,36,18,0,236,235,1,0,0,0,237,240,1,0,0,
0,238,236,1,0,0,0,238,239,1,0,0,0,239,49,1,0,0,0,240,238,1,0,0,0,241,245,
5,8,0,0,242,244,3,36,18,0,243,242,1,0,0,0,244,247,1,0,0,0,245,243,1,0,0,
0,245,246,1,0,0,0,246,51,1,0,0,0,247,245,1,0,0,0,248,252,5,23,0,0,249,251,
3,36,18,0,250,249,1,0,0,0,251,254,1,0,0,0,252,250,1,0,0,0,252,253,1,0,0,
0,253,255,1,0,0,0,254,252,1,0,0,0,255,256,5,12,0,0,256,53,1,0,0,0,257,258,
5,15,0,0,258,259,3,56,28,0,259,55,1,0,0,0,260,261,6,28,-1,0,261,262,5,48,
0,0,262,277,3,56,28,15,263,264,5,49,0,0,264,277,3,56,28,14,265,266,5,46,
0,0,266,277,3,56,28,13,267,268,5,47,0,0,268,277,3,56,28,12,269,270,5,25,
0,0,270,277,3,56,28,11,271,272,5,50,0,0,272,273,3,56,28,0,273,274,5,51,0,
0,274,277,1,0,0,0,275,277,3,58,29,0,276,260,1,0,0,0,276,263,1,0,0,0,276,
265,1,0,0,0,276,267,1,0,0,0,276,269,1,0,0,0,276,271,1,0,0,0,276,275,1,0,
0,0,277,316,1,0,0,0,278,279,10,19,0,0,279,280,5,46,0,0,280,315,3,56,28,20,
281,282,10,18,0,0,282,283,5,47,0,0,283,315,3,56,28,19,284,285,10,17,0,0,
285,286,5,48,0,0,286,315,3,56,28,18,287,288,10,16,0,0,288,289,5,49,0,0,289,
315,3,56,28,17,290,291,10,10,0,0,291,292,5,39,0,0,292,315,3,56,28,11,293,
294,10,9,0,0,294,295,5,41,0,0,295,315,3,56,28,10,296,297,10,8,0,0,297,298,
5,43,0,0,298,315,3,56,28,9,299,300,10,7,0,0,300,301,5,42,0,0,301,315,3,56,
28,8,302,303,10,6,0,0,303,304,5,45,0,0,304,315,3,56,28,7,305,306,10,5,0,
0,306,307,5,44,0,0,307,315,3,56,28,6,308,309,10,4,0,0,309,310,5,28,0,0,310,
315,3,56,28,5,311,312,10,3,0,0,312,313,5,1,0,0,313,315,3,56,28,4,314,278,
1,0,0,0,314,281,1,0,0,0,314,284,1,0,0,0,314,287,1,0,0,0,314,290,1,0,0,0,
314,293,1,0,0,0,314,296,1,0,0,0,314,299,1,0,0,0,314,302,1,0,0,0,314,305,
1,0,0,0,314,308,1,0,0,0,314,311,1,0,0,0,315,318,1,0,0,0,316,314,1,0,0,0,
316,317,1,0,0,0,317,57,1,0,0,0,318,316,1,0,0,0,319,332,3,62,31,0,320,332,
3,16,8,0,321,332,3,64,32,0,322,332,5,16,0,0,323,332,5,27,0,0,324,332,5,36,
0,0,325,332,5,58,0,0,326,332,5,59,0,0,327,332,5,55,0,0,328,332,5,57,0,0,
329,332,3,60,30,0,330,332,5,54,0,0,331,319,1,0,0,0,331,320,1,0,0,0,331,321,
1,0,0,0,331,322,1,0,0,0,331,323,1,0,0,0,331,324,1,0,0,0,331,325,1,0,0,0,
331,326,1,0,0,0,331,327,1,0,0,0,331,328,1,0,0,0,331,329,1,0,0,0,331,330,
1,0,0,0,332,59,1,0,0,0,333,334,5,56,0,0,334,61,1,0,0,0,335,336,5,54,0,0,
336,338,5,52,0,0,337,339,3,56,28,0,338,337,1,0,0,0,338,339,1,0,0,0,339,340,
1,0,0,0,340,341,5,53,0,0,341,63,1,0,0,0,342,343,5,17,0,0,343,344,3,32,16,
0,344,65,1,0,0,0,37,70,72,88,93,99,105,114,120,132,138,143,146,155,158,163,
169,181,184,189,193,199,202,207,209,213,218,223,225,233,238,245,252,276,
314,316,331,338];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.atn.PredictionContextCache();

export default class JassParser extends antlr4.Parser {

    static grammarFileName = "JassParser.g4";
    static literalNames = [ null, "'and'", "'array'", "'boolean'", "'code'", 
                            "'call'", "'constant'", "'debug'", "'else'", 
                            "'elseif'", "'endfunction'", "'endif'", "'endloop'", 
                            "'endglobals'", "'extends'", "'exitwhen'", "'false'", 
                            "'function'", "'globals'", "'handle'", "'if'", 
                            "'integer'", "'local'", "'loop'", "'native'", 
                            "'not'", "'nothing'", "'null'", "'or'", "'real'", 
                            "'returns'", "'return'", "'set'", "'string'", 
                            "'takes'", "'then'", "'true'", "'type'", "','", 
                            "'=='", "'='", "'!='", "'<='", "'<'", "'>='", 
                            "'>'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", 
                            "'['", "']'" ];
    static symbolicNames = [ null, "AND", "ARRAY", "BOOLEAN", "CODE", "CALL", 
                             "CONSTANT", "DEBUG", "ELSE", "ELSEIF", "ENDFUNCTION", 
                             "ENDIF", "ENDLOOP", "ENDGLOBALS", "EXTENDS", 
                             "EXITWHEN", "FALSE", "FUNCTION", "GLOBALS", 
                             "HANDLE", "IF", "INTEGER", "LOCAL", "LOOP", 
                             "NATIVE", "NOT", "NOTHING", "NULL", "OR", "REAL", 
                             "RETURNS", "RETURN", "SET", "STRING", "TAKES", 
                             "THEN", "TRUE", "TYPE", "COMMA", "EQ_EQ", "EQ", 
                             "NEQ", "LT_EQ", "LT", "GT_EQ", "GT", "PLUS", 
                             "MINUS", "MUL", "DIV", "LPAREN", "RPAREN", 
                             "LBRACK", "RBRACK", "ID", "INTVAL", "STRVAL", 
                             "RAWVAL", "HEXVAL", "REALVAL", "WS", "NL", 
                             "LINE_COMMENT" ];
    static ruleNames = [ "root", "typeDef", "typeName", "typeNameBase", 
                         "var", "glob", "gvar", "argList", "funCall", "param", 
                         "paramList", "funTake", "funRet", "fun", "funHead", 
                         "funStmt", "funName", "nativ", "stmt", "lvarStmt", 
                         "setStmt", "callStmt", "returnStmt", "ifStmt", 
                         "elseIfStmt", "elseStmt", "loopStmt", "exitWhenStmt", 
                         "expr", "prim", "str", "arrayAccess", "funcAsCode" ];

    constructor(input) {
        super(input);
        this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
        this.ruleNames = JassParser.ruleNames;
        this.literalNames = JassParser.literalNames;
        this.symbolicNames = JassParser.symbolicNames;
    }

    sempred(localctx, ruleIndex, predIndex) {
    	switch(ruleIndex) {
    	case 28:
    	    		return this.expr_sempred(localctx, predIndex);
        default:
            throw "No predicate with index:" + ruleIndex;
       }
    }

    expr_sempred(localctx, predIndex) {
    	switch(predIndex) {
    		case 0:
    			return this.precpred(this._ctx, 19);
    		case 1:
    			return this.precpred(this._ctx, 18);
    		case 2:
    			return this.precpred(this._ctx, 17);
    		case 3:
    			return this.precpred(this._ctx, 16);
    		case 4:
    			return this.precpred(this._ctx, 10);
    		case 5:
    			return this.precpred(this._ctx, 9);
    		case 6:
    			return this.precpred(this._ctx, 8);
    		case 7:
    			return this.precpred(this._ctx, 7);
    		case 8:
    			return this.precpred(this._ctx, 6);
    		case 9:
    			return this.precpred(this._ctx, 5);
    		case 10:
    			return this.precpred(this._ctx, 4);
    		case 11:
    			return this.precpred(this._ctx, 3);
    		default:
    			throw "No predicate with index:" + predIndex;
    	}
    };




	root() {
	    let localctx = new RootContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 0, JassParser.RULE_root);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 72;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while(((((_la - 6)) & ~0x1f) === 0 && ((1 << (_la - 6)) & 2147751937) !== 0)) {
	            this.state = 70;
	            this._errHandler.sync(this);
	            var la_ = this._interp.adaptivePredict(this._input,0,this._ctx);
	            switch(la_) {
	            case 1:
	                this.state = 66;
	                this.typeDef();
	                break;

	            case 2:
	                this.state = 67;
	                this.nativ();
	                break;

	            case 3:
	                this.state = 68;
	                this.glob();
	                break;

	            case 4:
	                this.state = 69;
	                this.fun();
	                break;

	            }
	            this.state = 74;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	        this.state = 75;
	        this.match(JassParser.EOF);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	typeDef() {
	    let localctx = new TypeDefContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 2, JassParser.RULE_typeDef);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 77;
	        this.match(JassParser.TYPE);
	        this.state = 78;
	        this.typeName();
	        this.state = 79;
	        this.match(JassParser.EXTENDS);
	        this.state = 80;
	        this.typeNameBase();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	typeName() {
	    let localctx = new TypeNameContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 4, JassParser.RULE_typeName);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 82;
	        _la = this._input.LA(1);
	        if(!((((_la) & ~0x1f) === 0 && ((1 << _la) & 539492376) !== 0) || _la===33 || _la===54)) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	typeNameBase() {
	    let localctx = new TypeNameBaseContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 6, JassParser.RULE_typeNameBase);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 84;
	        this.typeName();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	var_() {
	    let localctx = new VarContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 8, JassParser.RULE_var);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 86;
	        this.typeName();
	        this.state = 88;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===2) {
	            this.state = 87;
	            this.match(JassParser.ARRAY);
	        }

	        this.state = 90;
	        this.match(JassParser.ID);
	        this.state = 93;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===40) {
	            this.state = 91;
	            this.match(JassParser.EQ);
	            this.state = 92;
	            this.expr(0);
	        }

	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	glob() {
	    let localctx = new GlobContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 10, JassParser.RULE_glob);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 95;
	        this.match(JassParser.GLOBALS);
	        this.state = 99;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while((((_la) & ~0x1f) === 0 && ((1 << _la) & 539492440) !== 0) || _la===33 || _la===54) {
	            this.state = 96;
	            this.gvar();
	            this.state = 101;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	        this.state = 102;
	        this.match(JassParser.ENDGLOBALS);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	gvar() {
	    let localctx = new GvarContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 12, JassParser.RULE_gvar);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 105;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===6) {
	            this.state = 104;
	            this.match(JassParser.CONSTANT);
	        }

	        this.state = 107;
	        this.var_();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	argList() {
	    let localctx = new ArgListContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 14, JassParser.RULE_argList);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 109;
	        this.expr(0);
	        this.state = 114;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while(_la===38) {
	            this.state = 110;
	            this.match(JassParser.COMMA);
	            this.state = 111;
	            this.expr(0);
	            this.state = 116;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	funCall() {
	    let localctx = new FunCallContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 16, JassParser.RULE_funCall);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 117;
	        this.funName();
	        this.state = 118;
	        this.match(JassParser.LPAREN);
	        this.state = 120;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if((((_la) & ~0x1f) === 0 && ((1 << _la) & 167968768) !== 0) || ((((_la - 36)) & ~0x1f) === 0 && ((1 << (_la - 36)) & 16546817) !== 0)) {
	            this.state = 119;
	            this.argList();
	        }

	        this.state = 122;
	        this.match(JassParser.RPAREN);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	param() {
	    let localctx = new ParamContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 18, JassParser.RULE_param);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 124;
	        this.typeName();
	        this.state = 125;
	        this.match(JassParser.ID);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	paramList() {
	    let localctx = new ParamListContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 20, JassParser.RULE_paramList);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 127;
	        this.param();
	        this.state = 132;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while(_la===38) {
	            this.state = 128;
	            this.match(JassParser.COMMA);
	            this.state = 129;
	            this.param();
	            this.state = 134;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	funTake() {
	    let localctx = new FunTakeContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 22, JassParser.RULE_funTake);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 135;
	        this.match(JassParser.TAKES);
	        this.state = 138;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 26:
	            this.state = 136;
	            this.match(JassParser.NOTHING);
	            break;
	        case 3:
	        case 4:
	        case 19:
	        case 21:
	        case 29:
	        case 33:
	        case 54:
	            this.state = 137;
	            this.paramList();
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	funRet() {
	    let localctx = new FunRetContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 24, JassParser.RULE_funRet);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 140;
	        this.match(JassParser.RETURNS);
	        this.state = 143;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 26:
	            this.state = 141;
	            this.match(JassParser.NOTHING);
	            break;
	        case 3:
	        case 4:
	        case 19:
	        case 21:
	        case 29:
	        case 33:
	        case 54:
	            this.state = 142;
	            this.typeName();
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	fun() {
	    let localctx = new FunContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 26, JassParser.RULE_fun);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 146;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===6) {
	            this.state = 145;
	            this.match(JassParser.CONSTANT);
	        }

	        this.state = 148;
	        this.match(JassParser.FUNCTION);
	        this.state = 149;
	        this.funHead();
	        this.state = 150;
	        this.funStmt();
	        this.state = 151;
	        this.match(JassParser.ENDFUNCTION);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	funHead() {
	    let localctx = new FunHeadContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 28, JassParser.RULE_funHead);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 153;
	        this.funName();
	        this.state = 155;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===34) {
	            this.state = 154;
	            this.funTake();
	        }

	        this.state = 158;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===30) {
	            this.state = 157;
	            this.funRet();
	        }

	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	funStmt() {
	    let localctx = new FunStmtContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 30, JassParser.RULE_funStmt);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 163;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while((((_la) & ~0x1f) === 0 && ((1 << _la) & 2700640440) !== 0) || ((((_la - 32)) & ~0x1f) === 0 && ((1 << (_la - 32)) & 4194307) !== 0)) {
	            this.state = 160;
	            this.stmt();
	            this.state = 165;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	funName() {
	    let localctx = new FunNameContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 32, JassParser.RULE_funName);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 166;
	        this.match(JassParser.ID);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	nativ() {
	    let localctx = new NativContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 34, JassParser.RULE_nativ);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 169;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===6) {
	            this.state = 168;
	            this.match(JassParser.CONSTANT);
	        }

	        this.state = 171;
	        this.match(JassParser.NATIVE);
	        this.state = 172;
	        this.funHead();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	stmt() {
	    let localctx = new StmtContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 36, JassParser.RULE_stmt);
	    try {
	        this.state = 181;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,16,this._ctx);
	        switch(la_) {
	        case 1:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 174;
	            this.setStmt();
	            break;

	        case 2:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 175;
	            this.callStmt();
	            break;

	        case 3:
	            this.enterOuterAlt(localctx, 3);
	            this.state = 176;
	            this.lvarStmt();
	            break;

	        case 4:
	            this.enterOuterAlt(localctx, 4);
	            this.state = 177;
	            this.returnStmt();
	            break;

	        case 5:
	            this.enterOuterAlt(localctx, 5);
	            this.state = 178;
	            this.ifStmt();
	            break;

	        case 6:
	            this.enterOuterAlt(localctx, 6);
	            this.state = 179;
	            this.loopStmt();
	            break;

	        case 7:
	            this.enterOuterAlt(localctx, 7);
	            this.state = 180;
	            this.exitWhenStmt();
	            break;

	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	lvarStmt() {
	    let localctx = new LvarStmtContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 38, JassParser.RULE_lvarStmt);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 184;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===22) {
	            this.state = 183;
	            this.match(JassParser.LOCAL);
	        }

	        this.state = 186;
	        this.var_();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	setStmt() {
	    let localctx = new SetStmtContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 40, JassParser.RULE_setStmt);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 189;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===32) {
	            this.state = 188;
	            this.match(JassParser.SET);
	        }

	        this.state = 193;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,19,this._ctx);
	        switch(la_) {
	        case 1:
	            this.state = 191;
	            this.arrayAccess();
	            break;

	        case 2:
	            this.state = 192;
	            this.match(JassParser.ID);
	            break;

	        }
	        this.state = 195;
	        this.match(JassParser.EQ);
	        this.state = 196;
	        this.expr(0);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	callStmt() {
	    let localctx = new CallStmtContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 42, JassParser.RULE_callStmt);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 199;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===7) {
	            this.state = 198;
	            this.match(JassParser.DEBUG);
	        }

	        this.state = 209;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,23,this._ctx);
	        switch(la_) {
	        case 1:
	            this.state = 202;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	            if(_la===5) {
	                this.state = 201;
	                this.match(JassParser.CALL);
	            }

	            this.state = 204;
	            this.funCall();
	            break;

	        case 2:
	            this.state = 205;
	            this.match(JassParser.CALL);
	            this.state = 207;
	            this._errHandler.sync(this);
	            var la_ = this._interp.adaptivePredict(this._input,22,this._ctx);
	            if(la_===1) {
	                this.state = 206;
	                this.funCall();

	            }
	            break;

	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	returnStmt() {
	    let localctx = new ReturnStmtContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 44, JassParser.RULE_returnStmt);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 211;
	        this.match(JassParser.RETURN);
	        this.state = 213;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,24,this._ctx);
	        if(la_===1) {
	            this.state = 212;
	            this.expr(0);

	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	ifStmt() {
	    let localctx = new IfStmtContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 46, JassParser.RULE_ifStmt);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 215;
	        this.match(JassParser.IF);
	        this.state = 216;
	        this.expr(0);
	        this.state = 218;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===35) {
	            this.state = 217;
	            this.match(JassParser.THEN);
	        }

	        this.state = 225;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while((((_la) & ~0x1f) === 0 && ((1 << _la) & 2700641208) !== 0) || ((((_la - 32)) & ~0x1f) === 0 && ((1 << (_la - 32)) & 4194307) !== 0)) {
	            this.state = 223;
	            this._errHandler.sync(this);
	            switch(this._input.LA(1)) {
	            case 3:
	            case 4:
	            case 5:
	            case 7:
	            case 15:
	            case 19:
	            case 20:
	            case 21:
	            case 22:
	            case 23:
	            case 29:
	            case 31:
	            case 32:
	            case 33:
	            case 54:
	                this.state = 220;
	                this.stmt();
	                break;
	            case 9:
	                this.state = 221;
	                this.elseIfStmt();
	                break;
	            case 8:
	                this.state = 222;
	                this.elseStmt();
	                break;
	            default:
	                throw new antlr4.error.NoViableAltException(this);
	            }
	            this.state = 227;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	        this.state = 228;
	        this.match(JassParser.ENDIF);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	elseIfStmt() {
	    let localctx = new ElseIfStmtContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 48, JassParser.RULE_elseIfStmt);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 230;
	        this.match(JassParser.ELSEIF);
	        this.state = 231;
	        this.expr(0);
	        this.state = 233;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===35) {
	            this.state = 232;
	            this.match(JassParser.THEN);
	        }

	        this.state = 238;
	        this._errHandler.sync(this);
	        var _alt = this._interp.adaptivePredict(this._input,29,this._ctx)
	        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	            if(_alt===1) {
	                this.state = 235;
	                this.stmt(); 
	            }
	            this.state = 240;
	            this._errHandler.sync(this);
	            _alt = this._interp.adaptivePredict(this._input,29,this._ctx);
	        }

	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	elseStmt() {
	    let localctx = new ElseStmtContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 50, JassParser.RULE_elseStmt);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 241;
	        this.match(JassParser.ELSE);
	        this.state = 245;
	        this._errHandler.sync(this);
	        var _alt = this._interp.adaptivePredict(this._input,30,this._ctx)
	        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	            if(_alt===1) {
	                this.state = 242;
	                this.stmt(); 
	            }
	            this.state = 247;
	            this._errHandler.sync(this);
	            _alt = this._interp.adaptivePredict(this._input,30,this._ctx);
	        }

	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	loopStmt() {
	    let localctx = new LoopStmtContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 52, JassParser.RULE_loopStmt);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 248;
	        this.match(JassParser.LOOP);
	        this.state = 252;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while((((_la) & ~0x1f) === 0 && ((1 << _la) & 2700640440) !== 0) || ((((_la - 32)) & ~0x1f) === 0 && ((1 << (_la - 32)) & 4194307) !== 0)) {
	            this.state = 249;
	            this.stmt();
	            this.state = 254;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	        this.state = 255;
	        this.match(JassParser.ENDLOOP);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	exitWhenStmt() {
	    let localctx = new ExitWhenStmtContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 54, JassParser.RULE_exitWhenStmt);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 257;
	        this.match(JassParser.EXITWHEN);
	        this.state = 258;
	        this.expr(0);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


	expr(_p) {
		if(_p===undefined) {
		    _p = 0;
		}
	    const _parentctx = this._ctx;
	    const _parentState = this.state;
	    let localctx = new ExprContext(this, this._ctx, _parentState);
	    let _prevctx = localctx;
	    const _startState = 56;
	    this.enterRecursionRule(localctx, 56, JassParser.RULE_expr, _p);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 276;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 48:
	            this.state = 261;
	            this.match(JassParser.MUL);
	            this.state = 262;
	            this.expr(15);
	            break;
	        case 49:
	            this.state = 263;
	            this.match(JassParser.DIV);
	            this.state = 264;
	            this.expr(14);
	            break;
	        case 46:
	            this.state = 265;
	            this.match(JassParser.PLUS);
	            this.state = 266;
	            this.expr(13);
	            break;
	        case 47:
	            this.state = 267;
	            this.match(JassParser.MINUS);
	            this.state = 268;
	            this.expr(12);
	            break;
	        case 25:
	            this.state = 269;
	            this.match(JassParser.NOT);
	            this.state = 270;
	            this.expr(11);
	            break;
	        case 50:
	            this.state = 271;
	            this.match(JassParser.LPAREN);
	            this.state = 272;
	            this.expr(0);
	            this.state = 273;
	            this.match(JassParser.RPAREN);
	            break;
	        case 16:
	        case 17:
	        case 27:
	        case 36:
	        case 54:
	        case 55:
	        case 56:
	        case 57:
	        case 58:
	        case 59:
	            this.state = 275;
	            this.prim();
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	        this._ctx.stop = this._input.LT(-1);
	        this.state = 316;
	        this._errHandler.sync(this);
	        var _alt = this._interp.adaptivePredict(this._input,34,this._ctx)
	        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	            if(_alt===1) {
	                if(this._parseListeners!==null) {
	                    this.triggerExitRuleEvent();
	                }
	                _prevctx = localctx;
	                this.state = 314;
	                this._errHandler.sync(this);
	                var la_ = this._interp.adaptivePredict(this._input,33,this._ctx);
	                switch(la_) {
	                case 1:
	                    localctx = new ExprContext(this, _parentctx, _parentState);
	                    this.pushNewRecursionContext(localctx, _startState, JassParser.RULE_expr);
	                    this.state = 278;
	                    if (!( this.precpred(this._ctx, 19))) {
	                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 19)");
	                    }
	                    this.state = 279;
	                    this.match(JassParser.PLUS);
	                    this.state = 280;
	                    this.expr(20);
	                    break;

	                case 2:
	                    localctx = new ExprContext(this, _parentctx, _parentState);
	                    this.pushNewRecursionContext(localctx, _startState, JassParser.RULE_expr);
	                    this.state = 281;
	                    if (!( this.precpred(this._ctx, 18))) {
	                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 18)");
	                    }
	                    this.state = 282;
	                    this.match(JassParser.MINUS);
	                    this.state = 283;
	                    this.expr(19);
	                    break;

	                case 3:
	                    localctx = new ExprContext(this, _parentctx, _parentState);
	                    this.pushNewRecursionContext(localctx, _startState, JassParser.RULE_expr);
	                    this.state = 284;
	                    if (!( this.precpred(this._ctx, 17))) {
	                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 17)");
	                    }
	                    this.state = 285;
	                    this.match(JassParser.MUL);
	                    this.state = 286;
	                    this.expr(18);
	                    break;

	                case 4:
	                    localctx = new ExprContext(this, _parentctx, _parentState);
	                    this.pushNewRecursionContext(localctx, _startState, JassParser.RULE_expr);
	                    this.state = 287;
	                    if (!( this.precpred(this._ctx, 16))) {
	                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 16)");
	                    }
	                    this.state = 288;
	                    this.match(JassParser.DIV);
	                    this.state = 289;
	                    this.expr(17);
	                    break;

	                case 5:
	                    localctx = new ExprContext(this, _parentctx, _parentState);
	                    this.pushNewRecursionContext(localctx, _startState, JassParser.RULE_expr);
	                    this.state = 290;
	                    if (!( this.precpred(this._ctx, 10))) {
	                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 10)");
	                    }
	                    this.state = 291;
	                    this.match(JassParser.EQ_EQ);
	                    this.state = 292;
	                    this.expr(11);
	                    break;

	                case 6:
	                    localctx = new ExprContext(this, _parentctx, _parentState);
	                    this.pushNewRecursionContext(localctx, _startState, JassParser.RULE_expr);
	                    this.state = 293;
	                    if (!( this.precpred(this._ctx, 9))) {
	                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 9)");
	                    }
	                    this.state = 294;
	                    this.match(JassParser.NEQ);
	                    this.state = 295;
	                    this.expr(10);
	                    break;

	                case 7:
	                    localctx = new ExprContext(this, _parentctx, _parentState);
	                    this.pushNewRecursionContext(localctx, _startState, JassParser.RULE_expr);
	                    this.state = 296;
	                    if (!( this.precpred(this._ctx, 8))) {
	                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 8)");
	                    }
	                    this.state = 297;
	                    this.match(JassParser.LT);
	                    this.state = 298;
	                    this.expr(9);
	                    break;

	                case 8:
	                    localctx = new ExprContext(this, _parentctx, _parentState);
	                    this.pushNewRecursionContext(localctx, _startState, JassParser.RULE_expr);
	                    this.state = 299;
	                    if (!( this.precpred(this._ctx, 7))) {
	                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 7)");
	                    }
	                    this.state = 300;
	                    this.match(JassParser.LT_EQ);
	                    this.state = 301;
	                    this.expr(8);
	                    break;

	                case 9:
	                    localctx = new ExprContext(this, _parentctx, _parentState);
	                    this.pushNewRecursionContext(localctx, _startState, JassParser.RULE_expr);
	                    this.state = 302;
	                    if (!( this.precpred(this._ctx, 6))) {
	                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 6)");
	                    }
	                    this.state = 303;
	                    this.match(JassParser.GT);
	                    this.state = 304;
	                    this.expr(7);
	                    break;

	                case 10:
	                    localctx = new ExprContext(this, _parentctx, _parentState);
	                    this.pushNewRecursionContext(localctx, _startState, JassParser.RULE_expr);
	                    this.state = 305;
	                    if (!( this.precpred(this._ctx, 5))) {
	                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 5)");
	                    }
	                    this.state = 306;
	                    this.match(JassParser.GT_EQ);
	                    this.state = 307;
	                    this.expr(6);
	                    break;

	                case 11:
	                    localctx = new ExprContext(this, _parentctx, _parentState);
	                    this.pushNewRecursionContext(localctx, _startState, JassParser.RULE_expr);
	                    this.state = 308;
	                    if (!( this.precpred(this._ctx, 4))) {
	                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 4)");
	                    }
	                    this.state = 309;
	                    this.match(JassParser.OR);
	                    this.state = 310;
	                    this.expr(5);
	                    break;

	                case 12:
	                    localctx = new ExprContext(this, _parentctx, _parentState);
	                    this.pushNewRecursionContext(localctx, _startState, JassParser.RULE_expr);
	                    this.state = 311;
	                    if (!( this.precpred(this._ctx, 3))) {
	                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 3)");
	                    }
	                    this.state = 312;
	                    this.match(JassParser.AND);
	                    this.state = 313;
	                    this.expr(4);
	                    break;

	                } 
	            }
	            this.state = 318;
	            this._errHandler.sync(this);
	            _alt = this._interp.adaptivePredict(this._input,34,this._ctx);
	        }

	    } catch( error) {
	        if(error instanceof antlr4.error.RecognitionException) {
		        localctx.exception = error;
		        this._errHandler.reportError(this, error);
		        this._errHandler.recover(this, error);
		    } else {
		    	throw error;
		    }
	    } finally {
	        this.unrollRecursionContexts(_parentctx)
	    }
	    return localctx;
	}



	prim() {
	    let localctx = new PrimContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 58, JassParser.RULE_prim);
	    try {
	        this.state = 331;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,35,this._ctx);
	        switch(la_) {
	        case 1:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 319;
	            this.arrayAccess();
	            break;

	        case 2:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 320;
	            this.funCall();
	            break;

	        case 3:
	            this.enterOuterAlt(localctx, 3);
	            this.state = 321;
	            this.funcAsCode();
	            break;

	        case 4:
	            this.enterOuterAlt(localctx, 4);
	            this.state = 322;
	            this.match(JassParser.FALSE);
	            break;

	        case 5:
	            this.enterOuterAlt(localctx, 5);
	            this.state = 323;
	            this.match(JassParser.NULL);
	            break;

	        case 6:
	            this.enterOuterAlt(localctx, 6);
	            this.state = 324;
	            this.match(JassParser.TRUE);
	            break;

	        case 7:
	            this.enterOuterAlt(localctx, 7);
	            this.state = 325;
	            this.match(JassParser.HEXVAL);
	            break;

	        case 8:
	            this.enterOuterAlt(localctx, 8);
	            this.state = 326;
	            this.match(JassParser.REALVAL);
	            break;

	        case 9:
	            this.enterOuterAlt(localctx, 9);
	            this.state = 327;
	            this.match(JassParser.INTVAL);
	            break;

	        case 10:
	            this.enterOuterAlt(localctx, 10);
	            this.state = 328;
	            this.match(JassParser.RAWVAL);
	            break;

	        case 11:
	            this.enterOuterAlt(localctx, 11);
	            this.state = 329;
	            this.str();
	            break;

	        case 12:
	            this.enterOuterAlt(localctx, 12);
	            this.state = 330;
	            this.match(JassParser.ID);
	            break;

	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	str() {
	    let localctx = new StrContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 60, JassParser.RULE_str);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 333;
	        this.match(JassParser.STRVAL);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	arrayAccess() {
	    let localctx = new ArrayAccessContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 62, JassParser.RULE_arrayAccess);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 335;
	        this.match(JassParser.ID);
	        this.state = 336;
	        this.match(JassParser.LBRACK);
	        this.state = 338;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if((((_la) & ~0x1f) === 0 && ((1 << _la) & 167968768) !== 0) || ((((_la - 36)) & ~0x1f) === 0 && ((1 << (_la - 36)) & 16546817) !== 0)) {
	            this.state = 337;
	            this.expr(0);
	        }

	        this.state = 340;
	        this.match(JassParser.RBRACK);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	funcAsCode() {
	    let localctx = new FuncAsCodeContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 64, JassParser.RULE_funcAsCode);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 342;
	        this.match(JassParser.FUNCTION);
	        this.state = 343;
	        this.funName();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


}

JassParser.EOF = antlr4.Token.EOF;
JassParser.AND = 1;
JassParser.ARRAY = 2;
JassParser.BOOLEAN = 3;
JassParser.CODE = 4;
JassParser.CALL = 5;
JassParser.CONSTANT = 6;
JassParser.DEBUG = 7;
JassParser.ELSE = 8;
JassParser.ELSEIF = 9;
JassParser.ENDFUNCTION = 10;
JassParser.ENDIF = 11;
JassParser.ENDLOOP = 12;
JassParser.ENDGLOBALS = 13;
JassParser.EXTENDS = 14;
JassParser.EXITWHEN = 15;
JassParser.FALSE = 16;
JassParser.FUNCTION = 17;
JassParser.GLOBALS = 18;
JassParser.HANDLE = 19;
JassParser.IF = 20;
JassParser.INTEGER = 21;
JassParser.LOCAL = 22;
JassParser.LOOP = 23;
JassParser.NATIVE = 24;
JassParser.NOT = 25;
JassParser.NOTHING = 26;
JassParser.NULL = 27;
JassParser.OR = 28;
JassParser.REAL = 29;
JassParser.RETURNS = 30;
JassParser.RETURN = 31;
JassParser.SET = 32;
JassParser.STRING = 33;
JassParser.TAKES = 34;
JassParser.THEN = 35;
JassParser.TRUE = 36;
JassParser.TYPE = 37;
JassParser.COMMA = 38;
JassParser.EQ_EQ = 39;
JassParser.EQ = 40;
JassParser.NEQ = 41;
JassParser.LT_EQ = 42;
JassParser.LT = 43;
JassParser.GT_EQ = 44;
JassParser.GT = 45;
JassParser.PLUS = 46;
JassParser.MINUS = 47;
JassParser.MUL = 48;
JassParser.DIV = 49;
JassParser.LPAREN = 50;
JassParser.RPAREN = 51;
JassParser.LBRACK = 52;
JassParser.RBRACK = 53;
JassParser.ID = 54;
JassParser.INTVAL = 55;
JassParser.STRVAL = 56;
JassParser.RAWVAL = 57;
JassParser.HEXVAL = 58;
JassParser.REALVAL = 59;
JassParser.WS = 60;
JassParser.NL = 61;
JassParser.LINE_COMMENT = 62;

JassParser.RULE_root = 0;
JassParser.RULE_typeDef = 1;
JassParser.RULE_typeName = 2;
JassParser.RULE_typeNameBase = 3;
JassParser.RULE_var = 4;
JassParser.RULE_glob = 5;
JassParser.RULE_gvar = 6;
JassParser.RULE_argList = 7;
JassParser.RULE_funCall = 8;
JassParser.RULE_param = 9;
JassParser.RULE_paramList = 10;
JassParser.RULE_funTake = 11;
JassParser.RULE_funRet = 12;
JassParser.RULE_fun = 13;
JassParser.RULE_funHead = 14;
JassParser.RULE_funStmt = 15;
JassParser.RULE_funName = 16;
JassParser.RULE_nativ = 17;
JassParser.RULE_stmt = 18;
JassParser.RULE_lvarStmt = 19;
JassParser.RULE_setStmt = 20;
JassParser.RULE_callStmt = 21;
JassParser.RULE_returnStmt = 22;
JassParser.RULE_ifStmt = 23;
JassParser.RULE_elseIfStmt = 24;
JassParser.RULE_elseStmt = 25;
JassParser.RULE_loopStmt = 26;
JassParser.RULE_exitWhenStmt = 27;
JassParser.RULE_expr = 28;
JassParser.RULE_prim = 29;
JassParser.RULE_str = 30;
JassParser.RULE_arrayAccess = 31;
JassParser.RULE_funcAsCode = 32;

class RootContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = JassParser.RULE_root;
    }

	EOF() {
	    return this.getToken(JassParser.EOF, 0);
	};

	typeDef = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(TypeDefContext);
	    } else {
	        return this.getTypedRuleContext(TypeDefContext,i);
	    }
	};

	nativ = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(NativContext);
	    } else {
	        return this.getTypedRuleContext(NativContext,i);
	    }
	};

	glob = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(GlobContext);
	    } else {
	        return this.getTypedRuleContext(GlobContext,i);
	    }
	};

	fun = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(FunContext);
	    } else {
	        return this.getTypedRuleContext(FunContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.enterRoot(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.exitRoot(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof JassParserVisitor ) {
	        return visitor.visitRoot(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class TypeDefContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = JassParser.RULE_typeDef;
    }

	TYPE() {
	    return this.getToken(JassParser.TYPE, 0);
	};

	typeName() {
	    return this.getTypedRuleContext(TypeNameContext,0);
	};

	EXTENDS() {
	    return this.getToken(JassParser.EXTENDS, 0);
	};

	typeNameBase() {
	    return this.getTypedRuleContext(TypeNameBaseContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.enterTypeDef(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.exitTypeDef(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof JassParserVisitor ) {
	        return visitor.visitTypeDef(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class TypeNameContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = JassParser.RULE_typeName;
    }

	HANDLE() {
	    return this.getToken(JassParser.HANDLE, 0);
	};

	INTEGER() {
	    return this.getToken(JassParser.INTEGER, 0);
	};

	REAL() {
	    return this.getToken(JassParser.REAL, 0);
	};

	BOOLEAN() {
	    return this.getToken(JassParser.BOOLEAN, 0);
	};

	STRING() {
	    return this.getToken(JassParser.STRING, 0);
	};

	CODE() {
	    return this.getToken(JassParser.CODE, 0);
	};

	ID() {
	    return this.getToken(JassParser.ID, 0);
	};

	enterRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.enterTypeName(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.exitTypeName(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof JassParserVisitor ) {
	        return visitor.visitTypeName(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class TypeNameBaseContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = JassParser.RULE_typeNameBase;
    }

	typeName() {
	    return this.getTypedRuleContext(TypeNameContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.enterTypeNameBase(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.exitTypeNameBase(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof JassParserVisitor ) {
	        return visitor.visitTypeNameBase(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class VarContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = JassParser.RULE_var;
    }

	typeName() {
	    return this.getTypedRuleContext(TypeNameContext,0);
	};

	ID() {
	    return this.getToken(JassParser.ID, 0);
	};

	ARRAY() {
	    return this.getToken(JassParser.ARRAY, 0);
	};

	EQ() {
	    return this.getToken(JassParser.EQ, 0);
	};

	expr() {
	    return this.getTypedRuleContext(ExprContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.enterVar(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.exitVar(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof JassParserVisitor ) {
	        return visitor.visitVar(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class GlobContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = JassParser.RULE_glob;
    }

	GLOBALS() {
	    return this.getToken(JassParser.GLOBALS, 0);
	};

	ENDGLOBALS() {
	    return this.getToken(JassParser.ENDGLOBALS, 0);
	};

	gvar = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(GvarContext);
	    } else {
	        return this.getTypedRuleContext(GvarContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.enterGlob(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.exitGlob(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof JassParserVisitor ) {
	        return visitor.visitGlob(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class GvarContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = JassParser.RULE_gvar;
    }

	var_() {
	    return this.getTypedRuleContext(VarContext,0);
	};

	CONSTANT() {
	    return this.getToken(JassParser.CONSTANT, 0);
	};

	enterRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.enterGvar(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.exitGvar(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof JassParserVisitor ) {
	        return visitor.visitGvar(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ArgListContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = JassParser.RULE_argList;
    }

	expr = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ExprContext);
	    } else {
	        return this.getTypedRuleContext(ExprContext,i);
	    }
	};

	COMMA = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(JassParser.COMMA);
	    } else {
	        return this.getToken(JassParser.COMMA, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.enterArgList(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.exitArgList(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof JassParserVisitor ) {
	        return visitor.visitArgList(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class FunCallContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = JassParser.RULE_funCall;
    }

	funName() {
	    return this.getTypedRuleContext(FunNameContext,0);
	};

	LPAREN() {
	    return this.getToken(JassParser.LPAREN, 0);
	};

	RPAREN() {
	    return this.getToken(JassParser.RPAREN, 0);
	};

	argList() {
	    return this.getTypedRuleContext(ArgListContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.enterFunCall(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.exitFunCall(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof JassParserVisitor ) {
	        return visitor.visitFunCall(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ParamContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = JassParser.RULE_param;
    }

	typeName() {
	    return this.getTypedRuleContext(TypeNameContext,0);
	};

	ID() {
	    return this.getToken(JassParser.ID, 0);
	};

	enterRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.enterParam(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.exitParam(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof JassParserVisitor ) {
	        return visitor.visitParam(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ParamListContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = JassParser.RULE_paramList;
    }

	param = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ParamContext);
	    } else {
	        return this.getTypedRuleContext(ParamContext,i);
	    }
	};

	COMMA = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(JassParser.COMMA);
	    } else {
	        return this.getToken(JassParser.COMMA, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.enterParamList(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.exitParamList(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof JassParserVisitor ) {
	        return visitor.visitParamList(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class FunTakeContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = JassParser.RULE_funTake;
    }

	TAKES() {
	    return this.getToken(JassParser.TAKES, 0);
	};

	NOTHING() {
	    return this.getToken(JassParser.NOTHING, 0);
	};

	paramList() {
	    return this.getTypedRuleContext(ParamListContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.enterFunTake(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.exitFunTake(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof JassParserVisitor ) {
	        return visitor.visitFunTake(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class FunRetContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = JassParser.RULE_funRet;
    }

	RETURNS() {
	    return this.getToken(JassParser.RETURNS, 0);
	};

	NOTHING() {
	    return this.getToken(JassParser.NOTHING, 0);
	};

	typeName() {
	    return this.getTypedRuleContext(TypeNameContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.enterFunRet(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.exitFunRet(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof JassParserVisitor ) {
	        return visitor.visitFunRet(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class FunContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = JassParser.RULE_fun;
    }

	FUNCTION() {
	    return this.getToken(JassParser.FUNCTION, 0);
	};

	funHead() {
	    return this.getTypedRuleContext(FunHeadContext,0);
	};

	funStmt() {
	    return this.getTypedRuleContext(FunStmtContext,0);
	};

	ENDFUNCTION() {
	    return this.getToken(JassParser.ENDFUNCTION, 0);
	};

	CONSTANT() {
	    return this.getToken(JassParser.CONSTANT, 0);
	};

	enterRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.enterFun(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.exitFun(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof JassParserVisitor ) {
	        return visitor.visitFun(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class FunHeadContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = JassParser.RULE_funHead;
    }

	funName() {
	    return this.getTypedRuleContext(FunNameContext,0);
	};

	funTake() {
	    return this.getTypedRuleContext(FunTakeContext,0);
	};

	funRet() {
	    return this.getTypedRuleContext(FunRetContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.enterFunHead(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.exitFunHead(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof JassParserVisitor ) {
	        return visitor.visitFunHead(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class FunStmtContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = JassParser.RULE_funStmt;
    }

	stmt = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(StmtContext);
	    } else {
	        return this.getTypedRuleContext(StmtContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.enterFunStmt(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.exitFunStmt(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof JassParserVisitor ) {
	        return visitor.visitFunStmt(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class FunNameContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = JassParser.RULE_funName;
    }

	ID() {
	    return this.getToken(JassParser.ID, 0);
	};

	enterRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.enterFunName(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.exitFunName(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof JassParserVisitor ) {
	        return visitor.visitFunName(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class NativContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = JassParser.RULE_nativ;
    }

	NATIVE() {
	    return this.getToken(JassParser.NATIVE, 0);
	};

	funHead() {
	    return this.getTypedRuleContext(FunHeadContext,0);
	};

	CONSTANT() {
	    return this.getToken(JassParser.CONSTANT, 0);
	};

	enterRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.enterNativ(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.exitNativ(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof JassParserVisitor ) {
	        return visitor.visitNativ(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class StmtContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = JassParser.RULE_stmt;
    }

	setStmt() {
	    return this.getTypedRuleContext(SetStmtContext,0);
	};

	callStmt() {
	    return this.getTypedRuleContext(CallStmtContext,0);
	};

	lvarStmt() {
	    return this.getTypedRuleContext(LvarStmtContext,0);
	};

	returnStmt() {
	    return this.getTypedRuleContext(ReturnStmtContext,0);
	};

	ifStmt() {
	    return this.getTypedRuleContext(IfStmtContext,0);
	};

	loopStmt() {
	    return this.getTypedRuleContext(LoopStmtContext,0);
	};

	exitWhenStmt() {
	    return this.getTypedRuleContext(ExitWhenStmtContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.enterStmt(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.exitStmt(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof JassParserVisitor ) {
	        return visitor.visitStmt(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class LvarStmtContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = JassParser.RULE_lvarStmt;
    }

	var_() {
	    return this.getTypedRuleContext(VarContext,0);
	};

	LOCAL() {
	    return this.getToken(JassParser.LOCAL, 0);
	};

	enterRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.enterLvarStmt(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.exitLvarStmt(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof JassParserVisitor ) {
	        return visitor.visitLvarStmt(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class SetStmtContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = JassParser.RULE_setStmt;
    }

	EQ() {
	    return this.getToken(JassParser.EQ, 0);
	};

	expr() {
	    return this.getTypedRuleContext(ExprContext,0);
	};

	arrayAccess() {
	    return this.getTypedRuleContext(ArrayAccessContext,0);
	};

	ID() {
	    return this.getToken(JassParser.ID, 0);
	};

	SET() {
	    return this.getToken(JassParser.SET, 0);
	};

	enterRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.enterSetStmt(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.exitSetStmt(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof JassParserVisitor ) {
	        return visitor.visitSetStmt(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class CallStmtContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = JassParser.RULE_callStmt;
    }

	DEBUG() {
	    return this.getToken(JassParser.DEBUG, 0);
	};

	funCall() {
	    return this.getTypedRuleContext(FunCallContext,0);
	};

	CALL() {
	    return this.getToken(JassParser.CALL, 0);
	};

	enterRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.enterCallStmt(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.exitCallStmt(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof JassParserVisitor ) {
	        return visitor.visitCallStmt(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ReturnStmtContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = JassParser.RULE_returnStmt;
    }

	RETURN() {
	    return this.getToken(JassParser.RETURN, 0);
	};

	expr() {
	    return this.getTypedRuleContext(ExprContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.enterReturnStmt(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.exitReturnStmt(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof JassParserVisitor ) {
	        return visitor.visitReturnStmt(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class IfStmtContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = JassParser.RULE_ifStmt;
    }

	IF() {
	    return this.getToken(JassParser.IF, 0);
	};

	expr() {
	    return this.getTypedRuleContext(ExprContext,0);
	};

	ENDIF() {
	    return this.getToken(JassParser.ENDIF, 0);
	};

	THEN() {
	    return this.getToken(JassParser.THEN, 0);
	};

	stmt = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(StmtContext);
	    } else {
	        return this.getTypedRuleContext(StmtContext,i);
	    }
	};

	elseIfStmt = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ElseIfStmtContext);
	    } else {
	        return this.getTypedRuleContext(ElseIfStmtContext,i);
	    }
	};

	elseStmt = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ElseStmtContext);
	    } else {
	        return this.getTypedRuleContext(ElseStmtContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.enterIfStmt(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.exitIfStmt(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof JassParserVisitor ) {
	        return visitor.visitIfStmt(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ElseIfStmtContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = JassParser.RULE_elseIfStmt;
    }

	ELSEIF() {
	    return this.getToken(JassParser.ELSEIF, 0);
	};

	expr() {
	    return this.getTypedRuleContext(ExprContext,0);
	};

	THEN() {
	    return this.getToken(JassParser.THEN, 0);
	};

	stmt = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(StmtContext);
	    } else {
	        return this.getTypedRuleContext(StmtContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.enterElseIfStmt(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.exitElseIfStmt(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof JassParserVisitor ) {
	        return visitor.visitElseIfStmt(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ElseStmtContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = JassParser.RULE_elseStmt;
    }

	ELSE() {
	    return this.getToken(JassParser.ELSE, 0);
	};

	stmt = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(StmtContext);
	    } else {
	        return this.getTypedRuleContext(StmtContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.enterElseStmt(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.exitElseStmt(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof JassParserVisitor ) {
	        return visitor.visitElseStmt(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class LoopStmtContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = JassParser.RULE_loopStmt;
    }

	LOOP() {
	    return this.getToken(JassParser.LOOP, 0);
	};

	ENDLOOP() {
	    return this.getToken(JassParser.ENDLOOP, 0);
	};

	stmt = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(StmtContext);
	    } else {
	        return this.getTypedRuleContext(StmtContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.enterLoopStmt(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.exitLoopStmt(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof JassParserVisitor ) {
	        return visitor.visitLoopStmt(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ExitWhenStmtContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = JassParser.RULE_exitWhenStmt;
    }

	EXITWHEN() {
	    return this.getToken(JassParser.EXITWHEN, 0);
	};

	expr() {
	    return this.getTypedRuleContext(ExprContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.enterExitWhenStmt(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.exitExitWhenStmt(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof JassParserVisitor ) {
	        return visitor.visitExitWhenStmt(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ExprContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = JassParser.RULE_expr;
    }

	MUL() {
	    return this.getToken(JassParser.MUL, 0);
	};

	expr = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ExprContext);
	    } else {
	        return this.getTypedRuleContext(ExprContext,i);
	    }
	};

	DIV() {
	    return this.getToken(JassParser.DIV, 0);
	};

	PLUS() {
	    return this.getToken(JassParser.PLUS, 0);
	};

	MINUS() {
	    return this.getToken(JassParser.MINUS, 0);
	};

	NOT() {
	    return this.getToken(JassParser.NOT, 0);
	};

	LPAREN() {
	    return this.getToken(JassParser.LPAREN, 0);
	};

	RPAREN() {
	    return this.getToken(JassParser.RPAREN, 0);
	};

	prim() {
	    return this.getTypedRuleContext(PrimContext,0);
	};

	EQ_EQ() {
	    return this.getToken(JassParser.EQ_EQ, 0);
	};

	NEQ() {
	    return this.getToken(JassParser.NEQ, 0);
	};

	LT() {
	    return this.getToken(JassParser.LT, 0);
	};

	LT_EQ() {
	    return this.getToken(JassParser.LT_EQ, 0);
	};

	GT() {
	    return this.getToken(JassParser.GT, 0);
	};

	GT_EQ() {
	    return this.getToken(JassParser.GT_EQ, 0);
	};

	OR() {
	    return this.getToken(JassParser.OR, 0);
	};

	AND() {
	    return this.getToken(JassParser.AND, 0);
	};

	enterRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.enterExpr(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.exitExpr(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof JassParserVisitor ) {
	        return visitor.visitExpr(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class PrimContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = JassParser.RULE_prim;
    }

	arrayAccess() {
	    return this.getTypedRuleContext(ArrayAccessContext,0);
	};

	funCall() {
	    return this.getTypedRuleContext(FunCallContext,0);
	};

	funcAsCode() {
	    return this.getTypedRuleContext(FuncAsCodeContext,0);
	};

	FALSE() {
	    return this.getToken(JassParser.FALSE, 0);
	};

	NULL() {
	    return this.getToken(JassParser.NULL, 0);
	};

	TRUE() {
	    return this.getToken(JassParser.TRUE, 0);
	};

	HEXVAL() {
	    return this.getToken(JassParser.HEXVAL, 0);
	};

	REALVAL() {
	    return this.getToken(JassParser.REALVAL, 0);
	};

	INTVAL() {
	    return this.getToken(JassParser.INTVAL, 0);
	};

	RAWVAL() {
	    return this.getToken(JassParser.RAWVAL, 0);
	};

	str() {
	    return this.getTypedRuleContext(StrContext,0);
	};

	ID() {
	    return this.getToken(JassParser.ID, 0);
	};

	enterRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.enterPrim(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.exitPrim(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof JassParserVisitor ) {
	        return visitor.visitPrim(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class StrContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = JassParser.RULE_str;
    }

	STRVAL() {
	    return this.getToken(JassParser.STRVAL, 0);
	};

	enterRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.enterStr(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.exitStr(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof JassParserVisitor ) {
	        return visitor.visitStr(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ArrayAccessContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = JassParser.RULE_arrayAccess;
    }

	ID() {
	    return this.getToken(JassParser.ID, 0);
	};

	LBRACK() {
	    return this.getToken(JassParser.LBRACK, 0);
	};

	RBRACK() {
	    return this.getToken(JassParser.RBRACK, 0);
	};

	expr() {
	    return this.getTypedRuleContext(ExprContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.enterArrayAccess(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.exitArrayAccess(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof JassParserVisitor ) {
	        return visitor.visitArrayAccess(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class FuncAsCodeContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = JassParser.RULE_funcAsCode;
    }

	FUNCTION() {
	    return this.getToken(JassParser.FUNCTION, 0);
	};

	funName() {
	    return this.getTypedRuleContext(FunNameContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.enterFuncAsCode(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof JassParserListener ) {
	        listener.exitFuncAsCode(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof JassParserVisitor ) {
	        return visitor.visitFuncAsCode(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}




JassParser.RootContext = RootContext; 
JassParser.TypeDefContext = TypeDefContext; 
JassParser.TypeNameContext = TypeNameContext; 
JassParser.TypeNameBaseContext = TypeNameBaseContext; 
JassParser.VarContext = VarContext; 
JassParser.GlobContext = GlobContext; 
JassParser.GvarContext = GvarContext; 
JassParser.ArgListContext = ArgListContext; 
JassParser.FunCallContext = FunCallContext; 
JassParser.ParamContext = ParamContext; 
JassParser.ParamListContext = ParamListContext; 
JassParser.FunTakeContext = FunTakeContext; 
JassParser.FunRetContext = FunRetContext; 
JassParser.FunContext = FunContext; 
JassParser.FunHeadContext = FunHeadContext; 
JassParser.FunStmtContext = FunStmtContext; 
JassParser.FunNameContext = FunNameContext; 
JassParser.NativContext = NativContext; 
JassParser.StmtContext = StmtContext; 
JassParser.LvarStmtContext = LvarStmtContext; 
JassParser.SetStmtContext = SetStmtContext; 
JassParser.CallStmtContext = CallStmtContext; 
JassParser.ReturnStmtContext = ReturnStmtContext; 
JassParser.IfStmtContext = IfStmtContext; 
JassParser.ElseIfStmtContext = ElseIfStmtContext; 
JassParser.ElseStmtContext = ElseStmtContext; 
JassParser.LoopStmtContext = LoopStmtContext; 
JassParser.ExitWhenStmtContext = ExitWhenStmtContext; 
JassParser.ExprContext = ExprContext; 
JassParser.PrimContext = PrimContext; 
JassParser.StrContext = StrContext; 
JassParser.ArrayAccessContext = ArrayAccessContext; 
JassParser.FuncAsCodeContext = FuncAsCodeContext; 
