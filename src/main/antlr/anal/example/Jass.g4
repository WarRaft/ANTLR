// $antlr-format alignTrailingComments true, columnLimit 150, minEmptyLines 1, maxEmptyLinesToKeep 1, reflowComments false, useTab false
// $antlr-format allowShortRulesOnASingleLine false, allowShortBlocksOnASingleLine true, alignSemicolons hanging, alignColons hanging

grammar Jass;

// https://web.mit.edu/dmaze/school/6.824/antlr-2.7.0/doc/options.html

// https://github.com/antlr/grammars-v4

root: (typeDef | nativ | glob | fun)* EOF ;

// === type
typeDef : TYPE typeName EXTENDS typeNameBase ;
typeName : HANDLE|INTEGER|REAL|BOOLEAN|STRING|CODE|ID ;
typeNameBase : typeName;

// === globals
var : typeName ARRAY? ID (EQ expr)?  ;

glob : GLOBALS gvar* ENDGLOBALS  ;
gvar : CONSTANT? var  ;


// === function
argList : expr (COMMA expr)*  ;
funCall : funName LPAREN argList? RPAREN  ;

param : typeName ID ;
paramList : param (COMMA param)*  ;

funTake : TAKES (NOTHING|paramList) ;
funRet : RETURNS (NOTHING|typeName) ;
fun : CONSTANT? FUNCTION funHead funStmt ENDFUNCTION ;
funHead : funName funTake? funRet?  ;
funStmt : stmt*  ;

// https://github.com/JetBrains/Grammar-Kit/blob/master/HOWTO.md#22-using-recoverwhile-attribute

funName : ID ;

nativ : CONSTANT? NATIVE funHead  ;

// === STATEMENT
stmt :
    setStmt |
    callStmt |
    lvarStmt |
    returnStmt |
    ifStmt |
    loopStmt |
    exitWhenStmt
    ;


lvarStmt : LOCAL? var  ;

setStmt : SET? (arrayAccess|ID) EQ expr  ;

callStmt : DEBUG? ((CALL? funCall)|(CALL funCall?)) ;

returnStmt : RETURN expr?  ;

ifStmt : IF expr THEN? (stmt|elseIfStmt|elseStmt)* ENDIF  ;
elseIfStmt : ELSEIF expr THEN? stmt*  ;
elseStmt : ELSE stmt*  ;

loopStmt : LOOP stmt* ENDLOOP  ;
exitWhenStmt :EXITWHEN expr  ;

// === EXPRESSION
expr
    : expr PLUS expr
    | expr MINUS expr
    | expr MUL expr
    | expr DIV expr
    | MUL expr
    | DIV expr
    | PLUS expr
    | MINUS expr
    | NOT expr
    | expr EQ_EQ expr
    | expr NEQ expr
    | expr LT expr
    | expr LT_EQ expr
    | expr GT expr
    | expr GT_EQ expr
    | expr OR expr
    | expr AND expr
    | LPAREN expr RPAREN
    | prim
    ;


prim :
    arrayAccess |
    funCall |
    funcAsCode |
    FALSE |
    NULL |
    TRUE |
    HEXVAL |
    REALVAL |
    INTVAL |
    RAWVAL |
    str |
    ID ;

str : STRVAL ;
arrayAccess : ID LBRACK expr? RBRACK ;
funcAsCode : FUNCTION funName ;



AND : 'and';
ARRAY : 'array';
BOOLEAN : 'boolean';
CODE : 'code';
CALL : 'call';
CONSTANT : 'constant';
DEBUG : 'debug';
ELSE : 'else';
ELSEIF : 'elseif';
ENDFUNCTION : 'endfunction';
ENDIF : 'endif';
ENDLOOP : 'endloop';
ENDGLOBALS : 'endglobals';
EXTENDS : 'extends';
EXITWHEN : 'exitwhen';
FALSE : 'false';
FUNCTION : 'function';
GLOBALS : 'globals';
HANDLE : 'handle';
IF : 'if';
INTEGER : 'integer';
LOCAL : 'local';
LOOP : 'loop';
NATIVE : 'native';
NOT : 'not';
NOTHING : 'nothing';
NULL : 'null';
OR : 'or';
REAL : 'real';
RETURNS : 'returns';
RETURN : 'return';
SET : 'set';
STRING : 'string';
TAKES : 'takes';
THEN : 'then';
TRUE : 'true';
TYPE : 'type';
COMMA : ',';
EQ_EQ: '==';
EQ : '=';
NEQ : '!=';
LT_EQ : '<=';

LT : '<';
GT_EQ: '>=';
GT : '>';
PLUS : '+';
MINUS : '-';
MUL : '*';
DIV : '/';
LPAREN : '(';
RPAREN : ')';
LBRACK : '[';
RBRACK : ']';

ID : [A-Za-z_][_0-9A-Za-z]*;
INTVAL: Digit+;

STRVAL: '"'  ~('\\' | '"')* '"';

RAWVAL: '\''  ~('\'' | '\\')* '\'';

fragment Digit: [0-9];
fragment HexDigit: [0-9a-fA-F];

HEXVAL: '0' [xX] HexDigit+;

REALVAL : [0-9]+.[0-9]*|.[0-9]+;


WS: [ \t\u000C\r]+ -> channel(HIDDEN);
NL: [\n] -> channel(2);


LINE_COMMENT: '//' ~[\r\n]* -> channel(HIDDEN);
