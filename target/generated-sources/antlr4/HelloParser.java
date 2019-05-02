// Generated from Hello.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, MORE_THAN=7, IP=8, ACCOUNT=9, 
		DENY_WORDS=10, TIME=11, ID=12, WS=13, INT=14;
	public static final int
		RULE_r = 0, RULE_check = 1, RULE_dos = 2, RULE_attack_login = 3, RULE_firewall_attack = 4, 
		RULE_limit = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"r", "check", "dos", "attack_login", "firewall_attack", "limit"
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

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HelloParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RContext extends ParserRuleContext {
		public TerminalNode MORE_THAN() { return getToken(HelloParser.MORE_THAN, 0); }
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitR(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(MORE_THAN);
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

	public static class CheckContext extends ParserRuleContext {
		public DosContext dos() {
			return getRuleContext(DosContext.class,0);
		}
		public CheckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_check; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterCheck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitCheck(this);
		}
	}

	public final CheckContext check() throws RecognitionException {
		CheckContext _localctx = new CheckContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_check);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			dos();
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

	public static class DosContext extends ParserRuleContext {
		public TerminalNode MORE_THAN() { return getToken(HelloParser.MORE_THAN, 0); }
		public LimitContext limit() {
			return getRuleContext(LimitContext.class,0);
		}
		public TerminalNode IP() { return getToken(HelloParser.IP, 0); }
		public DosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterDos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitDos(this);
		}
	}

	public final DosContext dos() throws RecognitionException {
		DosContext _localctx = new DosContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(MORE_THAN);
			setState(17);
			match(T__0);
			setState(18);
			limit();
			setState(19);
			match(T__1);
			setState(20);
			match(IP);
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

	public static class Attack_loginContext extends ParserRuleContext {
		public TerminalNode MORE_THAN() { return getToken(HelloParser.MORE_THAN, 0); }
		public LimitContext limit() {
			return getRuleContext(LimitContext.class,0);
		}
		public TerminalNode ACCOUNT() { return getToken(HelloParser.ACCOUNT, 0); }
		public Attack_loginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attack_login; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterAttack_login(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitAttack_login(this);
		}
	}

	public final Attack_loginContext attack_login() throws RecognitionException {
		Attack_loginContext _localctx = new Attack_loginContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_attack_login);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(MORE_THAN);
			setState(23);
			match(T__2);
			setState(24);
			limit();
			setState(25);
			match(T__3);
			setState(26);
			match(ACCOUNT);
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

	public static class Firewall_attackContext extends ParserRuleContext {
		public TerminalNode MORE_THAN() { return getToken(HelloParser.MORE_THAN, 0); }
		public TerminalNode DENY_WORDS() { return getToken(HelloParser.DENY_WORDS, 0); }
		public LimitContext limit() {
			return getRuleContext(LimitContext.class,0);
		}
		public Firewall_attackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_firewall_attack; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterFirewall_attack(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitFirewall_attack(this);
		}
	}

	public final Firewall_attackContext firewall_attack() throws RecognitionException {
		Firewall_attackContext _localctx = new Firewall_attackContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_firewall_attack);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(MORE_THAN);
			setState(29);
			match(T__4);
			setState(30);
			match(DENY_WORDS);
			setState(31);
			match(T__5);
			setState(32);
			limit();
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

	public static class LimitContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(HelloParser.INT, 0); }
		public TerminalNode TIME() { return getToken(HelloParser.TIME, 0); }
		public LimitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterLimit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitLimit(this);
		}
	}

	public final LimitContext limit() throws RecognitionException {
		LimitContext _localctx = new LimitContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_limit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(INT);
			setState(35);
			match(TIME);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20(\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\2"+
		"\2\b\2\4\6\b\n\f\2\2\2!\2\16\3\2\2\2\4\20\3\2\2\2\6\22\3\2\2\2\b\30\3"+
		"\2\2\2\n\36\3\2\2\2\f$\3\2\2\2\16\17\7\t\2\2\17\3\3\2\2\2\20\21\5\6\4"+
		"\2\21\5\3\2\2\2\22\23\7\t\2\2\23\24\7\3\2\2\24\25\5\f\7\2\25\26\7\4\2"+
		"\2\26\27\7\n\2\2\27\7\3\2\2\2\30\31\7\t\2\2\31\32\7\5\2\2\32\33\5\f\7"+
		"\2\33\34\7\6\2\2\34\35\7\13\2\2\35\t\3\2\2\2\36\37\7\t\2\2\37 \7\7\2\2"+
		" !\7\f\2\2!\"\7\b\2\2\"#\5\f\7\2#\13\3\2\2\2$%\7\20\2\2%&\7\r\2\2&\r\3"+
		"\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}