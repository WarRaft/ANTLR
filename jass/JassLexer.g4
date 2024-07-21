// $antlr-format alignTrailingComments true, columnLimit 150, maxEmptyLinesToKeep 1, reflowComments false, useTab false
// $antlr-format allowShortRulesOnASingleLine true, allowShortBlocksOnASingleLine true, minEmptyLines 0, alignSemicolons ownLine
// $antlr-format alignColons trailing, singleLineOverrulesHangingColon true, alignLexerCommands true, alignLabels true, alignTrailers true

lexer grammar JassLexer;

options {
    language = JavaScript;
}

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
