// Generated from /Users/frederik/Desktop/P4Project/grammar/Language.g4 by ANTLR 4.7
package Generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, TYPE=9, 
		BOOL=10, INT=11, DNA=12, RNA=13, DNAsym=14, RNAsym=15, CODON=16, PROTEIN=17, 
		AMINOACIDSINGLE=18, AMINOACIDTRIPLE=19, Word=20, WS=21, LCURLY=22, LPAREN=23, 
		LBRACK=24, RCURLY=25, RPAREN=26, RBRACK=27, COMMA=28, COLON=29, SEMI=30, 
		LT=31, GT=32, LTEQ=33, GTEQ=34, UNDERSCORE=35, NOT=36, AND=37, SUB=38, 
		EQUAL=39, EQEQ=40, NOTEQ=41, OR=42, DIV=43, ADD=44, MUL=45, MOD=46;
	public static final int
		RULE_prog = 0, RULE_declarations = 1, RULE_declaration = 2, RULE_arraytype = 3, 
		RULE_identifier = 4, RULE_statements = 5, RULE_statement = 6, RULE_compoundstatement = 7, 
		RULE_selection = 8, RULE_iteration = 9, RULE_functions = 10, RULE_function = 11, 
		RULE_assignment = 12, RULE_expression = 13, RULE_functioncall = 14, RULE_jump = 15, 
		RULE_printstatement = 16;
	public static final String[] ruleNames = {
		"prog", "declarations", "declaration", "arraytype", "identifier", "statements", 
		"statement", "compoundstatement", "selection", "iteration", "functions", 
		"function", "assignment", "expression", "functioncall", "jump", "printstatement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if'", "'else'", "'while'", "'for'", "'void'", "'break'", "'return'", 
		"'Print'", null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "'{'", "'('", "'['", "'}'", "')'", "']'", "','", "':'", 
		"';'", "'<'", "'>'", "'<='", "'>='", "'_'", "'!'", "'&&'", "'-'", "'='", 
		"'=='", "'!='", "'||'", "'/'", "'+'", "'*'", "'%'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "TYPE", "BOOL", 
		"INT", "DNA", "RNA", "DNAsym", "RNAsym", "CODON", "PROTEIN", "AMINOACIDSINGLE", 
		"AMINOACIDTRIPLE", "Word", "WS", "LCURLY", "LPAREN", "LBRACK", "RCURLY", 
		"RPAREN", "RBRACK", "COMMA", "COLON", "SEMI", "LT", "GT", "LTEQ", "GTEQ", 
		"UNDERSCORE", "NOT", "AND", "SUB", "EQUAL", "EQEQ", "NOTEQ", "OR", "DIV", 
		"ADD", "MUL", "MOD"
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

	@Override
	public String getGrammarFileName() { return "Language.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<DeclarationsContext> declarations() {
			return getRuleContexts(DeclarationsContext.class);
		}
		public DeclarationsContext declarations(int i) {
			return getRuleContext(DeclarationsContext.class,i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public List<FunctionsContext> functions() {
			return getRuleContexts(FunctionsContext.class);
		}
		public FunctionsContext functions(int i) {
			return getRuleContext(FunctionsContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(34);
					declarations();
					}
					} 
				}
				setState(39);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << BOOL) | (1L << INT) | (1L << DNA) | (1L << RNA) | (1L << CODON) | (1L << PROTEIN) | (1L << Word) | (1L << LPAREN) | (1L << NOT))) != 0)) {
				{
				{
				setState(40);
				statements();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4 || _la==TYPE) {
				{
				{
				setState(46);
				functions();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class DeclarationsContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			declaration();
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

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclareVariableContext extends DeclarationContext {
		public Token type;
		public ArraytypeContext arrtype;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(LanguageParser.TYPE, 0); }
		public ArraytypeContext arraytype() {
			return getRuleContext(ArraytypeContext.class,0);
		}
		public DeclareVariableContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterDeclareVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitDeclareVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitDeclareVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DclAssignContext extends DeclarationContext {
		public Token type;
		public ArraytypeContext arrtype;
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(LanguageParser.TYPE, 0); }
		public ArraytypeContext arraytype() {
			return getRuleContext(ArraytypeContext.class,0);
		}
		public DclAssignContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterDclAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitDclAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitDclAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new DclAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(54);
					((DclAssignContext)_localctx).type = match(TYPE);
					}
					break;
				case 2:
					{
					setState(55);
					((DclAssignContext)_localctx).arrtype = arraytype();
					}
					break;
				}
				setState(58);
				assignment();
				setState(59);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new DeclareVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(61);
					((DeclareVariableContext)_localctx).type = match(TYPE);
					}
					break;
				case 2:
					{
					setState(62);
					((DeclareVariableContext)_localctx).arrtype = arraytype();
					}
					break;
				}
				setState(65);
				identifier();
				setState(66);
				match(SEMI);
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

	public static class ArraytypeContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(LanguageParser.TYPE, 0); }
		public ArraytypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraytype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterArraytype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitArraytype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitArraytype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArraytypeContext arraytype() throws RecognitionException {
		ArraytypeContext _localctx = new ArraytypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arraytype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(TYPE);
			setState(71);
			match(LBRACK);
			setState(72);
			match(RBRACK);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Word() { return getToken(LanguageParser.Word, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(Word);
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

	public static class StatementsContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			statement();
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintstmtContext extends StatementContext {
		public PrintstatementContext printstatement() {
			return getRuleContext(PrintstatementContext.class,0);
		}
		public PrintstmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterPrintstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitPrintstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitPrintstmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompoundstmtContext extends StatementContext {
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public CompoundstmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterCompoundstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitCompoundstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitCompoundstmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignContext extends StatementContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				assignment();
				}
				break;
			case 2:
				_localctx = new CompoundstmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				compoundstatement();
				}
				break;
			case 3:
				_localctx = new ExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				expression(0);
				setState(81);
				match(SEMI);
				}
				break;
			case 4:
				_localctx = new PrintstmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				printstatement();
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

	public static class CompoundstatementContext extends ParserRuleContext {
		public IterationContext iteration() {
			return getRuleContext(IterationContext.class,0);
		}
		public SelectionContext selection() {
			return getRuleContext(SelectionContext.class,0);
		}
		public JumpContext jump() {
			return getRuleContext(JumpContext.class,0);
		}
		public CompoundstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterCompoundstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitCompoundstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitCompoundstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundstatementContext compoundstatement() throws RecognitionException {
		CompoundstatementContext _localctx = new CompoundstatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_compoundstatement);
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				iteration();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				selection();
				}
				break;
			case T__5:
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				jump();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SelectionContext extends ParserRuleContext {
		public SelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection; }
	 
		public SelectionContext() { }
		public void copyFrom(SelectionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfContext extends SelectionContext {
		public ExpressionContext predicate;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<DeclarationsContext> declarations() {
			return getRuleContexts(DeclarationsContext.class);
		}
		public DeclarationsContext declarations(int i) {
			return getRuleContext(DeclarationsContext.class,i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public IfContext(SelectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfelseContext extends SelectionContext {
		public ExpressionContext predicate;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<DeclarationsContext> declarations() {
			return getRuleContexts(DeclarationsContext.class);
		}
		public DeclarationsContext declarations(int i) {
			return getRuleContext(DeclarationsContext.class,i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public IfelseContext(SelectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterIfelse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitIfelse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitIfelse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectionContext selection() throws RecognitionException {
		SelectionContext _localctx = new SelectionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_selection);
		int _la;
		try {
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				match(T__0);
				setState(92);
				match(LPAREN);
				setState(93);
				((IfContext)_localctx).predicate = expression(0);
				setState(94);
				match(RPAREN);
				setState(95);
				match(LCURLY);
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TYPE) {
					{
					{
					setState(96);
					declarations();
					}
					}
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << BOOL) | (1L << INT) | (1L << DNA) | (1L << RNA) | (1L << CODON) | (1L << PROTEIN) | (1L << Word) | (1L << LPAREN) | (1L << NOT))) != 0)) {
					{
					{
					setState(102);
					statements();
					}
					}
					setState(107);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(108);
				match(RCURLY);
				}
				break;
			case 2:
				_localctx = new IfelseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(T__0);
				setState(111);
				match(LPAREN);
				setState(112);
				((IfelseContext)_localctx).predicate = expression(0);
				setState(113);
				match(RPAREN);
				setState(114);
				match(LCURLY);
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TYPE) {
					{
					{
					setState(115);
					declarations();
					}
					}
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << BOOL) | (1L << INT) | (1L << DNA) | (1L << RNA) | (1L << CODON) | (1L << PROTEIN) | (1L << Word) | (1L << LPAREN) | (1L << NOT))) != 0)) {
					{
					{
					setState(121);
					statements();
					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(127);
				match(RCURLY);
				setState(128);
				match(T__1);
				setState(129);
				match(LCURLY);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TYPE) {
					{
					{
					setState(130);
					declarations();
					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << BOOL) | (1L << INT) | (1L << DNA) | (1L << RNA) | (1L << CODON) | (1L << PROTEIN) | (1L << Word) | (1L << LPAREN) | (1L << NOT))) != 0)) {
					{
					{
					setState(136);
					statements();
					}
					}
					setState(141);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(142);
				match(RCURLY);
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

	public static class IterationContext extends ParserRuleContext {
		public IterationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration; }
	 
		public IterationContext() { }
		public void copyFrom(IterationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForContext extends IterationContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public ForContext(IterationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends IterationContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public WhileContext(IterationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationContext iteration() throws RecognitionException {
		IterationContext _localctx = new IterationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_iteration);
		int _la;
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(T__2);
				setState(147);
				match(LPAREN);
				setState(148);
				expression(0);
				setState(149);
				match(RPAREN);
				setState(150);
				match(LCURLY);
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << BOOL) | (1L << INT) | (1L << DNA) | (1L << RNA) | (1L << CODON) | (1L << PROTEIN) | (1L << Word) | (1L << LPAREN) | (1L << NOT))) != 0)) {
					{
					{
					setState(151);
					statements();
					}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(157);
				match(RCURLY);
				}
				break;
			case T__3:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(T__3);
				setState(160);
				match(LPAREN);
				setState(161);
				assignment();
				setState(162);
				expression(0);
				setState(163);
				match(SEMI);
				setState(164);
				expression(0);
				setState(165);
				match(RPAREN);
				setState(166);
				match(LCURLY);
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << BOOL) | (1L << INT) | (1L << DNA) | (1L << RNA) | (1L << CODON) | (1L << PROTEIN) | (1L << Word) | (1L << LPAREN) | (1L << NOT))) != 0)) {
					{
					{
					setState(167);
					statements();
					}
					}
					setState(172);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(173);
				match(RCURLY);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FunctionsContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitFunctions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			function();
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

	public static class FunctionContext extends ParserRuleContext {
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	 
		public FunctionContext() { }
		public void copyFrom(FunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncContext extends FunctionContext {
		public List<TerminalNode> TYPE() { return getTokens(LanguageParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(LanguageParser.TYPE, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<DeclarationsContext> declarations() {
			return getRuleContexts(DeclarationsContext.class);
		}
		public DeclarationsContext declarations(int i) {
			return getRuleContext(DeclarationsContext.class,i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public List<CompoundstatementContext> compoundstatement() {
			return getRuleContexts(CompoundstatementContext.class);
		}
		public CompoundstatementContext compoundstatement(int i) {
			return getRuleContext(CompoundstatementContext.class,i);
		}
		public FuncContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VoidfuncContext extends FunctionContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> TYPE() { return getTokens(LanguageParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(LanguageParser.TYPE, i);
		}
		public List<DeclarationsContext> declarations() {
			return getRuleContexts(DeclarationsContext.class);
		}
		public DeclarationsContext declarations(int i) {
			return getRuleContext(DeclarationsContext.class,i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public List<CompoundstatementContext> compoundstatement() {
			return getRuleContexts(CompoundstatementContext.class);
		}
		public CompoundstatementContext compoundstatement(int i) {
			return getRuleContext(CompoundstatementContext.class,i);
		}
		public VoidfuncContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterVoidfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitVoidfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitVoidfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function);
		int _la;
		try {
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				_localctx = new FuncContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(TYPE);
				setState(180);
				identifier();
				setState(181);
				match(LPAREN);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TYPE) {
					{
					{
					setState(182);
					match(TYPE);
					setState(183);
					identifier();
					}
					}
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(189);
				match(RPAREN);
				setState(190);
				match(LCURLY);
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TYPE) {
					{
					{
					setState(191);
					declarations();
					}
					}
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << BOOL) | (1L << INT) | (1L << DNA) | (1L << RNA) | (1L << CODON) | (1L << PROTEIN) | (1L << Word) | (1L << LPAREN) | (1L << NOT))) != 0)) {
					{
					{
					setState(197);
					statements();
					}
					}
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(203);
				match(RCURLY);
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__5) | (1L << T__6))) != 0)) {
					{
					{
					setState(204);
					compoundstatement();
					}
					}
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__4:
				_localctx = new VoidfuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(T__4);
				setState(211);
				identifier();
				setState(212);
				match(LPAREN);
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TYPE) {
					{
					{
					setState(213);
					match(TYPE);
					setState(214);
					identifier();
					}
					}
					setState(219);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(220);
				match(RPAREN);
				setState(221);
				match(LCURLY);
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TYPE) {
					{
					{
					setState(222);
					declarations();
					}
					}
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << BOOL) | (1L << INT) | (1L << DNA) | (1L << RNA) | (1L << CODON) | (1L << PROTEIN) | (1L << Word) | (1L << LPAREN) | (1L << NOT))) != 0)) {
					{
					{
					setState(228);
					statements();
					}
					}
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(234);
				match(RCURLY);
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__5) | (1L << T__6))) != 0)) {
					{
					{
					setState(235);
					compoundstatement();
					}
					}
					setState(240);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class AssignmentContext extends ParserRuleContext {
		public IdentifierContext left;
		public Token op;
		public ExpressionContext right;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			((AssignmentContext)_localctx).left = identifier();
			setState(244);
			((AssignmentContext)_localctx).op = match(EQUAL);
			setState(245);
			((AssignmentContext)_localctx).right = expression(0);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParensExpContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(LanguageParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LanguageParser.RPAREN, 0); }
		public ParensExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterParensExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitParensExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitParensExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberExpContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(LanguageParser.INT, 0); }
		public NumberExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterNumberExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitNumberExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitNumberExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryExpContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(LanguageParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(LanguageParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(LanguageParser.MOD, 0); }
		public TerminalNode ADD() { return getToken(LanguageParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(LanguageParser.SUB, 0); }
		public TerminalNode LT() { return getToken(LanguageParser.LT, 0); }
		public TerminalNode GT() { return getToken(LanguageParser.GT, 0); }
		public TerminalNode LTEQ() { return getToken(LanguageParser.LTEQ, 0); }
		public TerminalNode GTEQ() { return getToken(LanguageParser.GTEQ, 0); }
		public TerminalNode EQEQ() { return getToken(LanguageParser.EQEQ, 0); }
		public TerminalNode NOTEQ() { return getToken(LanguageParser.NOTEQ, 0); }
		public TerminalNode AND() { return getToken(LanguageParser.AND, 0); }
		public TerminalNode OR() { return getToken(LanguageParser.OR, 0); }
		public BinaryExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterBinaryExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitBinaryExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitBinaryExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExpContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(LanguageParser.NOT, 0); }
		public UnaryExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterUnaryExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitUnaryExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitUnaryExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolExpContext extends ExpressionContext {
		public TerminalNode BOOL() { return getToken(LanguageParser.BOOL, 0); }
		public BoolExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterBoolExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitBoolExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitBoolExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DnaExpContext extends ExpressionContext {
		public TerminalNode DNA() { return getToken(LanguageParser.DNA, 0); }
		public DnaExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterDnaExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitDnaExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitDnaExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableExpContext extends ExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VariableExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterVariableExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitVariableExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitVariableExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RnaExpContext extends ExpressionContext {
		public TerminalNode RNA() { return getToken(LanguageParser.RNA, 0); }
		public RnaExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterRnaExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitRnaExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitRnaExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctioncallExpContext extends ExpressionContext {
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public FunctioncallExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterFunctioncallExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitFunctioncallExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitFunctioncallExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CodonExpContext extends ExpressionContext {
		public TerminalNode CODON() { return getToken(LanguageParser.CODON, 0); }
		public CodonExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterCodonExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitCodonExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitCodonExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ProteinExpContext extends ExpressionContext {
		public TerminalNode PROTEIN() { return getToken(LanguageParser.PROTEIN, 0); }
		public ProteinExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterProteinExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitProteinExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitProteinExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				_localctx = new ParensExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(248);
				match(LPAREN);
				setState(249);
				expression(0);
				setState(250);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new UnaryExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(252);
				((UnaryExpContext)_localctx).op = match(NOT);
				setState(253);
				expression(15);
				}
				break;
			case 3:
				{
				_localctx = new FunctioncallExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(254);
				functioncall();
				}
				break;
			case 4:
				{
				_localctx = new VariableExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(255);
				identifier();
				}
				break;
			case 5:
				{
				_localctx = new NumberExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(256);
				match(INT);
				}
				break;
			case 6:
				{
				_localctx = new BoolExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(257);
				match(BOOL);
				}
				break;
			case 7:
				{
				_localctx = new DnaExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(258);
				match(DNA);
				}
				break;
			case 8:
				{
				_localctx = new RnaExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(259);
				match(RNA);
				}
				break;
			case 9:
				{
				_localctx = new CodonExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(260);
				match(CODON);
				}
				break;
			case 10:
				{
				_localctx = new ProteinExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(261);
				match(PROTEIN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(284);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(282);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExpContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(264);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(265);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIV) | (1L << MUL) | (1L << MOD))) != 0)) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(266);
						((BinaryExpContext)_localctx).right = expression(15);
						}
						break;
					case 2:
						{
						_localctx = new BinaryExpContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(267);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(268);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==SUB || _la==ADD) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(269);
						((BinaryExpContext)_localctx).right = expression(14);
						}
						break;
					case 3:
						{
						_localctx = new BinaryExpContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(270);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(271);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << GT) | (1L << LTEQ) | (1L << GTEQ))) != 0)) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(272);
						((BinaryExpContext)_localctx).right = expression(13);
						}
						break;
					case 4:
						{
						_localctx = new BinaryExpContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(273);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(274);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQEQ || _la==NOTEQ) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(275);
						((BinaryExpContext)_localctx).right = expression(12);
						}
						break;
					case 5:
						{
						_localctx = new BinaryExpContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(276);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(277);
						((BinaryExpContext)_localctx).op = match(AND);
						setState(278);
						((BinaryExpContext)_localctx).right = expression(11);
						}
						break;
					case 6:
						{
						_localctx = new BinaryExpContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(279);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(280);
						((BinaryExpContext)_localctx).op = match(OR);
						setState(281);
						((BinaryExpContext)_localctx).right = expression(10);
						}
						break;
					}
					} 
				}
				setState(286);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FunctioncallContext extends ParserRuleContext {
		public IdentifierContext funcname;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctioncallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioncall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterFunctioncall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitFunctioncall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitFunctioncall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctioncallContext functioncall() throws RecognitionException {
		FunctioncallContext _localctx = new FunctioncallContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functioncall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			((FunctioncallContext)_localctx).funcname = identifier();
			setState(288);
			match(LPAREN);
			{
			setState(289);
			expression(0);
			}
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(290);
				match(COMMA);
				{
				setState(291);
				expression(0);
				}
				}
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(297);
			match(RPAREN);
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

	public static class JumpContext extends ParserRuleContext {
		public JumpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jump; }
	 
		public JumpContext() { }
		public void copyFrom(JumpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BreakContext extends JumpContext {
		public BreakContext(JumpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitBreak(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnContext extends JumpContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnContext(JumpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpContext jump() throws RecognitionException {
		JumpContext _localctx = new JumpContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_jump);
		try {
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				_localctx = new BreakContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				match(T__5);
				setState(300);
				match(SEMI);
				}
				break;
			case T__6:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				match(T__6);
				setState(302);
				expression(0);
				setState(303);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PrintstatementContext extends ParserRuleContext {
		public PrintstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printstatement; }
	 
		public PrintstatementContext() { }
		public void copyFrom(PrintstatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintContext extends PrintstatementContext {
		public IdentifierContext left;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PrintContext(PrintstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintstatementContext printstatement() throws RecognitionException {
		PrintstatementContext _localctx = new PrintstatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_printstatement);
		try {
			_localctx = new PrintContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(T__7);
			setState(308);
			match(LPAREN);
			setState(309);
			((PrintContext)_localctx).left = identifier();
			setState(310);
			match(RPAREN);
			setState(311);
			match(SEMI);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u013c\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\7\2&\n\2\f\2\16\2)\13\2\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\7\2\62\n"+
		"\2\f\2\16\2\65\13\2\3\3\3\3\3\4\3\4\5\4;\n\4\3\4\3\4\3\4\3\4\3\4\5\4B"+
		"\n\4\3\4\3\4\3\4\5\4G\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\bW\n\b\3\t\3\t\3\t\5\t\\\n\t\3\n\3\n\3\n\3\n\3\n\3\n\7"+
		"\nd\n\n\f\n\16\ng\13\n\3\n\7\nj\n\n\f\n\16\nm\13\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\7\nw\n\n\f\n\16\nz\13\n\3\n\7\n}\n\n\f\n\16\n\u0080\13\n"+
		"\3\n\3\n\3\n\3\n\7\n\u0086\n\n\f\n\16\n\u0089\13\n\3\n\7\n\u008c\n\n\f"+
		"\n\16\n\u008f\13\n\3\n\3\n\5\n\u0093\n\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\7\13\u009b\n\13\f\13\16\13\u009e\13\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\7\13\u00ab\n\13\f\13\16\13\u00ae\13\13\3\13"+
		"\3\13\5\13\u00b2\n\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\7\r\u00bb\n\r\f\r\16"+
		"\r\u00be\13\r\3\r\3\r\3\r\7\r\u00c3\n\r\f\r\16\r\u00c6\13\r\3\r\7\r\u00c9"+
		"\n\r\f\r\16\r\u00cc\13\r\3\r\3\r\7\r\u00d0\n\r\f\r\16\r\u00d3\13\r\3\r"+
		"\3\r\3\r\3\r\3\r\7\r\u00da\n\r\f\r\16\r\u00dd\13\r\3\r\3\r\3\r\7\r\u00e2"+
		"\n\r\f\r\16\r\u00e5\13\r\3\r\7\r\u00e8\n\r\f\r\16\r\u00eb\13\r\3\r\3\r"+
		"\7\r\u00ef\n\r\f\r\16\r\u00f2\13\r\5\r\u00f4\n\r\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\5\17\u0109\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u011d\n\17\f\17\16\17\u0120"+
		"\13\17\3\20\3\20\3\20\3\20\3\20\7\20\u0127\n\20\f\20\16\20\u012a\13\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0134\n\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\2\3\34\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"\2\6\4\2--/\60\4\2((..\3\2!$\3\2*+\2\u0159\2\'\3\2\2\2\4\66\3\2\2\2"+
		"\6F\3\2\2\2\bH\3\2\2\2\nL\3\2\2\2\fN\3\2\2\2\16V\3\2\2\2\20[\3\2\2\2\22"+
		"\u0092\3\2\2\2\24\u00b1\3\2\2\2\26\u00b3\3\2\2\2\30\u00f3\3\2\2\2\32\u00f5"+
		"\3\2\2\2\34\u0108\3\2\2\2\36\u0121\3\2\2\2 \u0133\3\2\2\2\"\u0135\3\2"+
		"\2\2$&\5\4\3\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(-\3\2\2\2)\'"+
		"\3\2\2\2*,\5\f\7\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\63\3\2\2\2"+
		"/-\3\2\2\2\60\62\5\26\f\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63"+
		"\64\3\2\2\2\64\3\3\2\2\2\65\63\3\2\2\2\66\67\5\6\4\2\67\5\3\2\2\28;\7"+
		"\13\2\29;\5\b\5\2:8\3\2\2\2:9\3\2\2\2;<\3\2\2\2<=\5\32\16\2=>\7 \2\2>"+
		"G\3\2\2\2?B\7\13\2\2@B\5\b\5\2A?\3\2\2\2A@\3\2\2\2BC\3\2\2\2CD\5\n\6\2"+
		"DE\7 \2\2EG\3\2\2\2F:\3\2\2\2FA\3\2\2\2G\7\3\2\2\2HI\7\13\2\2IJ\7\32\2"+
		"\2JK\7\35\2\2K\t\3\2\2\2LM\7\26\2\2M\13\3\2\2\2NO\5\16\b\2O\r\3\2\2\2"+
		"PW\5\32\16\2QW\5\20\t\2RS\5\34\17\2ST\7 \2\2TW\3\2\2\2UW\5\"\22\2VP\3"+
		"\2\2\2VQ\3\2\2\2VR\3\2\2\2VU\3\2\2\2W\17\3\2\2\2X\\\5\24\13\2Y\\\5\22"+
		"\n\2Z\\\5 \21\2[X\3\2\2\2[Y\3\2\2\2[Z\3\2\2\2\\\21\3\2\2\2]^\7\3\2\2^"+
		"_\7\31\2\2_`\5\34\17\2`a\7\34\2\2ae\7\30\2\2bd\5\4\3\2cb\3\2\2\2dg\3\2"+
		"\2\2ec\3\2\2\2ef\3\2\2\2fk\3\2\2\2ge\3\2\2\2hj\5\f\7\2ih\3\2\2\2jm\3\2"+
		"\2\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2no\7\33\2\2o\u0093\3\2\2\2"+
		"pq\7\3\2\2qr\7\31\2\2rs\5\34\17\2st\7\34\2\2tx\7\30\2\2uw\5\4\3\2vu\3"+
		"\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y~\3\2\2\2zx\3\2\2\2{}\5\f\7\2|{\3"+
		"\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080~"+
		"\3\2\2\2\u0081\u0082\7\33\2\2\u0082\u0083\7\4\2\2\u0083\u0087\7\30\2\2"+
		"\u0084\u0086\5\4\3\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085"+
		"\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008d\3\2\2\2\u0089\u0087\3\2\2\2\u008a"+
		"\u008c\5\f\7\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090"+
		"\u0091\7\33\2\2\u0091\u0093\3\2\2\2\u0092]\3\2\2\2\u0092p\3\2\2\2\u0093"+
		"\23\3\2\2\2\u0094\u0095\7\5\2\2\u0095\u0096\7\31\2\2\u0096\u0097\5\34"+
		"\17\2\u0097\u0098\7\34\2\2\u0098\u009c\7\30\2\2\u0099\u009b\5\f\7\2\u009a"+
		"\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7\33\2\2\u00a0"+
		"\u00b2\3\2\2\2\u00a1\u00a2\7\6\2\2\u00a2\u00a3\7\31\2\2\u00a3\u00a4\5"+
		"\32\16\2\u00a4\u00a5\5\34\17\2\u00a5\u00a6\7 \2\2\u00a6\u00a7\5\34\17"+
		"\2\u00a7\u00a8\7\34\2\2\u00a8\u00ac\7\30\2\2\u00a9\u00ab\5\f\7\2\u00aa"+
		"\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7\33\2\2\u00b0"+
		"\u00b2\3\2\2\2\u00b1\u0094\3\2\2\2\u00b1\u00a1\3\2\2\2\u00b2\25\3\2\2"+
		"\2\u00b3\u00b4\5\30\r\2\u00b4\27\3\2\2\2\u00b5\u00b6\7\13\2\2\u00b6\u00b7"+
		"\5\n\6\2\u00b7\u00bc\7\31\2\2\u00b8\u00b9\7\13\2\2\u00b9\u00bb\5\n\6\2"+
		"\u00ba\u00b8\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd"+
		"\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\7\34\2\2"+
		"\u00c0\u00c4\7\30\2\2\u00c1\u00c3\5\4\3\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6"+
		"\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00ca\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c7\u00c9\5\f\7\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2"+
		"\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cd\u00d1\7\33\2\2\u00ce\u00d0\5\20\t\2\u00cf\u00ce\3"+
		"\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\u00f4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\7\7\2\2\u00d5\u00d6\5\n"+
		"\6\2\u00d6\u00db\7\31\2\2\u00d7\u00d8\7\13\2\2\u00d8\u00da\5\n\6\2\u00d9"+
		"\u00d7\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2"+
		"\2\2\u00dc\u00de\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df\7\34\2\2\u00df"+
		"\u00e3\7\30\2\2\u00e0\u00e2\5\4\3\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3"+
		"\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e9\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e6\u00e8\5\f\7\2\u00e7\u00e6\3\2\2\2\u00e8\u00eb\3\2"+
		"\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00ec\u00f0\7\33\2\2\u00ed\u00ef\5\20\t\2\u00ee\u00ed\3"+
		"\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00b5\3\2\2\2\u00f3\u00d4\3\2"+
		"\2\2\u00f4\31\3\2\2\2\u00f5\u00f6\5\n\6\2\u00f6\u00f7\7)\2\2\u00f7\u00f8"+
		"\5\34\17\2\u00f8\33\3\2\2\2\u00f9\u00fa\b\17\1\2\u00fa\u00fb\7\31\2\2"+
		"\u00fb\u00fc\5\34\17\2\u00fc\u00fd\7\34\2\2\u00fd\u0109\3\2\2\2\u00fe"+
		"\u00ff\7&\2\2\u00ff\u0109\5\34\17\21\u0100\u0109\5\36\20\2\u0101\u0109"+
		"\5\n\6\2\u0102\u0109\7\r\2\2\u0103\u0109\7\f\2\2\u0104\u0109\7\16\2\2"+
		"\u0105\u0109\7\17\2\2\u0106\u0109\7\22\2\2\u0107\u0109\7\23\2\2\u0108"+
		"\u00f9\3\2\2\2\u0108\u00fe\3\2\2\2\u0108\u0100\3\2\2\2\u0108\u0101\3\2"+
		"\2\2\u0108\u0102\3\2\2\2\u0108\u0103\3\2\2\2\u0108\u0104\3\2\2\2\u0108"+
		"\u0105\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0107\3\2\2\2\u0109\u011e\3\2"+
		"\2\2\u010a\u010b\f\20\2\2\u010b\u010c\t\2\2\2\u010c\u011d\5\34\17\21\u010d"+
		"\u010e\f\17\2\2\u010e\u010f\t\3\2\2\u010f\u011d\5\34\17\20\u0110\u0111"+
		"\f\16\2\2\u0111\u0112\t\4\2\2\u0112\u011d\5\34\17\17\u0113\u0114\f\r\2"+
		"\2\u0114\u0115\t\5\2\2\u0115\u011d\5\34\17\16\u0116\u0117\f\f\2\2\u0117"+
		"\u0118\7\'\2\2\u0118\u011d\5\34\17\r\u0119\u011a\f\13\2\2\u011a\u011b"+
		"\7,\2\2\u011b\u011d\5\34\17\f\u011c\u010a\3\2\2\2\u011c\u010d\3\2\2\2"+
		"\u011c\u0110\3\2\2\2\u011c\u0113\3\2\2\2\u011c\u0116\3\2\2\2\u011c\u0119"+
		"\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"\35\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0122\5\n\6\2\u0122\u0123\7\31\2"+
		"\2\u0123\u0128\5\34\17\2\u0124\u0125\7\36\2\2\u0125\u0127\5\34\17\2\u0126"+
		"\u0124\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2"+
		"\2\2\u0129\u012b\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012c\7\34\2\2\u012c"+
		"\37\3\2\2\2\u012d\u012e\7\b\2\2\u012e\u0134\7 \2\2\u012f\u0130\7\t\2\2"+
		"\u0130\u0131\5\34\17\2\u0131\u0132\7 \2\2\u0132\u0134\3\2\2\2\u0133\u012d"+
		"\3\2\2\2\u0133\u012f\3\2\2\2\u0134!\3\2\2\2\u0135\u0136\7\n\2\2\u0136"+
		"\u0137\7\31\2\2\u0137\u0138\5\n\6\2\u0138\u0139\7\34\2\2\u0139\u013a\7"+
		" \2\2\u013a#\3\2\2\2\"\'-\63:AFV[ekx~\u0087\u008d\u0092\u009c\u00ac\u00b1"+
		"\u00bc\u00c4\u00ca\u00d1\u00db\u00e3\u00e9\u00f0\u00f3\u0108\u011c\u011e"+
		"\u0128\u0133";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}