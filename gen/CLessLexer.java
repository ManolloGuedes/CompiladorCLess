// Generated from C:/Users/Manollo Guedes/IdeaProjects/TP/src\CLessLexer.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CLessLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TYPE_INT=1, TYPE_FLOAT=2, TYPE_CHAR=3, STRUCT=4, IF=5, ELSE=6, WHILE=7, 
		VOID=8, RETURN=9, COMENT=10, ABRE_PAR=11, FECHA_PAR=12, ABRE_COLC=13, 
		FECHA_COLC=14, ABRE_CHAVE=15, FECHA_CHAVE=16, PONTO_VIRGULA=17, VIRGULA=18, 
		ATRIBUICAO=19, SOMA=20, MULT=21, WS=22, MENOR_IGUAL=23, ERRO_MENOR_IGUAL=24, 
		MAIOR_IGUAL=25, ERRO_MAIOR_IGUAL=26, MAIOR=27, MENOR=28, IGUAL=29, DIFERENTE=30, 
		ERRO_DIFERENTE=31, IDENTIFICADOR=32, ERRO_IDENTIFICADOR_NUMERO=33, ERRO_IDENTIFICADOR_CARACTERE=34, 
		ARRAY=35, ERRO_ARRAY_ABRE_COLC=36, ERRO_ARRAY_FECHA_COLC=37, INT=38, FLOAT=39, 
		ERRO_FLOAT_SEM_FRACAO=40, ERRO_FLOAT_VIRGULA=41, CHAR=42;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"TYPE_INT", "TYPE_FLOAT", "TYPE_CHAR", "STRUCT", "IF", "ELSE", "WHILE", 
		"VOID", "RETURN", "INICIA_COMENT", "TERMINA_COMENT", "COMENT", "ABRE_PAR", 
		"FECHA_PAR", "ABRE_COLC", "FECHA_COLC", "ABRE_CHAVE", "FECHA_CHAVE", "PONTO_VIRGULA", 
		"VIRGULA", "ATRIBUICAO", "SOMA", "MULT", "WS", "MENOR_IGUAL", "ERRO_MENOR_IGUAL", 
		"MAIOR_IGUAL", "ERRO_MAIOR_IGUAL", "MAIOR", "MENOR", "IGUAL", "DIFERENTE", 
		"ERRO_DIFERENTE", "IDENTIFICADOR", "ERRO_IDENTIFICADOR_NUMERO", "ERRO_IDENTIFICADOR_CARACTERE", 
		"ARRAY", "ERRO_ARRAY_ABRE_COLC", "ERRO_ARRAY_FECHA_COLC", "INT", "FLOAT", 
		"ERRO_FLOAT_SEM_FRACAO", "ERRO_FLOAT_VIRGULA", "CHAR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'int'", "'float'", "'char'", "'struct'", "'if'", "'else'", "'while'", 
		"'void'", "'return'", null, "'('", "')'", "'['", "']'", "'{'", "'}'", 
		"';'", "','", "'='", null, null, null, "'<='", "'=<'", "'>='", "'=>'", 
		"'>'", "'<'", "'=='", "'!='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TYPE_INT", "TYPE_FLOAT", "TYPE_CHAR", "STRUCT", "IF", "ELSE", "WHILE", 
		"VOID", "RETURN", "COMENT", "ABRE_PAR", "FECHA_PAR", "ABRE_COLC", "FECHA_COLC", 
		"ABRE_CHAVE", "FECHA_CHAVE", "PONTO_VIRGULA", "VIRGULA", "ATRIBUICAO", 
		"SOMA", "MULT", "WS", "MENOR_IGUAL", "ERRO_MENOR_IGUAL", "MAIOR_IGUAL", 
		"ERRO_MAIOR_IGUAL", "MAIOR", "MENOR", "IGUAL", "DIFERENTE", "ERRO_DIFERENTE", 
		"IDENTIFICADOR", "ERRO_IDENTIFICADOR_NUMERO", "ERRO_IDENTIFICADOR_CARACTERE", 
		"ARRAY", "ERRO_ARRAY_ABRE_COLC", "ERRO_ARRAY_FECHA_COLC", "INT", "FLOAT", 
		"ERRO_FLOAT_SEM_FRACAO", "ERRO_FLOAT_VIRGULA", "CHAR"
	};
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


	public CLessLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CLessLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2,\u0157\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\r\3\r\7\r\u0094\n\r\f\r\16\r\u0097\13\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\6\31\u00b4\n\31"+
		"\r\31\16\31\u00b5\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3"+
		"\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\5\"\u00d6\n\"\3#\3#\7#\u00da\n#\f#\16#\u00dd\13#\3$\3$\3$\3"+
		"%\7%\u00e3\n%\f%\16%\u00e6\13%\3%\6%\u00e9\n%\r%\16%\u00ea\3%\7%\u00ee"+
		"\n%\f%\16%\u00f1\13%\6%\u00f3\n%\r%\16%\u00f4\3&\3&\3&\3&\7&\u00fb\n&"+
		"\f&\16&\u00fe\13&\5&\u0100\n&\3&\3&\3&\3&\3&\3&\5&\u0108\n&\3\'\3\'\3"+
		"\'\7\'\u010d\n\'\f\'\16\'\u0110\13\'\5\'\u0112\n\'\3\'\3\'\3\'\3\'\3\'"+
		"\5\'\u0119\n\'\3(\3(\3(\3(\7(\u011f\n(\f(\16(\u0122\13(\5(\u0124\n(\3"+
		"(\3(\3(\5(\u0129\n(\3)\3)\6)\u012d\n)\r)\16)\u012e\3)\6)\u0132\n)\r)\16"+
		")\u0133\5)\u0136\n)\3*\7*\u0139\n*\f*\16*\u013c\13*\3*\3*\6*\u0140\n*"+
		"\r*\16*\u0141\3+\7+\u0145\n+\f+\16+\u0148\13+\3+\3+\3,\7,\u014d\n,\f,"+
		"\16,\u0150\13,\3,\3,\3-\3-\3-\3-\3\u0095\2.\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\2\27\2\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25"+
		"-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36?\37A C!E\"G#I$K%M&O\'Q(S"+
		")U*W+Y,\3\2\n\4\2--//\4\2,,\61\61\5\2\13\f\17\17\"\"\5\2C\\aac|\6\2\62"+
		";C\\aac|\3\2\62;\f\2\13\f\17\17\"$)/\61;=@C]__aac|\4\2\13\f\17\17\u016d"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\3[\3\2\2\2\5_\3\2\2\2\7e\3\2\2\2\tj\3\2\2\2\13q\3\2\2\2\rt\3\2"+
		"\2\2\17y\3\2\2\2\21\177\3\2\2\2\23\u0084\3\2\2\2\25\u008b\3\2\2\2\27\u008e"+
		"\3\2\2\2\31\u0091\3\2\2\2\33\u009c\3\2\2\2\35\u009e\3\2\2\2\37\u00a0\3"+
		"\2\2\2!\u00a2\3\2\2\2#\u00a4\3\2\2\2%\u00a6\3\2\2\2\'\u00a8\3\2\2\2)\u00aa"+
		"\3\2\2\2+\u00ac\3\2\2\2-\u00ae\3\2\2\2/\u00b0\3\2\2\2\61\u00b3\3\2\2\2"+
		"\63\u00b9\3\2\2\2\65\u00bc\3\2\2\2\67\u00bf\3\2\2\29\u00c2\3\2\2\2;\u00c5"+
		"\3\2\2\2=\u00c7\3\2\2\2?\u00c9\3\2\2\2A\u00cc\3\2\2\2C\u00d5\3\2\2\2E"+
		"\u00d7\3\2\2\2G\u00de\3\2\2\2I\u00f2\3\2\2\2K\u0107\3\2\2\2M\u0118\3\2"+
		"\2\2O\u0128\3\2\2\2Q\u0135\3\2\2\2S\u013a\3\2\2\2U\u0146\3\2\2\2W\u014e"+
		"\3\2\2\2Y\u0153\3\2\2\2[\\\7k\2\2\\]\7p\2\2]^\7v\2\2^\4\3\2\2\2_`\7h\2"+
		"\2`a\7n\2\2ab\7q\2\2bc\7c\2\2cd\7v\2\2d\6\3\2\2\2ef\7e\2\2fg\7j\2\2gh"+
		"\7c\2\2hi\7t\2\2i\b\3\2\2\2jk\7u\2\2kl\7v\2\2lm\7t\2\2mn\7w\2\2no\7e\2"+
		"\2op\7v\2\2p\n\3\2\2\2qr\7k\2\2rs\7h\2\2s\f\3\2\2\2tu\7g\2\2uv\7n\2\2"+
		"vw\7u\2\2wx\7g\2\2x\16\3\2\2\2yz\7y\2\2z{\7j\2\2{|\7k\2\2|}\7n\2\2}~\7"+
		"g\2\2~\20\3\2\2\2\177\u0080\7x\2\2\u0080\u0081\7q\2\2\u0081\u0082\7k\2"+
		"\2\u0082\u0083\7f\2\2\u0083\22\3\2\2\2\u0084\u0085\7t\2\2\u0085\u0086"+
		"\7g\2\2\u0086\u0087\7v\2\2\u0087\u0088\7w\2\2\u0088\u0089\7t\2\2\u0089"+
		"\u008a\7p\2\2\u008a\24\3\2\2\2\u008b\u008c\7\61\2\2\u008c\u008d\7,\2\2"+
		"\u008d\26\3\2\2\2\u008e\u008f\7,\2\2\u008f\u0090\7\61\2\2\u0090\30\3\2"+
		"\2\2\u0091\u0095\5\25\13\2\u0092\u0094\13\2\2\2\u0093\u0092\3\2\2\2\u0094"+
		"\u0097\3\2\2\2\u0095\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0098\3\2"+
		"\2\2\u0097\u0095\3\2\2\2\u0098\u0099\5\27\f\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009b\b\r\2\2\u009b\32\3\2\2\2\u009c\u009d\7*\2\2\u009d\34\3\2\2\2\u009e"+
		"\u009f\7+\2\2\u009f\36\3\2\2\2\u00a0\u00a1\7]\2\2\u00a1 \3\2\2\2\u00a2"+
		"\u00a3\7_\2\2\u00a3\"\3\2\2\2\u00a4\u00a5\7}\2\2\u00a5$\3\2\2\2\u00a6"+
		"\u00a7\7\177\2\2\u00a7&\3\2\2\2\u00a8\u00a9\7=\2\2\u00a9(\3\2\2\2\u00aa"+
		"\u00ab\7.\2\2\u00ab*\3\2\2\2\u00ac\u00ad\7?\2\2\u00ad,\3\2\2\2\u00ae\u00af"+
		"\t\2\2\2\u00af.\3\2\2\2\u00b0\u00b1\t\3\2\2\u00b1\60\3\2\2\2\u00b2\u00b4"+
		"\t\4\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\b\31\2\2\u00b8\62\3\2\2"+
		"\2\u00b9\u00ba\7>\2\2\u00ba\u00bb\7?\2\2\u00bb\64\3\2\2\2\u00bc\u00bd"+
		"\7?\2\2\u00bd\u00be\7>\2\2\u00be\66\3\2\2\2\u00bf\u00c0\7@\2\2\u00c0\u00c1"+
		"\7?\2\2\u00c18\3\2\2\2\u00c2\u00c3\7?\2\2\u00c3\u00c4\7@\2\2\u00c4:\3"+
		"\2\2\2\u00c5\u00c6\7@\2\2\u00c6<\3\2\2\2\u00c7\u00c8\7>\2\2\u00c8>\3\2"+
		"\2\2\u00c9\u00ca\7?\2\2\u00ca\u00cb\7?\2\2\u00cb@\3\2\2\2\u00cc\u00cd"+
		"\7#\2\2\u00cd\u00ce\7?\2\2\u00ceB\3\2\2\2\u00cf\u00d0\7?\2\2\u00d0\u00d6"+
		"\7#\2\2\u00d1\u00d2\7>\2\2\u00d2\u00d6\7@\2\2\u00d3\u00d4\7@\2\2\u00d4"+
		"\u00d6\7>\2\2\u00d5\u00cf\3\2\2\2\u00d5\u00d1\3\2\2\2\u00d5\u00d3\3\2"+
		"\2\2\u00d6D\3\2\2\2\u00d7\u00db\t\5\2\2\u00d8\u00da\t\6\2\2\u00d9\u00d8"+
		"\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"F\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df\t\7\2\2\u00df\u00e0\5E#\2\u00e0"+
		"H\3\2\2\2\u00e1\u00e3\5E#\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2"+
		"\2\2\u00e7\u00e9\n\b\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ef\3\2\2\2\u00ec\u00ee\5E"+
		"#\2\u00ed\u00ec\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00e4\3\2"+
		"\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"J\3\2\2\2\u00f6\u00f7\5E#\2\u00f7\u00ff\5\37\20\2\u00f8\u0100\5E#\2\u00f9"+
		"\u00fb\t\7\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2"+
		"\2\2\u00fc\u00fd\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff"+
		"\u00f8\3\2\2\2\u00ff\u00fc\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\5!"+
		"\21\2\u0102\u0108\3\2\2\2\u0103\u0104\5E#\2\u0104\u0105\5\37\20\2\u0105"+
		"\u0106\5!\21\2\u0106\u0108\3\2\2\2\u0107\u00f6\3\2\2\2\u0107\u0103\3\2"+
		"\2\2\u0108L\3\2\2\2\u0109\u0111\5E#\2\u010a\u0112\5E#\2\u010b\u010d\t"+
		"\7\2\2\u010c\u010b\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u010a\3\2"+
		"\2\2\u0111\u010e\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\5!\21\2\u0114"+
		"\u0119\3\2\2\2\u0115\u0116\5E#\2\u0116\u0117\5!\21\2\u0117\u0119\3\2\2"+
		"\2\u0118\u0109\3\2\2\2\u0118\u0115\3\2\2\2\u0119N\3\2\2\2\u011a\u011b"+
		"\5E#\2\u011b\u0123\5\37\20\2\u011c\u0124\5E#\2\u011d\u011f\t\7\2\2\u011e"+
		"\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2"+
		"\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u011c\3\2\2\2\u0123"+
		"\u0120\3\2\2\2\u0124\u0129\3\2\2\2\u0125\u0126\5E#\2\u0126\u0127\5\37"+
		"\20\2\u0127\u0129\3\2\2\2\u0128\u011a\3\2\2\2\u0128\u0125\3\2\2\2\u0129"+
		"P\3\2\2\2\u012a\u012c\t\2\2\2\u012b\u012d\t\7\2\2\u012c\u012b\3\2\2\2"+
		"\u012d\u012e\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0136"+
		"\3\2\2\2\u0130\u0132\t\7\2\2\u0131\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\3\2\2\2\u0135\u012a\3\2"+
		"\2\2\u0135\u0131\3\2\2\2\u0136R\3\2\2\2\u0137\u0139\5Q)\2\u0138\u0137"+
		"\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u013d\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u013f\7\60\2\2\u013e\u0140\t"+
		"\7\2\2\u013f\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u013f\3\2\2\2\u0141"+
		"\u0142\3\2\2\2\u0142T\3\2\2\2\u0143\u0145\5Q)\2\u0144\u0143\3\2\2\2\u0145"+
		"\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0149\3\2"+
		"\2\2\u0148\u0146\3\2\2\2\u0149\u014a\7\60\2\2\u014aV\3\2\2\2\u014b\u014d"+
		"\5Q)\2\u014c\u014b\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014f\u0151\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0152\5)"+
		"\25\2\u0152X\3\2\2\2\u0153\u0154\7)\2\2\u0154\u0155\n\t\2\2\u0155\u0156"+
		"\7)\2\2\u0156Z\3\2\2\2\33\2\u0095\u00b5\u00d5\u00db\u00e4\u00ea\u00ef"+
		"\u00f4\u00fc\u00ff\u0107\u010e\u0111\u0118\u0120\u0123\u0128\u012e\u0133"+
		"\u0135\u013a\u0141\u0146\u014e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}