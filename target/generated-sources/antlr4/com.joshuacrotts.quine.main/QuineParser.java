// Generated from com.joshuacrotts.quine.main/Quine.g4 by ANTLR 4.10.1
package com.joshuacrotts.quine.main;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QuineParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITESPACE=1, COMMENT=2, OPEN_PAREN=3, CLOSE_PAREN=4, AND=5, OR=6, IMP=7, 
		BICOND=8, NEG=9, XOR=10, IDENTITY=11, ATOM=12;
	public static final int
		RULE_program = 0, RULE_atom = 1, RULE_propositionalWff = 2, RULE_propWff = 3, 
		RULE_propNegRule = 4, RULE_propAndRule = 5, RULE_propOrRule = 6, RULE_propImpRule = 7, 
		RULE_propBicondRule = 8, RULE_propExclusiveOrRule = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "atom", "propositionalWff", "propWff", "propNegRule", "propAndRule", 
			"propOrRule", "propImpRule", "propBicondRule", "propExclusiveOrRule"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WHITESPACE", "COMMENT", "OPEN_PAREN", "CLOSE_PAREN", "AND", "OR", 
			"IMP", "BICOND", "NEG", "XOR", "IDENTITY", "ATOM"
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
	public String getGrammarFileName() { return "Quine.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public QuineParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public PropositionalWffContext propositionalWff() {
			return getRuleContext(PropositionalWffContext.class,0);
		}
		public TerminalNode EOF() { return getToken(QuineParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuineListener ) ((QuineListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuineListener ) ((QuineListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(20);
			propositionalWff();
			setState(21);
			match(EOF);
			}
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

	public static class AtomContext extends ParserRuleContext {
		public TerminalNode ATOM() { return getToken(QuineParser.ATOM, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuineListener ) ((QuineListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuineListener ) ((QuineListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_atom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(ATOM);
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

	public static class PropositionalWffContext extends ParserRuleContext {
		public PropWffContext propWff() {
			return getRuleContext(PropWffContext.class,0);
		}
		public PropositionalWffContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propositionalWff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuineListener ) ((QuineListener)listener).enterPropositionalWff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuineListener ) ((QuineListener)listener).exitPropositionalWff(this);
		}
	}

	public final PropositionalWffContext propositionalWff() throws RecognitionException {
		PropositionalWffContext _localctx = new PropositionalWffContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_propositionalWff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			propWff();
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

	public static class PropWffContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public PropNegRuleContext propNegRule() {
			return getRuleContext(PropNegRuleContext.class,0);
		}
		public PropAndRuleContext propAndRule() {
			return getRuleContext(PropAndRuleContext.class,0);
		}
		public PropOrRuleContext propOrRule() {
			return getRuleContext(PropOrRuleContext.class,0);
		}
		public PropImpRuleContext propImpRule() {
			return getRuleContext(PropImpRuleContext.class,0);
		}
		public PropBicondRuleContext propBicondRule() {
			return getRuleContext(PropBicondRuleContext.class,0);
		}
		public PropExclusiveOrRuleContext propExclusiveOrRule() {
			return getRuleContext(PropExclusiveOrRuleContext.class,0);
		}
		public PropWffContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propWff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuineListener ) ((QuineListener)listener).enterPropWff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuineListener ) ((QuineListener)listener).exitPropWff(this);
		}
	}

	public final PropWffContext propWff() throws RecognitionException {
		PropWffContext _localctx = new PropWffContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_propWff);
		try {
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				atom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				propNegRule();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(29);
				propAndRule();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(30);
				propOrRule();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(31);
				propImpRule();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(32);
				propBicondRule();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(33);
				propExclusiveOrRule();
				}
				break;
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

	public static class PropNegRuleContext extends ParserRuleContext {
		public TerminalNode NEG() { return getToken(QuineParser.NEG, 0); }
		public PropWffContext propWff() {
			return getRuleContext(PropWffContext.class,0);
		}
		public PropNegRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propNegRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuineListener ) ((QuineListener)listener).enterPropNegRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuineListener ) ((QuineListener)listener).exitPropNegRule(this);
		}
	}

	public final PropNegRuleContext propNegRule() throws RecognitionException {
		PropNegRuleContext _localctx = new PropNegRuleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_propNegRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(NEG);
			setState(37);
			propWff();
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

	public static class PropAndRuleContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(QuineParser.OPEN_PAREN, 0); }
		public List<PropWffContext> propWff() {
			return getRuleContexts(PropWffContext.class);
		}
		public PropWffContext propWff(int i) {
			return getRuleContext(PropWffContext.class,i);
		}
		public TerminalNode AND() { return getToken(QuineParser.AND, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(QuineParser.CLOSE_PAREN, 0); }
		public PropAndRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propAndRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuineListener ) ((QuineListener)listener).enterPropAndRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuineListener ) ((QuineListener)listener).exitPropAndRule(this);
		}
	}

	public final PropAndRuleContext propAndRule() throws RecognitionException {
		PropAndRuleContext _localctx = new PropAndRuleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_propAndRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(OPEN_PAREN);
			setState(40);
			propWff();
			setState(41);
			match(AND);
			setState(42);
			propWff();
			setState(43);
			match(CLOSE_PAREN);
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

	public static class PropOrRuleContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(QuineParser.OPEN_PAREN, 0); }
		public List<PropWffContext> propWff() {
			return getRuleContexts(PropWffContext.class);
		}
		public PropWffContext propWff(int i) {
			return getRuleContext(PropWffContext.class,i);
		}
		public TerminalNode OR() { return getToken(QuineParser.OR, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(QuineParser.CLOSE_PAREN, 0); }
		public PropOrRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propOrRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuineListener ) ((QuineListener)listener).enterPropOrRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuineListener ) ((QuineListener)listener).exitPropOrRule(this);
		}
	}

	public final PropOrRuleContext propOrRule() throws RecognitionException {
		PropOrRuleContext _localctx = new PropOrRuleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_propOrRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(OPEN_PAREN);
			setState(46);
			propWff();
			setState(47);
			match(OR);
			setState(48);
			propWff();
			setState(49);
			match(CLOSE_PAREN);
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

	public static class PropImpRuleContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(QuineParser.OPEN_PAREN, 0); }
		public List<PropWffContext> propWff() {
			return getRuleContexts(PropWffContext.class);
		}
		public PropWffContext propWff(int i) {
			return getRuleContext(PropWffContext.class,i);
		}
		public TerminalNode IMP() { return getToken(QuineParser.IMP, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(QuineParser.CLOSE_PAREN, 0); }
		public PropImpRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propImpRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuineListener ) ((QuineListener)listener).enterPropImpRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuineListener ) ((QuineListener)listener).exitPropImpRule(this);
		}
	}

	public final PropImpRuleContext propImpRule() throws RecognitionException {
		PropImpRuleContext _localctx = new PropImpRuleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_propImpRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(OPEN_PAREN);
			setState(52);
			propWff();
			setState(53);
			match(IMP);
			setState(54);
			propWff();
			setState(55);
			match(CLOSE_PAREN);
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

	public static class PropBicondRuleContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(QuineParser.OPEN_PAREN, 0); }
		public List<PropWffContext> propWff() {
			return getRuleContexts(PropWffContext.class);
		}
		public PropWffContext propWff(int i) {
			return getRuleContext(PropWffContext.class,i);
		}
		public TerminalNode BICOND() { return getToken(QuineParser.BICOND, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(QuineParser.CLOSE_PAREN, 0); }
		public PropBicondRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propBicondRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuineListener ) ((QuineListener)listener).enterPropBicondRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuineListener ) ((QuineListener)listener).exitPropBicondRule(this);
		}
	}

	public final PropBicondRuleContext propBicondRule() throws RecognitionException {
		PropBicondRuleContext _localctx = new PropBicondRuleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_propBicondRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(OPEN_PAREN);
			setState(58);
			propWff();
			setState(59);
			match(BICOND);
			setState(60);
			propWff();
			setState(61);
			match(CLOSE_PAREN);
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

	public static class PropExclusiveOrRuleContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(QuineParser.OPEN_PAREN, 0); }
		public List<PropWffContext> propWff() {
			return getRuleContexts(PropWffContext.class);
		}
		public PropWffContext propWff(int i) {
			return getRuleContext(PropWffContext.class,i);
		}
		public TerminalNode XOR() { return getToken(QuineParser.XOR, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(QuineParser.CLOSE_PAREN, 0); }
		public PropExclusiveOrRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propExclusiveOrRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuineListener ) ((QuineListener)listener).enterPropExclusiveOrRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuineListener ) ((QuineListener)listener).exitPropExclusiveOrRule(this);
		}
	}

	public final PropExclusiveOrRuleContext propExclusiveOrRule() throws RecognitionException {
		PropExclusiveOrRuleContext _localctx = new PropExclusiveOrRuleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_propExclusiveOrRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(OPEN_PAREN);
			setState(64);
			propWff();
			setState(65);
			match(XOR);
			setState(66);
			propWff();
			setState(67);
			match(CLOSE_PAREN);
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
		"\u0004\u0001\fF\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003#\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0000"+
		"\u0000\n\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000\u0000A"+
		"\u0000\u0014\u0001\u0000\u0000\u0000\u0002\u0017\u0001\u0000\u0000\u0000"+
		"\u0004\u0019\u0001\u0000\u0000\u0000\u0006\"\u0001\u0000\u0000\u0000\b"+
		"$\u0001\u0000\u0000\u0000\n\'\u0001\u0000\u0000\u0000\f-\u0001\u0000\u0000"+
		"\u0000\u000e3\u0001\u0000\u0000\u0000\u00109\u0001\u0000\u0000\u0000\u0012"+
		"?\u0001\u0000\u0000\u0000\u0014\u0015\u0003\u0004\u0002\u0000\u0015\u0016"+
		"\u0005\u0000\u0000\u0001\u0016\u0001\u0001\u0000\u0000\u0000\u0017\u0018"+
		"\u0005\f\u0000\u0000\u0018\u0003\u0001\u0000\u0000\u0000\u0019\u001a\u0003"+
		"\u0006\u0003\u0000\u001a\u0005\u0001\u0000\u0000\u0000\u001b#\u0003\u0002"+
		"\u0001\u0000\u001c#\u0003\b\u0004\u0000\u001d#\u0003\n\u0005\u0000\u001e"+
		"#\u0003\f\u0006\u0000\u001f#\u0003\u000e\u0007\u0000 #\u0003\u0010\b\u0000"+
		"!#\u0003\u0012\t\u0000\"\u001b\u0001\u0000\u0000\u0000\"\u001c\u0001\u0000"+
		"\u0000\u0000\"\u001d\u0001\u0000\u0000\u0000\"\u001e\u0001\u0000\u0000"+
		"\u0000\"\u001f\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000\"!\u0001"+
		"\u0000\u0000\u0000#\u0007\u0001\u0000\u0000\u0000$%\u0005\t\u0000\u0000"+
		"%&\u0003\u0006\u0003\u0000&\t\u0001\u0000\u0000\u0000\'(\u0005\u0003\u0000"+
		"\u0000()\u0003\u0006\u0003\u0000)*\u0005\u0005\u0000\u0000*+\u0003\u0006"+
		"\u0003\u0000+,\u0005\u0004\u0000\u0000,\u000b\u0001\u0000\u0000\u0000"+
		"-.\u0005\u0003\u0000\u0000./\u0003\u0006\u0003\u0000/0\u0005\u0006\u0000"+
		"\u000001\u0003\u0006\u0003\u000012\u0005\u0004\u0000\u00002\r\u0001\u0000"+
		"\u0000\u000034\u0005\u0003\u0000\u000045\u0003\u0006\u0003\u000056\u0005"+
		"\u0007\u0000\u000067\u0003\u0006\u0003\u000078\u0005\u0004\u0000\u0000"+
		"8\u000f\u0001\u0000\u0000\u00009:\u0005\u0003\u0000\u0000:;\u0003\u0006"+
		"\u0003\u0000;<\u0005\b\u0000\u0000<=\u0003\u0006\u0003\u0000=>\u0005\u0004"+
		"\u0000\u0000>\u0011\u0001\u0000\u0000\u0000?@\u0005\u0003\u0000\u0000"+
		"@A\u0003\u0006\u0003\u0000AB\u0005\n\u0000\u0000BC\u0003\u0006\u0003\u0000"+
		"CD\u0005\u0004\u0000\u0000D\u0013\u0001\u0000\u0000\u0000\u0001\"";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}