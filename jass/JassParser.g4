// $antlr-format alignTrailingComments true, columnLimit 150, minEmptyLines 1, maxEmptyLinesToKeep 1, reflowComments false, useTab false
// $antlr-format allowShortRulesOnASingleLine false, allowShortBlocksOnASingleLine true, alignSemicolons hanging, alignColons hanging

parser grammar JassParser;

// https://web.mit.edu/dmaze/school/6.824/antlr-2.7.0/doc/options.html
options {
    tokenVocab = JassLexer;
    language = JavaScript;
}

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
