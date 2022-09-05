grammar Quine;

//=========== Lexeme patterns and tokens. ==============

/* Miscellaneous and skippable lexemes. */
WHITESPACE              : [ \r\n\t]+                               -> channel(HIDDEN) ;
COMMENT                 : '//' (~ [\r\n])* NEWLINE                 -> skip ; // Match any text that has // preceding.
fragment DIGIT          : [0-9]                                            ;
fragment LOWER_CASE_LTR : [a-z]                                            ;
fragment UPPER_CASE_LTR : [A-Z]                                            ;
fragment ANY_CASE_LTR   : [a-zA-Z]                                         ;
fragment UNDERSCORE     : '_'                                              ;
fragment SINGLE_QUOTE   : '\''                                             ;
fragment DOUBLE_QUOTE   : '"'                                              ;
fragment ANYCHAR        : .                                                ;
fragment NEWLINE        : '\n'                                             ;
fragment CARRIAGE_RET   : '\r'                                             ;
fragment TAB            : '\t'                                             ;
fragment NULL_CHAR      : '\\0'                                            ;
fragment ESCAPED_CHAR   : ('\\' .)                                         ;

/* Word literals for logic (if they want to type it out). */
fragment AND_LIT: 'AND';
fragment OR_LIT: 'OR';
fragment IMP_LIT: 'IMPLIES';
fragment BICOND_LIT: 'IFF';
fragment NEG_LIT: 'NOT';
fragment XOR_LIT: 'XOR';

/* Other symbols. */
OPEN_PAREN : '(';
CLOSE_PAREN: ')';

/* Binary and unary operators for propositional logic. */
AND     : '&' | '∧' | '^' | '·' | AND_LIT;
OR      : '|' | '∨' | '+' | '||' | OR_LIT;
IMP     : '->' | '→' | '⇒' | '⊃' | '>' | IMP_LIT;
BICOND  : '<->' | '⇔' | '≡' | '↔' | '<>' | BICOND_LIT ;
NEG     : '˜' | '\u007e' | '\uff5e' | '\u223c' | '¬' | '!' | '-' | NEG_LIT ;
XOR     : '⊕' | '⊻' | '≢' | '⩒' | '↮' | XOR_LIT ;

/* Atoms. */
ATOM: UPPER_CASE_LTR | LOWER_CASE_LTR;

//=========== Parser rules. ==============

program: (propositionalWff EOF);

/* Propositional Logic Rules. */
atom: ATOM;

/* Starting rule. */
propositionalWff: propWff | propOuterWff;

propWff: atom
    | propNegRule
    | propAndRule
    | propOrRule
    | propImpRule
    | propBicondRule
    | propExclusiveOrRule;

propOuterWff: atom
	| propOuterAndRule
	| propOuterOrRule
	| propOuterImpRule
	| propOuterBicondRule
	| propOuterExclusiveOrRule;

propNegRule: NEG propWff;
propAndRule: OPEN_PAREN propWff AND propWff CLOSE_PAREN;
propOrRule : OPEN_PAREN propWff OR propWff CLOSE_PAREN;
propImpRule: OPEN_PAREN propWff IMP propWff CLOSE_PAREN;
propBicondRule: OPEN_PAREN propWff BICOND propWff CLOSE_PAREN;
propExclusiveOrRule: OPEN_PAREN propWff XOR propWff CLOSE_PAREN;

propOuterAndRule: propWff AND propWff;
propOuterOrRule: propWff OR propWff;
propOuterImpRule: propWff IMP propWff;
propOuterBicondRule: propWff BICOND propWff;
propOuterExclusiveOrRule: propWff XOR propWff;
