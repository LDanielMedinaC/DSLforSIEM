// Generated from Hello.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, MORE_THAN=7, IP=8, ACCOUNT=9, 
		DENY_WORDS=10, TIME=11, ID=12, WS=13, INT=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "MORE_THAN", "IP", "ACCOUNT", 
			"DENY_WORDS", "TIME", "ID", "WS", "INT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'requests in less than'", "'with the IP address'", "'failed login'", 
			"'with the same'", "'firewall'", "'in less than'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "MORE_THAN", "IP", "ACCOUNT", 
			"DENY_WORDS", "TIME", "ID", "WS", "INT"
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


	public HelloLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20\u00d2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u00b0\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\5\f\u00c0\n\f\3\r\6\r\u00c3\n\r\r\r\16\r\u00c4\3\16\6\16\u00c8"+
		"\n\16\r\16\16\16\u00c9\3\16\3\16\3\17\6\17\u00cf\n\17\r\17\16\17\u00d0"+
		"\2\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\3\2\5\3\2C|\5\2\13\f\17\17\"\"\3\2\62;\2\u00d7\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5\65\3\2\2\2\7I\3\2\2\2\tV\3\2\2\2"+
		"\13d\3\2\2\2\rm\3\2\2\2\17z\3\2\2\2\21\u0093\3\2\2\2\23\u009b\3\2\2\2"+
		"\25\u00af\3\2\2\2\27\u00bf\3\2\2\2\31\u00c2\3\2\2\2\33\u00c7\3\2\2\2\35"+
		"\u00ce\3\2\2\2\37 \7t\2\2 !\7g\2\2!\"\7s\2\2\"#\7w\2\2#$\7g\2\2$%\7u\2"+
		"\2%&\7v\2\2&\'\7u\2\2\'(\7\"\2\2()\7k\2\2)*\7p\2\2*+\7\"\2\2+,\7n\2\2"+
		",-\7g\2\2-.\7u\2\2./\7u\2\2/\60\7\"\2\2\60\61\7v\2\2\61\62\7j\2\2\62\63"+
		"\7c\2\2\63\64\7p\2\2\64\4\3\2\2\2\65\66\7y\2\2\66\67\7k\2\2\678\7v\2\2"+
		"89\7j\2\29:\7\"\2\2:;\7v\2\2;<\7j\2\2<=\7g\2\2=>\7\"\2\2>?\7K\2\2?@\7"+
		"R\2\2@A\7\"\2\2AB\7c\2\2BC\7f\2\2CD\7f\2\2DE\7t\2\2EF\7g\2\2FG\7u\2\2"+
		"GH\7u\2\2H\6\3\2\2\2IJ\7h\2\2JK\7c\2\2KL\7k\2\2LM\7n\2\2MN\7g\2\2NO\7"+
		"f\2\2OP\7\"\2\2PQ\7n\2\2QR\7q\2\2RS\7i\2\2ST\7k\2\2TU\7p\2\2U\b\3\2\2"+
		"\2VW\7y\2\2WX\7k\2\2XY\7v\2\2YZ\7j\2\2Z[\7\"\2\2[\\\7v\2\2\\]\7j\2\2]"+
		"^\7g\2\2^_\7\"\2\2_`\7u\2\2`a\7c\2\2ab\7o\2\2bc\7g\2\2c\n\3\2\2\2de\7"+
		"h\2\2ef\7k\2\2fg\7t\2\2gh\7g\2\2hi\7y\2\2ij\7c\2\2jk\7n\2\2kl\7n\2\2l"+
		"\f\3\2\2\2mn\7k\2\2no\7p\2\2op\7\"\2\2pq\7n\2\2qr\7g\2\2rs\7u\2\2st\7"+
		"u\2\2tu\7\"\2\2uv\7v\2\2vw\7j\2\2wx\7c\2\2xy\7p\2\2y\16\3\2\2\2z{\7k\2"+
		"\2{|\7h\2\2|}\3\2\2\2}~\7v\2\2~\177\7j\2\2\177\u0080\7g\2\2\u0080\u0081"+
		"\7t\2\2\u0081\u0082\7g\2\2\u0082\u0083\3\2\2\2\u0083\u0084\7c\2\2\u0084"+
		"\u0085\7t\2\2\u0085\u0086\7g\2\2\u0086\u0087\3\2\2\2\u0087\u0088\7o\2"+
		"\2\u0088\u0089\7q\2\2\u0089\u008a\7t\2\2\u008a\u008b\7g\2\2\u008b\u008c"+
		"\3\2\2\2\u008c\u008d\7v\2\2\u008d\u008e\7j\2\2\u008e\u008f\7c\2\2\u008f"+
		"\u0090\7p\2\2\u0090\u0091\3\2\2\2\u0091\u0092\5\35\17\2\u0092\20\3\2\2"+
		"\2\u0093\u0094\5\35\17\2\u0094\u0095\7\60\2\2\u0095\u0096\5\35\17\2\u0096"+
		"\u0097\7\60\2\2\u0097\u0098\5\35\17\2\u0098\u0099\7\60\2\2\u0099\u009a"+
		"\5\35\17\2\u009a\22\3\2\2\2\u009b\u009c\5\31\r\2\u009c\u009d\7B\2\2\u009d"+
		"\u009e\5\31\r\2\u009e\u009f\7\60\2\2\u009f\u00a0\5\31\r\2\u00a0\24\3\2"+
		"\2\2\u00a1\u00a2\7f\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4\7q\2\2\u00a4\u00b0"+
		"\7r\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7l\2\2\u00a8"+
		"\u00a9\7g\2\2\u00a9\u00aa\7e\2\2\u00aa\u00b0\7v\2\2\u00ab\u00ac\7f\2\2"+
		"\u00ac\u00ad\7g\2\2\u00ad\u00ae\7p\2\2\u00ae\u00b0\7{\2\2\u00af\u00a1"+
		"\3\2\2\2\u00af\u00a5\3\2\2\2\u00af\u00ab\3\2\2\2\u00b0\26\3\2\2\2\u00b1"+
		"\u00b2\7u\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7e\2\2\u00b4\u00b5\7q\2\2"+
		"\u00b5\u00b6\7p\2\2\u00b6\u00b7\7f\2\2\u00b7\u00c0\7u\2\2\u00b8\u00b9"+
		"\7o\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7p\2\2\u00bb\u00bc\7w\2\2\u00bc"+
		"\u00bd\7v\2\2\u00bd\u00be\7g\2\2\u00be\u00c0\7u\2\2\u00bf\u00b1\3\2\2"+
		"\2\u00bf\u00b8\3\2\2\2\u00c0\30\3\2\2\2\u00c1\u00c3\t\2\2\2\u00c2\u00c1"+
		"\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\32\3\2\2\2\u00c6\u00c8\t\3\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9\3\2\2"+
		"\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc"+
		"\b\16\2\2\u00cc\34\3\2\2\2\u00cd\u00cf\t\4\2\2\u00ce\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\36\3\2\2"+
		"\2\b\2\u00af\u00bf\u00c4\u00c9\u00d0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}