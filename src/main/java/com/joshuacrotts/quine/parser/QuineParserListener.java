package com.joshuacrotts.quine.parser;

import com.joshuacrotts.quine.main.QuineBaseListener;
import com.joshuacrotts.quine.main.QuineParser;
import com.joshuacrotts.quine.model.treenode.*;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.ArrayList;
import java.util.Stack;

/**
 * QuineParserListener is the connector that defines the syntax and,
 * more importantly, the semantic analysis - how errors are defined
 * and reported. Each method inherited from QuineBaseListener comes
 * from the grammar Quine.g4 file and correspond to parser rules.
 *
 * @author Joshua Crotts
 * @date 9/05/2022
 */
public class QuineParserListener extends QuineBaseListener {

    /**
     * Max # of negated nodes that are stackable on any given Wff. That is,
     * ~~~~W is the max.
     */
    public static final int MAXIMUM_NEGATED_NODES = 4;

    /**
     * Map to keep track of nodes across the different listener
     * methods.
     */
    private final ParseTreeProperty<WffTree> PARSE_TREE;

    /**
     * Stack to keep track of all in-progress subwffs.
     */
    private final Stack<WffTree> TREE_ROOTS;

    /**
     * Current root of the wff tree being constructed.
     */
    private WffTree wffTree;

    /**
     * Keeps track of how many negation nodes we currently have stacked. Any other node resets this to 0.
     * 4 is the max.
     */
    private int negationCount = 0;

    public QuineParserListener(QuineParser _QuineParser) {
        super();
        this.PARSE_TREE = new ParseTreeProperty<>();
        this.TREE_ROOTS = new Stack<>();
    }

    @Override
    public void enterPropositionalWff(QuineParser.PropositionalWffContext ctx) {
        if (QuineErrorListener.sawError()) return;
        if (this.wffTree != null && this.wffTree.isPredicateWff()) {
            QuineErrorListener.syntaxError(ctx, "Wff cannot be both propositional and predicate.");
            return;
        }

        this.wffTree = new WffTree();
    }

    @Override
    public void exitPropositionalWff(QuineParser.PropositionalWffContext ctx) {
        if (QuineErrorListener.sawError()) return;
    }

    @Override
    public void enterAtom(QuineParser.AtomContext ctx) {
        if (QuineErrorListener.sawError()) return;
        WffTree atomNode = new AtomNode(ctx.ATOM().getText());
        this.PARSE_TREE.put(ctx, atomNode);
    }

    @Override
    public void enterPropWff(QuineParser.PropWffContext ctx) {
        if (QuineErrorListener.sawError()) return;
    }

    @Override
    public void exitPropWff(QuineParser.PropWffContext ctx) {
        if (QuineErrorListener.sawError()) return;
        if (ctx.atom() != null) {
            this.wffTree.addChild(this.PARSE_TREE.get(ctx.atom()));
        }
    }

    @Override
    public void enterPropNegRule(QuineParser.PropNegRuleContext ctx) {
        if (QuineErrorListener.sawError()) return;
        this.negationCount++;
        if (this.negationCount > QuineParserListener.MAXIMUM_NEGATED_NODES) {
            QuineErrorListener.syntaxError(ctx, "Error: cannot have more than four stacked negated nodes");
            return;
        }

        String symbol = ctx.NEG().getText();
        NegNode negNode = new NegNode(symbol);
        this.TREE_ROOTS.push(this.wffTree);
        this.wffTree = negNode;
    }

    @Override
    public void exitPropNegRule(QuineParser.PropNegRuleContext ctx) {
        if (QuineErrorListener.sawError()) return;
        this.negationCount--;
        this.popTreeRoot();
    }

    @Override
    public void enterPropAndRule(QuineParser.PropAndRuleContext ctx) {
        if (QuineErrorListener.sawError()) return;
        AndNode andNode = new AndNode(ctx.AND().getText());
        this.TREE_ROOTS.push(this.wffTree);
        this.wffTree = andNode;
    }

    @Override
    public void exitPropAndRule(QuineParser.PropAndRuleContext ctx) {
        if (QuineErrorListener.sawError()) return;
        this.popTreeRoot();
    }

    @Override
    public void enterPropOuterAndRule(QuineParser.PropOuterAndRuleContext ctx) {
        if (QuineErrorListener.sawError()) return;
        AndNode andNode = new AndNode(ctx.AND().getText());
        this.TREE_ROOTS.push(this.wffTree);
        this.wffTree = andNode;
    }

    @Override
    public void exitPropOuterAndRule(QuineParser.PropOuterAndRuleContext ctx) {
        if (QuineErrorListener.sawError()) return;
        this.popTreeRoot();
    }

    @Override
    public void enterPropOrRule(QuineParser.PropOrRuleContext ctx) {
        if (QuineErrorListener.sawError()) return;
        OrNode orNode = new OrNode(ctx.OR().getText());
        this.TREE_ROOTS.push(this.wffTree);
        this.wffTree = orNode;
    }

    @Override
    public void exitPropOrRule(QuineParser.PropOrRuleContext ctx) {
        if (QuineErrorListener.sawError()) return;
        this.popTreeRoot();
    }

    @Override
    public void enterPropOuterOrRule(QuineParser.PropOuterOrRuleContext ctx) {
        if (QuineErrorListener.sawError()) return;
        OrNode orNode = new OrNode(ctx.OR().getText());
        this.TREE_ROOTS.push(this.wffTree);
        this.wffTree = orNode;
    }

    @Override
    public void exitPropOuterOrRule(QuineParser.PropOuterOrRuleContext ctx) {
        if (QuineErrorListener.sawError()) return;
        this.popTreeRoot();
    }

    @Override
    public void enterPropImpRule(QuineParser.PropImpRuleContext ctx) {
        if (QuineErrorListener.sawError()) return;
        ImpNode impNode = new ImpNode(ctx.IMP().getText());
        this.TREE_ROOTS.push(this.wffTree);
        this.wffTree = impNode;
    }

    @Override
    public void exitPropImpRule(QuineParser.PropImpRuleContext ctx) {
        if (QuineErrorListener.sawError()) return;
        this.popTreeRoot();
    }

    @Override
    public void enterPropOuterImpRule(QuineParser.PropOuterImpRuleContext ctx) {
        if (QuineErrorListener.sawError()) return;
        ImpNode impNode = new ImpNode(ctx.IMP().getText());
        this.TREE_ROOTS.push(this.wffTree);
        this.wffTree = impNode;
    }

    @Override
    public void exitPropOuterImpRule(QuineParser.PropOuterImpRuleContext ctx) {
        if (QuineErrorListener.sawError()) return;
        this.popTreeRoot();
    }

    @Override
    public void enterPropBicondRule(QuineParser.PropBicondRuleContext ctx) {
        if (QuineErrorListener.sawError()) return;
        BicondNode bicondNode = new BicondNode(ctx.BICOND().getText());
        this.TREE_ROOTS.push(this.wffTree);
        this.wffTree = bicondNode;
    }

    @Override
    public void exitPropBicondRule(QuineParser.PropBicondRuleContext ctx) {
        if (QuineErrorListener.sawError()) return;
        this.popTreeRoot();
    }

    @Override
    public void enterPropOuterBicondRule(QuineParser.PropOuterBicondRuleContext ctx) {
        if (QuineErrorListener.sawError()) return;
        BicondNode bicondNode = new BicondNode(ctx.BICOND().getText());
        this.TREE_ROOTS.push(this.wffTree);
        this.wffTree = bicondNode;
    }

    @Override
    public void exitPropOuterBicondRule(QuineParser.PropOuterBicondRuleContext ctx) {
        if (QuineErrorListener.sawError()) return;
        this.popTreeRoot();
    }

    @Override
    public void enterPropExclusiveOrRule(QuineParser.PropExclusiveOrRuleContext ctx) {
        if (QuineErrorListener.sawError()) return;
        ExclusiveOrNode xorNode = new ExclusiveOrNode(ctx.XOR().getText());
        this.TREE_ROOTS.push(this.wffTree);
        this.wffTree = xorNode;
    }

    @Override
    public void exitPropExclusiveOrRule(QuineParser.PropExclusiveOrRuleContext ctx) {
        if (QuineErrorListener.sawError()) return;
        this.popTreeRoot();
    }

    @Override
    public void enterPropOuterExclusiveOrRule(QuineParser.PropOuterExclusiveOrRuleContext ctx) {
        if (QuineErrorListener.sawError()) return;
        ExclusiveOrNode xorNode = new ExclusiveOrNode(ctx.XOR().getText());
        this.TREE_ROOTS.push(this.wffTree);
        this.wffTree = xorNode;
    }

    @Override
    public void exitPropOuterExclusiveOrRule(QuineParser.PropOuterExclusiveOrRuleContext ctx) {
        if (QuineErrorListener.sawError()) return;
        this.popTreeRoot();
    }

    /**
     * Returns the WffTree that is constructed during parsing.
     *
     * @return WffTree.
     */
    public WffTree getSyntaxTree() {
        return QuineErrorListener.sawError() ? null : this.wffTree;
    }

    /**
     * Pops the root of the tree - each time a node with a potentially
     * left-recursive child is called (namely wff), we need to start adding
     * onto that specific WffTree. So, we save the old root into a stack,
     * and continue to add onto the new running "root". When we finish, we pop the
     * stack, add the running root as a child of the old root, and finally
     * reassign the links.
     */
    private void popTreeRoot() {
        WffTree oldRoot = this.TREE_ROOTS.pop(); // Remove the old root from the stack.
        oldRoot.addChild(this.wffTree); // Add the current running-node as a child of the old root.
        this.wffTree = oldRoot; // Reassign the root to be the old one.
    }
}