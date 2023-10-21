grammar MyGrammar;

expr:   expr MUL expr # MulOp
    |   expr op=(ADD | SUB) expr # AddOp
    |   expr op=(XOR | OR) expr # OrOp
    |   SUB expr # Unary
    |   literal # inLiteral
    |   '(' expr ')' # inPar;

literal: INT # Int
    | complex # complexNumber;

complex: INT 'i';

MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';
XOR: '^';
OR: '|';
EQUAL: '==';
UNEQUAL: '!=';

INT : DIGIT+;

fragment
DIGIT:  '0'..'9';
WS  : [ \t\n\r]+ -> skip;
