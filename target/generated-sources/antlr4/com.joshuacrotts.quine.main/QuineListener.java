// Generated from com.joshuacrotts.quine.main/Quine.g4 by ANTLR 4.10.1
package com.joshuacrotts.quine.main;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QuineParser}.
 */
public interface QuineListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link QuineParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(QuineParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuineParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(QuineParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuineParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(QuineParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuineParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(QuineParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuineParser#propositionalWff}.
	 * @param ctx the parse tree
	 */
	void enterPropositionalWff(QuineParser.PropositionalWffContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuineParser#propositionalWff}.
	 * @param ctx the parse tree
	 */
	void exitPropositionalWff(QuineParser.PropositionalWffContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuineParser#propWff}.
	 * @param ctx the parse tree
	 */
	void enterPropWff(QuineParser.PropWffContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuineParser#propWff}.
	 * @param ctx the parse tree
	 */
	void exitPropWff(QuineParser.PropWffContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuineParser#propOuterWff}.
	 * @param ctx the parse tree
	 */
	void enterPropOuterWff(QuineParser.PropOuterWffContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuineParser#propOuterWff}.
	 * @param ctx the parse tree
	 */
	void exitPropOuterWff(QuineParser.PropOuterWffContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuineParser#propNegRule}.
	 * @param ctx the parse tree
	 */
	void enterPropNegRule(QuineParser.PropNegRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuineParser#propNegRule}.
	 * @param ctx the parse tree
	 */
	void exitPropNegRule(QuineParser.PropNegRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuineParser#propAndRule}.
	 * @param ctx the parse tree
	 */
	void enterPropAndRule(QuineParser.PropAndRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuineParser#propAndRule}.
	 * @param ctx the parse tree
	 */
	void exitPropAndRule(QuineParser.PropAndRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuineParser#propOrRule}.
	 * @param ctx the parse tree
	 */
	void enterPropOrRule(QuineParser.PropOrRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuineParser#propOrRule}.
	 * @param ctx the parse tree
	 */
	void exitPropOrRule(QuineParser.PropOrRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuineParser#propImpRule}.
	 * @param ctx the parse tree
	 */
	void enterPropImpRule(QuineParser.PropImpRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuineParser#propImpRule}.
	 * @param ctx the parse tree
	 */
	void exitPropImpRule(QuineParser.PropImpRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuineParser#propBicondRule}.
	 * @param ctx the parse tree
	 */
	void enterPropBicondRule(QuineParser.PropBicondRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuineParser#propBicondRule}.
	 * @param ctx the parse tree
	 */
	void exitPropBicondRule(QuineParser.PropBicondRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuineParser#propExclusiveOrRule}.
	 * @param ctx the parse tree
	 */
	void enterPropExclusiveOrRule(QuineParser.PropExclusiveOrRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuineParser#propExclusiveOrRule}.
	 * @param ctx the parse tree
	 */
	void exitPropExclusiveOrRule(QuineParser.PropExclusiveOrRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuineParser#propOuterAndRule}.
	 * @param ctx the parse tree
	 */
	void enterPropOuterAndRule(QuineParser.PropOuterAndRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuineParser#propOuterAndRule}.
	 * @param ctx the parse tree
	 */
	void exitPropOuterAndRule(QuineParser.PropOuterAndRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuineParser#propOuterOrRule}.
	 * @param ctx the parse tree
	 */
	void enterPropOuterOrRule(QuineParser.PropOuterOrRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuineParser#propOuterOrRule}.
	 * @param ctx the parse tree
	 */
	void exitPropOuterOrRule(QuineParser.PropOuterOrRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuineParser#propOuterImpRule}.
	 * @param ctx the parse tree
	 */
	void enterPropOuterImpRule(QuineParser.PropOuterImpRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuineParser#propOuterImpRule}.
	 * @param ctx the parse tree
	 */
	void exitPropOuterImpRule(QuineParser.PropOuterImpRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuineParser#propOuterBicondRule}.
	 * @param ctx the parse tree
	 */
	void enterPropOuterBicondRule(QuineParser.PropOuterBicondRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuineParser#propOuterBicondRule}.
	 * @param ctx the parse tree
	 */
	void exitPropOuterBicondRule(QuineParser.PropOuterBicondRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuineParser#propOuterExclusiveOrRule}.
	 * @param ctx the parse tree
	 */
	void enterPropOuterExclusiveOrRule(QuineParser.PropOuterExclusiveOrRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuineParser#propOuterExclusiveOrRule}.
	 * @param ctx the parse tree
	 */
	void exitPropOuterExclusiveOrRule(QuineParser.PropOuterExclusiveOrRuleContext ctx);
}