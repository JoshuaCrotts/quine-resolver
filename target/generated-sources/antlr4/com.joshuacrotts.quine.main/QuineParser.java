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
		BICOND=8, NEG=9, XOR=10, ATOM=11;
	public static final int
		RULE_program = 0, RULE_atom = 1, RULE_propositionalWff = 2, RULE_propWff = 3, 
		RULE_propOuterWff = 4, RULE_propNegRule = 5, RULE_propAndRule = 6, RULE_propOrRule = 7, 
		RULE_propImpRule = 8, RULE_propBicondRule = 9, RULE_propExclusiveOrRule = 10, 
		RULE_propOuterAndRule = 11, RULE_propOuterOrRule = 12, RULE_propOuterImpRule = 13, 
		RULE_propOuterBicondRule = 14, RULE_propOuterExclusiveOrRule = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "atom", "propositionalWff", "propWff", "propOuterWff", "propNegRule", 
			"propAndRule", "propOrRule", "propImpRule", "propBicondRule", "propExclusiveOrRule", 
			"propOuterAndRule", "propOuterOrRule", "propOuterImpRule", "propOuterBicondRule", 
			"propOuterExclusiveOrRule"
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
			"IMP", "BICOND", "NEG", "XOR", "ATOM"
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
			setState(32);
			propositionalWff();
			setState(33);
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
			setState(35);
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
		public PropOuterWffContext propOuterWff() {
			return getRuleContext(PropOuterWffContext.class,0);
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
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				propWff();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				propOuterWff();
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
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				atom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				propNegRule();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				propAndRule();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				propOrRule();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(45);
				propImpRule();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(46);
				propBicondRule();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(47);
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

	public static class PropOuterWffContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public PropOuterAndRuleContext propOuterAndRule() {
			return getRuleContext(PropOuterAndRuleContext.class,0);
		}
		public PropOuterOrRuleContext propOuterOrRule() {
			return getRuleContext(PropOuterOrRuleContext.class,0);
		}
		public PropOuterImpRuleContext propOuterImpRule() {
			return getRuleContext(PropOuterImpRuleContext.class,0);
		}
		public PropOuterBicondRuleContext propOuterBicondRule() {
			return getRuleContext(PropOuterBicondRuleContext.class,0);
		}
		public PropOuterExclusiveOrRuleContext propOuterExclusiveOrRule() {
			return getRuleContext(PropOuterExclusiveOrRuleContext.class,0);
		}
		public PropOuterWffContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propOuterWff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuineListener ) ((QuineListener)listener).enterPropOuterWff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuineListener ) ((QuineListener)listener).exitPropOuterWff(this);
		}
	}

	public final PropOuterWffContext propOuterWff() throws RecognitionException {
		PropOuterWffContext _localctx = new PropOuterWffContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_propOuterWff);
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				atom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				propOuterAndRule();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				propOuterOrRule();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(53);
				propOuterImpRule();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(54);
				propOuterBicondRule();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(55);
				propOuterExclusiveOrRule();
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
		enterRule(_localctx, 10, RULE_propNegRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(NEG);
			setState(59);
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
		enterRule(_localctx, 12, RULE_propAndRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(OPEN_PAREN);
			setState(62);
			propWff();
			setState(63);
			match(AND);
			setState(64);
			propWff();
			setState(65);
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
		enterRule(_localctx, 14, RULE_propOrRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(OPEN_PAREN);
			setState(68);
			propWff();
			setState(69);
			match(OR);
			setState(70);
			propWff();
			setState(71);
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
		enterRule(_localctx, 16, RULE_propImpRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(OPEN_PAREN);
			setState(74);
			propWff();
			setState(75);
			match(IMP);
			setState(76);
			propWff();
			setState(77);
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
		enterRule(_localctx, 18, RULE_propBicondRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(OPEN_PAREN);
			setState(80);
			propWff();
			setState(81);
			match(BICOND);
			setState(82);
			propWff();
			setState(83);
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
		enterRule(_localctx, 20, RULE_propExclusiveOrRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(OPEN_PAREN);
			setState(86);
			propWff();
			setState(87);
			match(XOR);
			setState(88);
			propWff();
			setState(89);
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

	public static class PropOuterAndRuleContext extends ParserRuleContext {
		public List<PropWffContext> propWff() {
			return getRuleContexts(PropWffContext.class);
		}
		public PropWffContext propWff(int i) {
			return getRuleContext(PropWffContext.class,i);
		}
		public TerminalNode AND() { return getToken(QuineParser.AND, 0); }
		public PropOuterAndRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propOuterAndRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuineListener ) ((QuineListener)listener).enterPropOuterAndRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuineListener ) ((QuineListener)listener).exitPropOuterAndRule(this);
		}
	}

	public final PropOuterAndRuleContext propOuterAndRule() throws RecognitionException {
		PropOuterAndRuleContext _localctx = new PropOuterAndRuleContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_propOuterAndRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			propWff();
			setState(92);
			match(AND);
			setState(93);
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

	public static class PropOuterOrRuleContext extends ParserRuleContext {
		public List<PropWffContext> propWff() {
			return getRuleContexts(PropWffContext.class);
		}
		public PropWffContext propWff(int i) {
			return getRuleContext(PropWffContext.class,i);
		}
		public TerminalNode OR() { return getToken(QuineParser.OR, 0); }
		public PropOuterOrRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propOuterOrRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuineListener ) ((QuineListener)listener).enterPropOuterOrRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuineListener ) ((QuineListener)listener).exitPropOuterOrRule(this);
		}
	}

	public final PropOuterOrRuleContext propOuterOrRule() throws RecognitionException {
		PropOuterOrRuleContext _localctx = new PropOuterOrRuleContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_propOuterOrRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			propWff();
			setState(96);
			match(OR);
			setState(97);
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

	public static class PropOuterImpRuleContext extends ParserRuleContext {
		public List<PropWffContext> propWff() {
			return getRuleContexts(PropWffContext.class);
		}
		public PropWffContext propWff(int i) {
			return getRuleContext(PropWffContext.class,i);
		}
		public TerminalNode IMP() { return getToken(QuineParser.IMP, 0); }
		public PropOuterImpRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propOuterImpRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuineListener ) ((QuineListener)listener).enterPropOuterImpRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuineListener ) ((QuineListener)listener).exitPropOuterImpRule(this);
		}
	}

	public final PropOuterImpRuleContext propOuterImpRule() throws RecognitionException {
		PropOuterImpRuleContext _localctx = new PropOuterImpRuleContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_propOuterImpRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			propWff();
			setState(100);
			match(IMP);
			setState(101);
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

	public static class PropOuterBicondRuleContext extends ParserRuleContext {
		public List<PropWffContext> propWff() {
			return getRuleContexts(PropWffContext.class);
		}
		public PropWffContext propWff(int i) {
			return getRuleContext(PropWffContext.class,i);
		}
		public TerminalNode BICOND() { return getToken(QuineParser.BICOND, 0); }
		public PropOuterBicondRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propOuterBicondRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuineListener ) ((QuineListener)listener).enterPropOuterBicondRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuineListener ) ((QuineListener)listener).exitPropOuterBicondRule(this);
		}
	}

	public final PropOuterBicondRuleContext propOuterBicondRule() throws RecognitionException {
		PropOuterBicondRuleContext _localctx = new PropOuterBicondRuleContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_propOuterBicondRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			propWff();
			setState(104);
			match(BICOND);
			setState(105);
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

	public static class PropOuterExclusiveOrRuleContext extends ParserRuleContext {
		public List<PropWffContext> propWff() {
			return getRuleContexts(PropWffContext.class);
		}
		public PropWffContext propWff(int i) {
			return getRuleContext(PropWffContext.class,i);
		}
		public TerminalNode XOR() { return getToken(QuineParser.XOR, 0); }
		public PropOuterExclusiveOrRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propOuterExclusiveOrRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuineListener ) ((QuineListener)listener).enterPropOuterExclusiveOrRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuineListener ) ((QuineListener)listener).exitPropOuterExclusiveOrRule(this);
		}
	}

	public final PropOuterExclusiveOrRuleContext propOuterExclusiveOrRule() throws RecognitionException {
		PropOuterExclusiveOrRuleContext _localctx = new PropOuterExclusiveOrRuleContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_propOuterExclusiveOrRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			propWff();
			setState(108);
			match(XOR);
			setState(109);
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

	public static final String _serializedATN =
		"\u0004\u0001\u000bp\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0003\u0002(\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u00031\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u00049\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0000\u0000"+
		"\u0010\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e\u0000\u0000k\u0000 \u0001\u0000\u0000\u0000\u0002#"+
		"\u0001\u0000\u0000\u0000\u0004\'\u0001\u0000\u0000\u0000\u00060\u0001"+
		"\u0000\u0000\u0000\b8\u0001\u0000\u0000\u0000\n:\u0001\u0000\u0000\u0000"+
		"\f=\u0001\u0000\u0000\u0000\u000eC\u0001\u0000\u0000\u0000\u0010I\u0001"+
		"\u0000\u0000\u0000\u0012O\u0001\u0000\u0000\u0000\u0014U\u0001\u0000\u0000"+
		"\u0000\u0016[\u0001\u0000\u0000\u0000\u0018_\u0001\u0000\u0000\u0000\u001a"+
		"c\u0001\u0000\u0000\u0000\u001cg\u0001\u0000\u0000\u0000\u001ek\u0001"+
		"\u0000\u0000\u0000 !\u0003\u0004\u0002\u0000!\"\u0005\u0000\u0000\u0001"+
		"\"\u0001\u0001\u0000\u0000\u0000#$\u0005\u000b\u0000\u0000$\u0003\u0001"+
		"\u0000\u0000\u0000%(\u0003\u0006\u0003\u0000&(\u0003\b\u0004\u0000\'%"+
		"\u0001\u0000\u0000\u0000\'&\u0001\u0000\u0000\u0000(\u0005\u0001\u0000"+
		"\u0000\u0000)1\u0003\u0002\u0001\u0000*1\u0003\n\u0005\u0000+1\u0003\f"+
		"\u0006\u0000,1\u0003\u000e\u0007\u0000-1\u0003\u0010\b\u0000.1\u0003\u0012"+
		"\t\u0000/1\u0003\u0014\n\u00000)\u0001\u0000\u0000\u00000*\u0001\u0000"+
		"\u0000\u00000+\u0001\u0000\u0000\u00000,\u0001\u0000\u0000\u00000-\u0001"+
		"\u0000\u0000\u00000.\u0001\u0000\u0000\u00000/\u0001\u0000\u0000\u0000"+
		"1\u0007\u0001\u0000\u0000\u000029\u0003\u0002\u0001\u000039\u0003\u0016"+
		"\u000b\u000049\u0003\u0018\f\u000059\u0003\u001a\r\u000069\u0003\u001c"+
		"\u000e\u000079\u0003\u001e\u000f\u000082\u0001\u0000\u0000\u000083\u0001"+
		"\u0000\u0000\u000084\u0001\u0000\u0000\u000085\u0001\u0000\u0000\u0000"+
		"86\u0001\u0000\u0000\u000087\u0001\u0000\u0000\u00009\t\u0001\u0000\u0000"+
		"\u0000:;\u0005\t\u0000\u0000;<\u0003\u0006\u0003\u0000<\u000b\u0001\u0000"+
		"\u0000\u0000=>\u0005\u0003\u0000\u0000>?\u0003\u0006\u0003\u0000?@\u0005"+
		"\u0005\u0000\u0000@A\u0003\u0006\u0003\u0000AB\u0005\u0004\u0000\u0000"+
		"B\r\u0001\u0000\u0000\u0000CD\u0005\u0003\u0000\u0000DE\u0003\u0006\u0003"+
		"\u0000EF\u0005\u0006\u0000\u0000FG\u0003\u0006\u0003\u0000GH\u0005\u0004"+
		"\u0000\u0000H\u000f\u0001\u0000\u0000\u0000IJ\u0005\u0003\u0000\u0000"+
		"JK\u0003\u0006\u0003\u0000KL\u0005\u0007\u0000\u0000LM\u0003\u0006\u0003"+
		"\u0000MN\u0005\u0004\u0000\u0000N\u0011\u0001\u0000\u0000\u0000OP\u0005"+
		"\u0003\u0000\u0000PQ\u0003\u0006\u0003\u0000QR\u0005\b\u0000\u0000RS\u0003"+
		"\u0006\u0003\u0000ST\u0005\u0004\u0000\u0000T\u0013\u0001\u0000\u0000"+
		"\u0000UV\u0005\u0003\u0000\u0000VW\u0003\u0006\u0003\u0000WX\u0005\n\u0000"+
		"\u0000XY\u0003\u0006\u0003\u0000YZ\u0005\u0004\u0000\u0000Z\u0015\u0001"+
		"\u0000\u0000\u0000[\\\u0003\u0006\u0003\u0000\\]\u0005\u0005\u0000\u0000"+
		"]^\u0003\u0006\u0003\u0000^\u0017\u0001\u0000\u0000\u0000_`\u0003\u0006"+
		"\u0003\u0000`a\u0005\u0006\u0000\u0000ab\u0003\u0006\u0003\u0000b\u0019"+
		"\u0001\u0000\u0000\u0000cd\u0003\u0006\u0003\u0000de\u0005\u0007\u0000"+
		"\u0000ef\u0003\u0006\u0003\u0000f\u001b\u0001\u0000\u0000\u0000gh\u0003"+
		"\u0006\u0003\u0000hi\u0005\b\u0000\u0000ij\u0003\u0006\u0003\u0000j\u001d"+
		"\u0001\u0000\u0000\u0000kl\u0003\u0006\u0003\u0000lm\u0005\n\u0000\u0000"+
		"mn\u0003\u0006\u0003\u0000n\u001f\u0001\u0000\u0000\u0000\u0003\'08";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}