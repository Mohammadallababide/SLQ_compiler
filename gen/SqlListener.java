// Generated from C:/Users/Jehad/IdeaProjects/SQL_git/src\Sql.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SqlParser}.
 */
public interface SqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SqlParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(SqlParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(SqlParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#error}.
	 * @param ctx the parse tree
	 */
	void enterError(SqlParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#error}.
	 * @param ctx the parse tree
	 */
	void exitError(SqlParser.ErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt_list(SqlParser.Sql_stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt_list(SqlParser.Sql_stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt(SqlParser.Sql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt(SqlParser.Sql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_stmt(SqlParser.Alter_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_stmt(SqlParser.Alter_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_table_add_constraint}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_add_constraint(SqlParser.Alter_table_add_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_table_add_constraint}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_add_constraint(SqlParser.Alter_table_add_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_table_add}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_add(SqlParser.Alter_table_addContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_table_add}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_add(SqlParser.Alter_table_addContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#analyze_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAnalyze_stmt(SqlParser.Analyze_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#analyze_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAnalyze_stmt(SqlParser.Analyze_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#attach_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAttach_stmt(SqlParser.Attach_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#attach_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAttach_stmt(SqlParser.Attach_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#begin_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBegin_stmt(SqlParser.Begin_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#begin_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBegin_stmt(SqlParser.Begin_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#commit_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCommit_stmt(SqlParser.Commit_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#commit_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCommit_stmt(SqlParser.Commit_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#compound_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_select_stmt(SqlParser.Compound_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#compound_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_select_stmt(SqlParser.Compound_select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index_stmt(SqlParser.Create_index_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index_stmt(SqlParser.Create_index_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_stmt(SqlParser.Create_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_stmt(SqlParser.Create_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_trigger_stmt(SqlParser.Create_trigger_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_trigger_stmt(SqlParser.Create_trigger_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_view_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_view_stmt(SqlParser.Create_view_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_view_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_view_stmt(SqlParser.Create_view_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_virtual_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_virtual_table_stmt(SqlParser.Create_virtual_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_virtual_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_virtual_table_stmt(SqlParser.Create_virtual_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt(SqlParser.Delete_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt(SqlParser.Delete_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#delete_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt_limited(SqlParser.Delete_stmt_limitedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#delete_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt_limited(SqlParser.Delete_stmt_limitedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#detach_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDetach_stmt(SqlParser.Detach_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#detach_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDetach_stmt(SqlParser.Detach_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_index_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_index_stmt(SqlParser.Drop_index_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_index_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_index_stmt(SqlParser.Drop_index_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table_stmt(SqlParser.Drop_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table_stmt(SqlParser.Drop_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_trigger_stmt(SqlParser.Drop_trigger_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_trigger_stmt(SqlParser.Drop_trigger_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_view_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_view_stmt(SqlParser.Drop_view_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_view_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_view_stmt(SqlParser.Drop_view_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFactored_select_stmt(SqlParser.Factored_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFactored_select_stmt(SqlParser.Factored_select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt(SqlParser.Insert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt(SqlParser.Insert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#pragma_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPragma_stmt(SqlParser.Pragma_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#pragma_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPragma_stmt(SqlParser.Pragma_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#reindex_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReindex_stmt(SqlParser.Reindex_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#reindex_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReindex_stmt(SqlParser.Reindex_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#release_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRelease_stmt(SqlParser.Release_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#release_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRelease_stmt(SqlParser.Release_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#rollback_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRollback_stmt(SqlParser.Rollback_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#rollback_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRollback_stmt(SqlParser.Rollback_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#savepoint_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_stmt(SqlParser.Savepoint_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#savepoint_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_stmt(SqlParser.Savepoint_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#simple_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_select_stmt(SqlParser.Simple_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#simple_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_select_stmt(SqlParser.Simple_select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(SqlParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(SqlParser.Select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#select_or_values}.
	 * @param ctx the parse tree
	 */
	void enterSelect_or_values(SqlParser.Select_or_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#select_or_values}.
	 * @param ctx the parse tree
	 */
	void exitSelect_or_values(SqlParser.Select_or_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt(SqlParser.Update_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt(SqlParser.Update_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#update_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt_limited(SqlParser.Update_stmt_limitedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#update_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt_limited(SqlParser.Update_stmt_limitedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#vacuum_stmt}.
	 * @param ctx the parse tree
	 */
	void enterVacuum_stmt(SqlParser.Vacuum_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#vacuum_stmt}.
	 * @param ctx the parse tree
	 */
	void exitVacuum_stmt(SqlParser.Vacuum_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_def}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def(SqlParser.Column_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_def}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def(SqlParser.Column_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(SqlParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(SqlParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint(SqlParser.Column_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint(SqlParser.Column_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_primary_key(SqlParser.Column_constraint_primary_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_primary_key(SqlParser.Column_constraint_primary_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_foreign_key(SqlParser.Column_constraint_foreign_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_foreign_key(SqlParser.Column_constraint_foreign_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_constraint_not_null}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_not_null(SqlParser.Column_constraint_not_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_constraint_not_null}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_not_null(SqlParser.Column_constraint_not_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_constraint_null}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_null(SqlParser.Column_constraint_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_constraint_null}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_null(SqlParser.Column_constraint_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_default}.
	 * @param ctx the parse tree
	 */
	void enterColumn_default(SqlParser.Column_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_default}.
	 * @param ctx the parse tree
	 */
	void exitColumn_default(SqlParser.Column_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_default_value}.
	 * @param ctx the parse tree
	 */
	void enterColumn_default_value(SqlParser.Column_default_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_default_value}.
	 * @param ctx the parse tree
	 */
	void exitColumn_default_value(SqlParser.Column_default_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#conflict_clause}.
	 * @param ctx the parse tree
	 */
	void enterConflict_clause(SqlParser.Conflict_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#conflict_clause}.
	 * @param ctx the parse tree
	 */
	void exitConflict_clause(SqlParser.Conflict_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SqlParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SqlParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void enterForeign_key_clause(SqlParser.Foreign_key_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void exitForeign_key_clause(SqlParser.Foreign_key_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#fk_target_column_name}.
	 * @param ctx the parse tree
	 */
	void enterFk_target_column_name(SqlParser.Fk_target_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#fk_target_column_name}.
	 * @param ctx the parse tree
	 */
	void exitFk_target_column_name(SqlParser.Fk_target_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#raise_function}.
	 * @param ctx the parse tree
	 */
	void enterRaise_function(SqlParser.Raise_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#raise_function}.
	 * @param ctx the parse tree
	 */
	void exitRaise_function(SqlParser.Raise_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void enterIndexed_column(SqlParser.Indexed_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void exitIndexed_column(SqlParser.Indexed_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint(SqlParser.Table_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint(SqlParser.Table_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_primary_key(SqlParser.Table_constraint_primary_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_primary_key(SqlParser.Table_constraint_primary_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_foreign_key(SqlParser.Table_constraint_foreign_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_foreign_key(SqlParser.Table_constraint_foreign_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_constraint_unique}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_unique(SqlParser.Table_constraint_uniqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_constraint_unique}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_unique(SqlParser.Table_constraint_uniqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_constraint_key}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_key(SqlParser.Table_constraint_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_constraint_key}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_key(SqlParser.Table_constraint_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#fk_origin_column_name}.
	 * @param ctx the parse tree
	 */
	void enterFk_origin_column_name(SqlParser.Fk_origin_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#fk_origin_column_name}.
	 * @param ctx the parse tree
	 */
	void exitFk_origin_column_name(SqlParser.Fk_origin_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void enterWith_clause(SqlParser.With_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void exitWith_clause(SqlParser.With_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void enterQualified_table_name(SqlParser.Qualified_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void exitQualified_table_name(SqlParser.Qualified_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void enterOrdering_term(SqlParser.Ordering_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void exitOrdering_term(SqlParser.Ordering_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#pragma_value}.
	 * @param ctx the parse tree
	 */
	void enterPragma_value(SqlParser.Pragma_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#pragma_value}.
	 * @param ctx the parse tree
	 */
	void exitPragma_value(SqlParser.Pragma_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void enterCommon_table_expression(SqlParser.Common_table_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void exitCommon_table_expression(SqlParser.Common_table_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#result_column}.
	 * @param ctx the parse tree
	 */
	void enterResult_column(SqlParser.Result_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#result_column}.
	 * @param ctx the parse tree
	 */
	void exitResult_column(SqlParser.Result_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_subquery(SqlParser.Table_or_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_subquery(SqlParser.Table_or_subqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_clause(SqlParser.Join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_clause(SqlParser.Join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void enterJoin_operator(SqlParser.Join_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void exitJoin_operator(SqlParser.Join_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void enterJoin_constraint(SqlParser.Join_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void exitJoin_constraint(SqlParser.Join_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#select_core}.
	 * @param ctx the parse tree
	 */
	void enterSelect_core(SqlParser.Select_coreContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#select_core}.
	 * @param ctx the parse tree
	 */
	void exitSelect_core(SqlParser.Select_coreContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#compound_operator}.
	 * @param ctx the parse tree
	 */
	void enterCompound_operator(SqlParser.Compound_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#compound_operator}.
	 * @param ctx the parse tree
	 */
	void exitCompound_operator(SqlParser.Compound_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#cte_table_name}.
	 * @param ctx the parse tree
	 */
	void enterCte_table_name(SqlParser.Cte_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#cte_table_name}.
	 * @param ctx the parse tree
	 */
	void exitCte_table_name(SqlParser.Cte_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void enterSigned_number(SqlParser.Signed_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void exitSigned_number(SqlParser.Signed_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(SqlParser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(SqlParser.Literal_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(SqlParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(SqlParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#error_message}.
	 * @param ctx the parse tree
	 */
	void enterError_message(SqlParser.Error_messageContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#error_message}.
	 * @param ctx the parse tree
	 */
	void exitError_message(SqlParser.Error_messageContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#module_argument}.
	 * @param ctx the parse tree
	 */
	void enterModule_argument(SqlParser.Module_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#module_argument}.
	 * @param ctx the parse tree
	 */
	void exitModule_argument(SqlParser.Module_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias(SqlParser.Column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias(SqlParser.Column_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#string_rules}.
	 * @param ctx the parse tree
	 */
	void enterString_rules(SqlParser.String_rulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#string_rules}.
	 * @param ctx the parse tree
	 */
	void exitString_rules(SqlParser.String_rulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#char_rule}.
	 * @param ctx the parse tree
	 */
	void enterChar_rule(SqlParser.Char_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#char_rule}.
	 * @param ctx the parse tree
	 */
	void exitChar_rule(SqlParser.Char_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#callback_func}.
	 * @param ctx the parse tree
	 */
	void enterCallback_func(SqlParser.Callback_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#callback_func}.
	 * @param ctx the parse tree
	 */
	void exitCallback_func(SqlParser.Callback_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(SqlParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(SqlParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_Array}.
	 * @param ctx the parse tree
	 */
	void enterCreate_Array(SqlParser.Create_ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_Array}.
	 * @param ctx the parse tree
	 */
	void exitCreate_Array(SqlParser.Create_ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#prameters}.
	 * @param ctx the parse tree
	 */
	void enterPrameters(SqlParser.PrametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#prameters}.
	 * @param ctx the parse tree
	 */
	void exitPrameters(SqlParser.PrametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#print_statment}.
	 * @param ctx the parse tree
	 */
	void enterPrint_statment(SqlParser.Print_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#print_statment}.
	 * @param ctx the parse tree
	 */
	void exitPrint_statment(SqlParser.Print_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#indisde_the_print}.
	 * @param ctx the parse tree
	 */
	void enterIndisde_the_print(SqlParser.Indisde_the_printContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#indisde_the_print}.
	 * @param ctx the parse tree
	 */
	void exitIndisde_the_print(SqlParser.Indisde_the_printContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#indisde_the_print_part1}.
	 * @param ctx the parse tree
	 */
	void enterIndisde_the_print_part1(SqlParser.Indisde_the_print_part1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#indisde_the_print_part1}.
	 * @param ctx the parse tree
	 */
	void exitIndisde_the_print_part1(SqlParser.Indisde_the_print_part1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#indisde_the_print_part2}.
	 * @param ctx the parse tree
	 */
	void enterIndisde_the_print_part2(SqlParser.Indisde_the_print_part2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#indisde_the_print_part2}.
	 * @param ctx the parse tree
	 */
	void exitIndisde_the_print_part2(SqlParser.Indisde_the_print_part2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#call_function}.
	 * @param ctx the parse tree
	 */
	void enterCall_function(SqlParser.Call_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#call_function}.
	 * @param ctx the parse tree
	 */
	void exitCall_function(SqlParser.Call_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#function_header}.
	 * @param ctx the parse tree
	 */
	void enterFunction_header(SqlParser.Function_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#function_header}.
	 * @param ctx the parse tree
	 */
	void exitFunction_header(SqlParser.Function_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#creating_var}.
	 * @param ctx the parse tree
	 */
	void enterCreating_var(SqlParser.Creating_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#creating_var}.
	 * @param ctx the parse tree
	 */
	void exitCreating_var(SqlParser.Creating_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#use_random_name}.
	 * @param ctx the parse tree
	 */
	void enterUse_random_name(SqlParser.Use_random_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#use_random_name}.
	 * @param ctx the parse tree
	 */
	void exitUse_random_name(SqlParser.Use_random_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#if_else_rule}.
	 * @param ctx the parse tree
	 */
	void enterIf_else_rule(SqlParser.If_else_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#if_else_rule}.
	 * @param ctx the parse tree
	 */
	void exitIf_else_rule(SqlParser.If_else_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#while_rule}.
	 * @param ctx the parse tree
	 */
	void enterWhile_rule(SqlParser.While_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#while_rule}.
	 * @param ctx the parse tree
	 */
	void exitWhile_rule(SqlParser.While_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#do_while}.
	 * @param ctx the parse tree
	 */
	void enterDo_while(SqlParser.Do_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#do_while}.
	 * @param ctx the parse tree
	 */
	void exitDo_while(SqlParser.Do_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(SqlParser.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(SqlParser.Function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#for_loop_rule}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop_rule(SqlParser.For_loop_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#for_loop_rule}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop_rule(SqlParser.For_loop_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#operand_of_arithematic_rule}.
	 * @param ctx the parse tree
	 */
	void enterOperand_of_arithematic_rule(SqlParser.Operand_of_arithematic_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#operand_of_arithematic_rule}.
	 * @param ctx the parse tree
	 */
	void exitOperand_of_arithematic_rule(SqlParser.Operand_of_arithematic_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#comparative_processes}.
	 * @param ctx the parse tree
	 */
	void enterComparative_processes(SqlParser.Comparative_processesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#comparative_processes}.
	 * @param ctx the parse tree
	 */
	void exitComparative_processes(SqlParser.Comparative_processesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#arithematic_rule}.
	 * @param ctx the parse tree
	 */
	void enterArithematic_rule(SqlParser.Arithematic_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#arithematic_rule}.
	 * @param ctx the parse tree
	 */
	void exitArithematic_rule(SqlParser.Arithematic_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(SqlParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(SqlParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(SqlParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(SqlParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#switch}.
	 * @param ctx the parse tree
	 */
	void enterSwitch(SqlParser.SwitchContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#switch}.
	 * @param ctx the parse tree
	 */
	void exitSwitch(SqlParser.SwitchContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#defult}.
	 * @param ctx the parse tree
	 */
	void enterDefult(SqlParser.DefultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#defult}.
	 * @param ctx the parse tree
	 */
	void exitDefult(SqlParser.DefultContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#case}.
	 * @param ctx the parse tree
	 */
	void enterCase(SqlParser.CaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#case}.
	 * @param ctx the parse tree
	 */
	void exitCase(SqlParser.CaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#foreach}.
	 * @param ctx the parse tree
	 */
	void enterForeach(SqlParser.ForeachContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#foreach}.
	 * @param ctx the parse tree
	 */
	void exitForeach(SqlParser.ForeachContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#increase_decrease}.
	 * @param ctx the parse tree
	 */
	void enterIncrease_decrease(SqlParser.Increase_decreaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#increase_decrease}.
	 * @param ctx the parse tree
	 */
	void exitIncrease_decrease(SqlParser.Increase_decreaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(SqlParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(SqlParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#unknown}.
	 * @param ctx the parse tree
	 */
	void enterUnknown(SqlParser.UnknownContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#unknown}.
	 * @param ctx the parse tree
	 */
	void exitUnknown(SqlParser.UnknownContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(SqlParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(SqlParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(SqlParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(SqlParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#database_name}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_name(SqlParser.Database_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#database_name}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_name(SqlParser.Database_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#source_table_name}.
	 * @param ctx the parse tree
	 */
	void enterSource_table_name(SqlParser.Source_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#source_table_name}.
	 * @param ctx the parse tree
	 */
	void exitSource_table_name(SqlParser.Source_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(SqlParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(SqlParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_index_name(SqlParser.Table_or_index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_index_name(SqlParser.Table_or_index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void enterNew_table_name(SqlParser.New_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void exitNew_table_name(SqlParser.New_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(SqlParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(SqlParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void enterCollation_name(SqlParser.Collation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void exitCollation_name(SqlParser.Collation_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void enterForeign_table(SqlParser.Foreign_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void exitForeign_table(SqlParser.Foreign_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#index_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_name(SqlParser.Index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#index_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_name(SqlParser.Index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_name(SqlParser.Trigger_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_name(SqlParser.Trigger_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#view_name}.
	 * @param ctx the parse tree
	 */
	void enterView_name(SqlParser.View_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#view_name}.
	 * @param ctx the parse tree
	 */
	void exitView_name(SqlParser.View_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#module_name}.
	 * @param ctx the parse tree
	 */
	void enterModule_name(SqlParser.Module_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#module_name}.
	 * @param ctx the parse tree
	 */
	void exitModule_name(SqlParser.Module_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#pragma_name}.
	 * @param ctx the parse tree
	 */
	void enterPragma_name(SqlParser.Pragma_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#pragma_name}.
	 * @param ctx the parse tree
	 */
	void exitPragma_name(SqlParser.Pragma_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_name(SqlParser.Savepoint_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_name(SqlParser.Savepoint_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(SqlParser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(SqlParser.Table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_name(SqlParser.Transaction_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_name(SqlParser.Transaction_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#json}.
	 * @param ctx the parse tree
	 */
	void enterJson(SqlParser.JsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#json}.
	 * @param ctx the parse tree
	 */
	void exitJson(SqlParser.JsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#jsonObject}.
	 * @param ctx the parse tree
	 */
	void enterJsonObject(SqlParser.JsonObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#jsonObject}.
	 * @param ctx the parse tree
	 */
	void exitJsonObject(SqlParser.JsonObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void enterKeyValuePair(SqlParser.KeyValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void exitKeyValuePair(SqlParser.KeyValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#primitive}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive(SqlParser.PrimitiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#primitive}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive(SqlParser.PrimitiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(SqlParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(SqlParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(SqlParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(SqlParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#any_name}.
	 * @param ctx the parse tree
	 */
	void enterAny_name(SqlParser.Any_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#any_name}.
	 * @param ctx the parse tree
	 */
	void exitAny_name(SqlParser.Any_nameContext ctx);
}