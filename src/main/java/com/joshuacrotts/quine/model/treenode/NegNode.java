package com.joshuacrotts.quine.model.treenode;

/**
 *
 */
public class NegNode extends WffTree {

    /**
     * Uses the tilde (~) as the default symbol if none is provided.
     * This should, ideally, only happen in internal algorithms.
     */
    private static final String DEFAULT_SYMBOL = "~";

    /**
     * The default TeX symbol is the dash. In math mode, this will look better.
     */
    private static final String DEFAULT_TEX_SYMBOL = "-";

    /**
     * Atoms use an overbar to represent their logical negation.
     */
    private static final String ATOM_TEX_SYMBOL = "\\bar";

    /**
     * Keeps track of the symbol currently used. Whatever symbol is last used
     * is stored in this variable. This makes sure that, if the notation from
     * the user is consistent, there are no incidents like "~ not A" to represent
     * a double-negated atom.
     */
    private static String currentlyUsedSymbol;

    public NegNode(String _symbol) {
        super(_symbol, NodeType.NEG);
        currentlyUsedSymbol = _symbol;
    }

    public NegNode(WffTree _ch1) {
        this();
        super.addChild(_ch1);
    }

    public NegNode() {
        this(currentlyUsedSymbol == null ? DEFAULT_SYMBOL : currentlyUsedSymbol);
    }

    @Override
    public WffTree copy() {
        NegNode negNode = new NegNode(this.getSymbol());
        negNode.setFlags(this.getFlags());
        for (WffTree ch : this.getChildren()) {
            negNode.addChild(ch.copy());
        }
        return negNode;
    }

    @Override
    public String getStringRep() {
        WffTree ch1 = this.getChild(0);
        // If there's the literal word, then we want to return a space between.
        if (this.getSymbol().equalsIgnoreCase("not")) {
            return this.getSymbol() + " " + ch1.getStringRep();
        }
        return this.getSymbol() + ch1.getStringRep();
    }

    @Override
    public String getTexCommand() {
        WffTree ch1 = this.getChild(0);
        if (ch1.isAtom()) {
            // Atoms should have the bar above their symbol.
            return ATOM_TEX_SYMBOL + "{" + ch1.getTexCommand() + "}";
        } else if (ch1.isNegation()) {
            // If the child is a negation, we can just convert that directly into either a non-negated node
            // or one with only a single negation.
            StringBuilder sb = new StringBuilder();
            WffTree curr = ch1.getChild(0);
            int i = 0;
            // We keep checking the child until it's either an atom, T, F, or some other schema.
            while (curr.isNegation()) {
                i += 1;
                curr = curr.getChild(0);
            }

            if (curr.isAtom()) { sb.append((ATOM_TEX_SYMBOL + "{").repeat(i)); }
            else { sb.append((DEFAULT_TEX_SYMBOL + "{").repeat(i));}

            sb.append(curr.getTexCommand());
            sb.append("}".repeat(i));
            // Double negated atoms need a double bar above.
            return sb.toString();
        } else {
            return DEFAULT_TEX_SYMBOL + ch1.getTexCommand();
        }
    }

    @Override
    public String getTexParseCommand() {
        return DEFAULT_TEX_SYMBOL;
    }
}
