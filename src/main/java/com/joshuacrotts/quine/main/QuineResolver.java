package com.joshuacrotts.quine.main;

import com.joshuacrotts.quine.model.QuineTree;
import com.joshuacrotts.quine.model.treenode.WffTree;
import com.joshuacrotts.quine.parser.QuineParserAdapter;

public class QuineResolver {

    public static void main(String[] args) {
        WffTree tree = QuineParserAdapter.getAbstractSyntaxTree("(P -> ~Q)");
        QuineTree qt = new QuineTree(tree, tree.getAtoms());
        System.out.println(qt.printQuineTree());
    }
}
