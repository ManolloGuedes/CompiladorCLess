lexer grammar CLessLexer;

TYPE_INT:    'int';
TYPE_FLOAT:  'float';
TYPE_CHAR:   'char';
STRUCT: 'struct';
IF:     'if';
ELSE:   'else';
WHILE:  'while';
VOID:   'void';
RETURN: 'return';

fragment INICIA_COMENT:  '/*';
fragment TERMINA_COMENT: '*/';
COMENT: INICIA_COMENT(.)*?TERMINA_COMENT -> skip;

ABRE_PAR:       '(';
FECHA_PAR:      ')';
ABRE_COLC:      '[';
FECHA_COLC:     ']';
ABRE_CHAVE:     '{';
FECHA_CHAVE:    '}';
PONTO_VIRGULA:  ';';
VIRGULA:        ',';

ATRIBUICAO: '=';
SOMA:       '+' |
            '-';
MULT:       '*' |
            '/';

WS: [ \r\t\n]+ -> skip;

MENOR_IGUAL:        '<=';
ERRO_MENOR_IGUAL:   '=<';
MAIOR_IGUAL:        '>=';
ERRO_MAIOR_IGUAL:   '=>';
MAIOR:              '>';
MENOR:              '<';
IGUAL:              '==';
DIFERENTE:          '!=';
ERRO_DIFERENTE:     '=!'|
                    '<>'|
                    '><';


IDENTIFICADOR:      [_a-zA-Z][_a-zA-Z0-9]*;
ERRO_IDENTIFICADOR_NUMERO: [0-9]IDENTIFICADOR;
ERRO_IDENTIFICADOR_CARACTERE: ((IDENTIFICADOR*)(~([_a-zA-Z0-9]|[ \n\t\r]|';'|'('|')'|','|'['|']'|'*'|'/'|'+'|'-'|'='|
                                '>'|'<'|'!'|'\''|'"')+)(IDENTIFICADOR*))+;

ARRAY:  ((IDENTIFICADOR ABRE_COLC (IDENTIFICADOR | [0-9]*) FECHA_COLC) |
        (IDENTIFICADOR ABRE_COLC FECHA_COLC));
ERRO_ARRAY_ABRE_COLC:   IDENTIFICADOR (IDENTIFICADOR | [0-9]*) FECHA_COLC |
                        IDENTIFICADOR FECHA_COLC;
ERRO_ARRAY_FECHA_COLC:  IDENTIFICADOR ABRE_COLC (IDENTIFICADOR | [0-9]*) |
                        IDENTIFICADOR ABRE_COLC;

INT:    ( ( ('+'|'-')[0-9]+ ) | ( [0-9]+ ) );
FLOAT:  INT*'.'[0-9]+;
ERRO_FLOAT_SEM_FRACAO:  INT*'.';
ERRO_FLOAT_VIRGULA:    INT*VIRGULA;
CHAR:   '\''~('\t' | '\r'|'\n')'\''; //problema