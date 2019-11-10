// Generated from C:/Users/Jehad/IdeaProjects/SQL_git/src\Sql.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, DOUBEL=12, SCOL=13, DOT=14, OPEN_PAR=15, CLOSE_PAR=16, 
		OPEN_SQER_BAR=17, CLOSE_SQER_PAR=18, COMMA=19, ASSIGN=20, STAR=21, PLUS=22, 
		MINUS=23, TILDE=24, PIPE2=25, DIV=26, MOD=27, LT2=28, GT2=29, AMP=30, 
		PIPE=31, LT=32, LT_EQ=33, GT=34, GT_EQ=35, EQ=36, NOT_EQ1=37, NOT_EQ2=38, 
		K_ABORT=39, K_ACTION=40, K_ADD=41, K_AFTER=42, K_ALL=43, K_ALTER=44, K_ANALYZE=45, 
		K_AND=46, K_AS=47, K_ASC=48, K_ATTACH=49, K_AUTOINCREMENT=50, K_BEFORE=51, 
		K_BEGIN=52, K_BETWEEN=53, K_BY=54, K_CASCADE=55, K_CASE=56, K_CAST=57, 
		K_CHECK=58, K_COLLATE=59, K_COLUMN=60, K_COMMIT=61, K_CONFLICT=62, K_CONSTRAINT=63, 
		K_CREATE=64, K_CROSS=65, K_CURRENT_DATE=66, K_CURRENT_TIME=67, K_CURRENT_TIMESTAMP=68, 
		K_DATABASE=69, K_DEFAULT=70, K_DEFERRABLE=71, K_DEFERRED=72, K_DELETE=73, 
		K_DESC=74, K_DETACH=75, K_DISTINCT=76, K_DROP=77, K_EACH=78, K_ELSE=79, 
		K_END=80, K_ENABLE=81, K_ESCAPE=82, K_EXCEPT=83, K_EXCLUSIVE=84, K_EXISTS=85, 
		K_EXPLAIN=86, K_FAIL=87, K_FOR=88, K_FOREIGN=89, K_FROM=90, K_FULL=91, 
		K_GLOB=92, K_GROUP=93, K_HAVING=94, K_IF=95, K_IGNORE=96, K_IMMEDIATE=97, 
		K_IN=98, K_INDEX=99, K_INDEXED=100, K_INITIALLY=101, K_INNER=102, K_INSERT=103, 
		K_INSTEAD=104, K_INTERSECT=105, K_INTO=106, K_IS=107, K_ISNULL=108, K_JOIN=109, 
		K_KEY=110, K_LEFT=111, K_LIKE=112, K_LIMIT=113, K_MATCH=114, K_NATURAL=115, 
		K_NEXTVAL=116, K_NO=117, K_NOT=118, K_NOTNULL=119, K_NULL=120, K_OF=121, 
		K_OFFSET=122, K_ON=123, K_ONLY=124, K_OR=125, K_ORDER=126, K_OUTER=127, 
		K_PLAN=128, K_PRAGMA=129, K_PRIMARY=130, K_QUERY=131, K_RAISE=132, K_RECURSIVE=133, 
		K_REFERENCES=134, K_REGEXP=135, K_REINDEX=136, K_RELEASE=137, K_RENAME=138, 
		K_REPLACE=139, K_RESTRICT=140, K_RIGHT=141, K_ROLLBACK=142, K_ROW=143, 
		K_SAVEPOINT=144, K_SELECT=145, K_SET=146, K_TABLE=147, K_TEMP=148, K_TEMPORARY=149, 
		K_THEN=150, K_TO=151, K_TRANSACTION=152, K_TRIGGER=153, K_UNION=154, K_UNIQUE=155, 
		K_UPDATE=156, K_USING=157, K_VACUUM=158, K_VALUES=159, K_VIEW=160, K_VIRTUAL=161, 
		K_WHEN=162, K_WHERE=163, K_WITH=164, K_WITHOUT=165, K_WILE=166, K_DO=167, 
		K_RETURN=168, K_FOREACH=169, K_VAR=170, K_PRINT=171, K_SWITCH=172, K_BRECK=173, 
		ONE_CHAR_LETTER=174, STRING_LITERAL=175, IDENTIFIER=176, RANDOM_NAME=177, 
		NUMERIC_LITERAL=178, BIND_PARAMETER=179, BLOB_LITERAL=180, SINGLE_LINE_COMMENT=181, 
		MULTILINE_COMMENT=182, SPACES=183, UNEXPECTED_CHAR=184, ANY_THING=185, 
		DIGIT=186, SINGLE_STRING=187;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_sql_stmt_list = 2, RULE_sql_stmt = 3, 
		RULE_alter_table_stmt = 4, RULE_alter_table_add_constraint = 5, RULE_alter_table_add = 6, 
		RULE_analyze_stmt = 7, RULE_attach_stmt = 8, RULE_begin_stmt = 9, RULE_commit_stmt = 10, 
		RULE_compound_select_stmt = 11, RULE_create_index_stmt = 12, RULE_create_table_stmt = 13, 
		RULE_create_trigger_stmt = 14, RULE_create_view_stmt = 15, RULE_create_virtual_table_stmt = 16, 
		RULE_delete_stmt = 17, RULE_delete_stmt_limited = 18, RULE_detach_stmt = 19, 
		RULE_drop_index_stmt = 20, RULE_drop_table_stmt = 21, RULE_drop_trigger_stmt = 22, 
		RULE_drop_view_stmt = 23, RULE_factored_select_stmt = 24, RULE_insert_stmt = 25, 
		RULE_pragma_stmt = 26, RULE_reindex_stmt = 27, RULE_release_stmt = 28, 
		RULE_rollback_stmt = 29, RULE_savepoint_stmt = 30, RULE_simple_select_stmt = 31, 
		RULE_select_stmt = 32, RULE_select_or_values = 33, RULE_update_stmt = 34, 
		RULE_update_stmt_limited = 35, RULE_vacuum_stmt = 36, RULE_column_def = 37, 
		RULE_type_name = 38, RULE_column_constraint = 39, RULE_column_constraint_primary_key = 40, 
		RULE_column_constraint_foreign_key = 41, RULE_column_constraint_not_null = 42, 
		RULE_column_constraint_null = 43, RULE_column_default = 44, RULE_column_default_value = 45, 
		RULE_conflict_clause = 46, RULE_expr = 47, RULE_foreign_key_clause = 48, 
		RULE_fk_target_column_name = 49, RULE_raise_function = 50, RULE_indexed_column = 51, 
		RULE_table_constraint = 52, RULE_table_constraint_primary_key = 53, RULE_table_constraint_foreign_key = 54, 
		RULE_table_constraint_unique = 55, RULE_table_constraint_key = 56, RULE_fk_origin_column_name = 57, 
		RULE_with_clause = 58, RULE_qualified_table_name = 59, RULE_ordering_term = 60, 
		RULE_pragma_value = 61, RULE_common_table_expression = 62, RULE_result_column = 63, 
		RULE_table_or_subquery = 64, RULE_join_clause = 65, RULE_join_operator = 66, 
		RULE_join_constraint = 67, RULE_select_core = 68, RULE_compound_operator = 69, 
		RULE_cte_table_name = 70, RULE_signed_number = 71, RULE_literal_value = 72, 
		RULE_unary_operator = 73, RULE_error_message = 74, RULE_module_argument = 75, 
		RULE_column_alias = 76, RULE_string_rules = 77, RULE_char_rule = 78, RULE_callback_func = 79, 
		RULE_args = 80, RULE_create_Array = 81, RULE_prameters = 82, RULE_print_statment = 83, 
		RULE_indisde_the_print = 84, RULE_indisde_the_print_part1 = 85, RULE_indisde_the_print_part2 = 86, 
		RULE_call_function = 87, RULE_function_header = 88, RULE_creating_var = 89, 
		RULE_use_random_name = 90, RULE_if_else_rule = 91, RULE_while_rule = 92, 
		RULE_do_while = 93, RULE_function_body = 94, RULE_for_loop_rule = 95, 
		RULE_operand_of_arithematic_rule = 96, RULE_comparative_processes = 97, 
		RULE_arithematic_rule = 98, RULE_s = 99, RULE_function = 100, RULE_switch = 101, 
		RULE_defult = 102, RULE_case = 103, RULE_foreach = 104, RULE_increase_decrease = 105, 
		RULE_keyword = 106, RULE_unknown = 107, RULE_name = 108, RULE_function_name = 109, 
		RULE_database_name = 110, RULE_source_table_name = 111, RULE_table_name = 112, 
		RULE_table_or_index_name = 113, RULE_new_table_name = 114, RULE_column_name = 115, 
		RULE_collation_name = 116, RULE_foreign_table = 117, RULE_index_name = 118, 
		RULE_trigger_name = 119, RULE_view_name = 120, RULE_module_name = 121, 
		RULE_pragma_name = 122, RULE_savepoint_name = 123, RULE_table_alias = 124, 
		RULE_transaction_name = 125, RULE_json = 126, RULE_jsonObject = 127, RULE_keyValuePair = 128, 
		RULE_primitive = 129, RULE_bool = 130, RULE_string = 131, RULE_any_name = 132;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "error", "sql_stmt_list", "sql_stmt", "alter_table_stmt", "alter_table_add_constraint", 
			"alter_table_add", "analyze_stmt", "attach_stmt", "begin_stmt", "commit_stmt", 
			"compound_select_stmt", "create_index_stmt", "create_table_stmt", "create_trigger_stmt", 
			"create_view_stmt", "create_virtual_table_stmt", "delete_stmt", "delete_stmt_limited", 
			"detach_stmt", "drop_index_stmt", "drop_table_stmt", "drop_trigger_stmt", 
			"drop_view_stmt", "factored_select_stmt", "insert_stmt", "pragma_stmt", 
			"reindex_stmt", "release_stmt", "rollback_stmt", "savepoint_stmt", "simple_select_stmt", 
			"select_stmt", "select_or_values", "update_stmt", "update_stmt_limited", 
			"vacuum_stmt", "column_def", "type_name", "column_constraint", "column_constraint_primary_key", 
			"column_constraint_foreign_key", "column_constraint_not_null", "column_constraint_null", 
			"column_default", "column_default_value", "conflict_clause", "expr", 
			"foreign_key_clause", "fk_target_column_name", "raise_function", "indexed_column", 
			"table_constraint", "table_constraint_primary_key", "table_constraint_foreign_key", 
			"table_constraint_unique", "table_constraint_key", "fk_origin_column_name", 
			"with_clause", "qualified_table_name", "ordering_term", "pragma_value", 
			"common_table_expression", "result_column", "table_or_subquery", "join_clause", 
			"join_operator", "join_constraint", "select_core", "compound_operator", 
			"cte_table_name", "signed_number", "literal_value", "unary_operator", 
			"error_message", "module_argument", "column_alias", "string_rules", "char_rule", 
			"callback_func", "args", "create_Array", "prameters", "print_statment", 
			"indisde_the_print", "indisde_the_print_part1", "indisde_the_print_part2", 
			"call_function", "function_header", "creating_var", "use_random_name", 
			"if_else_rule", "while_rule", "do_while", "function_body", "for_loop_rule", 
			"operand_of_arithematic_rule", "comparative_processes", "arithematic_rule", 
			"s", "function", "switch", "defult", "case", "foreach", "increase_decrease", 
			"keyword", "unknown", "name", "function_name", "database_name", "source_table_name", 
			"table_name", "table_or_index_name", "new_table_name", "column_name", 
			"collation_name", "foreign_table", "index_name", "trigger_name", "view_name", 
			"module_name", "pragma_name", "savepoint_name", "table_alias", "transaction_name", 
			"json", "jsonObject", "keyValuePair", "primitive", "bool", "string", 
			"any_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'::'", "'&&'", "'!'", "'{'", "'}'", "'[]'", "':'", "'++'", "'--'", 
			"'true'", "'false'", "'\"'", "';'", "'.'", "'('", "')'", "'['", "']'", 
			"','", "'='", "'*'", "'+'", "'-'", "'~'", "'||'", "'/'", "'%'", "'<<'", 
			"'>>'", "'&'", "'|'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'<>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"DOUBEL", "SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "OPEN_SQER_BAR", "CLOSE_SQER_PAR", 
			"COMMA", "ASSIGN", "STAR", "PLUS", "MINUS", "TILDE", "PIPE2", "DIV", 
			"MOD", "LT2", "GT2", "AMP", "PIPE", "LT", "LT_EQ", "GT", "GT_EQ", "EQ", 
			"NOT_EQ1", "NOT_EQ2", "K_ABORT", "K_ACTION", "K_ADD", "K_AFTER", "K_ALL", 
			"K_ALTER", "K_ANALYZE", "K_AND", "K_AS", "K_ASC", "K_ATTACH", "K_AUTOINCREMENT", 
			"K_BEFORE", "K_BEGIN", "K_BETWEEN", "K_BY", "K_CASCADE", "K_CASE", "K_CAST", 
			"K_CHECK", "K_COLLATE", "K_COLUMN", "K_COMMIT", "K_CONFLICT", "K_CONSTRAINT", 
			"K_CREATE", "K_CROSS", "K_CURRENT_DATE", "K_CURRENT_TIME", "K_CURRENT_TIMESTAMP", 
			"K_DATABASE", "K_DEFAULT", "K_DEFERRABLE", "K_DEFERRED", "K_DELETE", 
			"K_DESC", "K_DETACH", "K_DISTINCT", "K_DROP", "K_EACH", "K_ELSE", "K_END", 
			"K_ENABLE", "K_ESCAPE", "K_EXCEPT", "K_EXCLUSIVE", "K_EXISTS", "K_EXPLAIN", 
			"K_FAIL", "K_FOR", "K_FOREIGN", "K_FROM", "K_FULL", "K_GLOB", "K_GROUP", 
			"K_HAVING", "K_IF", "K_IGNORE", "K_IMMEDIATE", "K_IN", "K_INDEX", "K_INDEXED", 
			"K_INITIALLY", "K_INNER", "K_INSERT", "K_INSTEAD", "K_INTERSECT", "K_INTO", 
			"K_IS", "K_ISNULL", "K_JOIN", "K_KEY", "K_LEFT", "K_LIKE", "K_LIMIT", 
			"K_MATCH", "K_NATURAL", "K_NEXTVAL", "K_NO", "K_NOT", "K_NOTNULL", "K_NULL", 
			"K_OF", "K_OFFSET", "K_ON", "K_ONLY", "K_OR", "K_ORDER", "K_OUTER", "K_PLAN", 
			"K_PRAGMA", "K_PRIMARY", "K_QUERY", "K_RAISE", "K_RECURSIVE", "K_REFERENCES", 
			"K_REGEXP", "K_REINDEX", "K_RELEASE", "K_RENAME", "K_REPLACE", "K_RESTRICT", 
			"K_RIGHT", "K_ROLLBACK", "K_ROW", "K_SAVEPOINT", "K_SELECT", "K_SET", 
			"K_TABLE", "K_TEMP", "K_TEMPORARY", "K_THEN", "K_TO", "K_TRANSACTION", 
			"K_TRIGGER", "K_UNION", "K_UNIQUE", "K_UPDATE", "K_USING", "K_VACUUM", 
			"K_VALUES", "K_VIEW", "K_VIRTUAL", "K_WHEN", "K_WHERE", "K_WITH", "K_WITHOUT", 
			"K_WILE", "K_DO", "K_RETURN", "K_FOREACH", "K_VAR", "K_PRINT", "K_SWITCH", 
			"K_BRECK", "ONE_CHAR_LETTER", "STRING_LITERAL", "IDENTIFIER", "RANDOM_NAME", 
			"NUMERIC_LITERAL", "BIND_PARAMETER", "BLOB_LITERAL", "SINGLE_LINE_COMMENT", 
			"MULTILINE_COMMENT", "SPACES", "UNEXPECTED_CHAR", "ANY_THING", "DIGIT", 
			"SINGLE_STRING"
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
	public String getGrammarFileName() { return "Sql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SqlParser.EOF, 0); }
		public List<Sql_stmt_listContext> sql_stmt_list() {
			return getRuleContexts(Sql_stmt_listContext.class);
		}
		public Sql_stmt_listContext sql_stmt_list(int i) {
			return getRuleContext(Sql_stmt_listContext.class,i);
		}
		public List<ErrorContext> error() {
			return getRuleContexts(ErrorContext.class);
		}
		public ErrorContext error(int i) {
			return getRuleContext(ErrorContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCOL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_ATTACH) | (1L << K_BEGIN) | (1L << K_COMMIT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_CREATE - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DROP - 64)) | (1L << (K_END - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_INSERT - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (K_PRAGMA - 129)) | (1L << (K_REINDEX - 129)) | (1L << (K_RELEASE - 129)) | (1L << (K_REPLACE - 129)) | (1L << (K_ROLLBACK - 129)) | (1L << (K_SAVEPOINT - 129)) | (1L << (K_SELECT - 129)) | (1L << (K_UPDATE - 129)) | (1L << (K_VACUUM - 129)) | (1L << (K_VALUES - 129)) | (1L << (K_WITH - 129)) | (1L << (UNEXPECTED_CHAR - 129)))) != 0)) {
				{
				setState(268);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SCOL:
				case K_ALTER:
				case K_ANALYZE:
				case K_ATTACH:
				case K_BEGIN:
				case K_COMMIT:
				case K_CREATE:
				case K_DELETE:
				case K_DETACH:
				case K_DROP:
				case K_END:
				case K_EXPLAIN:
				case K_INSERT:
				case K_PRAGMA:
				case K_REINDEX:
				case K_RELEASE:
				case K_REPLACE:
				case K_ROLLBACK:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_UPDATE:
				case K_VACUUM:
				case K_VALUES:
				case K_WITH:
					{
					setState(266);
					sql_stmt_list();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(267);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(273);
			match(EOF);
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

	public static class ErrorContext extends ParserRuleContext {
		public Token UNEXPECTED_CHAR;
		public TerminalNode UNEXPECTED_CHAR() { return getToken(SqlParser.UNEXPECTED_CHAR, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			((ErrorContext)_localctx).UNEXPECTED_CHAR = match(UNEXPECTED_CHAR);

			     throw new RuntimeException("UNEXPECTED_CHAR=" + (((ErrorContext)_localctx).UNEXPECTED_CHAR!=null?((ErrorContext)_localctx).UNEXPECTED_CHAR.getText():null));
			   
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

	public static class Sql_stmt_listContext extends ParserRuleContext {
		public List<Sql_stmtContext> sql_stmt() {
			return getRuleContexts(Sql_stmtContext.class);
		}
		public Sql_stmtContext sql_stmt(int i) {
			return getRuleContext(Sql_stmtContext.class,i);
		}
		public List<TerminalNode> SCOL() { return getTokens(SqlParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SqlParser.SCOL, i);
		}
		public Sql_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSql_stmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSql_stmt_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSql_stmt_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmt_listContext sql_stmt_list() throws RecognitionException {
		Sql_stmt_listContext _localctx = new Sql_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sql_stmt_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(278);
				match(SCOL);
				}
				}
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(284);
			sql_stmt();
			setState(293);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(286); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(285);
						match(SCOL);
						}
						}
						setState(288); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(290);
					sql_stmt();
					}
					} 
				}
				setState(295);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(299);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(296);
					match(SCOL);
					}
					} 
				}
				setState(301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class Sql_stmtContext extends ParserRuleContext {
		public Alter_table_stmtContext alter_table_stmt() {
			return getRuleContext(Alter_table_stmtContext.class,0);
		}
		public Analyze_stmtContext analyze_stmt() {
			return getRuleContext(Analyze_stmtContext.class,0);
		}
		public Attach_stmtContext attach_stmt() {
			return getRuleContext(Attach_stmtContext.class,0);
		}
		public Begin_stmtContext begin_stmt() {
			return getRuleContext(Begin_stmtContext.class,0);
		}
		public Commit_stmtContext commit_stmt() {
			return getRuleContext(Commit_stmtContext.class,0);
		}
		public Compound_select_stmtContext compound_select_stmt() {
			return getRuleContext(Compound_select_stmtContext.class,0);
		}
		public Create_index_stmtContext create_index_stmt() {
			return getRuleContext(Create_index_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Create_trigger_stmtContext create_trigger_stmt() {
			return getRuleContext(Create_trigger_stmtContext.class,0);
		}
		public Create_view_stmtContext create_view_stmt() {
			return getRuleContext(Create_view_stmtContext.class,0);
		}
		public Create_virtual_table_stmtContext create_virtual_table_stmt() {
			return getRuleContext(Create_virtual_table_stmtContext.class,0);
		}
		public Delete_stmtContext delete_stmt() {
			return getRuleContext(Delete_stmtContext.class,0);
		}
		public Delete_stmt_limitedContext delete_stmt_limited() {
			return getRuleContext(Delete_stmt_limitedContext.class,0);
		}
		public Detach_stmtContext detach_stmt() {
			return getRuleContext(Detach_stmtContext.class,0);
		}
		public Drop_index_stmtContext drop_index_stmt() {
			return getRuleContext(Drop_index_stmtContext.class,0);
		}
		public Drop_table_stmtContext drop_table_stmt() {
			return getRuleContext(Drop_table_stmtContext.class,0);
		}
		public Drop_trigger_stmtContext drop_trigger_stmt() {
			return getRuleContext(Drop_trigger_stmtContext.class,0);
		}
		public Drop_view_stmtContext drop_view_stmt() {
			return getRuleContext(Drop_view_stmtContext.class,0);
		}
		public Factored_select_stmtContext factored_select_stmt() {
			return getRuleContext(Factored_select_stmtContext.class,0);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Pragma_stmtContext pragma_stmt() {
			return getRuleContext(Pragma_stmtContext.class,0);
		}
		public Reindex_stmtContext reindex_stmt() {
			return getRuleContext(Reindex_stmtContext.class,0);
		}
		public Release_stmtContext release_stmt() {
			return getRuleContext(Release_stmtContext.class,0);
		}
		public Rollback_stmtContext rollback_stmt() {
			return getRuleContext(Rollback_stmtContext.class,0);
		}
		public Savepoint_stmtContext savepoint_stmt() {
			return getRuleContext(Savepoint_stmtContext.class,0);
		}
		public Simple_select_stmtContext simple_select_stmt() {
			return getRuleContext(Simple_select_stmtContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Update_stmtContext update_stmt() {
			return getRuleContext(Update_stmtContext.class,0);
		}
		public Update_stmt_limitedContext update_stmt_limited() {
			return getRuleContext(Update_stmt_limitedContext.class,0);
		}
		public Vacuum_stmtContext vacuum_stmt() {
			return getRuleContext(Vacuum_stmtContext.class,0);
		}
		public TerminalNode K_EXPLAIN() { return getToken(SqlParser.K_EXPLAIN, 0); }
		public TerminalNode K_QUERY() { return getToken(SqlParser.K_QUERY, 0); }
		public TerminalNode K_PLAN() { return getToken(SqlParser.K_PLAN, 0); }
		public Sql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSql_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmtContext sql_stmt() throws RecognitionException {
		Sql_stmtContext _localctx = new Sql_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sql_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_EXPLAIN) {
				{
				setState(302);
				match(K_EXPLAIN);
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_QUERY) {
					{
					setState(303);
					match(K_QUERY);
					setState(304);
					match(K_PLAN);
					}
				}

				}
			}

			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(309);
				alter_table_stmt();
				}
				break;
			case 2:
				{
				setState(310);
				analyze_stmt();
				}
				break;
			case 3:
				{
				setState(311);
				attach_stmt();
				}
				break;
			case 4:
				{
				setState(312);
				begin_stmt();
				}
				break;
			case 5:
				{
				setState(313);
				commit_stmt();
				}
				break;
			case 6:
				{
				setState(314);
				compound_select_stmt();
				}
				break;
			case 7:
				{
				setState(315);
				create_index_stmt();
				}
				break;
			case 8:
				{
				setState(316);
				create_table_stmt();
				}
				break;
			case 9:
				{
				setState(317);
				create_trigger_stmt();
				}
				break;
			case 10:
				{
				setState(318);
				create_view_stmt();
				}
				break;
			case 11:
				{
				setState(319);
				create_virtual_table_stmt();
				}
				break;
			case 12:
				{
				setState(320);
				delete_stmt();
				}
				break;
			case 13:
				{
				setState(321);
				delete_stmt_limited();
				}
				break;
			case 14:
				{
				setState(322);
				detach_stmt();
				}
				break;
			case 15:
				{
				setState(323);
				drop_index_stmt();
				}
				break;
			case 16:
				{
				setState(324);
				drop_table_stmt();
				}
				break;
			case 17:
				{
				setState(325);
				drop_trigger_stmt();
				}
				break;
			case 18:
				{
				setState(326);
				drop_view_stmt();
				}
				break;
			case 19:
				{
				setState(327);
				factored_select_stmt();
				}
				break;
			case 20:
				{
				setState(328);
				insert_stmt();
				}
				break;
			case 21:
				{
				setState(329);
				pragma_stmt();
				}
				break;
			case 22:
				{
				setState(330);
				reindex_stmt();
				}
				break;
			case 23:
				{
				setState(331);
				release_stmt();
				}
				break;
			case 24:
				{
				setState(332);
				rollback_stmt();
				}
				break;
			case 25:
				{
				setState(333);
				savepoint_stmt();
				}
				break;
			case 26:
				{
				setState(334);
				simple_select_stmt();
				}
				break;
			case 27:
				{
				setState(335);
				select_stmt();
				}
				break;
			case 28:
				{
				setState(336);
				update_stmt();
				}
				break;
			case 29:
				{
				setState(337);
				update_stmt_limited();
				}
				break;
			case 30:
				{
				setState(338);
				vacuum_stmt();
				}
				break;
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

	public static class Alter_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_ALTER() { return getToken(SqlParser.K_ALTER, 0); }
		public TerminalNode K_TABLE() { return getToken(SqlParser.K_TABLE, 0); }
		public Source_table_nameContext source_table_name() {
			return getRuleContext(Source_table_nameContext.class,0);
		}
		public TerminalNode K_RENAME() { return getToken(SqlParser.K_RENAME, 0); }
		public TerminalNode K_TO() { return getToken(SqlParser.K_TO, 0); }
		public New_table_nameContext new_table_name() {
			return getRuleContext(New_table_nameContext.class,0);
		}
		public Alter_table_addContext alter_table_add() {
			return getRuleContext(Alter_table_addContext.class,0);
		}
		public Alter_table_add_constraintContext alter_table_add_constraint() {
			return getRuleContext(Alter_table_add_constraintContext.class,0);
		}
		public TerminalNode K_ADD() { return getToken(SqlParser.K_ADD, 0); }
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public TerminalNode K_ONLY() { return getToken(SqlParser.K_ONLY, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public TerminalNode K_ENABLE() { return getToken(SqlParser.K_ENABLE, 0); }
		public UnknownContext unknown() {
			return getRuleContext(UnknownContext.class,0);
		}
		public TerminalNode K_COLUMN() { return getToken(SqlParser.K_COLUMN, 0); }
		public Alter_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAlter_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAlter_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAlter_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_stmtContext alter_table_stmt() throws RecognitionException {
		Alter_table_stmtContext _localctx = new Alter_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_alter_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(K_ALTER);
			setState(342);
			match(K_TABLE);
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ONLY) {
				{
				setState(343);
				match(K_ONLY);
				}
			}

			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(346);
				database_name();
				setState(347);
				match(DOT);
				}
				break;
			}
			setState(351);
			source_table_name();
			setState(362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(352);
				match(K_RENAME);
				setState(353);
				match(K_TO);
				setState(354);
				new_table_name();
				}
				break;
			case 2:
				{
				setState(355);
				alter_table_add();
				}
				break;
			case 3:
				{
				setState(356);
				alter_table_add_constraint();
				}
				break;
			case 4:
				{
				setState(357);
				match(K_ADD);
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_COLUMN) {
					{
					setState(358);
					match(K_COLUMN);
					}
				}

				setState(361);
				column_def();
				}
				break;
			}
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(364);
				match(K_ENABLE);
				}
				break;
			}
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(367);
				unknown();
				}
				break;
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

	public static class Alter_table_add_constraintContext extends ParserRuleContext {
		public TerminalNode K_ADD() { return getToken(SqlParser.K_ADD, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(SqlParser.K_CONSTRAINT, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_constraintContext table_constraint() {
			return getRuleContext(Table_constraintContext.class,0);
		}
		public Alter_table_add_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_add_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAlter_table_add_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAlter_table_add_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAlter_table_add_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_add_constraintContext alter_table_add_constraint() throws RecognitionException {
		Alter_table_add_constraintContext _localctx = new Alter_table_add_constraintContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_alter_table_add_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(K_ADD);
			setState(371);
			match(K_CONSTRAINT);
			setState(372);
			any_name();
			setState(373);
			table_constraint();
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

	public static class Alter_table_addContext extends ParserRuleContext {
		public TerminalNode K_ADD() { return getToken(SqlParser.K_ADD, 0); }
		public Table_constraintContext table_constraint() {
			return getRuleContext(Table_constraintContext.class,0);
		}
		public Alter_table_addContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAlter_table_add(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAlter_table_add(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAlter_table_add(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_addContext alter_table_add() throws RecognitionException {
		Alter_table_addContext _localctx = new Alter_table_addContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_alter_table_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(K_ADD);
			setState(376);
			table_constraint();
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

	public static class Analyze_stmtContext extends ParserRuleContext {
		public TerminalNode K_ANALYZE() { return getToken(SqlParser.K_ANALYZE, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Table_or_index_nameContext table_or_index_name() {
			return getRuleContext(Table_or_index_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public Analyze_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_analyze_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAnalyze_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAnalyze_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAnalyze_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Analyze_stmtContext analyze_stmt() throws RecognitionException {
		Analyze_stmtContext _localctx = new Analyze_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_analyze_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(K_ANALYZE);
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(379);
				database_name();
				}
				break;
			case 2:
				{
				setState(380);
				table_or_index_name();
				}
				break;
			case 3:
				{
				setState(381);
				database_name();
				setState(382);
				match(DOT);
				setState(383);
				table_or_index_name();
				}
				break;
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

	public static class Attach_stmtContext extends ParserRuleContext {
		public TerminalNode K_ATTACH() { return getToken(SqlParser.K_ATTACH, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SqlParser.K_AS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_DATABASE() { return getToken(SqlParser.K_DATABASE, 0); }
		public Attach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attach_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAttach_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAttach_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAttach_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attach_stmtContext attach_stmt() throws RecognitionException {
		Attach_stmtContext _localctx = new Attach_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_attach_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(K_ATTACH);
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_DATABASE) {
				{
				setState(388);
				match(K_DATABASE);
				}
			}

			setState(391);
			expr(0);
			setState(392);
			match(K_AS);
			setState(393);
			database_name();
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

	public static class Begin_stmtContext extends ParserRuleContext {
		public TerminalNode K_BEGIN() { return getToken(SqlParser.K_BEGIN, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SqlParser.K_TRANSACTION, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SqlParser.K_DEFERRED, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SqlParser.K_IMMEDIATE, 0); }
		public TerminalNode K_EXCLUSIVE() { return getToken(SqlParser.K_EXCLUSIVE, 0); }
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public Begin_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterBegin_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitBegin_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitBegin_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Begin_stmtContext begin_stmt() throws RecognitionException {
		Begin_stmtContext _localctx = new Begin_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_begin_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(K_BEGIN);
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (K_DEFERRED - 72)) | (1L << (K_EXCLUSIVE - 72)) | (1L << (K_IMMEDIATE - 72)))) != 0)) {
				{
				setState(396);
				_la = _input.LA(1);
				if ( !(((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (K_DEFERRED - 72)) | (1L << (K_EXCLUSIVE - 72)) | (1L << (K_IMMEDIATE - 72)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(399);
				match(K_TRANSACTION);
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 175)) & ~0x3f) == 0 && ((1L << (_la - 175)) & ((1L << (STRING_LITERAL - 175)) | (1L << (IDENTIFIER - 175)) | (1L << (RANDOM_NAME - 175)))) != 0)) {
					{
					setState(400);
					transaction_name();
					}
				}

				}
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

	public static class Commit_stmtContext extends ParserRuleContext {
		public TerminalNode K_COMMIT() { return getToken(SqlParser.K_COMMIT, 0); }
		public TerminalNode K_END() { return getToken(SqlParser.K_END, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SqlParser.K_TRANSACTION, 0); }
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public Commit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCommit_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCommit_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCommit_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Commit_stmtContext commit_stmt() throws RecognitionException {
		Commit_stmtContext _localctx = new Commit_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_commit_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			_la = _input.LA(1);
			if ( !(_la==K_COMMIT || _la==K_END) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(406);
				match(K_TRANSACTION);
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 175)) & ~0x3f) == 0 && ((1L << (_la - 175)) & ((1L << (STRING_LITERAL - 175)) | (1L << (IDENTIFIER - 175)) | (1L << (RANDOM_NAME - 175)))) != 0)) {
					{
					setState(407);
					transaction_name();
					}
				}

				}
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

	public static class Compound_select_stmtContext extends ParserRuleContext {
		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}
		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(SqlParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(SqlParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SqlParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> K_UNION() { return getTokens(SqlParser.K_UNION); }
		public TerminalNode K_UNION(int i) {
			return getToken(SqlParser.K_UNION, i);
		}
		public List<TerminalNode> K_INTERSECT() { return getTokens(SqlParser.K_INTERSECT); }
		public TerminalNode K_INTERSECT(int i) {
			return getToken(SqlParser.K_INTERSECT, i);
		}
		public List<TerminalNode> K_EXCEPT() { return getTokens(SqlParser.K_EXCEPT); }
		public TerminalNode K_EXCEPT(int i) {
			return getToken(SqlParser.K_EXCEPT, i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SqlParser.K_RECURSIVE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SqlParser.K_OFFSET, 0); }
		public List<TerminalNode> K_ALL() { return getTokens(SqlParser.K_ALL); }
		public TerminalNode K_ALL(int i) {
			return getToken(SqlParser.K_ALL, i);
		}
		public Compound_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCompound_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCompound_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCompound_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_select_stmtContext compound_select_stmt() throws RecognitionException {
		Compound_select_stmtContext _localctx = new Compound_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_compound_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(412);
				match(K_WITH);
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_RECURSIVE) {
					{
					setState(413);
					match(K_RECURSIVE);
					}
				}

				setState(416);
				common_table_expression();
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(417);
					match(COMMA);
					setState(418);
					common_table_expression();
					}
					}
					setState(423);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(426);
			select_core();
			setState(436); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(433);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_UNION:
					{
					setState(427);
					match(K_UNION);
					setState(429);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_ALL) {
						{
						setState(428);
						match(K_ALL);
						}
					}

					}
					break;
				case K_INTERSECT:
					{
					setState(431);
					match(K_INTERSECT);
					}
					break;
				case K_EXCEPT:
					{
					setState(432);
					match(K_EXCEPT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(435);
				select_core();
				}
				}
				setState(438); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION );
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(440);
				match(K_ORDER);
				setState(441);
				match(K_BY);
				setState(442);
				ordering_term();
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(443);
					match(COMMA);
					setState(444);
					ordering_term();
					}
					}
					setState(449);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(452);
				match(K_LIMIT);
				setState(453);
				expr(0);
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(454);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(455);
					expr(0);
					}
				}

				}
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

	public static class Create_index_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SqlParser.K_CREATE, 0); }
		public TerminalNode K_INDEX() { return getToken(SqlParser.K_INDEX, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_ON() { return getToken(SqlParser.K_ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SqlParser.K_UNIQUE, 0); }
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Create_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCreate_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCreate_index_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCreate_index_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_index_stmtContext create_index_stmt() throws RecognitionException {
		Create_index_stmtContext _localctx = new Create_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(K_CREATE);
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_UNIQUE) {
				{
				setState(461);
				match(K_UNIQUE);
				}
			}

			setState(464);
			match(K_INDEX);
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(465);
				match(K_IF);
				setState(466);
				match(K_NOT);
				setState(467);
				match(K_EXISTS);
				}
			}

			setState(473);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(470);
				database_name();
				setState(471);
				match(DOT);
				}
				break;
			}
			setState(475);
			index_name();
			setState(476);
			match(K_ON);
			setState(477);
			table_name();
			setState(478);
			match(OPEN_PAR);
			setState(479);
			indexed_column();
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(480);
				match(COMMA);
				setState(481);
				indexed_column();
				}
				}
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(487);
			match(CLOSE_PAR);
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(488);
				match(K_WHERE);
				setState(489);
				expr(0);
				}
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

	public static class Create_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SqlParser.K_CREATE, 0); }
		public TerminalNode K_TABLE() { return getToken(SqlParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode K_AS() { return getToken(SqlParser.K_AS, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public UnknownContext unknown() {
			return getRuleContext(UnknownContext.class,0);
		}
		public TerminalNode K_TEMP() { return getToken(SqlParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SqlParser.K_TEMPORARY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public List<Table_constraintContext> table_constraint() {
			return getRuleContexts(Table_constraintContext.class);
		}
		public Table_constraintContext table_constraint(int i) {
			return getRuleContext(Table_constraintContext.class,i);
		}
		public TerminalNode K_WITHOUT() { return getToken(SqlParser.K_WITHOUT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCreate_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCreate_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCreate_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_create_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(K_CREATE);
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(493);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(496);
			match(K_TABLE);
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(497);
				match(K_IF);
				setState(498);
				match(K_NOT);
				setState(499);
				match(K_EXISTS);
				}
			}

			setState(505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(502);
				database_name();
				setState(503);
				match(DOT);
				}
				break;
			}
			setState(507);
			table_name();
			setState(526);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(508);
				match(OPEN_PAR);
				setState(509);
				column_def();
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					setState(514);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						setState(510);
						match(COMMA);
						setState(511);
						table_constraint();
						}
						break;
					case 2:
						{
						setState(512);
						match(COMMA);
						setState(513);
						column_def();
						}
						break;
					}
					}
					setState(518);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(519);
				match(CLOSE_PAR);
				setState(522);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(520);
					match(K_WITHOUT);
					setState(521);
					match(IDENTIFIER);
					}
					break;
				}
				}
				break;
			case K_AS:
				{
				setState(524);
				match(K_AS);
				setState(525);
				select_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(528);
				unknown();
				}
				break;
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

	public static class Create_trigger_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SqlParser.K_CREATE, 0); }
		public TerminalNode K_TRIGGER() { return getToken(SqlParser.K_TRIGGER, 0); }
		public Trigger_nameContext trigger_name() {
			return getRuleContext(Trigger_nameContext.class,0);
		}
		public TerminalNode K_ON() { return getToken(SqlParser.K_ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_BEGIN() { return getToken(SqlParser.K_BEGIN, 0); }
		public TerminalNode K_END() { return getToken(SqlParser.K_END, 0); }
		public TerminalNode K_DELETE() { return getToken(SqlParser.K_DELETE, 0); }
		public TerminalNode K_INSERT() { return getToken(SqlParser.K_INSERT, 0); }
		public TerminalNode K_UPDATE() { return getToken(SqlParser.K_UPDATE, 0); }
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public List<Database_nameContext> database_name() {
			return getRuleContexts(Database_nameContext.class);
		}
		public Database_nameContext database_name(int i) {
			return getRuleContext(Database_nameContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SqlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SqlParser.DOT, i);
		}
		public TerminalNode K_BEFORE() { return getToken(SqlParser.K_BEFORE, 0); }
		public TerminalNode K_AFTER() { return getToken(SqlParser.K_AFTER, 0); }
		public TerminalNode K_INSTEAD() { return getToken(SqlParser.K_INSTEAD, 0); }
		public List<TerminalNode> K_OF() { return getTokens(SqlParser.K_OF); }
		public TerminalNode K_OF(int i) {
			return getToken(SqlParser.K_OF, i);
		}
		public TerminalNode K_FOR() { return getToken(SqlParser.K_FOR, 0); }
		public TerminalNode K_EACH() { return getToken(SqlParser.K_EACH, 0); }
		public TerminalNode K_ROW() { return getToken(SqlParser.K_ROW, 0); }
		public TerminalNode K_WHEN() { return getToken(SqlParser.K_WHEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> SCOL() { return getTokens(SqlParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SqlParser.SCOL, i);
		}
		public TerminalNode K_TEMP() { return getToken(SqlParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SqlParser.K_TEMPORARY, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<Update_stmtContext> update_stmt() {
			return getRuleContexts(Update_stmtContext.class);
		}
		public Update_stmtContext update_stmt(int i) {
			return getRuleContext(Update_stmtContext.class,i);
		}
		public List<Insert_stmtContext> insert_stmt() {
			return getRuleContexts(Insert_stmtContext.class);
		}
		public Insert_stmtContext insert_stmt(int i) {
			return getRuleContext(Insert_stmtContext.class,i);
		}
		public List<Delete_stmtContext> delete_stmt() {
			return getRuleContexts(Delete_stmtContext.class);
		}
		public Delete_stmtContext delete_stmt(int i) {
			return getRuleContext(Delete_stmtContext.class,i);
		}
		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}
		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Create_trigger_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_trigger_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCreate_trigger_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCreate_trigger_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCreate_trigger_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_trigger_stmtContext create_trigger_stmt() throws RecognitionException {
		Create_trigger_stmtContext _localctx = new Create_trigger_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_create_trigger_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			match(K_CREATE);
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(532);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(535);
			match(K_TRIGGER);
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(536);
				match(K_IF);
				setState(537);
				match(K_NOT);
				setState(538);
				match(K_EXISTS);
				}
			}

			setState(544);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(541);
				database_name();
				setState(542);
				match(DOT);
				}
				break;
			}
			setState(546);
			trigger_name();
			setState(551);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_BEFORE:
				{
				setState(547);
				match(K_BEFORE);
				}
				break;
			case K_AFTER:
				{
				setState(548);
				match(K_AFTER);
				}
				break;
			case K_INSTEAD:
				{
				setState(549);
				match(K_INSTEAD);
				setState(550);
				match(K_OF);
				}
				break;
			case K_DELETE:
			case K_INSERT:
			case K_UPDATE:
				break;
			default:
				break;
			}
			setState(567);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_DELETE:
				{
				setState(553);
				match(K_DELETE);
				}
				break;
			case K_INSERT:
				{
				setState(554);
				match(K_INSERT);
				}
				break;
			case K_UPDATE:
				{
				setState(555);
				match(K_UPDATE);
				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_OF) {
					{
					setState(556);
					match(K_OF);
					setState(557);
					column_name();
					setState(562);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(558);
						match(COMMA);
						setState(559);
						column_name();
						}
						}
						setState(564);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(569);
			match(K_ON);
			setState(573);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(570);
				database_name();
				setState(571);
				match(DOT);
				}
				break;
			}
			setState(575);
			table_name();
			setState(579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FOR) {
				{
				setState(576);
				match(K_FOR);
				setState(577);
				match(K_EACH);
				setState(578);
				match(K_ROW);
				}
			}

			setState(583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHEN) {
				{
				setState(581);
				match(K_WHEN);
				setState(582);
				expr(0);
				}
			}

			setState(585);
			match(K_BEGIN);
			setState(594); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(590);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(586);
					update_stmt();
					}
					break;
				case 2:
					{
					setState(587);
					insert_stmt();
					}
					break;
				case 3:
					{
					setState(588);
					delete_stmt();
					}
					break;
				case 4:
					{
					setState(589);
					select_stmt();
					}
					break;
				}
				setState(592);
				match(SCOL);
				}
				}
				setState(596); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_DELETE || _la==K_INSERT || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (K_REPLACE - 139)) | (1L << (K_SELECT - 139)) | (1L << (K_UPDATE - 139)) | (1L << (K_VALUES - 139)) | (1L << (K_WITH - 139)))) != 0) );
			setState(598);
			match(K_END);
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

	public static class Create_view_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SqlParser.K_CREATE, 0); }
		public TerminalNode K_VIEW() { return getToken(SqlParser.K_VIEW, 0); }
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SqlParser.K_AS, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public TerminalNode K_TEMP() { return getToken(SqlParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SqlParser.K_TEMPORARY, 0); }
		public Create_view_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_view_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCreate_view_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCreate_view_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCreate_view_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_view_stmtContext create_view_stmt() throws RecognitionException {
		Create_view_stmtContext _localctx = new Create_view_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_create_view_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			match(K_CREATE);
			setState(602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(601);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(604);
			match(K_VIEW);
			setState(608);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(605);
				match(K_IF);
				setState(606);
				match(K_NOT);
				setState(607);
				match(K_EXISTS);
				}
			}

			setState(613);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(610);
				database_name();
				setState(611);
				match(DOT);
				}
				break;
			}
			setState(615);
			view_name();
			setState(616);
			match(K_AS);
			setState(617);
			select_stmt();
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

	public static class Create_virtual_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SqlParser.K_CREATE, 0); }
		public TerminalNode K_VIRTUAL() { return getToken(SqlParser.K_VIRTUAL, 0); }
		public TerminalNode K_TABLE() { return getToken(SqlParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_USING() { return getToken(SqlParser.K_USING, 0); }
		public Module_nameContext module_name() {
			return getRuleContext(Module_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Module_argumentContext> module_argument() {
			return getRuleContexts(Module_argumentContext.class);
		}
		public Module_argumentContext module_argument(int i) {
			return getRuleContext(Module_argumentContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Create_virtual_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_virtual_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCreate_virtual_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCreate_virtual_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCreate_virtual_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_virtual_table_stmtContext create_virtual_table_stmt() throws RecognitionException {
		Create_virtual_table_stmtContext _localctx = new Create_virtual_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_create_virtual_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			match(K_CREATE);
			setState(620);
			match(K_VIRTUAL);
			setState(621);
			match(K_TABLE);
			setState(625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(622);
				match(K_IF);
				setState(623);
				match(K_NOT);
				setState(624);
				match(K_EXISTS);
				}
			}

			setState(630);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(627);
				database_name();
				setState(628);
				match(DOT);
				}
				break;
			}
			setState(632);
			table_name();
			setState(633);
			match(K_USING);
			setState(634);
			module_name();
			setState(646);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(635);
				match(OPEN_PAR);
				setState(636);
				module_argument();
				setState(641);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(637);
					match(COMMA);
					setState(638);
					module_argument();
					}
					}
					setState(643);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(644);
				match(CLOSE_PAR);
				}
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

	public static class Delete_stmtContext extends ParserRuleContext {
		public TerminalNode K_DELETE() { return getToken(SqlParser.K_DELETE, 0); }
		public TerminalNode K_FROM() { return getToken(SqlParser.K_FROM, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Delete_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDelete_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDelete_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDelete_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmtContext delete_stmt() throws RecognitionException {
		Delete_stmtContext _localctx = new Delete_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_delete_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(648);
				with_clause();
				}
			}

			setState(651);
			match(K_DELETE);
			setState(652);
			match(K_FROM);
			setState(653);
			qualified_table_name();
			setState(656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(654);
				match(K_WHERE);
				setState(655);
				expr(0);
				}
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

	public static class Delete_stmt_limitedContext extends ParserRuleContext {
		public TerminalNode K_DELETE() { return getToken(SqlParser.K_DELETE, 0); }
		public TerminalNode K_FROM() { return getToken(SqlParser.K_FROM, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SqlParser.K_LIMIT, 0); }
		public TerminalNode K_ORDER() { return getToken(SqlParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_OFFSET() { return getToken(SqlParser.K_OFFSET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Delete_stmt_limitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt_limited; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDelete_stmt_limited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDelete_stmt_limited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDelete_stmt_limited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmt_limitedContext delete_stmt_limited() throws RecognitionException {
		Delete_stmt_limitedContext _localctx = new Delete_stmt_limitedContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_delete_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(658);
				with_clause();
				}
			}

			setState(661);
			match(K_DELETE);
			setState(662);
			match(K_FROM);
			setState(663);
			qualified_table_name();
			setState(666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(664);
				match(K_WHERE);
				setState(665);
				expr(0);
				}
			}

			setState(686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(678);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(668);
					match(K_ORDER);
					setState(669);
					match(K_BY);
					setState(670);
					ordering_term();
					setState(675);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(671);
						match(COMMA);
						setState(672);
						ordering_term();
						}
						}
						setState(677);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(680);
				match(K_LIMIT);
				setState(681);
				expr(0);
				setState(684);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(682);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(683);
					expr(0);
					}
				}

				}
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

	public static class Detach_stmtContext extends ParserRuleContext {
		public TerminalNode K_DETACH() { return getToken(SqlParser.K_DETACH, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_DATABASE() { return getToken(SqlParser.K_DATABASE, 0); }
		public Detach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_detach_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDetach_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDetach_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDetach_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Detach_stmtContext detach_stmt() throws RecognitionException {
		Detach_stmtContext _localctx = new Detach_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_detach_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			match(K_DETACH);
			setState(690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_DATABASE) {
				{
				setState(689);
				match(K_DATABASE);
				}
			}

			setState(692);
			database_name();
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

	public static class Drop_index_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SqlParser.K_DROP, 0); }
		public TerminalNode K_INDEX() { return getToken(SqlParser.K_INDEX, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public Drop_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDrop_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDrop_index_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDrop_index_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_index_stmtContext drop_index_stmt() throws RecognitionException {
		Drop_index_stmtContext _localctx = new Drop_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_drop_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			match(K_DROP);
			setState(695);
			match(K_INDEX);
			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(696);
				match(K_IF);
				setState(697);
				match(K_EXISTS);
				}
			}

			setState(703);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(700);
				database_name();
				setState(701);
				match(DOT);
				}
				break;
			}
			setState(705);
			index_name();
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

	public static class Drop_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SqlParser.K_DROP, 0); }
		public TerminalNode K_TABLE() { return getToken(SqlParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public Drop_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDrop_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDrop_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDrop_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_table_stmtContext drop_table_stmt() throws RecognitionException {
		Drop_table_stmtContext _localctx = new Drop_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_drop_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			match(K_DROP);
			setState(708);
			match(K_TABLE);
			setState(711);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(709);
				match(K_IF);
				setState(710);
				match(K_EXISTS);
				}
			}

			setState(716);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(713);
				database_name();
				setState(714);
				match(DOT);
				}
				break;
			}
			setState(718);
			table_name();
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

	public static class Drop_trigger_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SqlParser.K_DROP, 0); }
		public TerminalNode K_TRIGGER() { return getToken(SqlParser.K_TRIGGER, 0); }
		public Trigger_nameContext trigger_name() {
			return getRuleContext(Trigger_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public Drop_trigger_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_trigger_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDrop_trigger_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDrop_trigger_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDrop_trigger_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_trigger_stmtContext drop_trigger_stmt() throws RecognitionException {
		Drop_trigger_stmtContext _localctx = new Drop_trigger_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_drop_trigger_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			match(K_DROP);
			setState(721);
			match(K_TRIGGER);
			setState(724);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(722);
				match(K_IF);
				setState(723);
				match(K_EXISTS);
				}
			}

			setState(729);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(726);
				database_name();
				setState(727);
				match(DOT);
				}
				break;
			}
			setState(731);
			trigger_name();
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

	public static class Drop_view_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SqlParser.K_DROP, 0); }
		public TerminalNode K_VIEW() { return getToken(SqlParser.K_VIEW, 0); }
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public Drop_view_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_view_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDrop_view_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDrop_view_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDrop_view_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_view_stmtContext drop_view_stmt() throws RecognitionException {
		Drop_view_stmtContext _localctx = new Drop_view_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_drop_view_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			match(K_DROP);
			setState(734);
			match(K_VIEW);
			setState(737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(735);
				match(K_IF);
				setState(736);
				match(K_EXISTS);
				}
			}

			setState(742);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(739);
				database_name();
				setState(740);
				match(DOT);
				}
				break;
			}
			setState(744);
			view_name();
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

	public static class Factored_select_stmtContext extends ParserRuleContext {
		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}
		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(SqlParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public List<Compound_operatorContext> compound_operator() {
			return getRuleContexts(Compound_operatorContext.class);
		}
		public Compound_operatorContext compound_operator(int i) {
			return getRuleContext(Compound_operatorContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(SqlParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SqlParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SqlParser.K_RECURSIVE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SqlParser.K_OFFSET, 0); }
		public Factored_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factored_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFactored_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFactored_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFactored_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factored_select_stmtContext factored_select_stmt() throws RecognitionException {
		Factored_select_stmtContext _localctx = new Factored_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_factored_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(746);
				match(K_WITH);
				setState(748);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_RECURSIVE) {
					{
					setState(747);
					match(K_RECURSIVE);
					}
				}

				setState(750);
				common_table_expression();
				setState(755);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(751);
					match(COMMA);
					setState(752);
					common_table_expression();
					}
					}
					setState(757);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(760);
			select_core();
			setState(766);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION) {
				{
				{
				setState(761);
				compound_operator();
				setState(762);
				select_core();
				}
				}
				setState(768);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(769);
				match(K_ORDER);
				setState(770);
				match(K_BY);
				setState(771);
				ordering_term();
				setState(776);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(772);
					match(COMMA);
					setState(773);
					ordering_term();
					}
					}
					setState(778);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(787);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(781);
				match(K_LIMIT);
				setState(782);
				expr(0);
				setState(785);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(783);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(784);
					expr(0);
					}
				}

				}
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

	public static class Insert_stmtContext extends ParserRuleContext {
		public TerminalNode K_INTO() { return getToken(SqlParser.K_INTO, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_INSERT() { return getToken(SqlParser.K_INSERT, 0); }
		public TerminalNode K_REPLACE() { return getToken(SqlParser.K_REPLACE, 0); }
		public TerminalNode K_OR() { return getToken(SqlParser.K_OR, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SqlParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SqlParser.K_ABORT, 0); }
		public TerminalNode K_FAIL() { return getToken(SqlParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SqlParser.K_IGNORE, 0); }
		public TerminalNode K_VALUES() { return getToken(SqlParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SqlParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SqlParser.OPEN_PAR, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SqlParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SqlParser.CLOSE_PAR, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_DEFAULT() { return getToken(SqlParser.K_DEFAULT, 0); }
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterInsert_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitInsert_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitInsert_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(789);
				with_clause();
				}
			}

			setState(809);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(792);
				match(K_INSERT);
				}
				break;
			case 2:
				{
				setState(793);
				match(K_REPLACE);
				}
				break;
			case 3:
				{
				setState(794);
				match(K_INSERT);
				setState(795);
				match(K_OR);
				setState(796);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(797);
				match(K_INSERT);
				setState(798);
				match(K_OR);
				setState(799);
				match(K_ROLLBACK);
				}
				break;
			case 5:
				{
				setState(800);
				match(K_INSERT);
				setState(801);
				match(K_OR);
				setState(802);
				match(K_ABORT);
				}
				break;
			case 6:
				{
				setState(803);
				match(K_INSERT);
				setState(804);
				match(K_OR);
				setState(805);
				match(K_FAIL);
				}
				break;
			case 7:
				{
				setState(806);
				match(K_INSERT);
				setState(807);
				match(K_OR);
				setState(808);
				match(K_IGNORE);
				}
				break;
			}
			setState(811);
			match(K_INTO);
			setState(815);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(812);
				database_name();
				setState(813);
				match(DOT);
				}
				break;
			}
			setState(817);
			table_name();
			setState(829);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(818);
				match(OPEN_PAR);
				setState(819);
				column_name();
				setState(824);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(820);
					match(COMMA);
					setState(821);
					column_name();
					}
					}
					setState(826);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(827);
				match(CLOSE_PAR);
				}
			}

			setState(862);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(831);
				match(K_VALUES);
				setState(832);
				match(OPEN_PAR);
				setState(833);
				expr(0);
				setState(838);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(834);
					match(COMMA);
					setState(835);
					expr(0);
					}
					}
					setState(840);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(841);
				match(CLOSE_PAR);
				setState(856);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(842);
					match(COMMA);
					setState(843);
					match(OPEN_PAR);
					setState(844);
					expr(0);
					setState(849);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(845);
						match(COMMA);
						setState(846);
						expr(0);
						}
						}
						setState(851);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(852);
					match(CLOSE_PAR);
					}
					}
					setState(858);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(859);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(860);
				match(K_DEFAULT);
				setState(861);
				match(K_VALUES);
				}
				break;
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

	public static class Pragma_stmtContext extends ParserRuleContext {
		public TerminalNode K_PRAGMA() { return getToken(SqlParser.K_PRAGMA, 0); }
		public Pragma_nameContext pragma_name() {
			return getRuleContext(Pragma_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public TerminalNode ASSIGN() { return getToken(SqlParser.ASSIGN, 0); }
		public Pragma_valueContext pragma_value() {
			return getRuleContext(Pragma_valueContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Pragma_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterPragma_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitPragma_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitPragma_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_stmtContext pragma_stmt() throws RecognitionException {
		Pragma_stmtContext _localctx = new Pragma_stmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_pragma_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
			match(K_PRAGMA);
			setState(868);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(865);
				database_name();
				setState(866);
				match(DOT);
				}
				break;
			}
			setState(870);
			pragma_name();
			setState(877);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(871);
				match(ASSIGN);
				setState(872);
				pragma_value();
				}
				break;
			case OPEN_PAR:
				{
				setState(873);
				match(OPEN_PAR);
				setState(874);
				pragma_value();
				setState(875);
				match(CLOSE_PAR);
				}
				break;
			case EOF:
			case SCOL:
			case K_ALTER:
			case K_ANALYZE:
			case K_ATTACH:
			case K_BEGIN:
			case K_COMMIT:
			case K_CREATE:
			case K_DELETE:
			case K_DETACH:
			case K_DROP:
			case K_END:
			case K_EXPLAIN:
			case K_INSERT:
			case K_PRAGMA:
			case K_REINDEX:
			case K_RELEASE:
			case K_REPLACE:
			case K_ROLLBACK:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_UPDATE:
			case K_VACUUM:
			case K_VALUES:
			case K_WITH:
			case UNEXPECTED_CHAR:
				break;
			default:
				break;
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

	public static class Reindex_stmtContext extends ParserRuleContext {
		public TerminalNode K_REINDEX() { return getToken(SqlParser.K_REINDEX, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public Reindex_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reindex_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterReindex_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitReindex_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitReindex_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reindex_stmtContext reindex_stmt() throws RecognitionException {
		Reindex_stmtContext _localctx = new Reindex_stmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_reindex_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
			match(K_REINDEX);
			setState(890);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(880);
				collation_name();
				}
				break;
			case 2:
				{
				setState(884);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(881);
					database_name();
					setState(882);
					match(DOT);
					}
					break;
				}
				setState(888);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(886);
					table_name();
					}
					break;
				case 2:
					{
					setState(887);
					index_name();
					}
					break;
				}
				}
				break;
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

	public static class Release_stmtContext extends ParserRuleContext {
		public TerminalNode K_RELEASE() { return getToken(SqlParser.K_RELEASE, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public TerminalNode K_SAVEPOINT() { return getToken(SqlParser.K_SAVEPOINT, 0); }
		public Release_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_release_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterRelease_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitRelease_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitRelease_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Release_stmtContext release_stmt() throws RecognitionException {
		Release_stmtContext _localctx = new Release_stmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_release_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(892);
			match(K_RELEASE);
			setState(894);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_SAVEPOINT) {
				{
				setState(893);
				match(K_SAVEPOINT);
				}
			}

			setState(896);
			savepoint_name();
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

	public static class Rollback_stmtContext extends ParserRuleContext {
		public TerminalNode K_ROLLBACK() { return getToken(SqlParser.K_ROLLBACK, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SqlParser.K_TRANSACTION, 0); }
		public TerminalNode K_TO() { return getToken(SqlParser.K_TO, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public TerminalNode K_SAVEPOINT() { return getToken(SqlParser.K_SAVEPOINT, 0); }
		public Rollback_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterRollback_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitRollback_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitRollback_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rollback_stmtContext rollback_stmt() throws RecognitionException {
		Rollback_stmtContext _localctx = new Rollback_stmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_rollback_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(898);
			match(K_ROLLBACK);
			setState(903);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(899);
				match(K_TRANSACTION);
				setState(901);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 175)) & ~0x3f) == 0 && ((1L << (_la - 175)) & ((1L << (STRING_LITERAL - 175)) | (1L << (IDENTIFIER - 175)) | (1L << (RANDOM_NAME - 175)))) != 0)) {
					{
					setState(900);
					transaction_name();
					}
				}

				}
			}

			setState(910);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TO) {
				{
				setState(905);
				match(K_TO);
				setState(907);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_SAVEPOINT) {
					{
					setState(906);
					match(K_SAVEPOINT);
					}
				}

				setState(909);
				savepoint_name();
				}
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

	public static class Savepoint_stmtContext extends ParserRuleContext {
		public TerminalNode K_SAVEPOINT() { return getToken(SqlParser.K_SAVEPOINT, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public Savepoint_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSavepoint_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSavepoint_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSavepoint_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Savepoint_stmtContext savepoint_stmt() throws RecognitionException {
		Savepoint_stmtContext _localctx = new Savepoint_stmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_savepoint_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(912);
			match(K_SAVEPOINT);
			setState(913);
			savepoint_name();
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

	public static class Simple_select_stmtContext extends ParserRuleContext {
		public Select_coreContext select_core() {
			return getRuleContext(Select_coreContext.class,0);
		}
		public TerminalNode K_WITH() { return getToken(SqlParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(SqlParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SqlParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SqlParser.K_RECURSIVE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SqlParser.K_OFFSET, 0); }
		public Simple_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSimple_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSimple_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSimple_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_select_stmtContext simple_select_stmt() throws RecognitionException {
		Simple_select_stmtContext _localctx = new Simple_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_simple_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(927);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(915);
				match(K_WITH);
				setState(917);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_RECURSIVE) {
					{
					setState(916);
					match(K_RECURSIVE);
					}
				}

				setState(919);
				common_table_expression();
				setState(924);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(920);
					match(COMMA);
					setState(921);
					common_table_expression();
					}
					}
					setState(926);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(929);
			select_core();
			setState(940);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(930);
				match(K_ORDER);
				setState(931);
				match(K_BY);
				setState(932);
				ordering_term();
				setState(937);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(933);
					match(COMMA);
					setState(934);
					ordering_term();
					}
					}
					setState(939);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(948);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(942);
				match(K_LIMIT);
				setState(943);
				expr(0);
				setState(946);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(944);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(945);
					expr(0);
					}
				}

				}
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

	public static class Select_stmtContext extends ParserRuleContext {
		public List<Select_or_valuesContext> select_or_values() {
			return getRuleContexts(Select_or_valuesContext.class);
		}
		public Select_or_valuesContext select_or_values(int i) {
			return getRuleContext(Select_or_valuesContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(SqlParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public List<Compound_operatorContext> compound_operator() {
			return getRuleContexts(Compound_operatorContext.class);
		}
		public Compound_operatorContext compound_operator(int i) {
			return getRuleContext(Compound_operatorContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(SqlParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SqlParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SqlParser.K_RECURSIVE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SqlParser.K_OFFSET, 0); }
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSelect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_select_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(962);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(950);
				match(K_WITH);
				setState(952);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_RECURSIVE) {
					{
					setState(951);
					match(K_RECURSIVE);
					}
				}

				setState(954);
				common_table_expression();
				setState(959);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(955);
					match(COMMA);
					setState(956);
					common_table_expression();
					}
					}
					setState(961);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(964);
			select_or_values();
			setState(970);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(965);
					compound_operator();
					setState(966);
					select_or_values();
					}
					} 
				}
				setState(972);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			}
			setState(983);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				setState(973);
				match(K_ORDER);
				setState(974);
				match(K_BY);
				setState(975);
				ordering_term();
				setState(980);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(976);
						match(COMMA);
						setState(977);
						ordering_term();
						}
						} 
					}
					setState(982);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				}
				}
				break;
			}
			setState(991);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(985);
				match(K_LIMIT);
				setState(986);
				expr(0);
				setState(989);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
				case 1:
					{
					setState(987);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(988);
					expr(0);
					}
					break;
				}
				}
				break;
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

	public static class Select_or_valuesContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(SqlParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode K_FROM() { return getToken(SqlParser.K_FROM, 0); }
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_GROUP() { return getToken(SqlParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SqlParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(SqlParser.K_ALL, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_HAVING() { return getToken(SqlParser.K_HAVING, 0); }
		public TerminalNode K_VALUES() { return getToken(SqlParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SqlParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SqlParser.OPEN_PAR, i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SqlParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SqlParser.CLOSE_PAR, i);
		}
		public Select_or_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_or_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSelect_or_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSelect_or_values(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSelect_or_values(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_or_valuesContext select_or_values() throws RecognitionException {
		Select_or_valuesContext _localctx = new Select_or_valuesContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_select_or_values);
		int _la;
		try {
			int _alt;
			setState(1067);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(993);
				match(K_SELECT);
				setState(995);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ALL || _la==K_DISTINCT) {
					{
					setState(994);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(997);
				result_column();
				setState(1002);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(998);
						match(COMMA);
						setState(999);
						result_column();
						}
						} 
					}
					setState(1004);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
				}
				setState(1017);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
				case 1:
					{
					setState(1005);
					match(K_FROM);
					setState(1015);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
					case 1:
						{
						setState(1006);
						table_or_subquery();
						setState(1011);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1007);
								match(COMMA);
								setState(1008);
								table_or_subquery();
								}
								} 
							}
							setState(1013);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
						}
						}
						break;
					case 2:
						{
						setState(1014);
						join_clause();
						}
						break;
					}
					}
					break;
				}
				setState(1021);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(1019);
					match(K_WHERE);
					setState(1020);
					expr(0);
					}
					break;
				}
				setState(1037);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
				case 1:
					{
					setState(1023);
					match(K_GROUP);
					setState(1024);
					match(K_BY);
					setState(1025);
					expr(0);
					setState(1030);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1026);
							match(COMMA);
							setState(1027);
							expr(0);
							}
							} 
						}
						setState(1032);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
					}
					setState(1035);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
					case 1:
						{
						setState(1033);
						match(K_HAVING);
						setState(1034);
						expr(0);
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(1039);
				match(K_VALUES);
				setState(1040);
				match(OPEN_PAR);
				setState(1041);
				expr(0);
				setState(1046);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1042);
					match(COMMA);
					setState(1043);
					expr(0);
					}
					}
					setState(1048);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1049);
				match(CLOSE_PAR);
				setState(1064);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1050);
						match(COMMA);
						setState(1051);
						match(OPEN_PAR);
						setState(1052);
						expr(0);
						setState(1057);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1053);
							match(COMMA);
							setState(1054);
							expr(0);
							}
							}
							setState(1059);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1060);
						match(CLOSE_PAR);
						}
						} 
					}
					setState(1066);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
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

	public static class Update_stmtContext extends ParserRuleContext {
		public TerminalNode K_UPDATE() { return getToken(SqlParser.K_UPDATE, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_SET() { return getToken(SqlParser.K_SET, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SqlParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SqlParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_OR() { return getToken(SqlParser.K_OR, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SqlParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SqlParser.K_ABORT, 0); }
		public TerminalNode K_REPLACE() { return getToken(SqlParser.K_REPLACE, 0); }
		public TerminalNode K_FAIL() { return getToken(SqlParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SqlParser.K_IGNORE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public Update_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterUpdate_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitUpdate_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitUpdate_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmtContext update_stmt() throws RecognitionException {
		Update_stmtContext _localctx = new Update_stmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1070);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1069);
				with_clause();
				}
			}

			setState(1072);
			match(K_UPDATE);
			setState(1083);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(1073);
				match(K_OR);
				setState(1074);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(1075);
				match(K_OR);
				setState(1076);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(1077);
				match(K_OR);
				setState(1078);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(1079);
				match(K_OR);
				setState(1080);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(1081);
				match(K_OR);
				setState(1082);
				match(K_IGNORE);
				}
				break;
			}
			setState(1085);
			qualified_table_name();
			setState(1086);
			match(K_SET);
			setState(1087);
			column_name();
			setState(1088);
			match(ASSIGN);
			setState(1089);
			expr(0);
			setState(1097);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1090);
				match(COMMA);
				setState(1091);
				column_name();
				setState(1092);
				match(ASSIGN);
				setState(1093);
				expr(0);
				}
				}
				setState(1099);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1100);
				match(K_WHERE);
				setState(1101);
				expr(0);
				}
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

	public static class Update_stmt_limitedContext extends ParserRuleContext {
		public TerminalNode K_UPDATE() { return getToken(SqlParser.K_UPDATE, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_SET() { return getToken(SqlParser.K_SET, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SqlParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SqlParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_OR() { return getToken(SqlParser.K_OR, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SqlParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SqlParser.K_ABORT, 0); }
		public TerminalNode K_REPLACE() { return getToken(SqlParser.K_REPLACE, 0); }
		public TerminalNode K_FAIL() { return getToken(SqlParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SqlParser.K_IGNORE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public TerminalNode K_LIMIT() { return getToken(SqlParser.K_LIMIT, 0); }
		public TerminalNode K_ORDER() { return getToken(SqlParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_OFFSET() { return getToken(SqlParser.K_OFFSET, 0); }
		public Update_stmt_limitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt_limited; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterUpdate_stmt_limited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitUpdate_stmt_limited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitUpdate_stmt_limited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmt_limitedContext update_stmt_limited() throws RecognitionException {
		Update_stmt_limitedContext _localctx = new Update_stmt_limitedContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_update_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1104);
				with_clause();
				}
			}

			setState(1107);
			match(K_UPDATE);
			setState(1118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				{
				setState(1108);
				match(K_OR);
				setState(1109);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(1110);
				match(K_OR);
				setState(1111);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(1112);
				match(K_OR);
				setState(1113);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(1114);
				match(K_OR);
				setState(1115);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(1116);
				match(K_OR);
				setState(1117);
				match(K_IGNORE);
				}
				break;
			}
			setState(1120);
			qualified_table_name();
			setState(1121);
			match(K_SET);
			setState(1122);
			column_name();
			setState(1123);
			match(ASSIGN);
			setState(1124);
			expr(0);
			setState(1132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1125);
				match(COMMA);
				setState(1126);
				column_name();
				setState(1127);
				match(ASSIGN);
				setState(1128);
				expr(0);
				}
				}
				setState(1134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1135);
				match(K_WHERE);
				setState(1136);
				expr(0);
				}
			}

			setState(1157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(1149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(1139);
					match(K_ORDER);
					setState(1140);
					match(K_BY);
					setState(1141);
					ordering_term();
					setState(1146);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1142);
						match(COMMA);
						setState(1143);
						ordering_term();
						}
						}
						setState(1148);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1151);
				match(K_LIMIT);
				setState(1152);
				expr(0);
				setState(1155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(1153);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1154);
					expr(0);
					}
				}

				}
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

	public static class Vacuum_stmtContext extends ParserRuleContext {
		public TerminalNode K_VACUUM() { return getToken(SqlParser.K_VACUUM, 0); }
		public Vacuum_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vacuum_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterVacuum_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitVacuum_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitVacuum_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Vacuum_stmtContext vacuum_stmt() throws RecognitionException {
		Vacuum_stmtContext _localctx = new Vacuum_stmtContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_vacuum_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1159);
			match(K_VACUUM);
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

	public static class Column_defContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public List<Column_constraintContext> column_constraint() {
			return getRuleContexts(Column_constraintContext.class);
		}
		public Column_constraintContext column_constraint(int i) {
			return getRuleContext(Column_constraintContext.class,i);
		}
		public List<Type_nameContext> type_name() {
			return getRuleContexts(Type_nameContext.class);
		}
		public Type_nameContext type_name(int i) {
			return getRuleContext(Type_nameContext.class,i);
		}
		public Column_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defContext column_def() throws RecognitionException {
		Column_defContext _localctx = new Column_defContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_column_def);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1161);
			column_name();
			setState(1166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1164);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case K_CHECK:
					case K_COLLATE:
					case K_CONSTRAINT:
					case K_DEFAULT:
					case K_NOT:
					case K_NULL:
					case K_PRIMARY:
					case K_REFERENCES:
					case K_UNIQUE:
						{
						setState(1162);
						column_constraint();
						}
						break;
					case STRING_LITERAL:
					case IDENTIFIER:
					case RANDOM_NAME:
						{
						setState(1163);
						type_name();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
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

	public static class Type_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}
		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode COMMA() { return getToken(SqlParser.COMMA, 0); }
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1169);
			name();
			setState(1189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				{
				setState(1170);
				match(OPEN_PAR);
				setState(1171);
				signed_number();
				setState(1173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 175)) & ~0x3f) == 0 && ((1L << (_la - 175)) & ((1L << (STRING_LITERAL - 175)) | (1L << (IDENTIFIER - 175)) | (1L << (RANDOM_NAME - 175)))) != 0)) {
					{
					setState(1172);
					any_name();
					}
				}

				setState(1175);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(1177);
				match(OPEN_PAR);
				setState(1178);
				signed_number();
				setState(1180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 175)) & ~0x3f) == 0 && ((1L << (_la - 175)) & ((1L << (STRING_LITERAL - 175)) | (1L << (IDENTIFIER - 175)) | (1L << (RANDOM_NAME - 175)))) != 0)) {
					{
					setState(1179);
					any_name();
					}
				}

				setState(1182);
				match(COMMA);
				setState(1183);
				signed_number();
				setState(1185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 175)) & ~0x3f) == 0 && ((1L << (_la - 175)) & ((1L << (STRING_LITERAL - 175)) | (1L << (IDENTIFIER - 175)) | (1L << (RANDOM_NAME - 175)))) != 0)) {
					{
					setState(1184);
					any_name();
					}
				}

				setState(1187);
				match(CLOSE_PAR);
				}
				break;
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

	public static class Column_constraintContext extends ParserRuleContext {
		public Column_constraint_primary_keyContext column_constraint_primary_key() {
			return getRuleContext(Column_constraint_primary_keyContext.class,0);
		}
		public Column_constraint_foreign_keyContext column_constraint_foreign_key() {
			return getRuleContext(Column_constraint_foreign_keyContext.class,0);
		}
		public Column_constraint_not_nullContext column_constraint_not_null() {
			return getRuleContext(Column_constraint_not_nullContext.class,0);
		}
		public Column_constraint_nullContext column_constraint_null() {
			return getRuleContext(Column_constraint_nullContext.class,0);
		}
		public TerminalNode K_UNIQUE() { return getToken(SqlParser.K_UNIQUE, 0); }
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public TerminalNode K_CHECK() { return getToken(SqlParser.K_CHECK, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Column_defaultContext column_default() {
			return getRuleContext(Column_defaultContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SqlParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(SqlParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Column_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraintContext column_constraint() throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1191);
				match(K_CONSTRAINT);
				setState(1192);
				name();
				}
			}

			setState(1209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(1195);
				column_constraint_primary_key();
				}
				break;
			case K_REFERENCES:
				{
				setState(1196);
				column_constraint_foreign_key();
				}
				break;
			case K_NOT:
				{
				setState(1197);
				column_constraint_not_null();
				}
				break;
			case K_NULL:
				{
				setState(1198);
				column_constraint_null();
				}
				break;
			case K_UNIQUE:
				{
				setState(1199);
				match(K_UNIQUE);
				setState(1200);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(1201);
				match(K_CHECK);
				setState(1202);
				match(OPEN_PAR);
				setState(1203);
				expr(0);
				setState(1204);
				match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
				setState(1206);
				column_default();
				}
				break;
			case K_COLLATE:
				{
				setState(1207);
				match(K_COLLATE);
				setState(1208);
				collation_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Column_constraint_primary_keyContext extends ParserRuleContext {
		public TerminalNode K_PRIMARY() { return getToken(SqlParser.K_PRIMARY, 0); }
		public TerminalNode K_KEY() { return getToken(SqlParser.K_KEY, 0); }
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public TerminalNode K_AUTOINCREMENT() { return getToken(SqlParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_ASC() { return getToken(SqlParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SqlParser.K_DESC, 0); }
		public Column_constraint_primary_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_primary_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_constraint_primary_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_constraint_primary_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_constraint_primary_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_primary_keyContext column_constraint_primary_key() throws RecognitionException {
		Column_constraint_primary_keyContext _localctx = new Column_constraint_primary_keyContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_column_constraint_primary_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1211);
			match(K_PRIMARY);
			setState(1212);
			match(K_KEY);
			setState(1214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				{
				setState(1213);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1216);
			conflict_clause();
			setState(1218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1217);
				match(K_AUTOINCREMENT);
				}
				break;
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

	public static class Column_constraint_foreign_keyContext extends ParserRuleContext {
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public Column_constraint_foreign_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_foreign_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_constraint_foreign_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_constraint_foreign_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_constraint_foreign_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_foreign_keyContext column_constraint_foreign_key() throws RecognitionException {
		Column_constraint_foreign_keyContext _localctx = new Column_constraint_foreign_keyContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_column_constraint_foreign_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1220);
			foreign_key_clause();
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

	public static class Column_constraint_not_nullContext extends ParserRuleContext {
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_NULL() { return getToken(SqlParser.K_NULL, 0); }
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public Column_constraint_not_nullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_not_null; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_constraint_not_null(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_constraint_not_null(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_constraint_not_null(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_not_nullContext column_constraint_not_null() throws RecognitionException {
		Column_constraint_not_nullContext _localctx = new Column_constraint_not_nullContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_column_constraint_not_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1222);
			match(K_NOT);
			setState(1223);
			match(K_NULL);
			setState(1224);
			conflict_clause();
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

	public static class Column_constraint_nullContext extends ParserRuleContext {
		public TerminalNode K_NULL() { return getToken(SqlParser.K_NULL, 0); }
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public Column_constraint_nullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_null; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_constraint_null(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_constraint_null(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_constraint_null(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_nullContext column_constraint_null() throws RecognitionException {
		Column_constraint_nullContext _localctx = new Column_constraint_nullContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_column_constraint_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1226);
			match(K_NULL);
			setState(1227);
			conflict_clause();
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

	public static class Column_defaultContext extends ParserRuleContext {
		public TerminalNode K_DEFAULT() { return getToken(SqlParser.K_DEFAULT, 0); }
		public Column_default_valueContext column_default_value() {
			return getRuleContext(Column_default_valueContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode K_NEXTVAL() { return getToken(SqlParser.K_NEXTVAL, 0); }
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public Column_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_default(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_default(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defaultContext column_default() throws RecognitionException {
		Column_defaultContext _localctx = new Column_defaultContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_column_default);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1229);
			match(K_DEFAULT);
			setState(1241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				{
				setState(1230);
				column_default_value();
				}
				break;
			case 2:
				{
				setState(1231);
				match(OPEN_PAR);
				setState(1232);
				expr(0);
				setState(1233);
				match(CLOSE_PAR);
				}
				break;
			case 3:
				{
				setState(1235);
				match(K_NEXTVAL);
				setState(1236);
				match(OPEN_PAR);
				setState(1237);
				expr(0);
				setState(1238);
				match(CLOSE_PAR);
				}
				break;
			case 4:
				{
				setState(1240);
				any_name();
				}
				break;
			}
			setState(1249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				{
				setState(1243);
				match(T__0);
				setState(1245); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1244);
						any_name();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1247); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
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

	public static class Column_default_valueContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Column_default_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_default_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_default_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_default_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_default_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_default_valueContext column_default_value() throws RecognitionException {
		Column_default_valueContext _localctx = new Column_default_valueContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_column_default_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				{
				setState(1251);
				signed_number();
				}
				break;
			case 2:
				{
				setState(1252);
				literal_value();
				}
				break;
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

	public static class Conflict_clauseContext extends ParserRuleContext {
		public TerminalNode K_ON() { return getToken(SqlParser.K_ON, 0); }
		public TerminalNode K_CONFLICT() { return getToken(SqlParser.K_CONFLICT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SqlParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SqlParser.K_ABORT, 0); }
		public TerminalNode K_FAIL() { return getToken(SqlParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SqlParser.K_IGNORE, 0); }
		public TerminalNode K_REPLACE() { return getToken(SqlParser.K_REPLACE, 0); }
		public Conflict_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conflict_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterConflict_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitConflict_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitConflict_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conflict_clauseContext conflict_clause() throws RecognitionException {
		Conflict_clauseContext _localctx = new Conflict_clauseContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_conflict_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				{
				setState(1255);
				match(K_ON);
				setState(1256);
				match(K_CONFLICT);
				setState(1257);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (K_FAIL - 87)) | (1L << (K_IGNORE - 87)) | (1L << (K_REPLACE - 87)) | (1L << (K_ROLLBACK - 87)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
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

	public static class ExprContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode BIND_PARAMETER() { return getToken(SqlParser.BIND_PARAMETER, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(SqlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SqlParser.DOT, i);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SqlParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SqlParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(SqlParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(SqlParser.MINUS, i);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode STAR() { return getToken(SqlParser.STAR, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SqlParser.K_DISTINCT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode K_CAST() { return getToken(SqlParser.K_CAST, 0); }
		public TerminalNode K_AS() { return getToken(SqlParser.K_AS, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_CASE() { return getToken(SqlParser.K_CASE, 0); }
		public TerminalNode K_END() { return getToken(SqlParser.K_END, 0); }
		public List<TerminalNode> K_WHEN() { return getTokens(SqlParser.K_WHEN); }
		public TerminalNode K_WHEN(int i) {
			return getToken(SqlParser.K_WHEN, i);
		}
		public List<TerminalNode> K_THEN() { return getTokens(SqlParser.K_THEN); }
		public TerminalNode K_THEN(int i) {
			return getToken(SqlParser.K_THEN, i);
		}
		public TerminalNode K_ELSE() { return getToken(SqlParser.K_ELSE, 0); }
		public Raise_functionContext raise_function() {
			return getRuleContext(Raise_functionContext.class,0);
		}
		public TerminalNode PIPE2() { return getToken(SqlParser.PIPE2, 0); }
		public TerminalNode DIV() { return getToken(SqlParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SqlParser.MOD, 0); }
		public TerminalNode LT2() { return getToken(SqlParser.LT2, 0); }
		public TerminalNode GT2() { return getToken(SqlParser.GT2, 0); }
		public TerminalNode AMP() { return getToken(SqlParser.AMP, 0); }
		public TerminalNode PIPE() { return getToken(SqlParser.PIPE, 0); }
		public TerminalNode LT() { return getToken(SqlParser.LT, 0); }
		public TerminalNode LT_EQ() { return getToken(SqlParser.LT_EQ, 0); }
		public TerminalNode GT() { return getToken(SqlParser.GT, 0); }
		public TerminalNode GT_EQ() { return getToken(SqlParser.GT_EQ, 0); }
		public TerminalNode ASSIGN() { return getToken(SqlParser.ASSIGN, 0); }
		public TerminalNode EQ() { return getToken(SqlParser.EQ, 0); }
		public TerminalNode NOT_EQ1() { return getToken(SqlParser.NOT_EQ1, 0); }
		public TerminalNode NOT_EQ2() { return getToken(SqlParser.NOT_EQ2, 0); }
		public TerminalNode K_IS() { return getToken(SqlParser.K_IS, 0); }
		public TerminalNode K_IN() { return getToken(SqlParser.K_IN, 0); }
		public TerminalNode K_LIKE() { return getToken(SqlParser.K_LIKE, 0); }
		public TerminalNode K_GLOB() { return getToken(SqlParser.K_GLOB, 0); }
		public TerminalNode K_MATCH() { return getToken(SqlParser.K_MATCH, 0); }
		public TerminalNode K_REGEXP() { return getToken(SqlParser.K_REGEXP, 0); }
		public TerminalNode K_AND() { return getToken(SqlParser.K_AND, 0); }
		public TerminalNode K_OR() { return getToken(SqlParser.K_OR, 0); }
		public TerminalNode K_BETWEEN() { return getToken(SqlParser.K_BETWEEN, 0); }
		public TerminalNode K_COLLATE() { return getToken(SqlParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ESCAPE() { return getToken(SqlParser.K_ESCAPE, 0); }
		public TerminalNode K_ISNULL() { return getToken(SqlParser.K_ISNULL, 0); }
		public TerminalNode K_NOTNULL() { return getToken(SqlParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(SqlParser.K_NULL, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				{
				setState(1261);
				literal_value();
				}
				break;
			case 2:
				{
				setState(1262);
				match(BIND_PARAMETER);
				}
				break;
			case 3:
				{
				setState(1271);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
				case 1:
					{
					setState(1266);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
					case 1:
						{
						setState(1263);
						database_name();
						setState(1264);
						match(DOT);
						}
						break;
					}
					setState(1268);
					table_name();
					setState(1269);
					match(DOT);
					}
					break;
				}
				setState(1273);
				column_name();
				}
				break;
			case 4:
				{
				setState(1274);
				unary_operator();
				setState(1275);
				expr(27);
				}
				break;
			case 5:
				{
				setState(1277);
				match(T__2);
				setState(1278);
				expr(24);
				}
				break;
			case 6:
				{
				setState(1279);
				match(PLUS);
				setState(1280);
				match(PLUS);
				setState(1281);
				expr(22);
				}
				break;
			case 7:
				{
				setState(1282);
				match(MINUS);
				setState(1283);
				match(MINUS);
				setState(1284);
				expr(20);
				}
				break;
			case 8:
				{
				setState(1285);
				function_name();
				setState(1286);
				match(OPEN_PAR);
				setState(1299);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
				case OPEN_PAR:
				case PLUS:
				case MINUS:
				case TILDE:
				case K_CASE:
				case K_CAST:
				case K_CURRENT_DATE:
				case K_CURRENT_TIME:
				case K_CURRENT_TIMESTAMP:
				case K_DISTINCT:
				case K_EXISTS:
				case K_NOT:
				case K_NULL:
				case K_RAISE:
				case STRING_LITERAL:
				case IDENTIFIER:
				case RANDOM_NAME:
				case NUMERIC_LITERAL:
				case BIND_PARAMETER:
				case BLOB_LITERAL:
					{
					setState(1288);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_DISTINCT) {
						{
						setState(1287);
						match(K_DISTINCT);
						}
					}

					setState(1290);
					expr(0);
					setState(1295);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1291);
						match(COMMA);
						setState(1292);
						expr(0);
						}
						}
						setState(1297);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(1298);
					match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					break;
				}
				setState(1301);
				match(CLOSE_PAR);
				}
				break;
			case 9:
				{
				setState(1303);
				match(OPEN_PAR);
				setState(1304);
				expr(0);
				setState(1305);
				match(CLOSE_PAR);
				}
				break;
			case 10:
				{
				setState(1307);
				match(K_CAST);
				setState(1308);
				match(OPEN_PAR);
				setState(1309);
				expr(0);
				setState(1310);
				match(K_AS);
				setState(1311);
				type_name();
				setState(1312);
				match(CLOSE_PAR);
				}
				break;
			case 11:
				{
				setState(1318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(1315);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(1314);
						match(K_NOT);
						}
					}

					setState(1317);
					match(K_EXISTS);
					}
				}

				setState(1320);
				match(OPEN_PAR);
				setState(1321);
				select_stmt();
				setState(1322);
				match(CLOSE_PAR);
				}
				break;
			case 12:
				{
				setState(1324);
				match(K_CASE);
				setState(1326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << K_CASE) | (1L << K_CAST))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (K_CURRENT_DATE - 66)) | (1L << (K_CURRENT_TIME - 66)) | (1L << (K_CURRENT_TIMESTAMP - 66)) | (1L << (K_EXISTS - 66)) | (1L << (K_NOT - 66)) | (1L << (K_NULL - 66)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (K_RAISE - 132)) | (1L << (STRING_LITERAL - 132)) | (1L << (IDENTIFIER - 132)) | (1L << (RANDOM_NAME - 132)) | (1L << (NUMERIC_LITERAL - 132)) | (1L << (BIND_PARAMETER - 132)) | (1L << (BLOB_LITERAL - 132)))) != 0)) {
					{
					setState(1325);
					expr(0);
					}
				}

				setState(1333); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1328);
					match(K_WHEN);
					setState(1329);
					expr(0);
					setState(1330);
					match(K_THEN);
					setState(1331);
					expr(0);
					}
					}
					setState(1335); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==K_WHEN );
				setState(1339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ELSE) {
					{
					setState(1337);
					match(K_ELSE);
					setState(1338);
					expr(0);
					}
				}

				setState(1341);
				match(K_END);
				}
				break;
			case 13:
				{
				setState(1343);
				raise_function();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1455);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1453);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1346);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(1347);
						match(PIPE2);
						setState(1348);
						expr(27);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1349);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1350);
						match(T__1);
						setState(1351);
						expr(26);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1352);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1353);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1354);
						expr(20);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1355);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1356);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1357);
						expr(19);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1358);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1359);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1360);
						expr(18);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1361);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1362);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1363);
						expr(17);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1364);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1377);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
						case 1:
							{
							setState(1365);
							match(ASSIGN);
							}
							break;
						case 2:
							{
							setState(1366);
							match(EQ);
							}
							break;
						case 3:
							{
							setState(1367);
							match(NOT_EQ1);
							}
							break;
						case 4:
							{
							setState(1368);
							match(NOT_EQ2);
							}
							break;
						case 5:
							{
							setState(1369);
							match(K_IS);
							}
							break;
						case 6:
							{
							setState(1370);
							match(K_IS);
							setState(1371);
							match(K_NOT);
							}
							break;
						case 7:
							{
							setState(1372);
							match(K_IN);
							}
							break;
						case 8:
							{
							setState(1373);
							match(K_LIKE);
							}
							break;
						case 9:
							{
							setState(1374);
							match(K_GLOB);
							}
							break;
						case 10:
							{
							setState(1375);
							match(K_MATCH);
							}
							break;
						case 11:
							{
							setState(1376);
							match(K_REGEXP);
							}
							break;
						}
						setState(1379);
						expr(16);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1380);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1381);
						match(K_AND);
						setState(1382);
						expr(15);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1383);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1384);
						match(K_OR);
						setState(1385);
						expr(14);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1386);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1387);
						match(K_IS);
						setState(1389);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
						case 1:
							{
							setState(1388);
							match(K_NOT);
							}
							break;
						}
						setState(1391);
						expr(7);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1392);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1394);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1393);
							match(K_NOT);
							}
						}

						setState(1396);
						match(K_BETWEEN);
						setState(1397);
						expr(0);
						setState(1398);
						match(K_AND);
						setState(1399);
						expr(6);
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1401);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1402);
						match(PLUS);
						setState(1403);
						match(PLUS);
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1404);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1405);
						match(MINUS);
						setState(1406);
						match(MINUS);
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1407);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1408);
						match(K_COLLATE);
						setState(1409);
						collation_name();
						}
						break;
					case 15:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1410);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1412);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1411);
							match(K_NOT);
							}
						}

						setState(1414);
						_la = _input.LA(1);
						if ( !(((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (K_GLOB - 92)) | (1L << (K_LIKE - 92)) | (1L << (K_MATCH - 92)) | (1L << (K_REGEXP - 92)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1415);
						expr(0);
						setState(1418);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
						case 1:
							{
							setState(1416);
							match(K_ESCAPE);
							setState(1417);
							expr(0);
							}
							break;
						}
						}
						break;
					case 16:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1420);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1425);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case K_ISNULL:
							{
							setState(1421);
							match(K_ISNULL);
							}
							break;
						case K_NOTNULL:
							{
							setState(1422);
							match(K_NOTNULL);
							}
							break;
						case K_NOT:
							{
							setState(1423);
							match(K_NOT);
							setState(1424);
							match(K_NULL);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 17:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1427);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1429);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1428);
							match(K_NOT);
							}
						}

						setState(1431);
						match(K_IN);
						setState(1451);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case OPEN_PAR:
							{
							setState(1432);
							match(OPEN_PAR);
							setState(1442);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case K_SELECT:
							case K_VALUES:
							case K_WITH:
								{
								setState(1433);
								select_stmt();
								}
								break;
							case T__2:
							case OPEN_PAR:
							case PLUS:
							case MINUS:
							case TILDE:
							case K_CASE:
							case K_CAST:
							case K_CURRENT_DATE:
							case K_CURRENT_TIME:
							case K_CURRENT_TIMESTAMP:
							case K_EXISTS:
							case K_NOT:
							case K_NULL:
							case K_RAISE:
							case STRING_LITERAL:
							case IDENTIFIER:
							case RANDOM_NAME:
							case NUMERIC_LITERAL:
							case BIND_PARAMETER:
							case BLOB_LITERAL:
								{
								setState(1434);
								expr(0);
								setState(1439);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(1435);
									match(COMMA);
									setState(1436);
									expr(0);
									}
									}
									setState(1441);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							case CLOSE_PAR:
								break;
							default:
								break;
							}
							setState(1444);
							match(CLOSE_PAR);
							}
							break;
						case STRING_LITERAL:
						case IDENTIFIER:
						case RANDOM_NAME:
							{
							setState(1448);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
							case 1:
								{
								setState(1445);
								database_name();
								setState(1446);
								match(DOT);
								}
								break;
							}
							setState(1450);
							table_name();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					}
					} 
				}
				setState(1457);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
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

	public static class Foreign_key_clauseContext extends ParserRuleContext {
		public TerminalNode K_REFERENCES() { return getToken(SqlParser.K_REFERENCES, 0); }
		public Foreign_tableContext foreign_table() {
			return getRuleContext(Foreign_tableContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Fk_target_column_nameContext> fk_target_column_name() {
			return getRuleContexts(Fk_target_column_nameContext.class);
		}
		public Fk_target_column_nameContext fk_target_column_name(int i) {
			return getRuleContext(Fk_target_column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode K_DEFERRABLE() { return getToken(SqlParser.K_DEFERRABLE, 0); }
		public List<TerminalNode> K_ON() { return getTokens(SqlParser.K_ON); }
		public TerminalNode K_ON(int i) {
			return getToken(SqlParser.K_ON, i);
		}
		public List<TerminalNode> K_MATCH() { return getTokens(SqlParser.K_MATCH); }
		public TerminalNode K_MATCH(int i) {
			return getToken(SqlParser.K_MATCH, i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public List<TerminalNode> K_DELETE() { return getTokens(SqlParser.K_DELETE); }
		public TerminalNode K_DELETE(int i) {
			return getToken(SqlParser.K_DELETE, i);
		}
		public List<TerminalNode> K_UPDATE() { return getTokens(SqlParser.K_UPDATE); }
		public TerminalNode K_UPDATE(int i) {
			return getToken(SqlParser.K_UPDATE, i);
		}
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_INITIALLY() { return getToken(SqlParser.K_INITIALLY, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SqlParser.K_DEFERRED, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SqlParser.K_IMMEDIATE, 0); }
		public TerminalNode K_ENABLE() { return getToken(SqlParser.K_ENABLE, 0); }
		public List<TerminalNode> K_SET() { return getTokens(SqlParser.K_SET); }
		public TerminalNode K_SET(int i) {
			return getToken(SqlParser.K_SET, i);
		}
		public List<TerminalNode> K_NULL() { return getTokens(SqlParser.K_NULL); }
		public TerminalNode K_NULL(int i) {
			return getToken(SqlParser.K_NULL, i);
		}
		public List<TerminalNode> K_DEFAULT() { return getTokens(SqlParser.K_DEFAULT); }
		public TerminalNode K_DEFAULT(int i) {
			return getToken(SqlParser.K_DEFAULT, i);
		}
		public List<TerminalNode> K_CASCADE() { return getTokens(SqlParser.K_CASCADE); }
		public TerminalNode K_CASCADE(int i) {
			return getToken(SqlParser.K_CASCADE, i);
		}
		public List<TerminalNode> K_RESTRICT() { return getTokens(SqlParser.K_RESTRICT); }
		public TerminalNode K_RESTRICT(int i) {
			return getToken(SqlParser.K_RESTRICT, i);
		}
		public List<TerminalNode> K_NO() { return getTokens(SqlParser.K_NO); }
		public TerminalNode K_NO(int i) {
			return getToken(SqlParser.K_NO, i);
		}
		public List<TerminalNode> K_ACTION() { return getTokens(SqlParser.K_ACTION); }
		public TerminalNode K_ACTION(int i) {
			return getToken(SqlParser.K_ACTION, i);
		}
		public Foreign_key_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_key_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterForeign_key_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitForeign_key_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitForeign_key_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_key_clauseContext foreign_key_clause() throws RecognitionException {
		Foreign_key_clauseContext _localctx = new Foreign_key_clauseContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_foreign_key_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1458);
			match(K_REFERENCES);
			setState(1462);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				{
				setState(1459);
				database_name();
				setState(1460);
				match(DOT);
				}
				break;
			}
			setState(1464);
			foreign_table();
			setState(1476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				{
				setState(1465);
				match(OPEN_PAR);
				setState(1466);
				fk_target_column_name();
				setState(1471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1467);
					match(COMMA);
					setState(1468);
					fk_target_column_name();
					}
					}
					setState(1473);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1474);
				match(CLOSE_PAR);
				}
				break;
			}
			setState(1496);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1492);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case K_ON:
						{
						setState(1478);
						match(K_ON);
						setState(1479);
						_la = _input.LA(1);
						if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1488);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
						case 1:
							{
							setState(1480);
							match(K_SET);
							setState(1481);
							match(K_NULL);
							}
							break;
						case 2:
							{
							setState(1482);
							match(K_SET);
							setState(1483);
							match(K_DEFAULT);
							}
							break;
						case 3:
							{
							setState(1484);
							match(K_CASCADE);
							}
							break;
						case 4:
							{
							setState(1485);
							match(K_RESTRICT);
							}
							break;
						case 5:
							{
							setState(1486);
							match(K_NO);
							setState(1487);
							match(K_ACTION);
							}
							break;
						}
						}
						break;
					case K_MATCH:
						{
						setState(1490);
						match(K_MATCH);
						setState(1491);
						name();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(1498);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
			}
			setState(1512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				{
				setState(1500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1499);
					match(K_NOT);
					}
				}

				setState(1502);
				match(K_DEFERRABLE);
				setState(1507);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
				case 1:
					{
					setState(1503);
					match(K_INITIALLY);
					setState(1504);
					match(K_DEFERRED);
					}
					break;
				case 2:
					{
					setState(1505);
					match(K_INITIALLY);
					setState(1506);
					match(K_IMMEDIATE);
					}
					break;
				}
				setState(1510);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
				case 1:
					{
					setState(1509);
					match(K_ENABLE);
					}
					break;
				}
				}
				break;
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

	public static class Fk_target_column_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Fk_target_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fk_target_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFk_target_column_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFk_target_column_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFk_target_column_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fk_target_column_nameContext fk_target_column_name() throws RecognitionException {
		Fk_target_column_nameContext _localctx = new Fk_target_column_nameContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_fk_target_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1514);
			name();
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

	public static class Raise_functionContext extends ParserRuleContext {
		public TerminalNode K_RAISE() { return getToken(SqlParser.K_RAISE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode K_IGNORE() { return getToken(SqlParser.K_IGNORE, 0); }
		public TerminalNode COMMA() { return getToken(SqlParser.COMMA, 0); }
		public Error_messageContext error_message() {
			return getRuleContext(Error_messageContext.class,0);
		}
		public TerminalNode K_ROLLBACK() { return getToken(SqlParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SqlParser.K_ABORT, 0); }
		public TerminalNode K_FAIL() { return getToken(SqlParser.K_FAIL, 0); }
		public Raise_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raise_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterRaise_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitRaise_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitRaise_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raise_functionContext raise_function() throws RecognitionException {
		Raise_functionContext _localctx = new Raise_functionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_raise_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1516);
			match(K_RAISE);
			setState(1517);
			match(OPEN_PAR);
			setState(1522);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_IGNORE:
				{
				setState(1518);
				match(K_IGNORE);
				}
				break;
			case K_ABORT:
			case K_FAIL:
			case K_ROLLBACK:
				{
				setState(1519);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || _la==K_FAIL || _la==K_ROLLBACK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1520);
				match(COMMA);
				setState(1521);
				error_message();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1524);
			match(CLOSE_PAR);
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

	public static class Indexed_columnContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SqlParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(SqlParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SqlParser.K_DESC, 0); }
		public Indexed_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexed_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterIndexed_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitIndexed_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitIndexed_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Indexed_columnContext indexed_column() throws RecognitionException {
		Indexed_columnContext _localctx = new Indexed_columnContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1526);
			column_name();
			setState(1529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1527);
				match(K_COLLATE);
				setState(1528);
				collation_name();
				}
			}

			setState(1532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1531);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
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

	public static class Table_constraintContext extends ParserRuleContext {
		public Table_constraint_primary_keyContext table_constraint_primary_key() {
			return getRuleContext(Table_constraint_primary_keyContext.class,0);
		}
		public Table_constraint_keyContext table_constraint_key() {
			return getRuleContext(Table_constraint_keyContext.class,0);
		}
		public Table_constraint_uniqueContext table_constraint_unique() {
			return getRuleContext(Table_constraint_uniqueContext.class,0);
		}
		public TerminalNode K_CHECK() { return getToken(SqlParser.K_CHECK, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Table_constraint_foreign_keyContext table_constraint_foreign_key() {
			return getRuleContext(Table_constraint_foreign_keyContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(SqlParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTable_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTable_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTable_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraintContext table_constraint() throws RecognitionException {
		Table_constraintContext _localctx = new Table_constraintContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1534);
				match(K_CONSTRAINT);
				setState(1535);
				name();
				}
			}

			setState(1547);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(1538);
				table_constraint_primary_key();
				}
				break;
			case K_KEY:
				{
				setState(1539);
				table_constraint_key();
				}
				break;
			case K_UNIQUE:
				{
				setState(1540);
				table_constraint_unique();
				}
				break;
			case K_CHECK:
				{
				setState(1541);
				match(K_CHECK);
				setState(1542);
				match(OPEN_PAR);
				setState(1543);
				expr(0);
				setState(1544);
				match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
				setState(1546);
				table_constraint_foreign_key();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Table_constraint_primary_keyContext extends ParserRuleContext {
		public TerminalNode K_PRIMARY() { return getToken(SqlParser.K_PRIMARY, 0); }
		public TerminalNode K_KEY() { return getToken(SqlParser.K_KEY, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Table_constraint_primary_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_primary_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTable_constraint_primary_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTable_constraint_primary_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTable_constraint_primary_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_primary_keyContext table_constraint_primary_key() throws RecognitionException {
		Table_constraint_primary_keyContext _localctx = new Table_constraint_primary_keyContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_table_constraint_primary_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1549);
			match(K_PRIMARY);
			setState(1550);
			match(K_KEY);
			setState(1551);
			match(OPEN_PAR);
			setState(1552);
			indexed_column();
			setState(1557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1553);
				match(COMMA);
				setState(1554);
				indexed_column();
				}
				}
				setState(1559);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1560);
			match(CLOSE_PAR);
			setState(1561);
			conflict_clause();
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

	public static class Table_constraint_foreign_keyContext extends ParserRuleContext {
		public TerminalNode K_FOREIGN() { return getToken(SqlParser.K_FOREIGN, 0); }
		public TerminalNode K_KEY() { return getToken(SqlParser.K_KEY, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Fk_origin_column_nameContext> fk_origin_column_name() {
			return getRuleContexts(Fk_origin_column_nameContext.class);
		}
		public Fk_origin_column_nameContext fk_origin_column_name(int i) {
			return getRuleContext(Fk_origin_column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Table_constraint_foreign_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_foreign_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTable_constraint_foreign_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTable_constraint_foreign_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTable_constraint_foreign_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_foreign_keyContext table_constraint_foreign_key() throws RecognitionException {
		Table_constraint_foreign_keyContext _localctx = new Table_constraint_foreign_keyContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_table_constraint_foreign_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1563);
			match(K_FOREIGN);
			setState(1564);
			match(K_KEY);
			setState(1565);
			match(OPEN_PAR);
			setState(1566);
			fk_origin_column_name();
			setState(1571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1567);
				match(COMMA);
				setState(1568);
				fk_origin_column_name();
				}
				}
				setState(1573);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1574);
			match(CLOSE_PAR);
			setState(1575);
			foreign_key_clause();
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

	public static class Table_constraint_uniqueContext extends ParserRuleContext {
		public TerminalNode K_UNIQUE() { return getToken(SqlParser.K_UNIQUE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public TerminalNode K_KEY() { return getToken(SqlParser.K_KEY, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Table_constraint_uniqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_unique; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTable_constraint_unique(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTable_constraint_unique(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTable_constraint_unique(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_uniqueContext table_constraint_unique() throws RecognitionException {
		Table_constraint_uniqueContext _localctx = new Table_constraint_uniqueContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_table_constraint_unique);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1577);
			match(K_UNIQUE);
			setState(1579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_KEY) {
				{
				setState(1578);
				match(K_KEY);
				}
			}

			setState(1582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 175)) & ~0x3f) == 0 && ((1L << (_la - 175)) & ((1L << (STRING_LITERAL - 175)) | (1L << (IDENTIFIER - 175)) | (1L << (RANDOM_NAME - 175)))) != 0)) {
				{
				setState(1581);
				name();
				}
			}

			setState(1584);
			match(OPEN_PAR);
			setState(1585);
			indexed_column();
			setState(1590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1586);
				match(COMMA);
				setState(1587);
				indexed_column();
				}
				}
				setState(1592);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1593);
			match(CLOSE_PAR);
			setState(1594);
			conflict_clause();
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

	public static class Table_constraint_keyContext extends ParserRuleContext {
		public TerminalNode K_KEY() { return getToken(SqlParser.K_KEY, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Table_constraint_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTable_constraint_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTable_constraint_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTable_constraint_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_keyContext table_constraint_key() throws RecognitionException {
		Table_constraint_keyContext _localctx = new Table_constraint_keyContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_table_constraint_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1596);
			match(K_KEY);
			setState(1598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 175)) & ~0x3f) == 0 && ((1L << (_la - 175)) & ((1L << (STRING_LITERAL - 175)) | (1L << (IDENTIFIER - 175)) | (1L << (RANDOM_NAME - 175)))) != 0)) {
				{
				setState(1597);
				name();
				}
			}

			setState(1600);
			match(OPEN_PAR);
			setState(1601);
			indexed_column();
			setState(1606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1602);
				match(COMMA);
				setState(1603);
				indexed_column();
				}
				}
				setState(1608);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1609);
			match(CLOSE_PAR);
			setState(1610);
			conflict_clause();
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

	public static class Fk_origin_column_nameContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Fk_origin_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fk_origin_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFk_origin_column_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFk_origin_column_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFk_origin_column_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fk_origin_column_nameContext fk_origin_column_name() throws RecognitionException {
		Fk_origin_column_nameContext _localctx = new Fk_origin_column_nameContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_fk_origin_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1612);
			column_name();
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

	public static class With_clauseContext extends ParserRuleContext {
		public TerminalNode K_WITH() { return getToken(SqlParser.K_WITH, 0); }
		public List<Cte_table_nameContext> cte_table_name() {
			return getRuleContexts(Cte_table_nameContext.class);
		}
		public Cte_table_nameContext cte_table_name(int i) {
			return getRuleContext(Cte_table_nameContext.class,i);
		}
		public List<TerminalNode> K_AS() { return getTokens(SqlParser.K_AS); }
		public TerminalNode K_AS(int i) {
			return getToken(SqlParser.K_AS, i);
		}
		public List<TerminalNode> OPEN_PAR() { return getTokens(SqlParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SqlParser.OPEN_PAR, i);
		}
		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}
		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SqlParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SqlParser.CLOSE_PAR, i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SqlParser.K_RECURSIVE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public With_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterWith_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitWith_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitWith_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_clauseContext with_clause() throws RecognitionException {
		With_clauseContext _localctx = new With_clauseContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_with_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1614);
			match(K_WITH);
			setState(1616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_RECURSIVE) {
				{
				setState(1615);
				match(K_RECURSIVE);
				}
			}

			setState(1618);
			cte_table_name();
			setState(1619);
			match(K_AS);
			setState(1620);
			match(OPEN_PAR);
			setState(1621);
			select_stmt();
			setState(1622);
			match(CLOSE_PAR);
			setState(1632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1623);
				match(COMMA);
				setState(1624);
				cte_table_name();
				setState(1625);
				match(K_AS);
				setState(1626);
				match(OPEN_PAR);
				setState(1627);
				select_stmt();
				setState(1628);
				match(CLOSE_PAR);
				}
				}
				setState(1634);
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

	public static class Qualified_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public TerminalNode K_INDEXED() { return getToken(SqlParser.K_INDEXED, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public Qualified_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterQualified_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitQualified_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitQualified_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualified_table_nameContext qualified_table_name() throws RecognitionException {
		Qualified_table_nameContext _localctx = new Qualified_table_nameContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_qualified_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1638);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				{
				setState(1635);
				database_name();
				setState(1636);
				match(DOT);
				}
				break;
			}
			setState(1640);
			table_name();
			setState(1646);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(1641);
				match(K_INDEXED);
				setState(1642);
				match(K_BY);
				setState(1643);
				index_name();
				}
				break;
			case K_NOT:
				{
				setState(1644);
				match(K_NOT);
				setState(1645);
				match(K_INDEXED);
				}
				break;
			case EOF:
			case SCOL:
			case K_ALTER:
			case K_ANALYZE:
			case K_ATTACH:
			case K_BEGIN:
			case K_COMMIT:
			case K_CREATE:
			case K_DELETE:
			case K_DETACH:
			case K_DROP:
			case K_END:
			case K_EXPLAIN:
			case K_INSERT:
			case K_LIMIT:
			case K_ORDER:
			case K_PRAGMA:
			case K_REINDEX:
			case K_RELEASE:
			case K_REPLACE:
			case K_ROLLBACK:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_SET:
			case K_UPDATE:
			case K_VACUUM:
			case K_VALUES:
			case K_WHERE:
			case K_WITH:
			case UNEXPECTED_CHAR:
				break;
			default:
				break;
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

	public static class Ordering_termContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SqlParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(SqlParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SqlParser.K_DESC, 0); }
		public Ordering_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordering_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterOrdering_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitOrdering_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitOrdering_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ordering_termContext ordering_term() throws RecognitionException {
		Ordering_termContext _localctx = new Ordering_termContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1648);
			expr(0);
			setState(1651);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				{
				setState(1649);
				match(K_COLLATE);
				setState(1650);
				collation_name();
				}
				break;
			}
			setState(1654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				{
				setState(1653);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
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

	public static class Pragma_valueContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SqlParser.STRING_LITERAL, 0); }
		public Pragma_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterPragma_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitPragma_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitPragma_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_valueContext pragma_value() throws RecognitionException {
		Pragma_valueContext _localctx = new Pragma_valueContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_pragma_value);
		try {
			setState(1659);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1656);
				signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1657);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1658);
				match(STRING_LITERAL);
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

	public static class Common_table_expressionContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SqlParser.K_AS, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SqlParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SqlParser.OPEN_PAR, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SqlParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SqlParser.CLOSE_PAR, i);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Common_table_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_table_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCommon_table_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCommon_table_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCommon_table_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Common_table_expressionContext common_table_expression() throws RecognitionException {
		Common_table_expressionContext _localctx = new Common_table_expressionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1661);
			table_name();
			setState(1673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1662);
				match(OPEN_PAR);
				setState(1663);
				column_name();
				setState(1668);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1664);
					match(COMMA);
					setState(1665);
					column_name();
					}
					}
					setState(1670);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1671);
				match(CLOSE_PAR);
				}
			}

			setState(1675);
			match(K_AS);
			setState(1676);
			match(OPEN_PAR);
			setState(1677);
			select_stmt();
			setState(1678);
			match(CLOSE_PAR);
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

	public static class Result_columnContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(SqlParser.STAR, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SqlParser.K_AS, 0); }
		public Result_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterResult_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitResult_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitResult_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Result_columnContext result_column() throws RecognitionException {
		Result_columnContext _localctx = new Result_columnContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_result_column);
		int _la;
		try {
			setState(1692);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1680);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1681);
				table_name();
				setState(1682);
				match(DOT);
				setState(1683);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1685);
				expr(0);
				setState(1690);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
				case 1:
					{
					setState(1687);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1686);
						match(K_AS);
						}
					}

					setState(1689);
					column_alias();
					}
					break;
				}
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

	public static class Table_or_subqueryContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode K_INDEXED() { return getToken(SqlParser.K_INDEXED, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_AS() { return getToken(SqlParser.K_AS, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Table_or_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTable_or_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTable_or_subquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTable_or_subquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_subqueryContext table_or_subquery() throws RecognitionException {
		Table_or_subqueryContext _localctx = new Table_or_subqueryContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_table_or_subquery);
		int _la;
		try {
			setState(1741);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1697);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
				case 1:
					{
					setState(1694);
					database_name();
					setState(1695);
					match(DOT);
					}
					break;
				}
				setState(1699);
				table_name();
				setState(1704);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
				case 1:
					{
					setState(1701);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1700);
						match(K_AS);
						}
					}

					setState(1703);
					table_alias();
					}
					break;
				}
				setState(1711);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
				case 1:
					{
					setState(1706);
					match(K_INDEXED);
					setState(1707);
					match(K_BY);
					setState(1708);
					index_name();
					}
					break;
				case 2:
					{
					setState(1709);
					match(K_NOT);
					setState(1710);
					match(K_INDEXED);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1713);
				match(OPEN_PAR);
				setState(1723);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
				case 1:
					{
					setState(1714);
					table_or_subquery();
					setState(1719);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1715);
						match(COMMA);
						setState(1716);
						table_or_subquery();
						}
						}
						setState(1721);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1722);
					join_clause();
					}
					break;
				}
				setState(1725);
				match(CLOSE_PAR);
				setState(1730);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
				case 1:
					{
					setState(1727);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1726);
						match(K_AS);
						}
					}

					setState(1729);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1732);
				match(OPEN_PAR);
				setState(1733);
				select_stmt();
				setState(1734);
				match(CLOSE_PAR);
				setState(1739);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
				case 1:
					{
					setState(1736);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1735);
						match(K_AS);
						}
					}

					setState(1738);
					table_alias();
					}
					break;
				}
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

	public static class Join_clauseContext extends ParserRuleContext {
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public List<Join_operatorContext> join_operator() {
			return getRuleContexts(Join_operatorContext.class);
		}
		public Join_operatorContext join_operator(int i) {
			return getRuleContext(Join_operatorContext.class,i);
		}
		public List<Join_constraintContext> join_constraint() {
			return getRuleContexts(Join_constraintContext.class);
		}
		public Join_constraintContext join_constraint(int i) {
			return getRuleContext(Join_constraintContext.class,i);
		}
		public Join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterJoin_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitJoin_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitJoin_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_join_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1743);
			table_or_subquery();
			setState(1750);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,232,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1744);
					join_operator();
					setState(1745);
					table_or_subquery();
					setState(1746);
					join_constraint();
					}
					} 
				}
				setState(1752);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,232,_ctx);
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

	public static class Join_operatorContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(SqlParser.COMMA, 0); }
		public TerminalNode K_JOIN() { return getToken(SqlParser.K_JOIN, 0); }
		public TerminalNode K_NATURAL() { return getToken(SqlParser.K_NATURAL, 0); }
		public TerminalNode K_LEFT() { return getToken(SqlParser.K_LEFT, 0); }
		public TerminalNode K_INNER() { return getToken(SqlParser.K_INNER, 0); }
		public TerminalNode K_CROSS() { return getToken(SqlParser.K_CROSS, 0); }
		public TerminalNode K_OUTER() { return getToken(SqlParser.K_OUTER, 0); }
		public Join_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterJoin_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitJoin_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitJoin_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_operatorContext join_operator() throws RecognitionException {
		Join_operatorContext _localctx = new Join_operatorContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_join_operator);
		int _la;
		try {
			setState(1766);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1753);
				match(COMMA);
				}
				break;
			case K_CROSS:
			case K_INNER:
			case K_JOIN:
			case K_LEFT:
			case K_NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1755);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NATURAL) {
					{
					setState(1754);
					match(K_NATURAL);
					}
				}

				setState(1763);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(1757);
					match(K_LEFT);
					setState(1759);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(1758);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(1761);
					match(K_INNER);
					}
					break;
				case K_CROSS:
					{
					setState(1762);
					match(K_CROSS);
					}
					break;
				case K_JOIN:
					break;
				default:
					break;
				}
				setState(1765);
				match(K_JOIN);
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

	public static class Join_constraintContext extends ParserRuleContext {
		public TerminalNode K_ON() { return getToken(SqlParser.K_ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_USING() { return getToken(SqlParser.K_USING, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Join_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterJoin_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitJoin_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitJoin_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_constraintContext join_constraint() throws RecognitionException {
		Join_constraintContext _localctx = new Join_constraintContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_join_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1782);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				{
				setState(1768);
				match(K_ON);
				setState(1769);
				expr(0);
				}
				break;
			case 2:
				{
				setState(1770);
				match(K_USING);
				setState(1771);
				match(OPEN_PAR);
				setState(1772);
				column_name();
				setState(1777);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1773);
					match(COMMA);
					setState(1774);
					column_name();
					}
					}
					setState(1779);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1780);
				match(CLOSE_PAR);
				}
				break;
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

	public static class Select_coreContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(SqlParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode K_FROM() { return getToken(SqlParser.K_FROM, 0); }
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_GROUP() { return getToken(SqlParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SqlParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(SqlParser.K_ALL, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_HAVING() { return getToken(SqlParser.K_HAVING, 0); }
		public TerminalNode K_VALUES() { return getToken(SqlParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SqlParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SqlParser.OPEN_PAR, i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SqlParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SqlParser.CLOSE_PAR, i);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public Select_coreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_core; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSelect_core(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSelect_core(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSelect_core(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_coreContext select_core() throws RecognitionException {
		Select_coreContext _localctx = new Select_coreContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_select_core);
		int _la;
		try {
			setState(1860);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1784);
				match(K_SELECT);
				setState(1786);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ALL || _la==K_DISTINCT) {
					{
					setState(1785);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1788);
				result_column();
				setState(1793);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1789);
					match(COMMA);
					setState(1790);
					result_column();
					}
					}
					setState(1795);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1808);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(1796);
					match(K_FROM);
					setState(1806);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
					case 1:
						{
						setState(1797);
						table_or_subquery();
						setState(1802);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1798);
							match(COMMA);
							setState(1799);
							table_or_subquery();
							}
							}
							setState(1804);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(1805);
						join_clause();
						}
						break;
					}
					}
				}

				setState(1812);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(1810);
					match(K_WHERE);
					setState(1811);
					expr(0);
					}
				}

				setState(1828);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(1814);
					match(K_GROUP);
					setState(1815);
					match(K_BY);
					setState(1816);
					expr(0);
					setState(1821);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1817);
						match(COMMA);
						setState(1818);
						expr(0);
						}
						}
						setState(1823);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1826);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(1824);
						match(K_HAVING);
						setState(1825);
						expr(0);
						}
					}

					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(1830);
				match(K_VALUES);
				setState(1831);
				match(OPEN_PAR);
				setState(1832);
				expr(0);
				setState(1837);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1833);
					match(COMMA);
					setState(1834);
					expr(0);
					}
					}
					setState(1839);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1840);
				match(CLOSE_PAR);
				setState(1855);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1841);
					match(COMMA);
					setState(1842);
					match(OPEN_PAR);
					setState(1843);
					expr(0);
					setState(1848);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1844);
						match(COMMA);
						setState(1845);
						expr(0);
						}
						}
						setState(1850);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1851);
					match(CLOSE_PAR);
					}
					}
					setState(1857);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1858);
				function();
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

	public static class Compound_operatorContext extends ParserRuleContext {
		public TerminalNode K_UNION() { return getToken(SqlParser.K_UNION, 0); }
		public TerminalNode K_ALL() { return getToken(SqlParser.K_ALL, 0); }
		public TerminalNode K_INTERSECT() { return getToken(SqlParser.K_INTERSECT, 0); }
		public TerminalNode K_EXCEPT() { return getToken(SqlParser.K_EXCEPT, 0); }
		public Compound_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCompound_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCompound_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCompound_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_operatorContext compound_operator() throws RecognitionException {
		Compound_operatorContext _localctx = new Compound_operatorContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_compound_operator);
		try {
			setState(1867);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1862);
				match(K_UNION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1863);
				match(K_UNION);
				setState(1864);
				match(K_ALL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1865);
				match(K_INTERSECT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1866);
				match(K_EXCEPT);
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

	public static class Cte_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Cte_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCte_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCte_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCte_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_table_nameContext cte_table_name() throws RecognitionException {
		Cte_table_nameContext _localctx = new Cte_table_nameContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_cte_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1869);
			table_name();
			setState(1881);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1870);
				match(OPEN_PAR);
				setState(1871);
				column_name();
				setState(1876);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1872);
					match(COMMA);
					setState(1873);
					column_name();
					}
					}
					setState(1878);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1879);
				match(CLOSE_PAR);
				}
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

	public static class Signed_numberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SqlParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STAR() { return getToken(SqlParser.STAR, 0); }
		public TerminalNode PLUS() { return getToken(SqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlParser.MINUS, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSigned_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSigned_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSigned_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1888);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NUMERIC_LITERAL:
				{
				setState(1884);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(1883);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1886);
				match(NUMERIC_LITERAL);
				}
				break;
			case STAR:
				{
				setState(1887);
				match(STAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SqlParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SqlParser.STRING_LITERAL, 0); }
		public TerminalNode BLOB_LITERAL() { return getToken(SqlParser.BLOB_LITERAL, 0); }
		public TerminalNode K_NULL() { return getToken(SqlParser.K_NULL, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SqlParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(SqlParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SqlParser.K_CURRENT_TIMESTAMP, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitLiteral_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitLiteral_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1890);
			_la = _input.LA(1);
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (K_CURRENT_DATE - 66)) | (1L << (K_CURRENT_TIME - 66)) | (1L << (K_CURRENT_TIMESTAMP - 66)) | (1L << (K_NULL - 66)))) != 0) || ((((_la - 175)) & ~0x3f) == 0 && ((1L << (_la - 175)) & ((1L << (STRING_LITERAL - 175)) | (1L << (NUMERIC_LITERAL - 175)) | (1L << (BLOB_LITERAL - 175)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(SqlParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SqlParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(SqlParser.TILDE, 0); }
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1892);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TILDE))) != 0) || _la==K_NOT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Error_messageContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(SqlParser.STRING_LITERAL, 0); }
		public Error_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterError_message(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitError_message(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitError_message(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_messageContext error_message() throws RecognitionException {
		Error_messageContext _localctx = new Error_messageContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1894);
			match(STRING_LITERAL);
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

	public static class Module_argumentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public Module_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterModule_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitModule_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitModule_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_argumentContext module_argument() throws RecognitionException {
		Module_argumentContext _localctx = new Module_argumentContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_module_argument);
		try {
			setState(1898);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1896);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1897);
				column_def();
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

	public static class Column_aliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SqlParser.STRING_LITERAL, 0); }
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1900);
			_la = _input.LA(1);
			if ( !(_la==STRING_LITERAL || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class String_rulesContext extends ParserRuleContext {
		public List<TerminalNode> DOUBEL() { return getTokens(SqlParser.DOUBEL); }
		public TerminalNode DOUBEL(int i) {
			return getToken(SqlParser.DOUBEL, i);
		}
		public TerminalNode RANDOM_NAME() { return getToken(SqlParser.RANDOM_NAME, 0); }
		public String_rulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_rules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterString_rules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitString_rules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitString_rules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_rulesContext string_rules() throws RecognitionException {
		String_rulesContext _localctx = new String_rulesContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_string_rules);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1902);
			match(DOUBEL);
			setState(1903);
			match(RANDOM_NAME);
			setState(1904);
			match(DOUBEL);
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

	public static class Char_ruleContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(SqlParser.DIGIT, 0); }
		public Char_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterChar_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitChar_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitChar_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Char_ruleContext char_rule() throws RecognitionException {
		Char_ruleContext _localctx = new Char_ruleContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_char_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1906);
			match(DIGIT);
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

	public static class Callback_funcContext extends ParserRuleContext {
		public Function_headerContext function_header() {
			return getRuleContext(Function_headerContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public List<While_ruleContext> while_rule() {
			return getRuleContexts(While_ruleContext.class);
		}
		public While_ruleContext while_rule(int i) {
			return getRuleContext(While_ruleContext.class,i);
		}
		public List<Do_whileContext> do_while() {
			return getRuleContexts(Do_whileContext.class);
		}
		public Do_whileContext do_while(int i) {
			return getRuleContext(Do_whileContext.class,i);
		}
		public List<If_else_ruleContext> if_else_rule() {
			return getRuleContexts(If_else_ruleContext.class);
		}
		public If_else_ruleContext if_else_rule(int i) {
			return getRuleContext(If_else_ruleContext.class,i);
		}
		public List<For_loop_ruleContext> for_loop_rule() {
			return getRuleContexts(For_loop_ruleContext.class);
		}
		public For_loop_ruleContext for_loop_rule(int i) {
			return getRuleContext(For_loop_ruleContext.class,i);
		}
		public Callback_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callback_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCallback_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCallback_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCallback_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Callback_funcContext callback_func() throws RecognitionException {
		Callback_funcContext _localctx = new Callback_funcContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_callback_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1908);
			function_header();
			setState(1909);
			match(T__3);
			setState(1916);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_FOR || _la==K_IF || _la==K_WILE || _la==K_DO) {
				{
				setState(1914);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_WILE:
					{
					setState(1910);
					while_rule();
					}
					break;
				case K_DO:
					{
					setState(1911);
					do_while();
					}
					break;
				case K_IF:
					{
					setState(1912);
					if_else_rule();
					}
					break;
				case K_FOR:
					{
					setState(1913);
					for_loop_rule();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1918);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1919);
			match(T__4);
			setState(1920);
			match(SCOL);
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

	public static class ArgsContext extends ParserRuleContext {
		public Create_ArrayContext create_Array() {
			return getRuleContext(Create_ArrayContext.class,0);
		}
		public Creating_varContext creating_var() {
			return getRuleContext(Creating_varContext.class,0);
		}
		public Callback_funcContext callback_func() {
			return getRuleContext(Callback_funcContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_args);
		try {
			setState(1925);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1922);
				create_Array();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1923);
				creating_var();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1924);
				callback_func();
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

	public static class Create_ArrayContext extends ParserRuleContext {
		public TerminalNode K_VAR() { return getToken(SqlParser.K_VAR, 0); }
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
		}
		public Create_ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_Array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCreate_Array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCreate_Array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCreate_Array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_ArrayContext create_Array() throws RecognitionException {
		Create_ArrayContext _localctx = new Create_ArrayContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_create_Array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1927);
			match(K_VAR);
			setState(1928);
			use_random_name();
			setState(1930); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1929);
				match(T__5);
				}
				}
				setState(1932); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__5 );
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

	public static class PrametersContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SqlParser.NUMERIC_LITERAL, 0); }
		public TerminalNode ONE_CHAR_LETTER() { return getToken(SqlParser.ONE_CHAR_LETTER, 0); }
		public Call_functionContext call_function() {
			return getRuleContext(Call_functionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
		}
		public TerminalNode AMP() { return getToken(SqlParser.AMP, 0); }
		public PrametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterPrameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitPrameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitPrameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrametersContext prameters() throws RecognitionException {
		PrametersContext _localctx = new PrametersContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_prameters);
		try {
			setState(1941);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1934);
				match(NUMERIC_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1935);
				match(ONE_CHAR_LETTER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1936);
				call_function();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1937);
				match(IDENTIFIER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1938);
				use_random_name();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1939);
				match(AMP);
				setState(1940);
				use_random_name();
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

	public static class Print_statmentContext extends ParserRuleContext {
		public TerminalNode K_PRINT() { return getToken(SqlParser.K_PRINT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public Indisde_the_printContext indisde_the_print() {
			return getRuleContext(Indisde_the_printContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public Print_statmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_statment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterPrint_statment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitPrint_statment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitPrint_statment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_statmentContext print_statment() throws RecognitionException {
		Print_statmentContext _localctx = new Print_statmentContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_print_statment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1943);
			match(K_PRINT);
			setState(1944);
			match(OPEN_PAR);
			setState(1945);
			indisde_the_print();
			setState(1946);
			match(CLOSE_PAR);
			setState(1947);
			match(SCOL);
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

	public static class Indisde_the_printContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SqlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SqlParser.IDENTIFIER, i);
		}
		public List<TerminalNode> RANDOM_NAME() { return getTokens(SqlParser.RANDOM_NAME); }
		public TerminalNode RANDOM_NAME(int i) {
			return getToken(SqlParser.RANDOM_NAME, i);
		}
		public List<Call_functionContext> call_function() {
			return getRuleContexts(Call_functionContext.class);
		}
		public Call_functionContext call_function(int i) {
			return getRuleContext(Call_functionContext.class,i);
		}
		public List<Indisde_the_print_part1Context> indisde_the_print_part1() {
			return getRuleContexts(Indisde_the_print_part1Context.class);
		}
		public Indisde_the_print_part1Context indisde_the_print_part1(int i) {
			return getRuleContext(Indisde_the_print_part1Context.class,i);
		}
		public List<Indisde_the_print_part2Context> indisde_the_print_part2() {
			return getRuleContexts(Indisde_the_print_part2Context.class);
		}
		public Indisde_the_print_part2Context indisde_the_print_part2(int i) {
			return getRuleContext(Indisde_the_print_part2Context.class,i);
		}
		public Indisde_the_printContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indisde_the_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterIndisde_the_print(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitIndisde_the_print(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitIndisde_the_print(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Indisde_the_printContext indisde_the_print() throws RecognitionException {
		Indisde_the_printContext _localctx = new Indisde_the_printContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_indisde_the_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1962);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 175)) & ~0x3f) == 0 && ((1L << (_la - 175)) & ((1L << (STRING_LITERAL - 175)) | (1L << (IDENTIFIER - 175)) | (1L << (RANDOM_NAME - 175)))) != 0)) {
				{
				setState(1960);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
				case 1:
					{
					{
					setState(1950);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
					case 1:
						{
						setState(1949);
						indisde_the_print_part1();
						}
						break;
					}
					setState(1952);
					match(IDENTIFIER);
					setState(1954);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PLUS) {
						{
						setState(1953);
						indisde_the_print_part2();
						}
					}

					}
					}
					break;
				case 2:
					{
					setState(1958);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
					case 1:
						{
						setState(1956);
						match(RANDOM_NAME);
						}
						break;
					case 2:
						{
						setState(1957);
						call_function();
						}
						break;
					}
					}
					break;
				}
				}
				setState(1964);
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

	public static class Indisde_the_print_part1Context extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(SqlParser.PLUS, 0); }
		public TerminalNode RANDOM_NAME() { return getToken(SqlParser.RANDOM_NAME, 0); }
		public Call_functionContext call_function() {
			return getRuleContext(Call_functionContext.class,0);
		}
		public Indisde_the_print_part1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indisde_the_print_part1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterIndisde_the_print_part1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitIndisde_the_print_part1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitIndisde_the_print_part1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Indisde_the_print_part1Context indisde_the_print_part1() throws RecognitionException {
		Indisde_the_print_part1Context _localctx = new Indisde_the_print_part1Context(_ctx, getState());
		enterRule(_localctx, 170, RULE_indisde_the_print_part1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1967);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
			case 1:
				{
				setState(1965);
				match(RANDOM_NAME);
				}
				break;
			case 2:
				{
				setState(1966);
				call_function();
				}
				break;
			}
			setState(1969);
			match(PLUS);
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

	public static class Indisde_the_print_part2Context extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(SqlParser.PLUS, 0); }
		public TerminalNode RANDOM_NAME() { return getToken(SqlParser.RANDOM_NAME, 0); }
		public Call_functionContext call_function() {
			return getRuleContext(Call_functionContext.class,0);
		}
		public Indisde_the_print_part2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indisde_the_print_part2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterIndisde_the_print_part2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitIndisde_the_print_part2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitIndisde_the_print_part2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Indisde_the_print_part2Context indisde_the_print_part2() throws RecognitionException {
		Indisde_the_print_part2Context _localctx = new Indisde_the_print_part2Context(_ctx, getState());
		enterRule(_localctx, 172, RULE_indisde_the_print_part2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1971);
			match(PLUS);
			setState(1974);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
			case 1:
				{
				setState(1972);
				match(RANDOM_NAME);
				}
				break;
			case 2:
				{
				setState(1973);
				call_function();
				}
				break;
			}
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

	public static class Call_functionContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public List<PrametersContext> prameters() {
			return getRuleContexts(PrametersContext.class);
		}
		public PrametersContext prameters(int i) {
			return getRuleContext(PrametersContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Call_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCall_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCall_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCall_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_functionContext call_function() throws RecognitionException {
		Call_functionContext _localctx = new Call_functionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_call_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1976);
			any_name();
			setState(1977);
			match(OPEN_PAR);
			setState(1988);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AMP || ((((_la - 174)) & ~0x3f) == 0 && ((1L << (_la - 174)) & ((1L << (ONE_CHAR_LETTER - 174)) | (1L << (STRING_LITERAL - 174)) | (1L << (IDENTIFIER - 174)) | (1L << (RANDOM_NAME - 174)) | (1L << (NUMERIC_LITERAL - 174)))) != 0)) {
				{
				{
				setState(1978);
				prameters();
				setState(1983);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1979);
					match(COMMA);
					setState(1980);
					prameters();
					}
					}
					setState(1985);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(1990);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1991);
			match(CLOSE_PAR);
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

	public static class Function_headerContext extends ParserRuleContext {
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public List<ArgsContext> args() {
			return getRuleContexts(ArgsContext.class);
		}
		public ArgsContext args(int i) {
			return getRuleContext(ArgsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Function_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFunction_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFunction_header(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFunction_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_headerContext function_header() throws RecognitionException {
		Function_headerContext _localctx = new Function_headerContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_function_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1993);
			use_random_name();
			setState(1994);
			match(OPEN_PAR);
			setState(2005);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_VAR || _la==RANDOM_NAME) {
				{
				{
				setState(1995);
				args();
				setState(2000);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1996);
					match(COMMA);
					setState(1997);
					args();
					}
					}
					setState(2002);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(2007);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2008);
			match(CLOSE_PAR);
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

	public static class Creating_varContext extends ParserRuleContext {
		public TerminalNode K_VAR() { return getToken(SqlParser.K_VAR, 0); }
		public TerminalNode RANDOM_NAME() { return getToken(SqlParser.RANDOM_NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(SqlParser.ASSIGN, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(SqlParser.NUMERIC_LITERAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public TerminalNode ONE_CHAR_LETTER() { return getToken(SqlParser.ONE_CHAR_LETTER, 0); }
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
		}
		public Call_functionContext call_function() {
			return getRuleContext(Call_functionContext.class,0);
		}
		public Creating_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creating_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCreating_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCreating_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCreating_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Creating_varContext creating_var() throws RecognitionException {
		Creating_varContext _localctx = new Creating_varContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_creating_var);
		try {
			setState(2022);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2010);
				match(K_VAR);
				setState(2011);
				match(RANDOM_NAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2012);
				match(K_VAR);
				setState(2013);
				match(RANDOM_NAME);
				setState(2014);
				match(ASSIGN);
				setState(2020);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
				case 1:
					{
					setState(2015);
					match(NUMERIC_LITERAL);
					}
					break;
				case 2:
					{
					setState(2016);
					match(IDENTIFIER);
					}
					break;
				case 3:
					{
					setState(2017);
					match(ONE_CHAR_LETTER);
					}
					break;
				case 4:
					{
					setState(2018);
					use_random_name();
					}
					break;
				case 5:
					{
					setState(2019);
					call_function();
					}
					break;
				}
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

	public static class Use_random_nameContext extends ParserRuleContext {
		public TerminalNode RANDOM_NAME() { return getToken(SqlParser.RANDOM_NAME, 0); }
		public Use_random_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use_random_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterUse_random_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitUse_random_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitUse_random_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Use_random_nameContext use_random_name() throws RecognitionException {
		Use_random_nameContext _localctx = new Use_random_nameContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_use_random_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2024);
			match(RANDOM_NAME);
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

	public static class If_else_ruleContext extends ParserRuleContext {
		public List<TerminalNode> K_IF() { return getTokens(SqlParser.K_IF); }
		public TerminalNode K_IF(int i) {
			return getToken(SqlParser.K_IF, i);
		}
		public List<TerminalNode> OPEN_PAR() { return getTokens(SqlParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SqlParser.OPEN_PAR, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SqlParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SqlParser.CLOSE_PAR, i);
		}
		public TerminalNode K_ELSE() { return getToken(SqlParser.K_ELSE, 0); }
		public List<If_else_ruleContext> if_else_rule() {
			return getRuleContexts(If_else_ruleContext.class);
		}
		public If_else_ruleContext if_else_rule(int i) {
			return getRuleContext(If_else_ruleContext.class,i);
		}
		public Call_functionContext call_function() {
			return getRuleContext(Call_functionContext.class,0);
		}
		public Creating_varContext creating_var() {
			return getRuleContext(Creating_varContext.class,0);
		}
		public If_else_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_else_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterIf_else_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitIf_else_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitIf_else_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_else_ruleContext if_else_rule() throws RecognitionException {
		If_else_ruleContext _localctx = new If_else_ruleContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_if_else_rule);
		int _la;
		try {
			setState(2097);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2087);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
				case 1:
					{
					setState(2026);
					match(K_IF);
					setState(2027);
					match(OPEN_PAR);
					setState(2028);
					expr(0);
					setState(2029);
					match(CLOSE_PAR);
					setState(2030);
					match(T__3);
					setState(2034);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==K_IF) {
						{
						{
						setState(2031);
						if_else_rule();
						}
						}
						setState(2036);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2037);
					match(T__4);
					}
					break;
				case 2:
					{
					setState(2039);
					match(K_IF);
					setState(2040);
					match(OPEN_PAR);
					setState(2041);
					expr(0);
					setState(2042);
					match(CLOSE_PAR);
					setState(2043);
					match(T__3);
					setState(2047);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==K_IF) {
						{
						{
						setState(2044);
						if_else_rule();
						}
						}
						setState(2049);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2050);
					match(T__4);
					setState(2051);
					match(K_ELSE);
					setState(2052);
					match(T__3);
					setState(2056);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==K_IF) {
						{
						{
						setState(2053);
						if_else_rule();
						}
						}
						setState(2058);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2059);
					match(T__4);
					}
					break;
				case 3:
					{
					setState(2061);
					match(K_IF);
					setState(2062);
					match(OPEN_PAR);
					setState(2063);
					expr(0);
					setState(2064);
					match(CLOSE_PAR);
					setState(2065);
					match(T__3);
					setState(2069);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==K_IF) {
						{
						{
						setState(2066);
						if_else_rule();
						}
						}
						setState(2071);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2072);
					match(T__4);
					setState(2073);
					match(K_ELSE);
					setState(2074);
					match(K_IF);
					setState(2075);
					match(OPEN_PAR);
					setState(2076);
					expr(0);
					setState(2077);
					match(CLOSE_PAR);
					setState(2078);
					match(T__3);
					setState(2082);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==K_IF) {
						{
						{
						setState(2079);
						if_else_rule();
						}
						}
						setState(2084);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2085);
					match(T__4);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2089);
				match(K_IF);
				setState(2090);
				match(OPEN_PAR);
				setState(2091);
				expr(0);
				setState(2092);
				match(CLOSE_PAR);
				setState(2095);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING_LITERAL:
				case IDENTIFIER:
				case RANDOM_NAME:
					{
					setState(2093);
					call_function();
					}
					break;
				case K_VAR:
					{
					setState(2094);
					creating_var();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class While_ruleContext extends ParserRuleContext {
		public TerminalNode K_WILE() { return getToken(SqlParser.K_WILE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public While_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterWhile_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitWhile_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitWhile_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_ruleContext while_rule() throws RecognitionException {
		While_ruleContext _localctx = new While_ruleContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_while_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
			case 1:
				{
				setState(2099);
				match(K_WILE);
				setState(2100);
				match(OPEN_PAR);
				setState(2101);
				expr(0);
				setState(2106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2102);
					match(COMMA);
					setState(2103);
					expr(0);
					}
					}
					setState(2108);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2109);
				match(CLOSE_PAR);
				setState(2110);
				match(T__3);
				setState(2111);
				match(T__4);
				}
				break;
			case 2:
				{
				setState(2113);
				match(K_WILE);
				setState(2114);
				match(OPEN_PAR);
				setState(2115);
				expr(0);
				setState(2120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2116);
					match(COMMA);
					setState(2117);
					expr(0);
					}
					}
					setState(2122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2123);
				match(CLOSE_PAR);
				setState(2124);
				match(SCOL);
				}
				break;
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

	public static class Do_whileContext extends ParserRuleContext {
		public TerminalNode K_DO() { return getToken(SqlParser.K_DO, 0); }
		public While_ruleContext while_rule() {
			return getRuleContext(While_ruleContext.class,0);
		}
		public Do_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDo_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDo_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDo_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_whileContext do_while() throws RecognitionException {
		Do_whileContext _localctx = new Do_whileContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_do_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2128);
			match(K_DO);
			setState(2129);
			match(T__3);
			setState(2130);
			match(T__4);
			setState(2131);
			while_rule();
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

	public static class Function_bodyContext extends ParserRuleContext {
		public TerminalNode K_RETURN() { return getToken(SqlParser.K_RETURN, 0); }
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public List<Do_whileContext> do_while() {
			return getRuleContexts(Do_whileContext.class);
		}
		public Do_whileContext do_while(int i) {
			return getRuleContext(Do_whileContext.class,i);
		}
		public List<While_ruleContext> while_rule() {
			return getRuleContexts(While_ruleContext.class);
		}
		public While_ruleContext while_rule(int i) {
			return getRuleContext(While_ruleContext.class,i);
		}
		public List<If_else_ruleContext> if_else_rule() {
			return getRuleContexts(If_else_ruleContext.class);
		}
		public If_else_ruleContext if_else_rule(int i) {
			return getRuleContext(If_else_ruleContext.class,i);
		}
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFunction_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFunction_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFunction_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_function_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2133);
			match(T__3);
			setState(2139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_IF || _la==K_WILE || _la==K_DO) {
				{
				setState(2137);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_DO:
					{
					setState(2134);
					do_while();
					}
					break;
				case K_WILE:
					{
					setState(2135);
					while_rule();
					}
					break;
				case K_IF:
					{
					setState(2136);
					if_else_rule();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2142);
			match(K_RETURN);
			setState(2143);
			match(SCOL);
			setState(2144);
			match(T__4);
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

	public static class For_loop_ruleContext extends ParserRuleContext {
		public TerminalNode K_FOR() { return getToken(SqlParser.K_FOR, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<TerminalNode> SCOL() { return getTokens(SqlParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SqlParser.SCOL, i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode K_VAR() { return getToken(SqlParser.K_VAR, 0); }
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SqlParser.ASSIGN, 0); }
		public List<TerminalNode> NUMERIC_LITERAL() { return getTokens(SqlParser.NUMERIC_LITERAL); }
		public TerminalNode NUMERIC_LITERAL(int i) {
			return getToken(SqlParser.NUMERIC_LITERAL, i);
		}
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public Comparative_processesContext comparative_processes() {
			return getRuleContext(Comparative_processesContext.class,0);
		}
		public List<Increase_decreaseContext> increase_decrease() {
			return getRuleContexts(Increase_decreaseContext.class);
		}
		public Increase_decreaseContext increase_decrease(int i) {
			return getRuleContext(Increase_decreaseContext.class,i);
		}
		public For_loop_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFor_loop_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFor_loop_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFor_loop_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loop_ruleContext for_loop_rule() throws RecognitionException {
		For_loop_ruleContext _localctx = new For_loop_ruleContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_for_loop_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2146);
			match(K_FOR);
			setState(2147);
			match(OPEN_PAR);
			setState(2153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(2148);
				match(K_VAR);
				setState(2149);
				use_random_name();
				setState(2150);
				match(ASSIGN);
				setState(2151);
				match(NUMERIC_LITERAL);
				}
			}

			setState(2155);
			match(SCOL);
			setState(2160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 175)) & ~0x3f) == 0 && ((1L << (_la - 175)) & ((1L << (STRING_LITERAL - 175)) | (1L << (IDENTIFIER - 175)) | (1L << (RANDOM_NAME - 175)))) != 0)) {
				{
				setState(2156);
				any_name();
				setState(2157);
				comparative_processes();
				setState(2158);
				match(NUMERIC_LITERAL);
				}
			}

			setState(2162);
			match(SCOL);
			setState(2167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7 || _la==T__8 || ((((_la - 175)) & ~0x3f) == 0 && ((1L << (_la - 175)) & ((1L << (STRING_LITERAL - 175)) | (1L << (IDENTIFIER - 175)) | (1L << (RANDOM_NAME - 175)))) != 0)) {
				{
				setState(2163);
				increase_decrease();
				setState(2164);
				any_name();
				setState(2165);
				increase_decrease();
				}
			}

			setState(2169);
			match(CLOSE_PAR);
			setState(2170);
			match(T__3);
			setState(2171);
			match(T__4);
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

	public static class Operand_of_arithematic_ruleContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SqlParser.NUMERIC_LITERAL, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Call_functionContext call_function() {
			return getRuleContext(Call_functionContext.class,0);
		}
		public Operand_of_arithematic_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand_of_arithematic_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterOperand_of_arithematic_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitOperand_of_arithematic_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitOperand_of_arithematic_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operand_of_arithematic_ruleContext operand_of_arithematic_rule() throws RecognitionException {
		Operand_of_arithematic_ruleContext _localctx = new Operand_of_arithematic_ruleContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_operand_of_arithematic_rule);
		try {
			setState(2176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2173);
				match(NUMERIC_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2174);
				any_name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2175);
				call_function();
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

	public static class Comparative_processesContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(SqlParser.GT, 0); }
		public TerminalNode LT() { return getToken(SqlParser.LT, 0); }
		public TerminalNode GT_EQ() { return getToken(SqlParser.GT_EQ, 0); }
		public TerminalNode EQ() { return getToken(SqlParser.EQ, 0); }
		public TerminalNode NOT_EQ1() { return getToken(SqlParser.NOT_EQ1, 0); }
		public Comparative_processesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparative_processes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterComparative_processes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitComparative_processes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitComparative_processes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparative_processesContext comparative_processes() throws RecognitionException {
		Comparative_processesContext _localctx = new Comparative_processesContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_comparative_processes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2178);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << GT) | (1L << GT_EQ) | (1L << EQ) | (1L << NOT_EQ1))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Arithematic_ruleContext extends ParserRuleContext {
		public List<Operand_of_arithematic_ruleContext> operand_of_arithematic_rule() {
			return getRuleContexts(Operand_of_arithematic_ruleContext.class);
		}
		public Operand_of_arithematic_ruleContext operand_of_arithematic_rule(int i) {
			return getRuleContext(Operand_of_arithematic_ruleContext.class,i);
		}
		public Comparative_processesContext comparative_processes() {
			return getRuleContext(Comparative_processesContext.class,0);
		}
		public Arithematic_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithematic_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterArithematic_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitArithematic_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitArithematic_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithematic_ruleContext arithematic_rule() throws RecognitionException {
		Arithematic_ruleContext _localctx = new Arithematic_ruleContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_arithematic_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2180);
			operand_of_arithematic_rule();
			setState(2181);
			comparative_processes();
			setState(2182);
			operand_of_arithematic_rule();
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

	public static class SContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(SqlParser.GT, 0); }
		public List<Arithematic_ruleContext> arithematic_rule() {
			return getRuleContexts(Arithematic_ruleContext.class);
		}
		public Arithematic_ruleContext arithematic_rule(int i) {
			return getRuleContext(Arithematic_ruleContext.class,i);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_s);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 175)) & ~0x3f) == 0 && ((1L << (_la - 175)) & ((1L << (STRING_LITERAL - 175)) | (1L << (IDENTIFIER - 175)) | (1L << (RANDOM_NAME - 175)) | (1L << (NUMERIC_LITERAL - 175)))) != 0)) {
				{
				{
				setState(2184);
				arithematic_rule();
				}
				}
				setState(2189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2190);
			match(GT);
			setState(2194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 175)) & ~0x3f) == 0 && ((1L << (_la - 175)) & ((1L << (STRING_LITERAL - 175)) | (1L << (IDENTIFIER - 175)) | (1L << (RANDOM_NAME - 175)) | (1L << (NUMERIC_LITERAL - 175)))) != 0)) {
				{
				{
				setState(2191);
				arithematic_rule();
				}
				}
				setState(2196);
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

	public static class FunctionContext extends ParserRuleContext {
		public Function_headerContext function_header() {
			return getRuleContext(Function_headerContext.class,0);
		}
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2197);
			function_header();
			setState(2198);
			function_body();
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

	public static class SwitchContext extends ParserRuleContext {
		public TerminalNode K_SWITCH() { return getToken(SqlParser.K_SWITCH, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public List<CaseContext> case() {
			return getRuleContexts(CaseContext.class);
		}
		public CaseContext case(int i) {
			return getRuleContext(CaseContext.class,i);
		}
		public DefultContext defult() {
			return getRuleContext(DefultContext.class,0);
		}
		public SwitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSwitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSwitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSwitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchContext switch() throws RecognitionException {
		SwitchContext _localctx = new SwitchContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_switch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2200);
			match(K_SWITCH);
			setState(2201);
			match(OPEN_PAR);
			setState(2202);
			use_random_name();
			setState(2203);
			match(CLOSE_PAR);
			setState(2204);
			match(T__3);
			setState(2206); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2205);
				case();
				}
				}
				setState(2208); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_CASE );
			setState(2211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_DEFAULT) {
				{
				setState(2210);
				defult();
				}
			}

			setState(2213);
			match(T__4);
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

	public static class DefultContext extends ParserRuleContext {
		public TerminalNode K_DEFAULT() { return getToken(SqlParser.K_DEFAULT, 0); }
		public DefultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDefult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDefult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDefult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefultContext defult() throws RecognitionException {
		DefultContext _localctx = new DefultContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_defult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2215);
			match(K_DEFAULT);
			setState(2216);
			match(T__6);
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

	public static class CaseContext extends ParserRuleContext {
		public TerminalNode K_CASE() { return getToken(SqlParser.K_CASE, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode ONE_CHAR_LETTER() { return getToken(SqlParser.ONE_CHAR_LETTER, 0); }
		public TerminalNode K_BRECK() { return getToken(SqlParser.K_BRECK, 0); }
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public CaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseContext case() throws RecognitionException {
		CaseContext _localctx = new CaseContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_case);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2218);
			match(K_CASE);
			setState(2221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
			case IDENTIFIER:
			case RANDOM_NAME:
				{
				setState(2219);
				any_name();
				}
				break;
			case ONE_CHAR_LETTER:
				{
				setState(2220);
				match(ONE_CHAR_LETTER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2223);
			match(T__6);
			setState(2226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_BRECK) {
				{
				setState(2224);
				match(K_BRECK);
				setState(2225);
				match(SCOL);
				}
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

	public static class ForeachContext extends ParserRuleContext {
		public TerminalNode K_FOREACH() { return getToken(SqlParser.K_FOREACH, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode K_VAR() { return getToken(SqlParser.K_VAR, 0); }
		public List<Use_random_nameContext> use_random_name() {
			return getRuleContexts(Use_random_nameContext.class);
		}
		public Use_random_nameContext use_random_name(int i) {
			return getRuleContext(Use_random_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public List<Call_functionContext> call_function() {
			return getRuleContexts(Call_functionContext.class);
		}
		public Call_functionContext call_function(int i) {
			return getRuleContext(Call_functionContext.class,i);
		}
		public List<While_ruleContext> while_rule() {
			return getRuleContexts(While_ruleContext.class);
		}
		public While_ruleContext while_rule(int i) {
			return getRuleContext(While_ruleContext.class,i);
		}
		public List<Do_whileContext> do_while() {
			return getRuleContexts(Do_whileContext.class);
		}
		public Do_whileContext do_while(int i) {
			return getRuleContext(Do_whileContext.class,i);
		}
		public List<If_else_ruleContext> if_else_rule() {
			return getRuleContexts(If_else_ruleContext.class);
		}
		public If_else_ruleContext if_else_rule(int i) {
			return getRuleContext(If_else_ruleContext.class,i);
		}
		public List<SwitchContext> switch() {
			return getRuleContexts(SwitchContext.class);
		}
		public SwitchContext switch(int i) {
			return getRuleContext(SwitchContext.class,i);
		}
		public List<ForeachContext> foreach() {
			return getRuleContexts(ForeachContext.class);
		}
		public ForeachContext foreach(int i) {
			return getRuleContext(ForeachContext.class,i);
		}
		public List<For_loop_ruleContext> for_loop_rule() {
			return getRuleContexts(For_loop_ruleContext.class);
		}
		public For_loop_ruleContext for_loop_rule(int i) {
			return getRuleContext(For_loop_ruleContext.class,i);
		}
		public ForeachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreach; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterForeach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitForeach(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitForeach(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeachContext foreach() throws RecognitionException {
		ForeachContext _localctx = new ForeachContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_foreach);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2228);
			match(K_FOREACH);
			setState(2229);
			match(OPEN_PAR);
			setState(2230);
			match(K_VAR);
			setState(2231);
			use_random_name();
			setState(2235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(2232);
				match(T__5);
				}
				}
				setState(2237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2238);
			match(T__6);
			setState(2239);
			use_random_name();
			setState(2243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(2240);
				match(T__5);
				}
				}
				setState(2245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2246);
			match(CLOSE_PAR);
			setState(2247);
			match(T__3);
			setState(2257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_FOR || _la==K_IF || ((((_la - 166)) & ~0x3f) == 0 && ((1L << (_la - 166)) & ((1L << (K_WILE - 166)) | (1L << (K_DO - 166)) | (1L << (K_FOREACH - 166)) | (1L << (K_SWITCH - 166)) | (1L << (STRING_LITERAL - 166)) | (1L << (IDENTIFIER - 166)) | (1L << (RANDOM_NAME - 166)))) != 0)) {
				{
				setState(2255);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING_LITERAL:
				case IDENTIFIER:
				case RANDOM_NAME:
					{
					setState(2248);
					call_function();
					}
					break;
				case K_WILE:
					{
					setState(2249);
					while_rule();
					}
					break;
				case K_DO:
					{
					setState(2250);
					do_while();
					}
					break;
				case K_IF:
					{
					setState(2251);
					if_else_rule();
					}
					break;
				case K_SWITCH:
					{
					setState(2252);
					switch();
					}
					break;
				case K_FOREACH:
					{
					setState(2253);
					foreach();
					}
					break;
				case K_FOR:
					{
					setState(2254);
					for_loop_rule();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2260);
			match(T__4);
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

	public static class Increase_decreaseContext extends ParserRuleContext {
		public Increase_decreaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increase_decrease; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterIncrease_decrease(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitIncrease_decrease(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitIncrease_decrease(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Increase_decreaseContext increase_decrease() throws RecognitionException {
		Increase_decreaseContext _localctx = new Increase_decreaseContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_increase_decrease);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7 || _la==T__8) {
				{
				setState(2272);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__7:
					{
					setState(2263); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(2262);
							match(T__7);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(2265); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,303,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				case T__8:
					{
					setState(2268); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(2267);
							match(T__8);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(2270); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,304,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2276);
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode K_BRECK() { return getToken(SqlParser.K_BRECK, 0); }
		public TerminalNode K_SWITCH() { return getToken(SqlParser.K_SWITCH, 0); }
		public TerminalNode K_ABORT() { return getToken(SqlParser.K_ABORT, 0); }
		public TerminalNode K_ACTION() { return getToken(SqlParser.K_ACTION, 0); }
		public TerminalNode K_ADD() { return getToken(SqlParser.K_ADD, 0); }
		public TerminalNode K_AFTER() { return getToken(SqlParser.K_AFTER, 0); }
		public TerminalNode K_ALL() { return getToken(SqlParser.K_ALL, 0); }
		public TerminalNode K_ALTER() { return getToken(SqlParser.K_ALTER, 0); }
		public TerminalNode K_ANALYZE() { return getToken(SqlParser.K_ANALYZE, 0); }
		public TerminalNode K_AND() { return getToken(SqlParser.K_AND, 0); }
		public TerminalNode K_AS() { return getToken(SqlParser.K_AS, 0); }
		public TerminalNode K_ASC() { return getToken(SqlParser.K_ASC, 0); }
		public TerminalNode K_ATTACH() { return getToken(SqlParser.K_ATTACH, 0); }
		public TerminalNode K_AUTOINCREMENT() { return getToken(SqlParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_BEFORE() { return getToken(SqlParser.K_BEFORE, 0); }
		public TerminalNode K_BEGIN() { return getToken(SqlParser.K_BEGIN, 0); }
		public TerminalNode K_BETWEEN() { return getToken(SqlParser.K_BETWEEN, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public TerminalNode K_CASCADE() { return getToken(SqlParser.K_CASCADE, 0); }
		public TerminalNode K_CASE() { return getToken(SqlParser.K_CASE, 0); }
		public TerminalNode K_CAST() { return getToken(SqlParser.K_CAST, 0); }
		public TerminalNode K_CHECK() { return getToken(SqlParser.K_CHECK, 0); }
		public TerminalNode K_COLLATE() { return getToken(SqlParser.K_COLLATE, 0); }
		public TerminalNode K_COLUMN() { return getToken(SqlParser.K_COLUMN, 0); }
		public TerminalNode K_COMMIT() { return getToken(SqlParser.K_COMMIT, 0); }
		public TerminalNode K_CONFLICT() { return getToken(SqlParser.K_CONFLICT, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(SqlParser.K_CONSTRAINT, 0); }
		public TerminalNode K_CREATE() { return getToken(SqlParser.K_CREATE, 0); }
		public TerminalNode K_CROSS() { return getToken(SqlParser.K_CROSS, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(SqlParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SqlParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SqlParser.K_CURRENT_TIMESTAMP, 0); }
		public TerminalNode K_DATABASE() { return getToken(SqlParser.K_DATABASE, 0); }
		public TerminalNode K_DEFAULT() { return getToken(SqlParser.K_DEFAULT, 0); }
		public TerminalNode K_DEFERRABLE() { return getToken(SqlParser.K_DEFERRABLE, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SqlParser.K_DEFERRED, 0); }
		public TerminalNode K_DELETE() { return getToken(SqlParser.K_DELETE, 0); }
		public TerminalNode K_DESC() { return getToken(SqlParser.K_DESC, 0); }
		public TerminalNode K_DETACH() { return getToken(SqlParser.K_DETACH, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SqlParser.K_DISTINCT, 0); }
		public TerminalNode K_DROP() { return getToken(SqlParser.K_DROP, 0); }
		public TerminalNode K_EACH() { return getToken(SqlParser.K_EACH, 0); }
		public TerminalNode K_ELSE() { return getToken(SqlParser.K_ELSE, 0); }
		public TerminalNode K_END() { return getToken(SqlParser.K_END, 0); }
		public TerminalNode K_ENABLE() { return getToken(SqlParser.K_ENABLE, 0); }
		public TerminalNode K_ESCAPE() { return getToken(SqlParser.K_ESCAPE, 0); }
		public TerminalNode K_EXCEPT() { return getToken(SqlParser.K_EXCEPT, 0); }
		public TerminalNode K_EXCLUSIVE() { return getToken(SqlParser.K_EXCLUSIVE, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public TerminalNode K_EXPLAIN() { return getToken(SqlParser.K_EXPLAIN, 0); }
		public TerminalNode K_FAIL() { return getToken(SqlParser.K_FAIL, 0); }
		public TerminalNode K_FOR() { return getToken(SqlParser.K_FOR, 0); }
		public TerminalNode K_FOREIGN() { return getToken(SqlParser.K_FOREIGN, 0); }
		public TerminalNode K_FROM() { return getToken(SqlParser.K_FROM, 0); }
		public TerminalNode K_FULL() { return getToken(SqlParser.K_FULL, 0); }
		public TerminalNode K_GLOB() { return getToken(SqlParser.K_GLOB, 0); }
		public TerminalNode K_GROUP() { return getToken(SqlParser.K_GROUP, 0); }
		public TerminalNode K_HAVING() { return getToken(SqlParser.K_HAVING, 0); }
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_IGNORE() { return getToken(SqlParser.K_IGNORE, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SqlParser.K_IMMEDIATE, 0); }
		public TerminalNode K_IN() { return getToken(SqlParser.K_IN, 0); }
		public TerminalNode K_INDEX() { return getToken(SqlParser.K_INDEX, 0); }
		public TerminalNode K_INDEXED() { return getToken(SqlParser.K_INDEXED, 0); }
		public TerminalNode K_INITIALLY() { return getToken(SqlParser.K_INITIALLY, 0); }
		public TerminalNode K_INNER() { return getToken(SqlParser.K_INNER, 0); }
		public TerminalNode K_INSERT() { return getToken(SqlParser.K_INSERT, 0); }
		public TerminalNode K_INSTEAD() { return getToken(SqlParser.K_INSTEAD, 0); }
		public TerminalNode K_INTERSECT() { return getToken(SqlParser.K_INTERSECT, 0); }
		public TerminalNode K_INTO() { return getToken(SqlParser.K_INTO, 0); }
		public TerminalNode K_IS() { return getToken(SqlParser.K_IS, 0); }
		public TerminalNode K_ISNULL() { return getToken(SqlParser.K_ISNULL, 0); }
		public TerminalNode K_JOIN() { return getToken(SqlParser.K_JOIN, 0); }
		public TerminalNode K_KEY() { return getToken(SqlParser.K_KEY, 0); }
		public TerminalNode K_LEFT() { return getToken(SqlParser.K_LEFT, 0); }
		public TerminalNode K_LIKE() { return getToken(SqlParser.K_LIKE, 0); }
		public TerminalNode K_LIMIT() { return getToken(SqlParser.K_LIMIT, 0); }
		public TerminalNode K_MATCH() { return getToken(SqlParser.K_MATCH, 0); }
		public TerminalNode K_NATURAL() { return getToken(SqlParser.K_NATURAL, 0); }
		public TerminalNode K_NO() { return getToken(SqlParser.K_NO, 0); }
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_NOTNULL() { return getToken(SqlParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(SqlParser.K_NULL, 0); }
		public TerminalNode K_OF() { return getToken(SqlParser.K_OF, 0); }
		public TerminalNode K_OFFSET() { return getToken(SqlParser.K_OFFSET, 0); }
		public TerminalNode K_ON() { return getToken(SqlParser.K_ON, 0); }
		public TerminalNode K_OR() { return getToken(SqlParser.K_OR, 0); }
		public TerminalNode K_ORDER() { return getToken(SqlParser.K_ORDER, 0); }
		public TerminalNode K_OUTER() { return getToken(SqlParser.K_OUTER, 0); }
		public TerminalNode K_PLAN() { return getToken(SqlParser.K_PLAN, 0); }
		public TerminalNode K_PRAGMA() { return getToken(SqlParser.K_PRAGMA, 0); }
		public TerminalNode K_PRIMARY() { return getToken(SqlParser.K_PRIMARY, 0); }
		public TerminalNode K_QUERY() { return getToken(SqlParser.K_QUERY, 0); }
		public TerminalNode K_RAISE() { return getToken(SqlParser.K_RAISE, 0); }
		public TerminalNode K_RECURSIVE() { return getToken(SqlParser.K_RECURSIVE, 0); }
		public TerminalNode K_REFERENCES() { return getToken(SqlParser.K_REFERENCES, 0); }
		public TerminalNode K_REGEXP() { return getToken(SqlParser.K_REGEXP, 0); }
		public TerminalNode K_REINDEX() { return getToken(SqlParser.K_REINDEX, 0); }
		public TerminalNode K_RELEASE() { return getToken(SqlParser.K_RELEASE, 0); }
		public TerminalNode K_RENAME() { return getToken(SqlParser.K_RENAME, 0); }
		public TerminalNode K_REPLACE() { return getToken(SqlParser.K_REPLACE, 0); }
		public TerminalNode K_RESTRICT() { return getToken(SqlParser.K_RESTRICT, 0); }
		public TerminalNode K_RIGHT() { return getToken(SqlParser.K_RIGHT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SqlParser.K_ROLLBACK, 0); }
		public TerminalNode K_ROW() { return getToken(SqlParser.K_ROW, 0); }
		public TerminalNode K_SAVEPOINT() { return getToken(SqlParser.K_SAVEPOINT, 0); }
		public TerminalNode K_SELECT() { return getToken(SqlParser.K_SELECT, 0); }
		public TerminalNode K_SET() { return getToken(SqlParser.K_SET, 0); }
		public TerminalNode K_TABLE() { return getToken(SqlParser.K_TABLE, 0); }
		public TerminalNode K_TEMP() { return getToken(SqlParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SqlParser.K_TEMPORARY, 0); }
		public TerminalNode K_THEN() { return getToken(SqlParser.K_THEN, 0); }
		public TerminalNode K_TO() { return getToken(SqlParser.K_TO, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SqlParser.K_TRANSACTION, 0); }
		public TerminalNode K_TRIGGER() { return getToken(SqlParser.K_TRIGGER, 0); }
		public TerminalNode K_UNION() { return getToken(SqlParser.K_UNION, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SqlParser.K_UNIQUE, 0); }
		public TerminalNode K_UPDATE() { return getToken(SqlParser.K_UPDATE, 0); }
		public TerminalNode K_USING() { return getToken(SqlParser.K_USING, 0); }
		public TerminalNode K_VACUUM() { return getToken(SqlParser.K_VACUUM, 0); }
		public TerminalNode K_VALUES() { return getToken(SqlParser.K_VALUES, 0); }
		public TerminalNode K_VIEW() { return getToken(SqlParser.K_VIEW, 0); }
		public TerminalNode K_VIRTUAL() { return getToken(SqlParser.K_VIRTUAL, 0); }
		public TerminalNode K_WHEN() { return getToken(SqlParser.K_WHEN, 0); }
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public TerminalNode K_WITH() { return getToken(SqlParser.K_WITH, 0); }
		public TerminalNode K_WITHOUT() { return getToken(SqlParser.K_WITHOUT, 0); }
		public TerminalNode K_NEXTVAL() { return getToken(SqlParser.K_NEXTVAL, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2277);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN) | (1L << K_COMMIT) | (1L << K_CONFLICT) | (1L << K_CONSTRAINT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_OUTER - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_SWITCH - 128)) | (1L << (K_BRECK - 128)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class UnknownContext extends ParserRuleContext {
		public TerminalNode DOUBEL() { return getToken(SqlParser.DOUBEL, 0); }
		public UnknownContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unknown; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterUnknown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitUnknown(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitUnknown(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnknownContext unknown() throws RecognitionException {
		UnknownContext _localctx = new UnknownContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_unknown);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2280); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2279);
					matchWildcard();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2282); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,307,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			{
			setState(2284);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==DOUBEL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class NameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2286);
			any_name();
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

	public static class Function_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2288);
			any_name();
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

	public static class Database_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Database_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDatabase_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDatabase_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDatabase_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2290);
			any_name();
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

	public static class Source_table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Source_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSource_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSource_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSource_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Source_table_nameContext source_table_name() throws RecognitionException {
		Source_table_nameContext _localctx = new Source_table_nameContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_source_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2292);
			any_name();
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

	public static class Table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2294);
			any_name();
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

	public static class Table_or_index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_or_index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTable_or_index_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTable_or_index_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTable_or_index_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_index_nameContext table_or_index_name() throws RecognitionException {
		Table_or_index_nameContext _localctx = new Table_or_index_nameContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2296);
			any_name();
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

	public static class New_table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public New_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterNew_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitNew_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitNew_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_table_nameContext new_table_name() throws RecognitionException {
		New_table_nameContext _localctx = new New_table_nameContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2298);
			any_name();
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

	public static class Column_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2300);
			any_name();
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

	public static class Collation_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Collation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collation_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCollation_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCollation_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCollation_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collation_nameContext collation_name() throws RecognitionException {
		Collation_nameContext _localctx = new Collation_nameContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2302);
			any_name();
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

	public static class Foreign_tableContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Foreign_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterForeign_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitForeign_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitForeign_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_tableContext foreign_table() throws RecognitionException {
		Foreign_tableContext _localctx = new Foreign_tableContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2304);
			any_name();
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

	public static class Index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterIndex_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitIndex_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitIndex_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2306);
			any_name();
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

	public static class Trigger_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Trigger_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTrigger_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTrigger_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTrigger_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trigger_nameContext trigger_name() throws RecognitionException {
		Trigger_nameContext _localctx = new Trigger_nameContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2308);
			any_name();
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

	public static class View_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public View_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterView_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitView_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitView_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final View_nameContext view_name() throws RecognitionException {
		View_nameContext _localctx = new View_nameContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2310);
			any_name();
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

	public static class Module_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Module_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterModule_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitModule_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitModule_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_nameContext module_name() throws RecognitionException {
		Module_nameContext _localctx = new Module_nameContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2312);
			any_name();
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

	public static class Pragma_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Pragma_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterPragma_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitPragma_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitPragma_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_nameContext pragma_name() throws RecognitionException {
		Pragma_nameContext _localctx = new Pragma_nameContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2314);
			any_name();
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

	public static class Savepoint_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Savepoint_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSavepoint_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSavepoint_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSavepoint_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Savepoint_nameContext savepoint_name() throws RecognitionException {
		Savepoint_nameContext _localctx = new Savepoint_nameContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2316);
			any_name();
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

	public static class Table_aliasContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTable_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTable_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTable_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2318);
			any_name();
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

	public static class Transaction_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Transaction_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transaction_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTransaction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTransaction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTransaction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Transaction_nameContext transaction_name() throws RecognitionException {
		Transaction_nameContext _localctx = new Transaction_nameContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2320);
			any_name();
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

	public static class JsonContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SqlParser.EOF, 0); }
		public List<JsonObjectContext> jsonObject() {
			return getRuleContexts(JsonObjectContext.class);
		}
		public JsonObjectContext jsonObject(int i) {
			return getRuleContext(JsonObjectContext.class,i);
		}
		public JsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterJson(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitJson(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitJson(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonContext json() throws RecognitionException {
		JsonContext _localctx = new JsonContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_json);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2322);
				jsonObject();
				}
				}
				setState(2327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2328);
			match(EOF);
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

	public static class JsonObjectContext extends ParserRuleContext {
		public List<KeyValuePairContext> keyValuePair() {
			return getRuleContexts(KeyValuePairContext.class);
		}
		public KeyValuePairContext keyValuePair(int i) {
			return getRuleContext(KeyValuePairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public JsonObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterJsonObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitJsonObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitJsonObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonObjectContext jsonObject() throws RecognitionException {
		JsonObjectContext _localctx = new JsonObjectContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_jsonObject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2330);
			match(T__3);
			setState(2339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RANDOM_NAME) {
				{
				setState(2331);
				keyValuePair();
				setState(2336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2332);
					match(COMMA);
					setState(2333);
					keyValuePair();
					}
					}
					setState(2338);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(2341);
			match(T__4);
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

	public static class KeyValuePairContext extends ParserRuleContext {
		public TerminalNode RANDOM_NAME() { return getToken(SqlParser.RANDOM_NAME, 0); }
		public PrimitiveContext primitive() {
			return getRuleContext(PrimitiveContext.class,0);
		}
		public JsonObjectContext jsonObject() {
			return getRuleContext(JsonObjectContext.class,0);
		}
		public KeyValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterKeyValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitKeyValuePair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitKeyValuePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyValuePairContext keyValuePair() throws RecognitionException {
		KeyValuePairContext _localctx = new KeyValuePairContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_keyValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2343);
			match(RANDOM_NAME);
			setState(2344);
			match(T__6);
			setState(2347);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
			case IDENTIFIER:
			case SINGLE_STRING:
				{
				setState(2345);
				primitive();
				}
				break;
			case T__3:
				{
				setState(2346);
				jsonObject();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PrimitiveContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public PrimitiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterPrimitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitPrimitive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitPrimitive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveContext primitive() throws RecognitionException {
		PrimitiveContext _localctx = new PrimitiveContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_primitive);
		try {
			setState(2351);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case SINGLE_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(2349);
				string();
				}
				break;
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(2350);
				bool();
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

	public static class BoolContext extends ParserRuleContext {
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2353);
			_la = _input.LA(1);
			if ( !(_la==T__9 || _la==T__10) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode SINGLE_STRING() { return getToken(SqlParser.SINGLE_STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2355);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==SINGLE_STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Any_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SqlParser.STRING_LITERAL, 0); }
		public TerminalNode RANDOM_NAME() { return getToken(SqlParser.RANDOM_NAME, 0); }
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAny_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAny_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAny_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_any_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2357);
			_la = _input.LA(1);
			if ( !(((((_la - 175)) & ~0x3f) == 0 && ((1L << (_la - 175)) & ((1L << (STRING_LITERAL - 175)) | (1L << (IDENTIFIER - 175)) | (1L << (RANDOM_NAME - 175)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 47:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 26);
		case 1:
			return precpred(_ctx, 25);
		case 2:
			return precpred(_ctx, 19);
		case 3:
			return precpred(_ctx, 18);
		case 4:
			return precpred(_ctx, 17);
		case 5:
			return precpred(_ctx, 16);
		case 6:
			return precpred(_ctx, 15);
		case 7:
			return precpred(_ctx, 14);
		case 8:
			return precpred(_ctx, 13);
		case 9:
			return precpred(_ctx, 6);
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 23);
		case 12:
			return precpred(_ctx, 21);
		case 13:
			return precpred(_ctx, 9);
		case 14:
			return precpred(_ctx, 8);
		case 15:
			return precpred(_ctx, 7);
		case 16:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00bd\u093a\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\3\2\3\2\7\2\u010f\n\2\f\2\16\2\u0112\13\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\4\7\4\u011a\n\4\f\4\16\4\u011d\13\4\3\4\3\4\6\4\u0121"+
		"\n\4\r\4\16\4\u0122\3\4\7\4\u0126\n\4\f\4\16\4\u0129\13\4\3\4\7\4\u012c"+
		"\n\4\f\4\16\4\u012f\13\4\3\5\3\5\3\5\5\5\u0134\n\5\5\5\u0136\n\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0156\n\5\3\6\3\6\3\6"+
		"\5\6\u015b\n\6\3\6\3\6\3\6\5\6\u0160\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\6\u016a\n\6\3\6\5\6\u016d\n\6\3\6\5\6\u0170\n\6\3\6\5\6\u0173\n\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0184"+
		"\n\t\3\n\3\n\5\n\u0188\n\n\3\n\3\n\3\n\3\n\3\13\3\13\5\13\u0190\n\13\3"+
		"\13\3\13\5\13\u0194\n\13\5\13\u0196\n\13\3\f\3\f\3\f\5\f\u019b\n\f\5\f"+
		"\u019d\n\f\3\r\3\r\5\r\u01a1\n\r\3\r\3\r\3\r\7\r\u01a6\n\r\f\r\16\r\u01a9"+
		"\13\r\5\r\u01ab\n\r\3\r\3\r\3\r\5\r\u01b0\n\r\3\r\3\r\5\r\u01b4\n\r\3"+
		"\r\6\r\u01b7\n\r\r\r\16\r\u01b8\3\r\3\r\3\r\3\r\3\r\7\r\u01c0\n\r\f\r"+
		"\16\r\u01c3\13\r\5\r\u01c5\n\r\3\r\3\r\3\r\3\r\5\r\u01cb\n\r\5\r\u01cd"+
		"\n\r\3\16\3\16\5\16\u01d1\n\16\3\16\3\16\3\16\3\16\5\16\u01d7\n\16\3\16"+
		"\3\16\3\16\5\16\u01dc\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u01e5"+
		"\n\16\f\16\16\16\u01e8\13\16\3\16\3\16\3\16\5\16\u01ed\n\16\3\17\3\17"+
		"\5\17\u01f1\n\17\3\17\3\17\3\17\3\17\5\17\u01f7\n\17\3\17\3\17\3\17\5"+
		"\17\u01fc\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0205\n\17\f\17"+
		"\16\17\u0208\13\17\3\17\3\17\3\17\5\17\u020d\n\17\3\17\3\17\5\17\u0211"+
		"\n\17\3\17\5\17\u0214\n\17\3\20\3\20\5\20\u0218\n\20\3\20\3\20\3\20\3"+
		"\20\5\20\u021e\n\20\3\20\3\20\3\20\5\20\u0223\n\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u022a\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0233\n"+
		"\20\f\20\16\20\u0236\13\20\5\20\u0238\n\20\5\20\u023a\n\20\3\20\3\20\3"+
		"\20\3\20\5\20\u0240\n\20\3\20\3\20\3\20\3\20\5\20\u0246\n\20\3\20\3\20"+
		"\5\20\u024a\n\20\3\20\3\20\3\20\3\20\3\20\5\20\u0251\n\20\3\20\3\20\6"+
		"\20\u0255\n\20\r\20\16\20\u0256\3\20\3\20\3\21\3\21\5\21\u025d\n\21\3"+
		"\21\3\21\3\21\3\21\5\21\u0263\n\21\3\21\3\21\3\21\5\21\u0268\n\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0274\n\22\3\22\3\22"+
		"\3\22\5\22\u0279\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0282\n"+
		"\22\f\22\16\22\u0285\13\22\3\22\3\22\5\22\u0289\n\22\3\23\5\23\u028c\n"+
		"\23\3\23\3\23\3\23\3\23\3\23\5\23\u0293\n\23\3\24\5\24\u0296\n\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u029d\n\24\3\24\3\24\3\24\3\24\3\24\7\24\u02a4"+
		"\n\24\f\24\16\24\u02a7\13\24\5\24\u02a9\n\24\3\24\3\24\3\24\3\24\5\24"+
		"\u02af\n\24\5\24\u02b1\n\24\3\25\3\25\5\25\u02b5\n\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\5\26\u02bd\n\26\3\26\3\26\3\26\5\26\u02c2\n\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\5\27\u02ca\n\27\3\27\3\27\3\27\5\27\u02cf\n\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\5\30\u02d7\n\30\3\30\3\30\3\30\5\30\u02dc"+
		"\n\30\3\30\3\30\3\31\3\31\3\31\3\31\5\31\u02e4\n\31\3\31\3\31\3\31\5\31"+
		"\u02e9\n\31\3\31\3\31\3\32\3\32\5\32\u02ef\n\32\3\32\3\32\3\32\7\32\u02f4"+
		"\n\32\f\32\16\32\u02f7\13\32\5\32\u02f9\n\32\3\32\3\32\3\32\3\32\7\32"+
		"\u02ff\n\32\f\32\16\32\u0302\13\32\3\32\3\32\3\32\3\32\3\32\7\32\u0309"+
		"\n\32\f\32\16\32\u030c\13\32\5\32\u030e\n\32\3\32\3\32\3\32\3\32\5\32"+
		"\u0314\n\32\5\32\u0316\n\32\3\33\5\33\u0319\n\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u032c"+
		"\n\33\3\33\3\33\3\33\3\33\5\33\u0332\n\33\3\33\3\33\3\33\3\33\3\33\7\33"+
		"\u0339\n\33\f\33\16\33\u033c\13\33\3\33\3\33\5\33\u0340\n\33\3\33\3\33"+
		"\3\33\3\33\3\33\7\33\u0347\n\33\f\33\16\33\u034a\13\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\7\33\u0352\n\33\f\33\16\33\u0355\13\33\3\33\3\33\7\33"+
		"\u0359\n\33\f\33\16\33\u035c\13\33\3\33\3\33\3\33\5\33\u0361\n\33\3\34"+
		"\3\34\3\34\3\34\5\34\u0367\n\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u0370\n\34\3\35\3\35\3\35\3\35\3\35\5\35\u0377\n\35\3\35\3\35\5\35\u037b"+
		"\n\35\5\35\u037d\n\35\3\36\3\36\5\36\u0381\n\36\3\36\3\36\3\37\3\37\3"+
		"\37\5\37\u0388\n\37\5\37\u038a\n\37\3\37\3\37\5\37\u038e\n\37\3\37\5\37"+
		"\u0391\n\37\3 \3 \3 \3!\3!\5!\u0398\n!\3!\3!\3!\7!\u039d\n!\f!\16!\u03a0"+
		"\13!\5!\u03a2\n!\3!\3!\3!\3!\3!\3!\7!\u03aa\n!\f!\16!\u03ad\13!\5!\u03af"+
		"\n!\3!\3!\3!\3!\5!\u03b5\n!\5!\u03b7\n!\3\"\3\"\5\"\u03bb\n\"\3\"\3\""+
		"\3\"\7\"\u03c0\n\"\f\"\16\"\u03c3\13\"\5\"\u03c5\n\"\3\"\3\"\3\"\3\"\7"+
		"\"\u03cb\n\"\f\"\16\"\u03ce\13\"\3\"\3\"\3\"\3\"\3\"\7\"\u03d5\n\"\f\""+
		"\16\"\u03d8\13\"\5\"\u03da\n\"\3\"\3\"\3\"\3\"\5\"\u03e0\n\"\5\"\u03e2"+
		"\n\"\3#\3#\5#\u03e6\n#\3#\3#\3#\7#\u03eb\n#\f#\16#\u03ee\13#\3#\3#\3#"+
		"\3#\7#\u03f4\n#\f#\16#\u03f7\13#\3#\5#\u03fa\n#\5#\u03fc\n#\3#\3#\5#\u0400"+
		"\n#\3#\3#\3#\3#\3#\7#\u0407\n#\f#\16#\u040a\13#\3#\3#\5#\u040e\n#\5#\u0410"+
		"\n#\3#\3#\3#\3#\3#\7#\u0417\n#\f#\16#\u041a\13#\3#\3#\3#\3#\3#\3#\7#\u0422"+
		"\n#\f#\16#\u0425\13#\3#\3#\7#\u0429\n#\f#\16#\u042c\13#\5#\u042e\n#\3"+
		"$\5$\u0431\n$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u043e\n$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\7$\u044a\n$\f$\16$\u044d\13$\3$\3$\5$\u0451\n$\3%"+
		"\5%\u0454\n%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0461\n%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\7%\u046d\n%\f%\16%\u0470\13%\3%\3%\5%\u0474\n%\3%\3"+
		"%\3%\3%\3%\7%\u047b\n%\f%\16%\u047e\13%\5%\u0480\n%\3%\3%\3%\3%\5%\u0486"+
		"\n%\5%\u0488\n%\3&\3&\3\'\3\'\3\'\7\'\u048f\n\'\f\'\16\'\u0492\13\'\3"+
		"(\3(\3(\3(\5(\u0498\n(\3(\3(\3(\3(\3(\5(\u049f\n(\3(\3(\3(\5(\u04a4\n"+
		"(\3(\3(\5(\u04a8\n(\3)\3)\5)\u04ac\n)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\5)\u04bc\n)\3*\3*\3*\5*\u04c1\n*\3*\3*\5*\u04c5\n*\3+\3+\3"+
		",\3,\3,\3,\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u04dc\n.\3"+
		".\3.\6.\u04e0\n.\r.\16.\u04e1\5.\u04e4\n.\3/\3/\5/\u04e8\n/\3\60\3\60"+
		"\3\60\5\60\u04ed\n\60\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u04f5\n\61\3"+
		"\61\3\61\3\61\5\61\u04fa\n\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u050b\n\61\3\61\3\61\3\61\7\61"+
		"\u0510\n\61\f\61\16\61\u0513\13\61\3\61\5\61\u0516\n\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0526\n\61"+
		"\3\61\5\61\u0529\n\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0531\n\61\3"+
		"\61\3\61\3\61\3\61\3\61\6\61\u0538\n\61\r\61\16\61\u0539\3\61\3\61\5\61"+
		"\u053e\n\61\3\61\3\61\3\61\5\61\u0543\n\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0564"+
		"\n\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0570\n\61"+
		"\3\61\3\61\3\61\5\61\u0575\n\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0587\n\61\3\61\3\61\3\61"+
		"\3\61\5\61\u058d\n\61\3\61\3\61\3\61\3\61\3\61\5\61\u0594\n\61\3\61\3"+
		"\61\5\61\u0598\n\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u05a0\n\61\f\61"+
		"\16\61\u05a3\13\61\5\61\u05a5\n\61\3\61\3\61\3\61\3\61\5\61\u05ab\n\61"+
		"\3\61\5\61\u05ae\n\61\7\61\u05b0\n\61\f\61\16\61\u05b3\13\61\3\62\3\62"+
		"\3\62\3\62\5\62\u05b9\n\62\3\62\3\62\3\62\3\62\3\62\7\62\u05c0\n\62\f"+
		"\62\16\62\u05c3\13\62\3\62\3\62\5\62\u05c7\n\62\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\5\62\u05d3\n\62\3\62\3\62\5\62\u05d7\n\62"+
		"\7\62\u05d9\n\62\f\62\16\62\u05dc\13\62\3\62\5\62\u05df\n\62\3\62\3\62"+
		"\3\62\3\62\3\62\5\62\u05e6\n\62\3\62\5\62\u05e9\n\62\5\62\u05eb\n\62\3"+
		"\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u05f5\n\64\3\64\3\64\3\65"+
		"\3\65\3\65\5\65\u05fc\n\65\3\65\5\65\u05ff\n\65\3\66\3\66\5\66\u0603\n"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u060e\n\66\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\7\67\u0616\n\67\f\67\16\67\u0619\13\67\3\67"+
		"\3\67\3\67\38\38\38\38\38\38\78\u0624\n8\f8\168\u0627\138\38\38\38\39"+
		"\39\59\u062e\n9\39\59\u0631\n9\39\39\39\39\79\u0637\n9\f9\169\u063a\13"+
		"9\39\39\39\3:\3:\5:\u0641\n:\3:\3:\3:\3:\7:\u0647\n:\f:\16:\u064a\13:"+
		"\3:\3:\3:\3;\3;\3<\3<\5<\u0653\n<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<"+
		"\7<\u0661\n<\f<\16<\u0664\13<\3=\3=\3=\5=\u0669\n=\3=\3=\3=\3=\3=\3=\5"+
		"=\u0671\n=\3>\3>\3>\5>\u0676\n>\3>\5>\u0679\n>\3?\3?\3?\5?\u067e\n?\3"+
		"@\3@\3@\3@\3@\7@\u0685\n@\f@\16@\u0688\13@\3@\3@\5@\u068c\n@\3@\3@\3@"+
		"\3@\3@\3A\3A\3A\3A\3A\3A\3A\5A\u069a\nA\3A\5A\u069d\nA\5A\u069f\nA\3B"+
		"\3B\3B\5B\u06a4\nB\3B\3B\5B\u06a8\nB\3B\5B\u06ab\nB\3B\3B\3B\3B\3B\5B"+
		"\u06b2\nB\3B\3B\3B\3B\7B\u06b8\nB\fB\16B\u06bb\13B\3B\5B\u06be\nB\3B\3"+
		"B\5B\u06c2\nB\3B\5B\u06c5\nB\3B\3B\3B\3B\5B\u06cb\nB\3B\5B\u06ce\nB\5"+
		"B\u06d0\nB\3C\3C\3C\3C\3C\7C\u06d7\nC\fC\16C\u06da\13C\3D\3D\5D\u06de"+
		"\nD\3D\3D\5D\u06e2\nD\3D\3D\5D\u06e6\nD\3D\5D\u06e9\nD\3E\3E\3E\3E\3E"+
		"\3E\3E\7E\u06f2\nE\fE\16E\u06f5\13E\3E\3E\5E\u06f9\nE\3F\3F\5F\u06fd\n"+
		"F\3F\3F\3F\7F\u0702\nF\fF\16F\u0705\13F\3F\3F\3F\3F\7F\u070b\nF\fF\16"+
		"F\u070e\13F\3F\5F\u0711\nF\5F\u0713\nF\3F\3F\5F\u0717\nF\3F\3F\3F\3F\3"+
		"F\7F\u071e\nF\fF\16F\u0721\13F\3F\3F\5F\u0725\nF\5F\u0727\nF\3F\3F\3F"+
		"\3F\3F\7F\u072e\nF\fF\16F\u0731\13F\3F\3F\3F\3F\3F\3F\7F\u0739\nF\fF\16"+
		"F\u073c\13F\3F\3F\7F\u0740\nF\fF\16F\u0743\13F\3F\3F\5F\u0747\nF\3G\3"+
		"G\3G\3G\3G\5G\u074e\nG\3H\3H\3H\3H\3H\7H\u0755\nH\fH\16H\u0758\13H\3H"+
		"\3H\5H\u075c\nH\3I\5I\u075f\nI\3I\3I\5I\u0763\nI\3J\3J\3K\3K\3L\3L\3M"+
		"\3M\5M\u076d\nM\3N\3N\3O\3O\3O\3O\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\7Q\u077d\nQ"+
		"\fQ\16Q\u0780\13Q\3Q\3Q\3Q\3R\3R\3R\5R\u0788\nR\3S\3S\3S\6S\u078d\nS\r"+
		"S\16S\u078e\3T\3T\3T\3T\3T\3T\3T\5T\u0798\nT\3U\3U\3U\3U\3U\3U\3V\5V\u07a1"+
		"\nV\3V\3V\5V\u07a5\nV\3V\3V\5V\u07a9\nV\7V\u07ab\nV\fV\16V\u07ae\13V\3"+
		"W\3W\5W\u07b2\nW\3W\3W\3X\3X\3X\5X\u07b9\nX\3Y\3Y\3Y\3Y\3Y\7Y\u07c0\n"+
		"Y\fY\16Y\u07c3\13Y\7Y\u07c5\nY\fY\16Y\u07c8\13Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\7"+
		"Z\u07d1\nZ\fZ\16Z\u07d4\13Z\7Z\u07d6\nZ\fZ\16Z\u07d9\13Z\3Z\3Z\3[\3[\3"+
		"[\3[\3[\3[\3[\3[\3[\3[\5[\u07e7\n[\5[\u07e9\n[\3\\\3\\\3]\3]\3]\3]\3]"+
		"\3]\7]\u07f3\n]\f]\16]\u07f6\13]\3]\3]\3]\3]\3]\3]\3]\3]\7]\u0800\n]\f"+
		"]\16]\u0803\13]\3]\3]\3]\3]\7]\u0809\n]\f]\16]\u080c\13]\3]\3]\3]\3]\3"+
		"]\3]\3]\3]\7]\u0816\n]\f]\16]\u0819\13]\3]\3]\3]\3]\3]\3]\3]\3]\7]\u0823"+
		"\n]\f]\16]\u0826\13]\3]\3]\5]\u082a\n]\3]\3]\3]\3]\3]\3]\5]\u0832\n]\5"+
		"]\u0834\n]\3^\3^\3^\3^\3^\7^\u083b\n^\f^\16^\u083e\13^\3^\3^\3^\3^\3^"+
		"\3^\3^\3^\3^\7^\u0849\n^\f^\16^\u084c\13^\3^\3^\3^\5^\u0851\n^\3_\3_\3"+
		"_\3_\3_\3`\3`\3`\3`\7`\u085c\n`\f`\16`\u085f\13`\3`\3`\3`\3`\3a\3a\3a"+
		"\3a\3a\3a\3a\5a\u086c\na\3a\3a\3a\3a\3a\5a\u0873\na\3a\3a\3a\3a\3a\5a"+
		"\u087a\na\3a\3a\3a\3a\3b\3b\3b\5b\u0883\nb\3c\3c\3d\3d\3d\3d\3e\7e\u088c"+
		"\ne\fe\16e\u088f\13e\3e\3e\7e\u0893\ne\fe\16e\u0896\13e\3f\3f\3f\3g\3"+
		"g\3g\3g\3g\3g\6g\u08a1\ng\rg\16g\u08a2\3g\5g\u08a6\ng\3g\3g\3h\3h\3h\3"+
		"i\3i\3i\5i\u08b0\ni\3i\3i\3i\5i\u08b5\ni\3j\3j\3j\3j\3j\7j\u08bc\nj\f"+
		"j\16j\u08bf\13j\3j\3j\3j\7j\u08c4\nj\fj\16j\u08c7\13j\3j\3j\3j\3j\3j\3"+
		"j\3j\3j\3j\7j\u08d2\nj\fj\16j\u08d5\13j\3j\3j\3k\6k\u08da\nk\rk\16k\u08db"+
		"\3k\6k\u08df\nk\rk\16k\u08e0\7k\u08e3\nk\fk\16k\u08e6\13k\3l\3l\3m\6m"+
		"\u08eb\nm\rm\16m\u08ec\3m\3m\3n\3n\3o\3o\3p\3p\3q\3q\3r\3r\3s\3s\3t\3"+
		"t\3u\3u\3v\3v\3w\3w\3x\3x\3y\3y\3z\3z\3{\3{\3|\3|\3}\3}\3~\3~\3\177\3"+
		"\177\3\u0080\7\u0080\u0916\n\u0080\f\u0080\16\u0080\u0919\13\u0080\3\u0080"+
		"\3\u0080\3\u0081\3\u0081\3\u0081\3\u0081\7\u0081\u0921\n\u0081\f\u0081"+
		"\16\u0081\u0924\13\u0081\5\u0081\u0926\n\u0081\3\u0081\3\u0081\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\5\u0082\u092e\n\u0082\3\u0083\3\u0083\5\u0083"+
		"\u0932\n\u0083\3\u0084\3\u0084\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086"+
		"\2\3`\u0087\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2"+
		"\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea"+
		"\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102"+
		"\u0104\u0106\u0108\u010a\2\31\5\2JJVVcc\4\2??RR\4\2\25\25||\3\2\u0096"+
		"\u0097\4\2--NN\4\2\62\62LL\7\2))YYbb\u008d\u008d\u0090\u0090\4\2\27\27"+
		"\34\35\3\2\30\31\3\2\36!\3\2\"%\6\2^^rrtt\u0089\u0089\4\2KK\u009e\u009e"+
		"\5\2))YY\u0090\u0090\7\2DFzz\u00b1\u00b1\u00b4\u00b4\u00b6\u00b6\4\2\30"+
		"\32xx\3\2\u00b1\u00b2\4\2\"\"$\'\5\2)}\177\u00a7\u00ae\u00af\3\2\16\16"+
		"\3\2\f\r\4\2\u00b2\u00b2\u00bd\u00bd\3\2\u00b1\u00b3\2\u0a75\2\u0110\3"+
		"\2\2\2\4\u0115\3\2\2\2\6\u011b\3\2\2\2\b\u0135\3\2\2\2\n\u0157\3\2\2\2"+
		"\f\u0174\3\2\2\2\16\u0179\3\2\2\2\20\u017c\3\2\2\2\22\u0185\3\2\2\2\24"+
		"\u018d\3\2\2\2\26\u0197\3\2\2\2\30\u01aa\3\2\2\2\32\u01ce\3\2\2\2\34\u01ee"+
		"\3\2\2\2\36\u0215\3\2\2\2 \u025a\3\2\2\2\"\u026d\3\2\2\2$\u028b\3\2\2"+
		"\2&\u0295\3\2\2\2(\u02b2\3\2\2\2*\u02b8\3\2\2\2,\u02c5\3\2\2\2.\u02d2"+
		"\3\2\2\2\60\u02df\3\2\2\2\62\u02f8\3\2\2\2\64\u0318\3\2\2\2\66\u0362\3"+
		"\2\2\28\u0371\3\2\2\2:\u037e\3\2\2\2<\u0384\3\2\2\2>\u0392\3\2\2\2@\u03a1"+
		"\3\2\2\2B\u03c4\3\2\2\2D\u042d\3\2\2\2F\u0430\3\2\2\2H\u0453\3\2\2\2J"+
		"\u0489\3\2\2\2L\u048b\3\2\2\2N\u0493\3\2\2\2P\u04ab\3\2\2\2R\u04bd\3\2"+
		"\2\2T\u04c6\3\2\2\2V\u04c8\3\2\2\2X\u04cc\3\2\2\2Z\u04cf\3\2\2\2\\\u04e7"+
		"\3\2\2\2^\u04ec\3\2\2\2`\u0542\3\2\2\2b\u05b4\3\2\2\2d\u05ec\3\2\2\2f"+
		"\u05ee\3\2\2\2h\u05f8\3\2\2\2j\u0602\3\2\2\2l\u060f\3\2\2\2n\u061d\3\2"+
		"\2\2p\u062b\3\2\2\2r\u063e\3\2\2\2t\u064e\3\2\2\2v\u0650\3\2\2\2x\u0668"+
		"\3\2\2\2z\u0672\3\2\2\2|\u067d\3\2\2\2~\u067f\3\2\2\2\u0080\u069e\3\2"+
		"\2\2\u0082\u06cf\3\2\2\2\u0084\u06d1\3\2\2\2\u0086\u06e8\3\2\2\2\u0088"+
		"\u06f8\3\2\2\2\u008a\u0746\3\2\2\2\u008c\u074d\3\2\2\2\u008e\u074f\3\2"+
		"\2\2\u0090\u0762\3\2\2\2\u0092\u0764\3\2\2\2\u0094\u0766\3\2\2\2\u0096"+
		"\u0768\3\2\2\2\u0098\u076c\3\2\2\2\u009a\u076e\3\2\2\2\u009c\u0770\3\2"+
		"\2\2\u009e\u0774\3\2\2\2\u00a0\u0776\3\2\2\2\u00a2\u0787\3\2\2\2\u00a4"+
		"\u0789\3\2\2\2\u00a6\u0797\3\2\2\2\u00a8\u0799\3\2\2\2\u00aa\u07ac\3\2"+
		"\2\2\u00ac\u07b1\3\2\2\2\u00ae\u07b5\3\2\2\2\u00b0\u07ba\3\2\2\2\u00b2"+
		"\u07cb\3\2\2\2\u00b4\u07e8\3\2\2\2\u00b6\u07ea\3\2\2\2\u00b8\u0833\3\2"+
		"\2\2\u00ba\u0850\3\2\2\2\u00bc\u0852\3\2\2\2\u00be\u0857\3\2\2\2\u00c0"+
		"\u0864\3\2\2\2\u00c2\u0882\3\2\2\2\u00c4\u0884\3\2\2\2\u00c6\u0886\3\2"+
		"\2\2\u00c8\u088d\3\2\2\2\u00ca\u0897\3\2\2\2\u00cc\u089a\3\2\2\2\u00ce"+
		"\u08a9\3\2\2\2\u00d0\u08ac\3\2\2\2\u00d2\u08b6\3\2\2\2\u00d4\u08e4\3\2"+
		"\2\2\u00d6\u08e7\3\2\2\2\u00d8\u08ea\3\2\2\2\u00da\u08f0\3\2\2\2\u00dc"+
		"\u08f2\3\2\2\2\u00de\u08f4\3\2\2\2\u00e0\u08f6\3\2\2\2\u00e2\u08f8\3\2"+
		"\2\2\u00e4\u08fa\3\2\2\2\u00e6\u08fc\3\2\2\2\u00e8\u08fe\3\2\2\2\u00ea"+
		"\u0900\3\2\2\2\u00ec\u0902\3\2\2\2\u00ee\u0904\3\2\2\2\u00f0\u0906\3\2"+
		"\2\2\u00f2\u0908\3\2\2\2\u00f4\u090a\3\2\2\2\u00f6\u090c\3\2\2\2\u00f8"+
		"\u090e\3\2\2\2\u00fa\u0910\3\2\2\2\u00fc\u0912\3\2\2\2\u00fe\u0917\3\2"+
		"\2\2\u0100\u091c\3\2\2\2\u0102\u0929\3\2\2\2\u0104\u0931\3\2\2\2\u0106"+
		"\u0933\3\2\2\2\u0108\u0935\3\2\2\2\u010a\u0937\3\2\2\2\u010c\u010f\5\6"+
		"\4\2\u010d\u010f\5\4\3\2\u010e\u010c\3\2\2\2\u010e\u010d\3\2\2\2\u010f"+
		"\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0113\3\2"+
		"\2\2\u0112\u0110\3\2\2\2\u0113\u0114\7\2\2\3\u0114\3\3\2\2\2\u0115\u0116"+
		"\7\u00ba\2\2\u0116\u0117\b\3\1\2\u0117\5\3\2\2\2\u0118\u011a\7\17\2\2"+
		"\u0119\u0118\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c"+
		"\3\2\2\2\u011c\u011e\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0127\5\b\5\2\u011f"+
		"\u0121\7\17\2\2\u0120\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0120\3"+
		"\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0126\5\b\5\2\u0125"+
		"\u0120\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2"+
		"\2\2\u0128\u012d\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012c\7\17\2\2\u012b"+
		"\u012a\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2"+
		"\2\2\u012e\7\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0133\7X\2\2\u0131\u0132"+
		"\7\u0085\2\2\u0132\u0134\7\u0082\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3"+
		"\2\2\2\u0134\u0136\3\2\2\2\u0135\u0130\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0155\3\2\2\2\u0137\u0156\5\n\6\2\u0138\u0156\5\20\t\2\u0139\u0156\5"+
		"\22\n\2\u013a\u0156\5\24\13\2\u013b\u0156\5\26\f\2\u013c\u0156\5\30\r"+
		"\2\u013d\u0156\5\32\16\2\u013e\u0156\5\34\17\2\u013f\u0156\5\36\20\2\u0140"+
		"\u0156\5 \21\2\u0141\u0156\5\"\22\2\u0142\u0156\5$\23\2\u0143\u0156\5"+
		"&\24\2\u0144\u0156\5(\25\2\u0145\u0156\5*\26\2\u0146\u0156\5,\27\2\u0147"+
		"\u0156\5.\30\2\u0148\u0156\5\60\31\2\u0149\u0156\5\62\32\2\u014a\u0156"+
		"\5\64\33\2\u014b\u0156\5\66\34\2\u014c\u0156\58\35\2\u014d\u0156\5:\36"+
		"\2\u014e\u0156\5<\37\2\u014f\u0156\5> \2\u0150\u0156\5@!\2\u0151\u0156"+
		"\5B\"\2\u0152\u0156\5F$\2\u0153\u0156\5H%\2\u0154\u0156\5J&\2\u0155\u0137"+
		"\3\2\2\2\u0155\u0138\3\2\2\2\u0155\u0139\3\2\2\2\u0155\u013a\3\2\2\2\u0155"+
		"\u013b\3\2\2\2\u0155\u013c\3\2\2\2\u0155\u013d\3\2\2\2\u0155\u013e\3\2"+
		"\2\2\u0155\u013f\3\2\2\2\u0155\u0140\3\2\2\2\u0155\u0141\3\2\2\2\u0155"+
		"\u0142\3\2\2\2\u0155\u0143\3\2\2\2\u0155\u0144\3\2\2\2\u0155\u0145\3\2"+
		"\2\2\u0155\u0146\3\2\2\2\u0155\u0147\3\2\2\2\u0155\u0148\3\2\2\2\u0155"+
		"\u0149\3\2\2\2\u0155\u014a\3\2\2\2\u0155\u014b\3\2\2\2\u0155\u014c\3\2"+
		"\2\2\u0155\u014d\3\2\2\2\u0155\u014e\3\2\2\2\u0155\u014f\3\2\2\2\u0155"+
		"\u0150\3\2\2\2\u0155\u0151\3\2\2\2\u0155\u0152\3\2\2\2\u0155\u0153\3\2"+
		"\2\2\u0155\u0154\3\2\2\2\u0156\t\3\2\2\2\u0157\u0158\7.\2\2\u0158\u015a"+
		"\7\u0095\2\2\u0159\u015b\7~\2\2\u015a\u0159\3\2\2\2\u015a\u015b\3\2\2"+
		"\2\u015b\u015f\3\2\2\2\u015c\u015d\5\u00dep\2\u015d\u015e\7\20\2\2\u015e"+
		"\u0160\3\2\2\2\u015f\u015c\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161\3\2"+
		"\2\2\u0161\u016c\5\u00e0q\2\u0162\u0163\7\u008c\2\2\u0163\u0164\7\u0099"+
		"\2\2\u0164\u016d\5\u00e6t\2\u0165\u016d\5\16\b\2\u0166\u016d\5\f\7\2\u0167"+
		"\u0169\7+\2\2\u0168\u016a\7>\2\2\u0169\u0168\3\2\2\2\u0169\u016a\3\2\2"+
		"\2\u016a\u016b\3\2\2\2\u016b\u016d\5L\'\2\u016c\u0162\3\2\2\2\u016c\u0165"+
		"\3\2\2\2\u016c\u0166\3\2\2\2\u016c\u0167\3\2\2\2\u016d\u016f\3\2\2\2\u016e"+
		"\u0170\7S\2\2\u016f\u016e\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0172\3\2"+
		"\2\2\u0171\u0173\5\u00d8m\2\u0172\u0171\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		"\13\3\2\2\2\u0174\u0175\7+\2\2\u0175\u0176\7A\2\2\u0176\u0177\5\u010a"+
		"\u0086\2\u0177\u0178\5j\66\2\u0178\r\3\2\2\2\u0179\u017a\7+\2\2\u017a"+
		"\u017b\5j\66\2\u017b\17\3\2\2\2\u017c\u0183\7/\2\2\u017d\u0184\5\u00de"+
		"p\2\u017e\u0184\5\u00e4s\2\u017f\u0180\5\u00dep\2\u0180\u0181\7\20\2\2"+
		"\u0181\u0182\5\u00e4s\2\u0182\u0184\3\2\2\2\u0183\u017d\3\2\2\2\u0183"+
		"\u017e\3\2\2\2\u0183\u017f\3\2\2\2\u0183\u0184\3\2\2\2\u0184\21\3\2\2"+
		"\2\u0185\u0187\7\63\2\2\u0186\u0188\7G\2\2\u0187\u0186\3\2\2\2\u0187\u0188"+
		"\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a\5`\61\2\u018a\u018b\7\61\2\2"+
		"\u018b\u018c\5\u00dep\2\u018c\23\3\2\2\2\u018d\u018f\7\66\2\2\u018e\u0190"+
		"\t\2\2\2\u018f\u018e\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0195\3\2\2\2\u0191"+
		"\u0193\7\u009a\2\2\u0192\u0194\5\u00fc\177\2\u0193\u0192\3\2\2\2\u0193"+
		"\u0194\3\2\2\2\u0194\u0196\3\2\2\2\u0195\u0191\3\2\2\2\u0195\u0196\3\2"+
		"\2\2\u0196\25\3\2\2\2\u0197\u019c\t\3\2\2\u0198\u019a\7\u009a\2\2\u0199"+
		"\u019b\5\u00fc\177\2\u019a\u0199\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019d"+
		"\3\2\2\2\u019c\u0198\3\2\2\2\u019c\u019d\3\2\2\2\u019d\27\3\2\2\2\u019e"+
		"\u01a0\7\u00a6\2\2\u019f\u01a1\7\u0087\2\2\u01a0\u019f\3\2\2\2\u01a0\u01a1"+
		"\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a7\5~@\2\u01a3\u01a4\7\25\2\2\u01a4"+
		"\u01a6\5~@\2\u01a5\u01a3\3\2\2\2\u01a6\u01a9\3\2\2\2\u01a7\u01a5\3\2\2"+
		"\2\u01a7\u01a8\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa\u019e"+
		"\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01b6\5\u008aF"+
		"\2\u01ad\u01af\7\u009c\2\2\u01ae\u01b0\7-\2\2\u01af\u01ae\3\2\2\2\u01af"+
		"\u01b0\3\2\2\2\u01b0\u01b4\3\2\2\2\u01b1\u01b4\7k\2\2\u01b2\u01b4\7U\2"+
		"\2\u01b3\u01ad\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b2\3\2\2\2\u01b4\u01b5"+
		"\3\2\2\2\u01b5\u01b7\5\u008aF\2\u01b6\u01b3\3\2\2\2\u01b7\u01b8\3\2\2"+
		"\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01c4\3\2\2\2\u01ba\u01bb"+
		"\7\u0080\2\2\u01bb\u01bc\78\2\2\u01bc\u01c1\5z>\2\u01bd\u01be\7\25\2\2"+
		"\u01be\u01c0\5z>\2\u01bf\u01bd\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1\u01bf"+
		"\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c4"+
		"\u01ba\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01cc\3\2\2\2\u01c6\u01c7\7s"+
		"\2\2\u01c7\u01ca\5`\61\2\u01c8\u01c9\t\4\2\2\u01c9\u01cb\5`\61\2\u01ca"+
		"\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cd\3\2\2\2\u01cc\u01c6\3\2"+
		"\2\2\u01cc\u01cd\3\2\2\2\u01cd\31\3\2\2\2\u01ce\u01d0\7B\2\2\u01cf\u01d1"+
		"\7\u009d\2\2\u01d0\u01cf\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d2\3\2\2"+
		"\2\u01d2\u01d6\7e\2\2\u01d3\u01d4\7a\2\2\u01d4\u01d5\7x\2\2\u01d5\u01d7"+
		"\7W\2\2\u01d6\u01d3\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01db\3\2\2\2\u01d8"+
		"\u01d9\5\u00dep\2\u01d9\u01da\7\20\2\2\u01da\u01dc\3\2\2\2\u01db\u01d8"+
		"\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01de\5\u00eex"+
		"\2\u01de\u01df\7}\2\2\u01df\u01e0\5\u00e2r\2\u01e0\u01e1\7\21\2\2\u01e1"+
		"\u01e6\5h\65\2\u01e2\u01e3\7\25\2\2\u01e3\u01e5\5h\65\2\u01e4\u01e2\3"+
		"\2\2\2\u01e5\u01e8\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7"+
		"\u01e9\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e9\u01ec\7\22\2\2\u01ea\u01eb\7"+
		"\u00a5\2\2\u01eb\u01ed\5`\61\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2"+
		"\u01ed\33\3\2\2\2\u01ee\u01f0\7B\2\2\u01ef\u01f1\t\5\2\2\u01f0\u01ef\3"+
		"\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f6\7\u0095\2\2"+
		"\u01f3\u01f4\7a\2\2\u01f4\u01f5\7x\2\2\u01f5\u01f7\7W\2\2\u01f6\u01f3"+
		"\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01fb\3\2\2\2\u01f8\u01f9\5\u00dep"+
		"\2\u01f9\u01fa\7\20\2\2\u01fa\u01fc\3\2\2\2\u01fb\u01f8\3\2\2\2\u01fb"+
		"\u01fc\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u0210\5\u00e2r\2\u01fe\u01ff"+
		"\7\21\2\2\u01ff\u0206\5L\'\2\u0200\u0201\7\25\2\2\u0201\u0205\5j\66\2"+
		"\u0202\u0203\7\25\2\2\u0203\u0205\5L\'\2\u0204\u0200\3\2\2\2\u0204\u0202"+
		"\3\2\2\2\u0205\u0208\3\2\2\2\u0206\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207"+
		"\u0209\3\2\2\2\u0208\u0206\3\2\2\2\u0209\u020c\7\22\2\2\u020a\u020b\7"+
		"\u00a7\2\2\u020b\u020d\7\u00b2\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2"+
		"\2\2\u020d\u0211\3\2\2\2\u020e\u020f\7\61\2\2\u020f\u0211\5B\"\2\u0210"+
		"\u01fe\3\2\2\2\u0210\u020e\3\2\2\2\u0211\u0213\3\2\2\2\u0212\u0214\5\u00d8"+
		"m\2\u0213\u0212\3\2\2\2\u0213\u0214\3\2\2\2\u0214\35\3\2\2\2\u0215\u0217"+
		"\7B\2\2\u0216\u0218\t\5\2\2\u0217\u0216\3\2\2\2\u0217\u0218\3\2\2\2\u0218"+
		"\u0219\3\2\2\2\u0219\u021d\7\u009b\2\2\u021a\u021b\7a\2\2\u021b\u021c"+
		"\7x\2\2\u021c\u021e\7W\2\2\u021d\u021a\3\2\2\2\u021d\u021e\3\2\2\2\u021e"+
		"\u0222\3\2\2\2\u021f\u0220\5\u00dep\2\u0220\u0221\7\20\2\2\u0221\u0223"+
		"\3\2\2\2\u0222\u021f\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0224\3\2\2\2\u0224"+
		"\u0229\5\u00f0y\2\u0225\u022a\7\65\2\2\u0226\u022a\7,\2\2\u0227\u0228"+
		"\7j\2\2\u0228\u022a\7{\2\2\u0229\u0225\3\2\2\2\u0229\u0226\3\2\2\2\u0229"+
		"\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u0239\3\2\2\2\u022b\u023a\7K"+
		"\2\2\u022c\u023a\7i\2\2\u022d\u0237\7\u009e\2\2\u022e\u022f\7{\2\2\u022f"+
		"\u0234\5\u00e8u\2\u0230\u0231\7\25\2\2\u0231\u0233\5\u00e8u\2\u0232\u0230"+
		"\3\2\2\2\u0233\u0236\3\2\2\2\u0234\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235"+
		"\u0238\3\2\2\2\u0236\u0234\3\2\2\2\u0237\u022e\3\2\2\2\u0237\u0238\3\2"+
		"\2\2\u0238\u023a\3\2\2\2\u0239\u022b\3\2\2\2\u0239\u022c\3\2\2\2\u0239"+
		"\u022d\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023f\7}\2\2\u023c\u023d\5\u00de"+
		"p\2\u023d\u023e\7\20\2\2\u023e\u0240\3\2\2\2\u023f\u023c\3\2\2\2\u023f"+
		"\u0240\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0245\5\u00e2r\2\u0242\u0243"+
		"\7Z\2\2\u0243\u0244\7P\2\2\u0244\u0246\7\u0091\2\2\u0245\u0242\3\2\2\2"+
		"\u0245\u0246\3\2\2\2\u0246\u0249\3\2\2\2\u0247\u0248\7\u00a4\2\2\u0248"+
		"\u024a\5`\61\2\u0249\u0247\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024b\3\2"+
		"\2\2\u024b\u0254\7\66\2\2\u024c\u0251\5F$\2\u024d\u0251\5\64\33\2\u024e"+
		"\u0251\5$\23\2\u024f\u0251\5B\"\2\u0250\u024c\3\2\2\2\u0250\u024d\3\2"+
		"\2\2\u0250\u024e\3\2\2\2\u0250\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252"+
		"\u0253\7\17\2\2\u0253\u0255\3\2\2\2\u0254\u0250\3\2\2\2\u0255\u0256\3"+
		"\2\2\2\u0256\u0254\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0258\3\2\2\2\u0258"+
		"\u0259\7R\2\2\u0259\37\3\2\2\2\u025a\u025c\7B\2\2\u025b\u025d\t\5\2\2"+
		"\u025c\u025b\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u0262"+
		"\7\u00a2\2\2\u025f\u0260\7a\2\2\u0260\u0261\7x\2\2\u0261\u0263\7W\2\2"+
		"\u0262\u025f\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0267\3\2\2\2\u0264\u0265"+
		"\5\u00dep\2\u0265\u0266\7\20\2\2\u0266\u0268\3\2\2\2\u0267\u0264\3\2\2"+
		"\2\u0267\u0268\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026a\5\u00f2z\2\u026a"+
		"\u026b\7\61\2\2\u026b\u026c\5B\"\2\u026c!\3\2\2\2\u026d\u026e\7B\2\2\u026e"+
		"\u026f\7\u00a3\2\2\u026f\u0273\7\u0095\2\2\u0270\u0271\7a\2\2\u0271\u0272"+
		"\7x\2\2\u0272\u0274\7W\2\2\u0273\u0270\3\2\2\2\u0273\u0274\3\2\2\2\u0274"+
		"\u0278\3\2\2\2\u0275\u0276\5\u00dep\2\u0276\u0277\7\20\2\2\u0277\u0279"+
		"\3\2\2\2\u0278\u0275\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u027a\3\2\2\2\u027a"+
		"\u027b\5\u00e2r\2\u027b\u027c\7\u009f\2\2\u027c\u0288\5\u00f4{\2\u027d"+
		"\u027e\7\21\2\2\u027e\u0283\5\u0098M\2\u027f\u0280\7\25\2\2\u0280\u0282"+
		"\5\u0098M\2\u0281\u027f\3\2\2\2\u0282\u0285\3\2\2\2\u0283\u0281\3\2\2"+
		"\2\u0283\u0284\3\2\2\2\u0284\u0286\3\2\2\2\u0285\u0283\3\2\2\2\u0286\u0287"+
		"\7\22\2\2\u0287\u0289\3\2\2\2\u0288\u027d\3\2\2\2\u0288\u0289\3\2\2\2"+
		"\u0289#\3\2\2\2\u028a\u028c\5v<\2\u028b\u028a\3\2\2\2\u028b\u028c\3\2"+
		"\2\2\u028c\u028d\3\2\2\2\u028d\u028e\7K\2\2\u028e\u028f\7\\\2\2\u028f"+
		"\u0292\5x=\2\u0290\u0291\7\u00a5\2\2\u0291\u0293\5`\61\2\u0292\u0290\3"+
		"\2\2\2\u0292\u0293\3\2\2\2\u0293%\3\2\2\2\u0294\u0296\5v<\2\u0295\u0294"+
		"\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0298\7K\2\2\u0298"+
		"\u0299\7\\\2\2\u0299\u029c\5x=\2\u029a\u029b\7\u00a5\2\2\u029b\u029d\5"+
		"`\61\2\u029c\u029a\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u02b0\3\2\2\2\u029e"+
		"\u029f\7\u0080\2\2\u029f\u02a0\78\2\2\u02a0\u02a5\5z>\2\u02a1\u02a2\7"+
		"\25\2\2\u02a2\u02a4\5z>\2\u02a3\u02a1\3\2\2\2\u02a4\u02a7\3\2\2\2\u02a5"+
		"\u02a3\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a9\3\2\2\2\u02a7\u02a5\3\2"+
		"\2\2\u02a8\u029e\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa"+
		"\u02ab\7s\2\2\u02ab\u02ae\5`\61\2\u02ac\u02ad\t\4\2\2\u02ad\u02af\5`\61"+
		"\2\u02ae\u02ac\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02b1\3\2\2\2\u02b0\u02a8"+
		"\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\'\3\2\2\2\u02b2\u02b4\7M\2\2\u02b3"+
		"\u02b5\7G\2\2\u02b4\u02b3\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b6\3\2"+
		"\2\2\u02b6\u02b7\5\u00dep\2\u02b7)\3\2\2\2\u02b8\u02b9\7O\2\2\u02b9\u02bc"+
		"\7e\2\2\u02ba\u02bb\7a\2\2\u02bb\u02bd\7W\2\2\u02bc\u02ba\3\2\2\2\u02bc"+
		"\u02bd\3\2\2\2\u02bd\u02c1\3\2\2\2\u02be\u02bf\5\u00dep\2\u02bf\u02c0"+
		"\7\20\2\2\u02c0\u02c2\3\2\2\2\u02c1\u02be\3\2\2\2\u02c1\u02c2\3\2\2\2"+
		"\u02c2\u02c3\3\2\2\2\u02c3\u02c4\5\u00eex\2\u02c4+\3\2\2\2\u02c5\u02c6"+
		"\7O\2\2\u02c6\u02c9\7\u0095\2\2\u02c7\u02c8\7a\2\2\u02c8\u02ca\7W\2\2"+
		"\u02c9\u02c7\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02ce\3\2\2\2\u02cb\u02cc"+
		"\5\u00dep\2\u02cc\u02cd\7\20\2\2\u02cd\u02cf\3\2\2\2\u02ce\u02cb\3\2\2"+
		"\2\u02ce\u02cf\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d1\5\u00e2r\2\u02d1"+
		"-\3\2\2\2\u02d2\u02d3\7O\2\2\u02d3\u02d6\7\u009b\2\2\u02d4\u02d5\7a\2"+
		"\2\u02d5\u02d7\7W\2\2\u02d6\u02d4\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02db"+
		"\3\2\2\2\u02d8\u02d9\5\u00dep\2\u02d9\u02da\7\20\2\2\u02da\u02dc\3\2\2"+
		"\2\u02db\u02d8\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02de"+
		"\5\u00f0y\2\u02de/\3\2\2\2\u02df\u02e0\7O\2\2\u02e0\u02e3\7\u00a2\2\2"+
		"\u02e1\u02e2\7a\2\2\u02e2\u02e4\7W\2\2\u02e3\u02e1\3\2\2\2\u02e3\u02e4"+
		"\3\2\2\2\u02e4\u02e8\3\2\2\2\u02e5\u02e6\5\u00dep\2\u02e6\u02e7\7\20\2"+
		"\2\u02e7\u02e9\3\2\2\2\u02e8\u02e5\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02ea"+
		"\3\2\2\2\u02ea\u02eb\5\u00f2z\2\u02eb\61\3\2\2\2\u02ec\u02ee\7\u00a6\2"+
		"\2\u02ed\u02ef\7\u0087\2\2\u02ee\u02ed\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef"+
		"\u02f0\3\2\2\2\u02f0\u02f5\5~@\2\u02f1\u02f2\7\25\2\2\u02f2\u02f4\5~@"+
		"\2\u02f3\u02f1\3\2\2\2\u02f4\u02f7\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f5\u02f6"+
		"\3\2\2\2\u02f6\u02f9\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f8\u02ec\3\2\2\2\u02f8"+
		"\u02f9\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u0300\5\u008aF\2\u02fb\u02fc"+
		"\5\u008cG\2\u02fc\u02fd\5\u008aF\2\u02fd\u02ff\3\2\2\2\u02fe\u02fb\3\2"+
		"\2\2\u02ff\u0302\3\2\2\2\u0300\u02fe\3\2\2\2\u0300\u0301\3\2\2\2\u0301"+
		"\u030d\3\2\2\2\u0302\u0300\3\2\2\2\u0303\u0304\7\u0080\2\2\u0304\u0305"+
		"\78\2\2\u0305\u030a\5z>\2\u0306\u0307\7\25\2\2\u0307\u0309\5z>\2\u0308"+
		"\u0306\3\2\2\2\u0309\u030c\3\2\2\2\u030a\u0308\3\2\2\2\u030a\u030b\3\2"+
		"\2\2\u030b\u030e\3\2\2\2\u030c\u030a\3\2\2\2\u030d\u0303\3\2\2\2\u030d"+
		"\u030e\3\2\2\2\u030e\u0315\3\2\2\2\u030f\u0310\7s\2\2\u0310\u0313\5`\61"+
		"\2\u0311\u0312\t\4\2\2\u0312\u0314\5`\61\2\u0313\u0311\3\2\2\2\u0313\u0314"+
		"\3\2\2\2\u0314\u0316\3\2\2\2\u0315\u030f\3\2\2\2\u0315\u0316\3\2\2\2\u0316"+
		"\63\3\2\2\2\u0317\u0319\5v<\2\u0318\u0317\3\2\2\2\u0318\u0319\3\2\2\2"+
		"\u0319\u032b\3\2\2\2\u031a\u032c\7i\2\2\u031b\u032c\7\u008d\2\2\u031c"+
		"\u031d\7i\2\2\u031d\u031e\7\177\2\2\u031e\u032c\7\u008d\2\2\u031f\u0320"+
		"\7i\2\2\u0320\u0321\7\177\2\2\u0321\u032c\7\u0090\2\2\u0322\u0323\7i\2"+
		"\2\u0323\u0324\7\177\2\2\u0324\u032c\7)\2\2\u0325\u0326\7i\2\2\u0326\u0327"+
		"\7\177\2\2\u0327\u032c\7Y\2\2\u0328\u0329\7i\2\2\u0329\u032a\7\177\2\2"+
		"\u032a\u032c\7b\2\2\u032b\u031a\3\2\2\2\u032b\u031b\3\2\2\2\u032b\u031c"+
		"\3\2\2\2\u032b\u031f\3\2\2\2\u032b\u0322\3\2\2\2\u032b\u0325\3\2\2\2\u032b"+
		"\u0328\3\2\2\2\u032c\u032d\3\2\2\2\u032d\u0331\7l\2\2\u032e\u032f\5\u00de"+
		"p\2\u032f\u0330\7\20\2\2\u0330\u0332\3\2\2\2\u0331\u032e\3\2\2\2\u0331"+
		"\u0332\3\2\2\2\u0332\u0333\3\2\2\2\u0333\u033f\5\u00e2r\2\u0334\u0335"+
		"\7\21\2\2\u0335\u033a\5\u00e8u\2\u0336\u0337\7\25\2\2\u0337\u0339\5\u00e8"+
		"u\2\u0338\u0336\3\2\2\2\u0339\u033c\3\2\2\2\u033a\u0338\3\2\2\2\u033a"+
		"\u033b\3\2\2\2\u033b\u033d\3\2\2\2\u033c\u033a\3\2\2\2\u033d\u033e\7\22"+
		"\2\2\u033e\u0340\3\2\2\2\u033f\u0334\3\2\2\2\u033f\u0340\3\2\2\2\u0340"+
		"\u0360\3\2\2\2\u0341\u0342\7\u00a1\2\2\u0342\u0343\7\21\2\2\u0343\u0348"+
		"\5`\61\2\u0344\u0345\7\25\2\2\u0345\u0347\5`\61\2\u0346\u0344\3\2\2\2"+
		"\u0347\u034a\3\2\2\2\u0348\u0346\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u034b"+
		"\3\2\2\2\u034a\u0348\3\2\2\2\u034b\u035a\7\22\2\2\u034c\u034d\7\25\2\2"+
		"\u034d\u034e\7\21\2\2\u034e\u0353\5`\61\2\u034f\u0350\7\25\2\2\u0350\u0352"+
		"\5`\61\2\u0351\u034f\3\2\2\2\u0352\u0355\3\2\2\2\u0353\u0351\3\2\2\2\u0353"+
		"\u0354\3\2\2\2\u0354\u0356\3\2\2\2\u0355\u0353\3\2\2\2\u0356\u0357\7\22"+
		"\2\2\u0357\u0359\3\2\2\2\u0358\u034c\3\2\2\2\u0359\u035c\3\2\2\2\u035a"+
		"\u0358\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u0361\3\2\2\2\u035c\u035a\3\2"+
		"\2\2\u035d\u0361\5B\"\2\u035e\u035f\7H\2\2\u035f\u0361\7\u00a1\2\2\u0360"+
		"\u0341\3\2\2\2\u0360\u035d\3\2\2\2\u0360\u035e\3\2\2\2\u0361\65\3\2\2"+
		"\2\u0362\u0366\7\u0083\2\2\u0363\u0364\5\u00dep\2\u0364\u0365\7\20\2\2"+
		"\u0365\u0367\3\2\2\2\u0366\u0363\3\2\2\2\u0366\u0367\3\2\2\2\u0367\u0368"+
		"\3\2\2\2\u0368\u036f\5\u00f6|\2\u0369\u036a\7\26\2\2\u036a\u0370\5|?\2"+
		"\u036b\u036c\7\21\2\2\u036c\u036d\5|?\2\u036d\u036e\7\22\2\2\u036e\u0370"+
		"\3\2\2\2\u036f\u0369\3\2\2\2\u036f\u036b\3\2\2\2\u036f\u0370\3\2\2\2\u0370"+
		"\67\3\2\2\2\u0371\u037c\7\u008a\2\2\u0372\u037d\5\u00eav\2\u0373\u0374"+
		"\5\u00dep\2\u0374\u0375\7\20\2\2\u0375\u0377\3\2\2\2\u0376\u0373\3\2\2"+
		"\2\u0376\u0377\3\2\2\2\u0377\u037a\3\2\2\2\u0378\u037b\5\u00e2r\2\u0379"+
		"\u037b\5\u00eex\2\u037a\u0378\3\2\2\2\u037a\u0379\3\2\2\2\u037b\u037d"+
		"\3\2\2\2\u037c\u0372\3\2\2\2\u037c\u0376\3\2\2\2\u037c\u037d\3\2\2\2\u037d"+
		"9\3\2\2\2\u037e\u0380\7\u008b\2\2\u037f\u0381\7\u0092\2\2\u0380\u037f"+
		"\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0382\3\2\2\2\u0382\u0383\5\u00f8}"+
		"\2\u0383;\3\2\2\2\u0384\u0389\7\u0090\2\2\u0385\u0387\7\u009a\2\2\u0386"+
		"\u0388\5\u00fc\177\2\u0387\u0386\3\2\2\2\u0387\u0388\3\2\2\2\u0388\u038a"+
		"\3\2\2\2\u0389\u0385\3\2\2\2\u0389\u038a\3\2\2\2\u038a\u0390\3\2\2\2\u038b"+
		"\u038d\7\u0099\2\2\u038c\u038e\7\u0092\2\2\u038d\u038c\3\2\2\2\u038d\u038e"+
		"\3\2\2\2\u038e\u038f\3\2\2\2\u038f\u0391\5\u00f8}\2\u0390\u038b\3\2\2"+
		"\2\u0390\u0391\3\2\2\2\u0391=\3\2\2\2\u0392\u0393\7\u0092\2\2\u0393\u0394"+
		"\5\u00f8}\2\u0394?\3\2\2\2\u0395\u0397\7\u00a6\2\2\u0396\u0398\7\u0087"+
		"\2\2\u0397\u0396\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u0399\3\2\2\2\u0399"+
		"\u039e\5~@\2\u039a\u039b\7\25\2\2\u039b\u039d\5~@\2\u039c\u039a\3\2\2"+
		"\2\u039d\u03a0\3\2\2\2\u039e\u039c\3\2\2\2\u039e\u039f\3\2\2\2\u039f\u03a2"+
		"\3\2\2\2\u03a0\u039e\3\2\2\2\u03a1\u0395\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2"+
		"\u03a3\3\2\2\2\u03a3\u03ae\5\u008aF\2\u03a4\u03a5\7\u0080\2\2\u03a5\u03a6"+
		"\78\2\2\u03a6\u03ab\5z>\2\u03a7\u03a8\7\25\2\2\u03a8\u03aa\5z>\2\u03a9"+
		"\u03a7\3\2\2\2\u03aa\u03ad\3\2\2\2\u03ab\u03a9\3\2\2\2\u03ab\u03ac\3\2"+
		"\2\2\u03ac\u03af\3\2\2\2\u03ad\u03ab\3\2\2\2\u03ae\u03a4\3\2\2\2\u03ae"+
		"\u03af\3\2\2\2\u03af\u03b6\3\2\2\2\u03b0\u03b1\7s\2\2\u03b1\u03b4\5`\61"+
		"\2\u03b2\u03b3\t\4\2\2\u03b3\u03b5\5`\61\2\u03b4\u03b2\3\2\2\2\u03b4\u03b5"+
		"\3\2\2\2\u03b5\u03b7\3\2\2\2\u03b6\u03b0\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7"+
		"A\3\2\2\2\u03b8\u03ba\7\u00a6\2\2\u03b9\u03bb\7\u0087\2\2\u03ba\u03b9"+
		"\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bc\u03c1\5~@\2\u03bd"+
		"\u03be\7\25\2\2\u03be\u03c0\5~@\2\u03bf\u03bd\3\2\2\2\u03c0\u03c3\3\2"+
		"\2\2\u03c1\u03bf\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03c5\3\2\2\2\u03c3"+
		"\u03c1\3\2\2\2\u03c4\u03b8\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03c6\3\2"+
		"\2\2\u03c6\u03cc\5D#\2\u03c7\u03c8\5\u008cG\2\u03c8\u03c9\5D#\2\u03c9"+
		"\u03cb\3\2\2\2\u03ca\u03c7\3\2\2\2\u03cb\u03ce\3\2\2\2\u03cc\u03ca\3\2"+
		"\2\2\u03cc\u03cd\3\2\2\2\u03cd\u03d9\3\2\2\2\u03ce\u03cc\3\2\2\2\u03cf"+
		"\u03d0\7\u0080\2\2\u03d0\u03d1\78\2\2\u03d1\u03d6\5z>\2\u03d2\u03d3\7"+
		"\25\2\2\u03d3\u03d5\5z>\2\u03d4\u03d2\3\2\2\2\u03d5\u03d8\3\2\2\2\u03d6"+
		"\u03d4\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7\u03da\3\2\2\2\u03d8\u03d6\3\2"+
		"\2\2\u03d9\u03cf\3\2\2\2\u03d9\u03da\3\2\2\2\u03da\u03e1\3\2\2\2\u03db"+
		"\u03dc\7s\2\2\u03dc\u03df\5`\61\2\u03dd\u03de\t\4\2\2\u03de\u03e0\5`\61"+
		"\2\u03df\u03dd\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0\u03e2\3\2\2\2\u03e1\u03db"+
		"\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2C\3\2\2\2\u03e3\u03e5\7\u0093\2\2\u03e4"+
		"\u03e6\t\6\2\2\u03e5\u03e4\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03e7\3\2"+
		"\2\2\u03e7\u03ec\5\u0080A\2\u03e8\u03e9\7\25\2\2\u03e9\u03eb\5\u0080A"+
		"\2\u03ea\u03e8\3\2\2\2\u03eb\u03ee\3\2\2\2\u03ec\u03ea\3\2\2\2\u03ec\u03ed"+
		"\3\2\2\2\u03ed\u03fb\3\2\2\2\u03ee\u03ec\3\2\2\2\u03ef\u03f9\7\\\2\2\u03f0"+
		"\u03f5\5\u0082B\2\u03f1\u03f2\7\25\2\2\u03f2\u03f4\5\u0082B\2\u03f3\u03f1"+
		"\3\2\2\2\u03f4\u03f7\3\2\2\2\u03f5\u03f3\3\2\2\2\u03f5\u03f6\3\2\2\2\u03f6"+
		"\u03fa\3\2\2\2\u03f7\u03f5\3\2\2\2\u03f8\u03fa\5\u0084C\2\u03f9\u03f0"+
		"\3\2\2\2\u03f9\u03f8\3\2\2\2\u03fa\u03fc\3\2\2\2\u03fb\u03ef\3\2\2\2\u03fb"+
		"\u03fc\3\2\2\2\u03fc\u03ff\3\2\2\2\u03fd\u03fe\7\u00a5\2\2\u03fe\u0400"+
		"\5`\61\2\u03ff\u03fd\3\2\2\2\u03ff\u0400\3\2\2\2\u0400\u040f\3\2\2\2\u0401"+
		"\u0402\7_\2\2\u0402\u0403\78\2\2\u0403\u0408\5`\61\2\u0404\u0405\7\25"+
		"\2\2\u0405\u0407\5`\61\2\u0406\u0404\3\2\2\2\u0407\u040a\3\2\2\2\u0408"+
		"\u0406\3\2\2\2\u0408\u0409\3\2\2\2\u0409\u040d\3\2\2\2\u040a\u0408\3\2"+
		"\2\2\u040b\u040c\7`\2\2\u040c\u040e\5`\61\2\u040d\u040b\3\2\2\2\u040d"+
		"\u040e\3\2\2\2\u040e\u0410\3\2\2\2\u040f\u0401\3\2\2\2\u040f\u0410\3\2"+
		"\2\2\u0410\u042e\3\2\2\2\u0411\u0412\7\u00a1\2\2\u0412\u0413\7\21\2\2"+
		"\u0413\u0418\5`\61\2\u0414\u0415\7\25\2\2\u0415\u0417\5`\61\2\u0416\u0414"+
		"\3\2\2\2\u0417\u041a\3\2\2\2\u0418\u0416\3\2\2\2\u0418\u0419\3\2\2\2\u0419"+
		"\u041b\3\2\2\2\u041a\u0418\3\2\2\2\u041b\u042a\7\22\2\2\u041c\u041d\7"+
		"\25\2\2\u041d\u041e\7\21\2\2\u041e\u0423\5`\61\2\u041f\u0420\7\25\2\2"+
		"\u0420\u0422\5`\61\2\u0421\u041f\3\2\2\2\u0422\u0425\3\2\2\2\u0423\u0421"+
		"\3\2\2\2\u0423\u0424\3\2\2\2\u0424\u0426\3\2\2\2\u0425\u0423\3\2\2\2\u0426"+
		"\u0427\7\22\2\2\u0427\u0429\3\2\2\2\u0428\u041c\3\2\2\2\u0429\u042c\3"+
		"\2\2\2\u042a\u0428\3\2\2\2\u042a\u042b\3\2\2\2\u042b\u042e\3\2\2\2\u042c"+
		"\u042a\3\2\2\2\u042d\u03e3\3\2\2\2\u042d\u0411\3\2\2\2\u042eE\3\2\2\2"+
		"\u042f\u0431\5v<\2\u0430\u042f\3\2\2\2\u0430\u0431\3\2\2\2\u0431\u0432"+
		"\3\2\2\2\u0432\u043d\7\u009e\2\2\u0433\u0434\7\177\2\2\u0434\u043e\7\u0090"+
		"\2\2\u0435\u0436\7\177\2\2\u0436\u043e\7)\2\2\u0437\u0438\7\177\2\2\u0438"+
		"\u043e\7\u008d\2\2\u0439\u043a\7\177\2\2\u043a\u043e\7Y\2\2\u043b\u043c"+
		"\7\177\2\2\u043c\u043e\7b\2\2\u043d\u0433\3\2\2\2\u043d\u0435\3\2\2\2"+
		"\u043d\u0437\3\2\2\2\u043d\u0439\3\2\2\2\u043d\u043b\3\2\2\2\u043d\u043e"+
		"\3\2\2\2\u043e\u043f\3\2\2\2\u043f\u0440\5x=\2\u0440\u0441\7\u0094\2\2"+
		"\u0441\u0442\5\u00e8u\2\u0442\u0443\7\26\2\2\u0443\u044b\5`\61\2\u0444"+
		"\u0445\7\25\2\2\u0445\u0446\5\u00e8u\2\u0446\u0447\7\26\2\2\u0447\u0448"+
		"\5`\61\2\u0448\u044a\3\2\2\2\u0449\u0444\3\2\2\2\u044a\u044d\3\2\2\2\u044b"+
		"\u0449\3\2\2\2\u044b\u044c\3\2\2\2\u044c\u0450\3\2\2\2\u044d\u044b\3\2"+
		"\2\2\u044e\u044f\7\u00a5\2\2\u044f\u0451\5`\61\2\u0450\u044e\3\2\2\2\u0450"+
		"\u0451\3\2\2\2\u0451G\3\2\2\2\u0452\u0454\5v<\2\u0453\u0452\3\2\2\2\u0453"+
		"\u0454\3\2\2\2\u0454\u0455\3\2\2\2\u0455\u0460\7\u009e\2\2\u0456\u0457"+
		"\7\177\2\2\u0457\u0461\7\u0090\2\2\u0458\u0459\7\177\2\2\u0459\u0461\7"+
		")\2\2\u045a\u045b\7\177\2\2\u045b\u0461\7\u008d\2\2\u045c\u045d\7\177"+
		"\2\2\u045d\u0461\7Y\2\2\u045e\u045f\7\177\2\2\u045f\u0461\7b\2\2\u0460"+
		"\u0456\3\2\2\2\u0460\u0458\3\2\2\2\u0460\u045a\3\2\2\2\u0460\u045c\3\2"+
		"\2\2\u0460\u045e\3\2\2\2\u0460\u0461\3\2\2\2\u0461\u0462\3\2\2\2\u0462"+
		"\u0463\5x=\2\u0463\u0464\7\u0094\2\2\u0464\u0465\5\u00e8u\2\u0465\u0466"+
		"\7\26\2\2\u0466\u046e\5`\61\2\u0467\u0468\7\25\2\2\u0468\u0469\5\u00e8"+
		"u\2\u0469\u046a\7\26\2\2\u046a\u046b\5`\61\2\u046b\u046d\3\2\2\2\u046c"+
		"\u0467\3\2\2\2\u046d\u0470\3\2\2\2\u046e\u046c\3\2\2\2\u046e\u046f\3\2"+
		"\2\2\u046f\u0473\3\2\2\2\u0470\u046e\3\2\2\2\u0471\u0472\7\u00a5\2\2\u0472"+
		"\u0474\5`\61\2\u0473\u0471\3\2\2\2\u0473\u0474\3\2\2\2\u0474\u0487\3\2"+
		"\2\2\u0475\u0476\7\u0080\2\2\u0476\u0477\78\2\2\u0477\u047c\5z>\2\u0478"+
		"\u0479\7\25\2\2\u0479\u047b\5z>\2\u047a\u0478\3\2\2\2\u047b\u047e\3\2"+
		"\2\2\u047c\u047a\3\2\2\2\u047c\u047d\3\2\2\2\u047d\u0480\3\2\2\2\u047e"+
		"\u047c\3\2\2\2\u047f\u0475\3\2\2\2\u047f\u0480\3\2\2\2\u0480\u0481\3\2"+
		"\2\2\u0481\u0482\7s\2\2\u0482\u0485\5`\61\2\u0483\u0484\t\4\2\2\u0484"+
		"\u0486\5`\61\2\u0485\u0483\3\2\2\2\u0485\u0486\3\2\2\2\u0486\u0488\3\2"+
		"\2\2\u0487\u047f\3\2\2\2\u0487\u0488\3\2\2\2\u0488I\3\2\2\2\u0489\u048a"+
		"\7\u00a0\2\2\u048aK\3\2\2\2\u048b\u0490\5\u00e8u\2\u048c\u048f\5P)\2\u048d"+
		"\u048f\5N(\2\u048e\u048c\3\2\2\2\u048e\u048d\3\2\2\2\u048f\u0492\3\2\2"+
		"\2\u0490\u048e\3\2\2\2\u0490\u0491\3\2\2\2\u0491M\3\2\2\2\u0492\u0490"+
		"\3\2\2\2\u0493\u04a7\5\u00dan\2\u0494\u0495\7\21\2\2\u0495\u0497\5\u0090"+
		"I\2\u0496\u0498\5\u010a\u0086\2\u0497\u0496\3\2\2\2\u0497\u0498\3\2\2"+
		"\2\u0498\u0499\3\2\2\2\u0499\u049a\7\22\2\2\u049a\u04a8\3\2\2\2\u049b"+
		"\u049c\7\21\2\2\u049c\u049e\5\u0090I\2\u049d\u049f\5\u010a\u0086\2\u049e"+
		"\u049d\3\2\2\2\u049e\u049f\3\2\2\2\u049f\u04a0\3\2\2\2\u04a0\u04a1\7\25"+
		"\2\2\u04a1\u04a3\5\u0090I\2\u04a2\u04a4\5\u010a\u0086\2\u04a3\u04a2\3"+
		"\2\2\2\u04a3\u04a4\3\2\2\2\u04a4\u04a5\3\2\2\2\u04a5\u04a6\7\22\2\2\u04a6"+
		"\u04a8\3\2\2\2\u04a7\u0494\3\2\2\2\u04a7\u049b\3\2\2\2\u04a7\u04a8\3\2"+
		"\2\2\u04a8O\3\2\2\2\u04a9\u04aa\7A\2\2\u04aa\u04ac\5\u00dan\2\u04ab\u04a9"+
		"\3\2\2\2\u04ab\u04ac\3\2\2\2\u04ac\u04bb\3\2\2\2\u04ad\u04bc\5R*\2\u04ae"+
		"\u04bc\5T+\2\u04af\u04bc\5V,\2\u04b0\u04bc\5X-\2\u04b1\u04b2\7\u009d\2"+
		"\2\u04b2\u04bc\5^\60\2\u04b3\u04b4\7<\2\2\u04b4\u04b5\7\21\2\2\u04b5\u04b6"+
		"\5`\61\2\u04b6\u04b7\7\22\2\2\u04b7\u04bc\3\2\2\2\u04b8\u04bc\5Z.\2\u04b9"+
		"\u04ba\7=\2\2\u04ba\u04bc\5\u00eav\2\u04bb\u04ad\3\2\2\2\u04bb\u04ae\3"+
		"\2\2\2\u04bb\u04af\3\2\2\2\u04bb\u04b0\3\2\2\2\u04bb\u04b1\3\2\2\2\u04bb"+
		"\u04b3\3\2\2\2\u04bb\u04b8\3\2\2\2\u04bb\u04b9\3\2\2\2\u04bcQ\3\2\2\2"+
		"\u04bd\u04be\7\u0084\2\2\u04be\u04c0\7p\2\2\u04bf\u04c1\t\7\2\2\u04c0"+
		"\u04bf\3\2\2\2\u04c0\u04c1\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2\u04c4\5^"+
		"\60\2\u04c3\u04c5\7\64\2\2\u04c4\u04c3\3\2\2\2\u04c4\u04c5\3\2\2\2\u04c5"+
		"S\3\2\2\2\u04c6\u04c7\5b\62\2\u04c7U\3\2\2\2\u04c8\u04c9\7x\2\2\u04c9"+
		"\u04ca\7z\2\2\u04ca\u04cb\5^\60\2\u04cbW\3\2\2\2\u04cc\u04cd\7z\2\2\u04cd"+
		"\u04ce\5^\60\2\u04ceY\3\2\2\2\u04cf\u04db\7H\2\2\u04d0\u04dc\5\\/\2\u04d1"+
		"\u04d2\7\21\2\2\u04d2\u04d3\5`\61\2\u04d3\u04d4\7\22\2\2\u04d4\u04dc\3"+
		"\2\2\2\u04d5\u04d6\7v\2\2\u04d6\u04d7\7\21\2\2\u04d7\u04d8\5`\61\2\u04d8"+
		"\u04d9\7\22\2\2\u04d9\u04dc\3\2\2\2\u04da\u04dc\5\u010a\u0086\2\u04db"+
		"\u04d0\3\2\2\2\u04db\u04d1\3\2\2\2\u04db\u04d5\3\2\2\2\u04db\u04da\3\2"+
		"\2\2\u04dc\u04e3\3\2\2\2\u04dd\u04df\7\3\2\2\u04de\u04e0\5\u010a\u0086"+
		"\2\u04df\u04de\3\2\2\2\u04e0\u04e1\3\2\2\2\u04e1\u04df\3\2\2\2\u04e1\u04e2"+
		"\3\2\2\2\u04e2\u04e4\3\2\2\2\u04e3\u04dd\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4"+
		"[\3\2\2\2\u04e5\u04e8\5\u0090I\2\u04e6\u04e8\5\u0092J\2\u04e7\u04e5\3"+
		"\2\2\2\u04e7\u04e6\3\2\2\2\u04e8]\3\2\2\2\u04e9\u04ea\7}\2\2\u04ea\u04eb"+
		"\7@\2\2\u04eb\u04ed\t\b\2\2\u04ec\u04e9\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed"+
		"_\3\2\2\2\u04ee\u04ef\b\61\1\2\u04ef\u0543\5\u0092J\2\u04f0\u0543\7\u00b5"+
		"\2\2\u04f1\u04f2\5\u00dep\2\u04f2\u04f3\7\20\2\2\u04f3\u04f5\3\2\2\2\u04f4"+
		"\u04f1\3\2\2\2\u04f4\u04f5\3\2\2\2\u04f5\u04f6\3\2\2\2\u04f6\u04f7\5\u00e2"+
		"r\2\u04f7\u04f8\7\20\2\2\u04f8\u04fa\3\2\2\2\u04f9\u04f4\3\2\2\2\u04f9"+
		"\u04fa\3\2\2\2\u04fa\u04fb\3\2\2\2\u04fb\u0543\5\u00e8u\2\u04fc\u04fd"+
		"\5\u0094K\2\u04fd\u04fe\5`\61\35\u04fe\u0543\3\2\2\2\u04ff\u0500\7\5\2"+
		"\2\u0500\u0543\5`\61\32\u0501\u0502\7\30\2\2\u0502\u0503\7\30\2\2\u0503"+
		"\u0543\5`\61\30\u0504\u0505\7\31\2\2\u0505\u0506\7\31\2\2\u0506\u0543"+
		"\5`\61\26\u0507\u0508\5\u00dco\2\u0508\u0515\7\21\2\2\u0509\u050b\7N\2"+
		"\2\u050a\u0509\3\2\2\2\u050a\u050b\3\2\2\2\u050b\u050c\3\2\2\2\u050c\u0511"+
		"\5`\61\2\u050d\u050e\7\25\2\2\u050e\u0510\5`\61\2\u050f\u050d\3\2\2\2"+
		"\u0510\u0513\3\2\2\2\u0511\u050f\3\2\2\2\u0511\u0512\3\2\2\2\u0512\u0516"+
		"\3\2\2\2\u0513\u0511\3\2\2\2\u0514\u0516\7\27\2\2\u0515\u050a\3\2\2\2"+
		"\u0515\u0514\3\2\2\2\u0515\u0516\3\2\2\2\u0516\u0517\3\2\2\2\u0517\u0518"+
		"\7\22\2\2\u0518\u0543\3\2\2\2\u0519\u051a\7\21\2\2\u051a\u051b\5`\61\2"+
		"\u051b\u051c\7\22\2\2\u051c\u0543\3\2\2\2\u051d\u051e\7;\2\2\u051e\u051f"+
		"\7\21\2\2\u051f\u0520\5`\61\2\u0520\u0521\7\61\2\2\u0521\u0522\5N(\2\u0522"+
		"\u0523\7\22\2\2\u0523\u0543\3\2\2\2\u0524\u0526\7x\2\2\u0525\u0524\3\2"+
		"\2\2\u0525\u0526\3\2\2\2\u0526\u0527\3\2\2\2\u0527\u0529\7W\2\2\u0528"+
		"\u0525\3\2\2\2\u0528\u0529\3\2\2\2\u0529\u052a\3\2\2\2\u052a\u052b\7\21"+
		"\2\2\u052b\u052c\5B\"\2\u052c\u052d\7\22\2\2\u052d\u0543\3\2\2\2\u052e"+
		"\u0530\7:\2\2\u052f\u0531\5`\61\2\u0530\u052f\3\2\2\2\u0530\u0531\3\2"+
		"\2\2\u0531\u0537\3\2\2\2\u0532\u0533\7\u00a4\2\2\u0533\u0534\5`\61\2\u0534"+
		"\u0535\7\u0098\2\2\u0535\u0536\5`\61\2\u0536\u0538\3\2\2\2\u0537\u0532"+
		"\3\2\2\2\u0538\u0539\3\2\2\2\u0539\u0537\3\2\2\2\u0539\u053a\3\2\2\2\u053a"+
		"\u053d\3\2\2\2\u053b\u053c\7Q\2\2\u053c\u053e\5`\61\2\u053d\u053b\3\2"+
		"\2\2\u053d\u053e\3\2\2\2\u053e\u053f\3\2\2\2\u053f\u0540\7R\2\2\u0540"+
		"\u0543\3\2\2\2\u0541\u0543\5f\64\2\u0542\u04ee\3\2\2\2\u0542\u04f0\3\2"+
		"\2\2\u0542\u04f9\3\2\2\2\u0542\u04fc\3\2\2\2\u0542\u04ff\3\2\2\2\u0542"+
		"\u0501\3\2\2\2\u0542\u0504\3\2\2\2\u0542\u0507\3\2\2\2\u0542\u0519\3\2"+
		"\2\2\u0542\u051d\3\2\2\2\u0542\u0528\3\2\2\2\u0542\u052e\3\2\2\2\u0542"+
		"\u0541\3\2\2\2\u0543\u05b1\3\2\2\2\u0544\u0545\f\34\2\2\u0545\u0546\7"+
		"\33\2\2\u0546\u05b0\5`\61\35\u0547\u0548\f\33\2\2\u0548\u0549\7\4\2\2"+
		"\u0549\u05b0\5`\61\34\u054a\u054b\f\25\2\2\u054b\u054c\t\t\2\2\u054c\u05b0"+
		"\5`\61\26\u054d\u054e\f\24\2\2\u054e\u054f\t\n\2\2\u054f\u05b0\5`\61\25"+
		"\u0550\u0551\f\23\2\2\u0551\u0552\t\13\2\2\u0552\u05b0\5`\61\24\u0553"+
		"\u0554\f\22\2\2\u0554\u0555\t\f\2\2\u0555\u05b0\5`\61\23\u0556\u0563\f"+
		"\21\2\2\u0557\u0564\7\26\2\2\u0558\u0564\7&\2\2\u0559\u0564\7\'\2\2\u055a"+
		"\u0564\7(\2\2\u055b\u0564\7m\2\2\u055c\u055d\7m\2\2\u055d\u0564\7x\2\2"+
		"\u055e\u0564\7d\2\2\u055f\u0564\7r\2\2\u0560\u0564\7^\2\2\u0561\u0564"+
		"\7t\2\2\u0562\u0564\7\u0089\2\2\u0563\u0557\3\2\2\2\u0563\u0558\3\2\2"+
		"\2\u0563\u0559\3\2\2\2\u0563\u055a\3\2\2\2\u0563\u055b\3\2\2\2\u0563\u055c"+
		"\3\2\2\2\u0563\u055e\3\2\2\2\u0563\u055f\3\2\2\2\u0563\u0560\3\2\2\2\u0563"+
		"\u0561\3\2\2\2\u0563\u0562\3\2\2\2\u0564\u0565\3\2\2\2\u0565\u05b0\5`"+
		"\61\22\u0566\u0567\f\20\2\2\u0567\u0568\7\60\2\2\u0568\u05b0\5`\61\21"+
		"\u0569\u056a\f\17\2\2\u056a\u056b\7\177\2\2\u056b\u05b0\5`\61\20\u056c"+
		"\u056d\f\b\2\2\u056d\u056f\7m\2\2\u056e\u0570\7x\2\2\u056f\u056e\3\2\2"+
		"\2\u056f\u0570\3\2\2\2\u0570\u0571\3\2\2\2\u0571\u05b0\5`\61\t\u0572\u0574"+
		"\f\7\2\2\u0573\u0575\7x\2\2\u0574\u0573\3\2\2\2\u0574\u0575\3\2\2\2\u0575"+
		"\u0576\3\2\2\2\u0576\u0577\7\67\2\2\u0577\u0578\5`\61\2\u0578\u0579\7"+
		"\60\2\2\u0579\u057a\5`\61\b\u057a\u05b0\3\2\2\2\u057b\u057c\f\31\2\2\u057c"+
		"\u057d\7\30\2\2\u057d\u05b0\7\30\2\2\u057e\u057f\f\27\2\2\u057f\u0580"+
		"\7\31\2\2\u0580\u05b0\7\31\2\2\u0581\u0582\f\13\2\2\u0582\u0583\7=\2\2"+
		"\u0583\u05b0\5\u00eav\2\u0584\u0586\f\n\2\2\u0585\u0587\7x\2\2\u0586\u0585"+
		"\3\2\2\2\u0586\u0587\3\2\2\2\u0587\u0588\3\2\2\2\u0588\u0589\t\r\2\2\u0589"+
		"\u058c\5`\61\2\u058a\u058b\7T\2\2\u058b\u058d\5`\61\2\u058c\u058a\3\2"+
		"\2\2\u058c\u058d\3\2\2\2\u058d\u05b0\3\2\2\2\u058e\u0593\f\t\2\2\u058f"+
		"\u0594\7n\2\2\u0590\u0594\7y\2\2\u0591\u0592\7x\2\2\u0592\u0594\7z\2\2"+
		"\u0593\u058f\3\2\2\2\u0593\u0590\3\2\2\2\u0593\u0591\3\2\2\2\u0594\u05b0"+
		"\3\2\2\2\u0595\u0597\f\6\2\2\u0596\u0598\7x\2\2\u0597\u0596\3\2\2\2\u0597"+
		"\u0598\3\2\2\2\u0598\u0599\3\2\2\2\u0599\u05ad\7d\2\2\u059a\u05a4\7\21"+
		"\2\2\u059b\u05a5\5B\"\2\u059c\u05a1\5`\61\2\u059d\u059e\7\25\2\2\u059e"+
		"\u05a0\5`\61\2\u059f\u059d\3\2\2\2\u05a0\u05a3\3\2\2\2\u05a1\u059f\3\2"+
		"\2\2\u05a1\u05a2\3\2\2\2\u05a2\u05a5\3\2\2\2\u05a3\u05a1\3\2\2\2\u05a4"+
		"\u059b\3\2\2\2\u05a4\u059c\3\2\2\2\u05a4\u05a5\3\2\2\2\u05a5\u05a6\3\2"+
		"\2\2\u05a6\u05ae\7\22\2\2\u05a7\u05a8\5\u00dep\2\u05a8\u05a9\7\20\2\2"+
		"\u05a9\u05ab\3\2\2\2\u05aa\u05a7\3\2\2\2\u05aa\u05ab\3\2\2\2\u05ab\u05ac"+
		"\3\2\2\2\u05ac\u05ae\5\u00e2r\2\u05ad\u059a\3\2\2\2\u05ad\u05aa\3\2\2"+
		"\2\u05ae\u05b0\3\2\2\2\u05af\u0544\3\2\2\2\u05af\u0547\3\2\2\2\u05af\u054a"+
		"\3\2\2\2\u05af\u054d\3\2\2\2\u05af\u0550\3\2\2\2\u05af\u0553\3\2\2\2\u05af"+
		"\u0556\3\2\2\2\u05af\u0566\3\2\2\2\u05af\u0569\3\2\2\2\u05af\u056c\3\2"+
		"\2\2\u05af\u0572\3\2\2\2\u05af\u057b\3\2\2\2\u05af\u057e\3\2\2\2\u05af"+
		"\u0581\3\2\2\2\u05af\u0584\3\2\2\2\u05af\u058e\3\2\2\2\u05af\u0595\3\2"+
		"\2\2\u05b0\u05b3\3\2\2\2\u05b1\u05af\3\2\2\2\u05b1\u05b2\3\2\2\2\u05b2"+
		"a\3\2\2\2\u05b3\u05b1\3\2\2\2\u05b4\u05b8\7\u0088\2\2\u05b5\u05b6\5\u00de"+
		"p\2\u05b6\u05b7\7\20\2\2\u05b7\u05b9\3\2\2\2\u05b8\u05b5\3\2\2\2\u05b8"+
		"\u05b9\3\2\2\2\u05b9\u05ba\3\2\2\2\u05ba\u05c6\5\u00ecw\2\u05bb\u05bc"+
		"\7\21\2\2\u05bc\u05c1\5d\63\2\u05bd\u05be\7\25\2\2\u05be\u05c0\5d\63\2"+
		"\u05bf\u05bd\3\2\2\2\u05c0\u05c3\3\2\2\2\u05c1\u05bf\3\2\2\2\u05c1\u05c2"+
		"\3\2\2\2\u05c2\u05c4\3\2\2\2\u05c3\u05c1\3\2\2\2\u05c4\u05c5\7\22\2\2"+
		"\u05c5\u05c7\3\2\2\2\u05c6\u05bb\3\2\2\2\u05c6\u05c7\3\2\2\2\u05c7\u05da"+
		"\3\2\2\2\u05c8\u05c9\7}\2\2\u05c9\u05d2\t\16\2\2\u05ca\u05cb\7\u0094\2"+
		"\2\u05cb\u05d3\7z\2\2\u05cc\u05cd\7\u0094\2\2\u05cd\u05d3\7H\2\2\u05ce"+
		"\u05d3\79\2\2\u05cf\u05d3\7\u008e\2\2\u05d0\u05d1\7w\2\2\u05d1\u05d3\7"+
		"*\2\2\u05d2\u05ca\3\2\2\2\u05d2\u05cc\3\2\2\2\u05d2\u05ce\3\2\2\2\u05d2"+
		"\u05cf\3\2\2\2\u05d2\u05d0\3\2\2\2\u05d3\u05d7\3\2\2\2\u05d4\u05d5\7t"+
		"\2\2\u05d5\u05d7\5\u00dan\2\u05d6\u05c8\3\2\2\2\u05d6\u05d4\3\2\2\2\u05d7"+
		"\u05d9\3\2\2\2\u05d8\u05d6\3\2\2\2\u05d9\u05dc\3\2\2\2\u05da\u05d8\3\2"+
		"\2\2\u05da\u05db\3\2\2\2\u05db\u05ea\3\2\2\2\u05dc\u05da\3\2\2\2\u05dd"+
		"\u05df\7x\2\2\u05de\u05dd\3\2\2\2\u05de\u05df\3\2\2\2\u05df\u05e0\3\2"+
		"\2\2\u05e0\u05e5\7I\2\2\u05e1\u05e2\7g\2\2\u05e2\u05e6\7J\2\2\u05e3\u05e4"+
		"\7g\2\2\u05e4\u05e6\7c\2\2\u05e5\u05e1\3\2\2\2\u05e5\u05e3\3\2\2\2\u05e5"+
		"\u05e6\3\2\2\2\u05e6\u05e8\3\2\2\2\u05e7\u05e9\7S\2\2\u05e8\u05e7\3\2"+
		"\2\2\u05e8\u05e9\3\2\2\2\u05e9\u05eb\3\2\2\2\u05ea\u05de\3\2\2\2\u05ea"+
		"\u05eb\3\2\2\2\u05ebc\3\2\2\2\u05ec\u05ed\5\u00dan\2\u05ede\3\2\2\2\u05ee"+
		"\u05ef\7\u0086\2\2\u05ef\u05f4\7\21\2\2\u05f0\u05f5\7b\2\2\u05f1\u05f2"+
		"\t\17\2\2\u05f2\u05f3\7\25\2\2\u05f3\u05f5\5\u0096L\2\u05f4\u05f0\3\2"+
		"\2\2\u05f4\u05f1\3\2\2\2\u05f5\u05f6\3\2\2\2\u05f6\u05f7\7\22\2\2\u05f7"+
		"g\3\2\2\2\u05f8\u05fb\5\u00e8u\2\u05f9\u05fa\7=\2\2\u05fa\u05fc\5\u00ea"+
		"v\2\u05fb\u05f9\3\2\2\2\u05fb\u05fc\3\2\2\2\u05fc\u05fe\3\2\2\2\u05fd"+
		"\u05ff\t\7\2\2\u05fe\u05fd\3\2\2\2\u05fe\u05ff\3\2\2\2\u05ffi\3\2\2\2"+
		"\u0600\u0601\7A\2\2\u0601\u0603\5\u00dan\2\u0602\u0600\3\2\2\2\u0602\u0603"+
		"\3\2\2\2\u0603\u060d\3\2\2\2\u0604\u060e\5l\67\2\u0605\u060e\5r:\2\u0606"+
		"\u060e\5p9\2\u0607\u0608\7<\2\2\u0608\u0609\7\21\2\2\u0609\u060a\5`\61"+
		"\2\u060a\u060b\7\22\2\2\u060b\u060e\3\2\2\2\u060c\u060e\5n8\2\u060d\u0604"+
		"\3\2\2\2\u060d\u0605\3\2\2\2\u060d\u0606\3\2\2\2\u060d\u0607\3\2\2\2\u060d"+
		"\u060c\3\2\2\2\u060ek\3\2\2\2\u060f\u0610\7\u0084\2\2\u0610\u0611\7p\2"+
		"\2\u0611\u0612\7\21\2\2\u0612\u0617\5h\65\2\u0613\u0614\7\25\2\2\u0614"+
		"\u0616\5h\65\2\u0615\u0613\3\2\2\2\u0616\u0619\3\2\2\2\u0617\u0615\3\2"+
		"\2\2\u0617\u0618\3\2\2\2\u0618\u061a\3\2\2\2\u0619\u0617\3\2\2\2\u061a"+
		"\u061b\7\22\2\2\u061b\u061c\5^\60\2\u061cm\3\2\2\2\u061d\u061e\7[\2\2"+
		"\u061e\u061f\7p\2\2\u061f\u0620\7\21\2\2\u0620\u0625\5t;\2\u0621\u0622"+
		"\7\25\2\2\u0622\u0624\5t;\2\u0623\u0621\3\2\2\2\u0624\u0627\3\2\2\2\u0625"+
		"\u0623\3\2\2\2\u0625\u0626\3\2\2\2\u0626\u0628\3\2\2\2\u0627\u0625\3\2"+
		"\2\2\u0628\u0629\7\22\2\2\u0629\u062a\5b\62\2\u062ao\3\2\2\2\u062b\u062d"+
		"\7\u009d\2\2\u062c\u062e\7p\2\2\u062d\u062c\3\2\2\2\u062d\u062e\3\2\2"+
		"\2\u062e\u0630\3\2\2\2\u062f\u0631\5\u00dan\2\u0630\u062f\3\2\2\2\u0630"+
		"\u0631\3\2\2\2\u0631\u0632\3\2\2\2\u0632\u0633\7\21\2\2\u0633\u0638\5"+
		"h\65\2\u0634\u0635\7\25\2\2\u0635\u0637\5h\65\2\u0636\u0634\3\2\2\2\u0637"+
		"\u063a\3\2\2\2\u0638\u0636\3\2\2\2\u0638\u0639\3\2\2\2\u0639\u063b\3\2"+
		"\2\2\u063a\u0638\3\2\2\2\u063b\u063c\7\22\2\2\u063c\u063d\5^\60\2\u063d"+
		"q\3\2\2\2\u063e\u0640\7p\2\2\u063f\u0641\5\u00dan\2\u0640\u063f\3\2\2"+
		"\2\u0640\u0641\3\2\2\2\u0641\u0642\3\2\2\2\u0642\u0643\7\21\2\2\u0643"+
		"\u0648\5h\65\2\u0644\u0645\7\25\2\2\u0645\u0647\5h\65\2\u0646\u0644\3"+
		"\2\2\2\u0647\u064a\3\2\2\2\u0648\u0646\3\2\2\2\u0648\u0649\3\2\2\2\u0649"+
		"\u064b\3\2\2\2\u064a\u0648\3\2\2\2\u064b\u064c\7\22\2\2\u064c\u064d\5"+
		"^\60\2\u064ds\3\2\2\2\u064e\u064f\5\u00e8u\2\u064fu\3\2\2\2\u0650\u0652"+
		"\7\u00a6\2\2\u0651\u0653\7\u0087\2\2\u0652\u0651\3\2\2\2\u0652\u0653\3"+
		"\2\2\2\u0653\u0654\3\2\2\2\u0654\u0655\5\u008eH\2\u0655\u0656\7\61\2\2"+
		"\u0656\u0657\7\21\2\2\u0657\u0658\5B\"\2\u0658\u0662\7\22\2\2\u0659\u065a"+
		"\7\25\2\2\u065a\u065b\5\u008eH\2\u065b\u065c\7\61\2\2\u065c\u065d\7\21"+
		"\2\2\u065d\u065e\5B\"\2\u065e\u065f\7\22\2\2\u065f\u0661\3\2\2\2\u0660"+
		"\u0659\3\2\2\2\u0661\u0664\3\2\2\2\u0662\u0660\3\2\2\2\u0662\u0663\3\2"+
		"\2\2\u0663w\3\2\2\2\u0664\u0662\3\2\2\2\u0665\u0666\5\u00dep\2\u0666\u0667"+
		"\7\20\2\2\u0667\u0669\3\2\2\2\u0668\u0665\3\2\2\2\u0668\u0669\3\2\2\2"+
		"\u0669\u066a\3\2\2\2\u066a\u0670\5\u00e2r\2\u066b\u066c\7f\2\2\u066c\u066d"+
		"\78\2\2\u066d\u0671\5\u00eex\2\u066e\u066f\7x\2\2\u066f\u0671\7f\2\2\u0670"+
		"\u066b\3\2\2\2\u0670\u066e\3\2\2\2\u0670\u0671\3\2\2\2\u0671y\3\2\2\2"+
		"\u0672\u0675\5`\61\2\u0673\u0674\7=\2\2\u0674\u0676\5\u00eav\2\u0675\u0673"+
		"\3\2\2\2\u0675\u0676\3\2\2\2\u0676\u0678\3\2\2\2\u0677\u0679\t\7\2\2\u0678"+
		"\u0677\3\2\2\2\u0678\u0679\3\2\2\2\u0679{\3\2\2\2\u067a\u067e\5\u0090"+
		"I\2\u067b\u067e\5\u00dan\2\u067c\u067e\7\u00b1\2\2\u067d\u067a\3\2\2\2"+
		"\u067d\u067b\3\2\2\2\u067d\u067c\3\2\2\2\u067e}\3\2\2\2\u067f\u068b\5"+
		"\u00e2r\2\u0680\u0681\7\21\2\2\u0681\u0686\5\u00e8u\2\u0682\u0683\7\25"+
		"\2\2\u0683\u0685\5\u00e8u\2\u0684\u0682\3\2\2\2\u0685\u0688\3\2\2\2\u0686"+
		"\u0684\3\2\2\2\u0686\u0687\3\2\2\2\u0687\u0689\3\2\2\2\u0688\u0686\3\2"+
		"\2\2\u0689\u068a\7\22\2\2\u068a\u068c\3\2\2\2\u068b\u0680\3\2\2\2\u068b"+
		"\u068c\3\2\2\2\u068c\u068d\3\2\2\2\u068d\u068e\7\61\2\2\u068e\u068f\7"+
		"\21\2\2\u068f\u0690\5B\"\2\u0690\u0691\7\22\2\2\u0691\177\3\2\2\2\u0692"+
		"\u069f\7\27\2\2\u0693\u0694\5\u00e2r\2\u0694\u0695\7\20\2\2\u0695\u0696"+
		"\7\27\2\2\u0696\u069f\3\2\2\2\u0697\u069c\5`\61\2\u0698\u069a\7\61\2\2"+
		"\u0699\u0698\3\2\2\2\u0699\u069a\3\2\2\2\u069a\u069b\3\2\2\2\u069b\u069d"+
		"\5\u009aN\2\u069c\u0699\3\2\2\2\u069c\u069d\3\2\2\2\u069d\u069f\3\2\2"+
		"\2\u069e\u0692\3\2\2\2\u069e\u0693\3\2\2\2\u069e\u0697\3\2\2\2\u069f\u0081"+
		"\3\2\2\2\u06a0\u06a1\5\u00dep\2\u06a1\u06a2\7\20\2\2\u06a2\u06a4\3\2\2"+
		"\2\u06a3\u06a0\3\2\2\2\u06a3\u06a4\3\2\2\2\u06a4\u06a5\3\2\2\2\u06a5\u06aa"+
		"\5\u00e2r\2\u06a6\u06a8\7\61\2\2\u06a7\u06a6\3\2\2\2\u06a7\u06a8\3\2\2"+
		"\2\u06a8\u06a9\3\2\2\2\u06a9\u06ab\5\u00fa~\2\u06aa\u06a7\3\2\2\2\u06aa"+
		"\u06ab\3\2\2\2\u06ab\u06b1\3\2\2\2\u06ac\u06ad\7f\2\2\u06ad\u06ae\78\2"+
		"\2\u06ae\u06b2\5\u00eex\2\u06af\u06b0\7x\2\2\u06b0\u06b2\7f\2\2\u06b1"+
		"\u06ac\3\2\2\2\u06b1\u06af\3\2\2\2\u06b1\u06b2\3\2\2\2\u06b2\u06d0\3\2"+
		"\2\2\u06b3\u06bd\7\21\2\2\u06b4\u06b9\5\u0082B\2\u06b5\u06b6\7\25\2\2"+
		"\u06b6\u06b8\5\u0082B\2\u06b7\u06b5\3\2\2\2\u06b8\u06bb\3\2\2\2\u06b9"+
		"\u06b7\3\2\2\2\u06b9\u06ba\3\2\2\2\u06ba\u06be\3\2\2\2\u06bb\u06b9\3\2"+
		"\2\2\u06bc\u06be\5\u0084C\2\u06bd\u06b4\3\2\2\2\u06bd\u06bc\3\2\2\2\u06be"+
		"\u06bf\3\2\2\2\u06bf\u06c4\7\22\2\2\u06c0\u06c2\7\61\2\2\u06c1\u06c0\3"+
		"\2\2\2\u06c1\u06c2\3\2\2\2\u06c2\u06c3\3\2\2\2\u06c3\u06c5\5\u00fa~\2"+
		"\u06c4\u06c1\3\2\2\2\u06c4\u06c5\3\2\2\2\u06c5\u06d0\3\2\2\2\u06c6\u06c7"+
		"\7\21\2\2\u06c7\u06c8\5B\"\2\u06c8\u06cd\7\22\2\2\u06c9\u06cb\7\61\2\2"+
		"\u06ca\u06c9\3\2\2\2\u06ca\u06cb\3\2\2\2\u06cb\u06cc\3\2\2\2\u06cc\u06ce"+
		"\5\u00fa~\2\u06cd\u06ca\3\2\2\2\u06cd\u06ce\3\2\2\2\u06ce\u06d0\3\2\2"+
		"\2\u06cf\u06a3\3\2\2\2\u06cf\u06b3\3\2\2\2\u06cf\u06c6\3\2\2\2\u06d0\u0083"+
		"\3\2\2\2\u06d1\u06d8\5\u0082B\2\u06d2\u06d3\5\u0086D\2\u06d3\u06d4\5\u0082"+
		"B\2\u06d4\u06d5\5\u0088E\2\u06d5\u06d7\3\2\2\2\u06d6\u06d2\3\2\2\2\u06d7"+
		"\u06da\3\2\2\2\u06d8\u06d6\3\2\2\2\u06d8\u06d9\3\2\2\2\u06d9\u0085\3\2"+
		"\2\2\u06da\u06d8\3\2\2\2\u06db\u06e9\7\25\2\2\u06dc\u06de\7u\2\2\u06dd"+
		"\u06dc\3\2\2\2\u06dd\u06de\3\2\2\2\u06de\u06e5\3\2\2\2\u06df\u06e1\7q"+
		"\2\2\u06e0\u06e2\7\u0081\2\2\u06e1\u06e0\3\2\2\2\u06e1\u06e2\3\2\2\2\u06e2"+
		"\u06e6\3\2\2\2\u06e3\u06e6\7h\2\2\u06e4\u06e6\7C\2\2\u06e5\u06df\3\2\2"+
		"\2\u06e5\u06e3\3\2\2\2\u06e5\u06e4\3\2\2\2\u06e5\u06e6\3\2\2\2\u06e6\u06e7"+
		"\3\2\2\2\u06e7\u06e9\7o\2\2\u06e8\u06db\3\2\2\2\u06e8\u06dd\3\2\2\2\u06e9"+
		"\u0087\3\2\2\2\u06ea\u06eb\7}\2\2\u06eb\u06f9\5`\61\2\u06ec\u06ed\7\u009f"+
		"\2\2\u06ed\u06ee\7\21\2\2\u06ee\u06f3\5\u00e8u\2\u06ef\u06f0\7\25\2\2"+
		"\u06f0\u06f2\5\u00e8u\2\u06f1\u06ef\3\2\2\2\u06f2\u06f5\3\2\2\2\u06f3"+
		"\u06f1\3\2\2\2\u06f3\u06f4\3\2\2\2\u06f4\u06f6\3\2\2\2\u06f5\u06f3\3\2"+
		"\2\2\u06f6\u06f7\7\22\2\2\u06f7\u06f9\3\2\2\2\u06f8\u06ea\3\2\2\2\u06f8"+
		"\u06ec\3\2\2\2\u06f8\u06f9\3\2\2\2\u06f9\u0089\3\2\2\2\u06fa\u06fc\7\u0093"+
		"\2\2\u06fb\u06fd\t\6\2\2\u06fc\u06fb\3\2\2\2\u06fc\u06fd\3\2\2\2\u06fd"+
		"\u06fe\3\2\2\2\u06fe\u0703\5\u0080A\2\u06ff\u0700\7\25\2\2\u0700\u0702"+
		"\5\u0080A\2\u0701\u06ff\3\2\2\2\u0702\u0705\3\2\2\2\u0703\u0701\3\2\2"+
		"\2\u0703\u0704\3\2\2\2\u0704\u0712\3\2\2\2\u0705\u0703\3\2\2\2\u0706\u0710"+
		"\7\\\2\2\u0707\u070c\5\u0082B\2\u0708\u0709\7\25\2\2\u0709\u070b\5\u0082"+
		"B\2\u070a\u0708\3\2\2\2\u070b\u070e\3\2\2\2\u070c\u070a\3\2\2\2\u070c"+
		"\u070d\3\2\2\2\u070d\u0711\3\2\2\2\u070e\u070c\3\2\2\2\u070f\u0711\5\u0084"+
		"C\2\u0710\u0707\3\2\2\2\u0710\u070f\3\2\2\2\u0711\u0713\3\2\2\2\u0712"+
		"\u0706\3\2\2\2\u0712\u0713\3\2\2\2\u0713\u0716\3\2\2\2\u0714\u0715\7\u00a5"+
		"\2\2\u0715\u0717\5`\61\2\u0716\u0714\3\2\2\2\u0716\u0717\3\2\2\2\u0717"+
		"\u0726\3\2\2\2\u0718\u0719\7_\2\2\u0719\u071a\78\2\2\u071a\u071f\5`\61"+
		"\2\u071b\u071c\7\25\2\2\u071c\u071e\5`\61\2\u071d\u071b\3\2\2\2\u071e"+
		"\u0721\3\2\2\2\u071f\u071d\3\2\2\2\u071f\u0720\3\2\2\2\u0720\u0724\3\2"+
		"\2\2\u0721\u071f\3\2\2\2\u0722\u0723\7`\2\2\u0723\u0725\5`\61\2\u0724"+
		"\u0722\3\2\2\2\u0724\u0725\3\2\2\2\u0725\u0727\3\2\2\2\u0726\u0718\3\2"+
		"\2\2\u0726\u0727\3\2\2\2\u0727\u0747\3\2\2\2\u0728\u0729\7\u00a1\2\2\u0729"+
		"\u072a\7\21\2\2\u072a\u072f\5`\61\2\u072b\u072c\7\25\2\2\u072c\u072e\5"+
		"`\61\2\u072d\u072b\3\2\2\2\u072e\u0731\3\2\2\2\u072f\u072d\3\2\2\2\u072f"+
		"\u0730\3\2\2\2\u0730\u0732\3\2\2\2\u0731\u072f\3\2\2\2\u0732\u0741\7\22"+
		"\2\2\u0733\u0734\7\25\2\2\u0734\u0735\7\21\2\2\u0735\u073a\5`\61\2\u0736"+
		"\u0737\7\25\2\2\u0737\u0739\5`\61\2\u0738\u0736\3\2\2\2\u0739\u073c\3"+
		"\2\2\2\u073a\u0738\3\2\2\2\u073a\u073b\3\2\2\2\u073b\u073d\3\2\2\2\u073c"+
		"\u073a\3\2\2\2\u073d\u073e\7\22\2\2\u073e\u0740\3\2\2\2\u073f\u0733\3"+
		"\2\2\2\u0740\u0743\3\2\2\2\u0741\u073f\3\2\2\2\u0741\u0742\3\2\2\2\u0742"+
		"\u0744\3\2\2\2\u0743\u0741\3\2\2\2\u0744\u0745\5\u00caf\2\u0745\u0747"+
		"\3\2\2\2\u0746\u06fa\3\2\2\2\u0746\u0728\3\2\2\2\u0747\u008b\3\2\2\2\u0748"+
		"\u074e\7\u009c\2\2\u0749\u074a\7\u009c\2\2\u074a\u074e\7-\2\2\u074b\u074e"+
		"\7k\2\2\u074c\u074e\7U\2\2\u074d\u0748\3\2\2\2\u074d\u0749\3\2\2\2\u074d"+
		"\u074b\3\2\2\2\u074d\u074c\3\2\2\2\u074e\u008d\3\2\2\2\u074f\u075b\5\u00e2"+
		"r\2\u0750\u0751\7\21\2\2\u0751\u0756\5\u00e8u\2\u0752\u0753\7\25\2\2\u0753"+
		"\u0755\5\u00e8u\2\u0754\u0752\3\2\2\2\u0755\u0758\3\2\2\2\u0756\u0754"+
		"\3\2\2\2\u0756\u0757\3\2\2\2\u0757\u0759\3\2\2\2\u0758\u0756\3\2\2\2\u0759"+
		"\u075a\7\22\2\2\u075a\u075c\3\2\2\2\u075b\u0750\3\2\2\2\u075b\u075c\3"+
		"\2\2\2\u075c\u008f\3\2\2\2\u075d\u075f\t\n\2\2\u075e\u075d\3\2\2\2\u075e"+
		"\u075f\3\2\2\2\u075f\u0760\3\2\2\2\u0760\u0763\7\u00b4\2\2\u0761\u0763"+
		"\7\27\2\2\u0762\u075e\3\2\2\2\u0762\u0761\3\2\2\2\u0763\u0091\3\2\2\2"+
		"\u0764\u0765\t\20\2\2\u0765\u0093\3\2\2\2\u0766\u0767\t\21\2\2\u0767\u0095"+
		"\3\2\2\2\u0768\u0769\7\u00b1\2\2\u0769\u0097\3\2\2\2\u076a\u076d\5`\61"+
		"\2\u076b\u076d\5L\'\2\u076c\u076a\3\2\2\2\u076c\u076b\3\2\2\2\u076d\u0099"+
		"\3\2\2\2\u076e\u076f\t\22\2\2\u076f\u009b\3\2\2\2\u0770\u0771\7\16\2\2"+
		"\u0771\u0772\7\u00b3\2\2\u0772\u0773\7\16\2\2\u0773\u009d\3\2\2\2\u0774"+
		"\u0775\7\u00bc\2\2\u0775\u009f\3\2\2\2\u0776\u0777\5\u00b2Z\2\u0777\u077e"+
		"\7\6\2\2\u0778\u077d\5\u00ba^\2\u0779\u077d\5\u00bc_\2\u077a\u077d\5\u00b8"+
		"]\2\u077b\u077d\5\u00c0a\2\u077c\u0778\3\2\2\2\u077c\u0779\3\2\2\2\u077c"+
		"\u077a\3\2\2\2\u077c\u077b\3\2\2\2\u077d\u0780\3\2\2\2\u077e\u077c\3\2"+
		"\2\2\u077e\u077f\3\2\2\2\u077f\u0781\3\2\2\2\u0780\u077e\3\2\2\2\u0781"+
		"\u0782\7\7\2\2\u0782\u0783\7\17\2\2\u0783\u00a1\3\2\2\2\u0784\u0788\5"+
		"\u00a4S\2\u0785\u0788\5\u00b4[\2\u0786\u0788\5\u00a0Q\2\u0787\u0784\3"+
		"\2\2\2\u0787\u0785\3\2\2\2\u0787\u0786\3\2\2\2\u0788\u00a3\3\2\2\2\u0789"+
		"\u078a\7\u00ac\2\2\u078a\u078c\5\u00b6\\\2\u078b\u078d\7\b\2\2\u078c\u078b"+
		"\3\2\2\2\u078d\u078e\3\2\2\2\u078e\u078c\3\2\2\2\u078e\u078f\3\2\2\2\u078f"+
		"\u00a5\3\2\2\2\u0790\u0798\7\u00b4\2\2\u0791\u0798\7\u00b0\2\2\u0792\u0798"+
		"\5\u00b0Y\2\u0793\u0798\7\u00b2\2\2\u0794\u0798\5\u00b6\\\2\u0795\u0796"+
		"\7 \2\2\u0796\u0798\5\u00b6\\\2\u0797\u0790\3\2\2\2\u0797\u0791\3\2\2"+
		"\2\u0797\u0792\3\2\2\2\u0797\u0793\3\2\2\2\u0797\u0794\3\2\2\2\u0797\u0795"+
		"\3\2\2\2\u0798\u00a7\3\2\2\2\u0799\u079a\7\u00ad\2\2\u079a\u079b\7\21"+
		"\2\2\u079b\u079c\5\u00aaV\2\u079c\u079d\7\22\2\2\u079d\u079e\7\17\2\2"+
		"\u079e\u00a9\3\2\2\2\u079f\u07a1\5\u00acW\2\u07a0\u079f\3\2\2\2\u07a0"+
		"\u07a1\3\2\2\2\u07a1\u07a2\3\2\2\2\u07a2\u07a4\7\u00b2\2\2\u07a3\u07a5"+
		"\5\u00aeX\2\u07a4\u07a3\3\2\2\2\u07a4\u07a5\3\2\2\2\u07a5\u07ab\3\2\2"+
		"\2\u07a6\u07a9\7\u00b3\2\2\u07a7\u07a9\5\u00b0Y\2\u07a8\u07a6\3\2\2\2"+
		"\u07a8\u07a7\3\2\2\2\u07a9\u07ab\3\2\2\2\u07aa\u07a0\3\2\2\2\u07aa\u07a8"+
		"\3\2\2\2\u07ab\u07ae\3\2\2\2\u07ac\u07aa\3\2\2\2\u07ac\u07ad\3\2\2\2\u07ad"+
		"\u00ab\3\2\2\2\u07ae\u07ac\3\2\2\2\u07af\u07b2\7\u00b3\2\2\u07b0\u07b2"+
		"\5\u00b0Y\2\u07b1\u07af\3\2\2\2\u07b1\u07b0\3\2\2\2\u07b2\u07b3\3\2\2"+
		"\2\u07b3\u07b4\7\30\2\2\u07b4\u00ad\3\2\2\2\u07b5\u07b8\7\30\2\2\u07b6"+
		"\u07b9\7\u00b3\2\2\u07b7\u07b9\5\u00b0Y\2\u07b8\u07b6\3\2\2\2\u07b8\u07b7"+
		"\3\2\2\2\u07b9\u00af\3\2\2\2\u07ba\u07bb\5\u010a\u0086\2\u07bb\u07c6\7"+
		"\21\2\2\u07bc\u07c1\5\u00a6T\2\u07bd\u07be\7\25\2\2\u07be\u07c0\5\u00a6"+
		"T\2\u07bf\u07bd\3\2\2\2\u07c0\u07c3\3\2\2\2\u07c1\u07bf\3\2\2\2\u07c1"+
		"\u07c2\3\2\2\2\u07c2\u07c5\3\2\2\2\u07c3\u07c1\3\2\2\2\u07c4\u07bc\3\2"+
		"\2\2\u07c5\u07c8\3\2\2\2\u07c6\u07c4\3\2\2\2\u07c6\u07c7\3\2\2\2\u07c7"+
		"\u07c9\3\2\2\2\u07c8\u07c6\3\2\2\2\u07c9\u07ca\7\22\2\2\u07ca\u00b1\3"+
		"\2\2\2\u07cb\u07cc\5\u00b6\\\2\u07cc\u07d7\7\21\2\2\u07cd\u07d2\5\u00a2"+
		"R\2\u07ce\u07cf\7\25\2\2\u07cf\u07d1\5\u00a2R\2\u07d0\u07ce\3\2\2\2\u07d1"+
		"\u07d4\3\2\2\2\u07d2\u07d0\3\2\2\2\u07d2\u07d3\3\2\2\2\u07d3\u07d6\3\2"+
		"\2\2\u07d4\u07d2\3\2\2\2\u07d5\u07cd\3\2\2\2\u07d6\u07d9\3\2\2\2\u07d7"+
		"\u07d5\3\2\2\2\u07d7\u07d8\3\2\2\2\u07d8\u07da\3\2\2\2\u07d9\u07d7\3\2"+
		"\2\2\u07da\u07db\7\22\2\2\u07db\u00b3\3\2\2\2\u07dc\u07dd\7\u00ac\2\2"+
		"\u07dd\u07e9\7\u00b3\2\2\u07de\u07df\7\u00ac\2\2\u07df\u07e0\7\u00b3\2"+
		"\2\u07e0\u07e6\7\26\2\2\u07e1\u07e7\7\u00b4\2\2\u07e2\u07e7\7\u00b2\2"+
		"\2\u07e3\u07e7\7\u00b0\2\2\u07e4\u07e7\5\u00b6\\\2\u07e5\u07e7\5\u00b0"+
		"Y\2\u07e6\u07e1\3\2\2\2\u07e6\u07e2\3\2\2\2\u07e6\u07e3\3\2\2\2\u07e6"+
		"\u07e4\3\2\2\2\u07e6\u07e5\3\2\2\2\u07e7\u07e9\3\2\2\2\u07e8\u07dc\3\2"+
		"\2\2\u07e8\u07de\3\2\2\2\u07e9\u00b5\3\2\2\2\u07ea\u07eb\7\u00b3\2\2\u07eb"+
		"\u00b7\3\2\2\2\u07ec\u07ed\7a\2\2\u07ed\u07ee\7\21\2\2\u07ee\u07ef\5`"+
		"\61\2\u07ef\u07f0\7\22\2\2\u07f0\u07f4\7\6\2\2\u07f1\u07f3\5\u00b8]\2"+
		"\u07f2\u07f1\3\2\2\2\u07f3\u07f6\3\2\2\2\u07f4\u07f2\3\2\2\2\u07f4\u07f5"+
		"\3\2\2\2\u07f5\u07f7\3\2\2\2\u07f6\u07f4\3\2\2\2\u07f7\u07f8\7\7\2\2\u07f8"+
		"\u082a\3\2\2\2\u07f9\u07fa\7a\2\2\u07fa\u07fb\7\21\2\2\u07fb\u07fc\5`"+
		"\61\2\u07fc\u07fd\7\22\2\2\u07fd\u0801\7\6\2\2\u07fe\u0800\5\u00b8]\2"+
		"\u07ff\u07fe\3\2\2\2\u0800\u0803\3\2\2\2\u0801\u07ff\3\2\2\2\u0801\u0802"+
		"\3\2\2\2\u0802\u0804\3\2\2\2\u0803\u0801\3\2\2\2\u0804\u0805\7\7\2\2\u0805"+
		"\u0806\7Q\2\2\u0806\u080a\7\6\2\2\u0807\u0809\5\u00b8]\2\u0808\u0807\3"+
		"\2\2\2\u0809\u080c\3\2\2\2\u080a\u0808\3\2\2\2\u080a\u080b\3\2\2\2\u080b"+
		"\u080d\3\2\2\2\u080c\u080a\3\2\2\2\u080d\u080e\7\7\2\2\u080e\u082a\3\2"+
		"\2\2\u080f\u0810\7a\2\2\u0810\u0811\7\21\2\2\u0811\u0812\5`\61\2\u0812"+
		"\u0813\7\22\2\2\u0813\u0817\7\6\2\2\u0814\u0816\5\u00b8]\2\u0815\u0814"+
		"\3\2\2\2\u0816\u0819\3\2\2\2\u0817\u0815\3\2\2\2\u0817\u0818\3\2\2\2\u0818"+
		"\u081a\3\2\2\2\u0819\u0817\3\2\2\2\u081a\u081b\7\7\2\2\u081b\u081c\7Q"+
		"\2\2\u081c\u081d\7a\2\2\u081d\u081e\7\21\2\2\u081e\u081f\5`\61\2\u081f"+
		"\u0820\7\22\2\2\u0820\u0824\7\6\2\2\u0821\u0823\5\u00b8]\2\u0822\u0821"+
		"\3\2\2\2\u0823\u0826\3\2\2\2\u0824\u0822\3\2\2\2\u0824\u0825\3\2\2\2\u0825"+
		"\u0827\3\2\2\2\u0826\u0824\3\2\2\2\u0827\u0828\7\7\2\2\u0828\u082a\3\2"+
		"\2\2\u0829\u07ec\3\2\2\2\u0829\u07f9\3\2\2\2\u0829\u080f\3\2\2\2\u082a"+
		"\u0834\3\2\2\2\u082b\u082c\7a\2\2\u082c\u082d\7\21\2\2\u082d\u082e\5`"+
		"\61\2\u082e\u0831\7\22\2\2\u082f\u0832\5\u00b0Y\2\u0830\u0832\5\u00b4"+
		"[\2\u0831\u082f\3\2\2\2\u0831\u0830\3\2\2\2\u0832\u0834\3\2\2\2\u0833"+
		"\u0829\3\2\2\2\u0833\u082b\3\2\2\2\u0834\u00b9\3\2\2\2\u0835\u0836\7\u00a8"+
		"\2\2\u0836\u0837\7\21\2\2\u0837\u083c\5`\61\2\u0838\u0839\7\25\2\2\u0839"+
		"\u083b\5`\61\2\u083a\u0838\3\2\2\2\u083b\u083e\3\2\2\2\u083c\u083a\3\2"+
		"\2\2\u083c\u083d\3\2\2\2\u083d\u083f\3\2\2\2\u083e\u083c\3\2\2\2\u083f"+
		"\u0840\7\22\2\2\u0840\u0841\7\6\2\2\u0841\u0842\7\7\2\2\u0842\u0851\3"+
		"\2\2\2\u0843\u0844\7\u00a8\2\2\u0844\u0845\7\21\2\2\u0845\u084a\5`\61"+
		"\2\u0846\u0847\7\25\2\2\u0847\u0849\5`\61\2\u0848\u0846\3\2\2\2\u0849"+
		"\u084c\3\2\2\2\u084a\u0848\3\2\2\2\u084a\u084b\3\2\2\2\u084b\u084d\3\2"+
		"\2\2\u084c\u084a\3\2\2\2\u084d\u084e\7\22\2\2\u084e\u084f\7\17\2\2\u084f"+
		"\u0851\3\2\2\2\u0850\u0835\3\2\2\2\u0850\u0843\3\2\2\2\u0851\u00bb\3\2"+
		"\2\2\u0852\u0853\7\u00a9\2\2\u0853\u0854\7\6\2\2\u0854\u0855\7\7\2\2\u0855"+
		"\u0856\5\u00ba^\2\u0856\u00bd\3\2\2\2\u0857\u085d\7\6\2\2\u0858\u085c"+
		"\5\u00bc_\2\u0859\u085c\5\u00ba^\2\u085a\u085c\5\u00b8]\2\u085b\u0858"+
		"\3\2\2\2\u085b\u0859\3\2\2\2\u085b\u085a\3\2\2\2\u085c\u085f\3\2\2\2\u085d"+
		"\u085b\3\2\2\2\u085d\u085e\3\2\2\2\u085e\u0860\3\2\2\2\u085f\u085d\3\2"+
		"\2\2\u0860\u0861\7\u00aa\2\2\u0861\u0862\7\17\2\2\u0862\u0863\7\7\2\2"+
		"\u0863\u00bf\3\2\2\2\u0864\u0865\7Z\2\2\u0865\u086b\7\21\2\2\u0866\u0867"+
		"\7\u00ac\2\2\u0867\u0868\5\u00b6\\\2\u0868\u0869\7\26\2\2\u0869\u086a"+
		"\7\u00b4\2\2\u086a\u086c\3\2\2\2\u086b\u0866\3\2\2\2\u086b\u086c\3\2\2"+
		"\2\u086c\u086d\3\2\2\2\u086d\u0872\7\17\2\2\u086e\u086f\5\u010a\u0086"+
		"\2\u086f\u0870\5\u00c4c\2\u0870\u0871\7\u00b4\2\2\u0871\u0873\3\2\2\2"+
		"\u0872\u086e\3\2\2\2\u0872\u0873\3\2\2\2\u0873\u0874\3\2\2\2\u0874\u0879"+
		"\7\17\2\2\u0875\u0876\5\u00d4k\2\u0876\u0877\5\u010a\u0086\2\u0877\u0878"+
		"\5\u00d4k\2\u0878\u087a\3\2\2\2\u0879\u0875\3\2\2\2\u0879\u087a\3\2\2"+
		"\2\u087a\u087b\3\2\2\2\u087b\u087c\7\22\2\2\u087c\u087d\7\6\2\2\u087d"+
		"\u087e\7\7\2\2\u087e\u00c1\3\2\2\2\u087f\u0883\7\u00b4\2\2\u0880\u0883"+
		"\5\u010a\u0086\2\u0881\u0883\5\u00b0Y\2\u0882\u087f\3\2\2\2\u0882\u0880"+
		"\3\2\2\2\u0882\u0881\3\2\2\2\u0883\u00c3\3\2\2\2\u0884\u0885\t\23\2\2"+
		"\u0885\u00c5\3\2\2\2\u0886\u0887\5\u00c2b\2\u0887\u0888\5\u00c4c\2\u0888"+
		"\u0889\5\u00c2b\2\u0889\u00c7\3\2\2\2\u088a\u088c\5\u00c6d\2\u088b\u088a"+
		"\3\2\2\2\u088c\u088f\3\2\2\2\u088d\u088b\3\2\2\2\u088d\u088e\3\2\2\2\u088e"+
		"\u0890\3\2\2\2\u088f\u088d\3\2\2\2\u0890\u0894\7$\2\2\u0891\u0893\5\u00c6"+
		"d\2\u0892\u0891\3\2\2\2\u0893\u0896\3\2\2\2\u0894\u0892\3\2\2\2\u0894"+
		"\u0895\3\2\2\2\u0895\u00c9\3\2\2\2\u0896\u0894\3\2\2\2\u0897\u0898\5\u00b2"+
		"Z\2\u0898\u0899\5\u00be`\2\u0899\u00cb\3\2\2\2\u089a\u089b\7\u00ae\2\2"+
		"\u089b\u089c\7\21\2\2\u089c\u089d\5\u00b6\\\2\u089d\u089e\7\22\2\2\u089e"+
		"\u08a0\7\6\2\2\u089f\u08a1\5\u00d0i\2\u08a0\u089f\3\2\2\2\u08a1\u08a2"+
		"\3\2\2\2\u08a2\u08a0\3\2\2\2\u08a2\u08a3\3\2\2\2\u08a3\u08a5\3\2\2\2\u08a4"+
		"\u08a6\5\u00ceh\2\u08a5\u08a4\3\2\2\2\u08a5\u08a6\3\2\2\2\u08a6\u08a7"+
		"\3\2\2\2\u08a7\u08a8\7\7\2\2\u08a8\u00cd\3\2\2\2\u08a9\u08aa\7H\2\2\u08aa"+
		"\u08ab\7\t\2\2\u08ab\u00cf\3\2\2\2\u08ac\u08af\7:\2\2\u08ad\u08b0\5\u010a"+
		"\u0086\2\u08ae\u08b0\7\u00b0\2\2\u08af\u08ad\3\2\2\2\u08af\u08ae\3\2\2"+
		"\2\u08b0\u08b1\3\2\2\2\u08b1\u08b4\7\t\2\2\u08b2\u08b3\7\u00af\2\2\u08b3"+
		"\u08b5\7\17\2\2\u08b4\u08b2\3\2\2\2\u08b4\u08b5\3\2\2\2\u08b5\u00d1\3"+
		"\2\2\2\u08b6\u08b7\7\u00ab\2\2\u08b7\u08b8\7\21\2\2\u08b8\u08b9\7\u00ac"+
		"\2\2\u08b9\u08bd\5\u00b6\\\2\u08ba\u08bc\7\b\2\2\u08bb\u08ba\3\2\2\2\u08bc"+
		"\u08bf\3\2\2\2\u08bd\u08bb\3\2\2\2\u08bd\u08be\3\2\2\2\u08be\u08c0\3\2"+
		"\2\2\u08bf\u08bd\3\2\2\2\u08c0\u08c1\7\t\2\2\u08c1\u08c5\5\u00b6\\\2\u08c2"+
		"\u08c4\7\b\2\2\u08c3\u08c2\3\2\2\2\u08c4\u08c7\3\2\2\2\u08c5\u08c3\3\2"+
		"\2\2\u08c5\u08c6\3\2\2\2\u08c6\u08c8\3\2\2\2\u08c7\u08c5\3\2\2\2\u08c8"+
		"\u08c9\7\22\2\2\u08c9\u08d3\7\6\2\2\u08ca\u08d2\5\u00b0Y\2\u08cb\u08d2"+
		"\5\u00ba^\2\u08cc\u08d2\5\u00bc_\2\u08cd\u08d2\5\u00b8]\2\u08ce\u08d2"+
		"\5\u00ccg\2\u08cf\u08d2\5\u00d2j\2\u08d0\u08d2\5\u00c0a\2\u08d1\u08ca"+
		"\3\2\2\2\u08d1\u08cb\3\2\2\2\u08d1\u08cc\3\2\2\2\u08d1\u08cd\3\2\2\2\u08d1"+
		"\u08ce\3\2\2\2\u08d1\u08cf\3\2\2\2\u08d1\u08d0\3\2\2\2\u08d2\u08d5\3\2"+
		"\2\2\u08d3\u08d1\3\2\2\2\u08d3\u08d4\3\2\2\2\u08d4\u08d6\3\2\2\2\u08d5"+
		"\u08d3\3\2\2\2\u08d6\u08d7\7\7\2\2\u08d7\u00d3\3\2\2\2\u08d8\u08da\7\n"+
		"\2\2\u08d9\u08d8\3\2\2\2\u08da\u08db\3\2\2\2\u08db\u08d9\3\2\2\2\u08db"+
		"\u08dc\3\2\2\2\u08dc\u08e3\3\2\2\2\u08dd\u08df\7\13\2\2\u08de\u08dd\3"+
		"\2\2\2\u08df\u08e0\3\2\2\2\u08e0\u08de\3\2\2\2\u08e0\u08e1\3\2\2\2\u08e1"+
		"\u08e3\3\2\2\2\u08e2\u08d9\3\2\2\2\u08e2\u08de\3\2\2\2\u08e3\u08e6\3\2"+
		"\2\2\u08e4\u08e2\3\2\2\2\u08e4\u08e5\3\2\2\2\u08e5\u00d5\3\2\2\2\u08e6"+
		"\u08e4\3\2\2\2\u08e7\u08e8\t\24\2\2\u08e8\u00d7\3\2\2\2\u08e9\u08eb\13"+
		"\2\2\2\u08ea\u08e9\3\2\2\2\u08eb\u08ec\3\2\2\2\u08ec\u08ea\3\2\2\2\u08ec"+
		"\u08ed\3\2\2\2\u08ed\u08ee\3\2\2\2\u08ee\u08ef\n\25\2\2\u08ef\u00d9\3"+
		"\2\2\2\u08f0\u08f1\5\u010a\u0086\2\u08f1\u00db\3\2\2\2\u08f2\u08f3\5\u010a"+
		"\u0086\2\u08f3\u00dd\3\2\2\2\u08f4\u08f5\5\u010a\u0086\2\u08f5\u00df\3"+
		"\2\2\2\u08f6\u08f7\5\u010a\u0086\2\u08f7\u00e1\3\2\2\2\u08f8\u08f9\5\u010a"+
		"\u0086\2\u08f9\u00e3\3\2\2\2\u08fa\u08fb\5\u010a\u0086\2\u08fb\u00e5\3"+
		"\2\2\2\u08fc\u08fd\5\u010a\u0086\2\u08fd\u00e7\3\2\2\2\u08fe\u08ff\5\u010a"+
		"\u0086\2\u08ff\u00e9\3\2\2\2\u0900\u0901\5\u010a\u0086\2\u0901\u00eb\3"+
		"\2\2\2\u0902\u0903\5\u010a\u0086\2\u0903\u00ed\3\2\2\2\u0904\u0905\5\u010a"+
		"\u0086\2\u0905\u00ef\3\2\2\2\u0906\u0907\5\u010a\u0086\2\u0907\u00f1\3"+
		"\2\2\2\u0908\u0909\5\u010a\u0086\2\u0909\u00f3\3\2\2\2\u090a\u090b\5\u010a"+
		"\u0086\2\u090b\u00f5\3\2\2\2\u090c\u090d\5\u010a\u0086\2\u090d\u00f7\3"+
		"\2\2\2\u090e\u090f\5\u010a\u0086\2\u090f\u00f9\3\2\2\2\u0910\u0911\5\u010a"+
		"\u0086\2\u0911\u00fb\3\2\2\2\u0912\u0913\5\u010a\u0086\2\u0913\u00fd\3"+
		"\2\2\2\u0914\u0916\5\u0100\u0081\2\u0915\u0914\3\2\2\2\u0916\u0919\3\2"+
		"\2\2\u0917\u0915\3\2\2\2\u0917\u0918\3\2\2\2\u0918\u091a\3\2\2\2\u0919"+
		"\u0917\3\2\2\2\u091a\u091b\7\2\2\3\u091b\u00ff\3\2\2\2\u091c\u0925\7\6"+
		"\2\2\u091d\u0922\5\u0102\u0082\2\u091e\u091f\7\25\2\2\u091f\u0921\5\u0102"+
		"\u0082\2\u0920\u091e\3\2\2\2\u0921\u0924\3\2\2\2\u0922\u0920\3\2\2\2\u0922"+
		"\u0923\3\2\2\2\u0923\u0926\3\2\2\2\u0924\u0922\3\2\2\2\u0925\u091d\3\2"+
		"\2\2\u0925\u0926\3\2\2\2\u0926\u0927\3\2\2\2\u0927\u0928\7\7\2\2\u0928"+
		"\u0101\3\2\2\2\u0929\u092a\7\u00b3\2\2\u092a\u092d\7\t\2\2\u092b\u092e"+
		"\5\u0104\u0083\2\u092c\u092e\5\u0100\u0081\2\u092d\u092b\3\2\2\2\u092d"+
		"\u092c\3\2\2\2\u092e\u0103\3\2\2\2\u092f\u0932\5\u0108\u0085\2\u0930\u0932"+
		"\5\u0106\u0084\2\u0931\u092f\3\2\2\2\u0931\u0930\3\2\2\2\u0932\u0105\3"+
		"\2\2\2\u0933\u0934\t\26\2\2\u0934\u0107\3\2\2\2\u0935\u0936\t\27\2\2\u0936"+
		"\u0109\3\2\2\2\u0937\u0938\t\30\2\2\u0938\u010b\3\2\2\2\u013b\u010e\u0110"+
		"\u011b\u0122\u0127\u012d\u0133\u0135\u0155\u015a\u015f\u0169\u016c\u016f"+
		"\u0172\u0183\u0187\u018f\u0193\u0195\u019a\u019c\u01a0\u01a7\u01aa\u01af"+
		"\u01b3\u01b8\u01c1\u01c4\u01ca\u01cc\u01d0\u01d6\u01db\u01e6\u01ec\u01f0"+
		"\u01f6\u01fb\u0204\u0206\u020c\u0210\u0213\u0217\u021d\u0222\u0229\u0234"+
		"\u0237\u0239\u023f\u0245\u0249\u0250\u0256\u025c\u0262\u0267\u0273\u0278"+
		"\u0283\u0288\u028b\u0292\u0295\u029c\u02a5\u02a8\u02ae\u02b0\u02b4\u02bc"+
		"\u02c1\u02c9\u02ce\u02d6\u02db\u02e3\u02e8\u02ee\u02f5\u02f8\u0300\u030a"+
		"\u030d\u0313\u0315\u0318\u032b\u0331\u033a\u033f\u0348\u0353\u035a\u0360"+
		"\u0366\u036f\u0376\u037a\u037c\u0380\u0387\u0389\u038d\u0390\u0397\u039e"+
		"\u03a1\u03ab\u03ae\u03b4\u03b6\u03ba\u03c1\u03c4\u03cc\u03d6\u03d9\u03df"+
		"\u03e1\u03e5\u03ec\u03f5\u03f9\u03fb\u03ff\u0408\u040d\u040f\u0418\u0423"+
		"\u042a\u042d\u0430\u043d\u044b\u0450\u0453\u0460\u046e\u0473\u047c\u047f"+
		"\u0485\u0487\u048e\u0490\u0497\u049e\u04a3\u04a7\u04ab\u04bb\u04c0\u04c4"+
		"\u04db\u04e1\u04e3\u04e7\u04ec\u04f4\u04f9\u050a\u0511\u0515\u0525\u0528"+
		"\u0530\u0539\u053d\u0542\u0563\u056f\u0574\u0586\u058c\u0593\u0597\u05a1"+
		"\u05a4\u05aa\u05ad\u05af\u05b1\u05b8\u05c1\u05c6\u05d2\u05d6\u05da\u05de"+
		"\u05e5\u05e8\u05ea\u05f4\u05fb\u05fe\u0602\u060d\u0617\u0625\u062d\u0630"+
		"\u0638\u0640\u0648\u0652\u0662\u0668\u0670\u0675\u0678\u067d\u0686\u068b"+
		"\u0699\u069c\u069e\u06a3\u06a7\u06aa\u06b1\u06b9\u06bd\u06c1\u06c4\u06ca"+
		"\u06cd\u06cf\u06d8\u06dd\u06e1\u06e5\u06e8\u06f3\u06f8\u06fc\u0703\u070c"+
		"\u0710\u0712\u0716\u071f\u0724\u0726\u072f\u073a\u0741\u0746\u074d\u0756"+
		"\u075b\u075e\u0762\u076c\u077c\u077e\u0787\u078e\u0797\u07a0\u07a4\u07a8"+
		"\u07aa\u07ac\u07b1\u07b8\u07c1\u07c6\u07d2\u07d7\u07e6\u07e8\u07f4\u0801"+
		"\u080a\u0817\u0824\u0829\u0831\u0833\u083c\u084a\u0850\u085b\u085d\u086b"+
		"\u0872\u0879\u0882\u088d\u0894\u08a2\u08a5\u08af\u08b4\u08bd\u08c5\u08d1"+
		"\u08d3\u08db\u08e0\u08e2\u08e4\u08ec\u0917\u0922\u0925\u092d\u0931";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}