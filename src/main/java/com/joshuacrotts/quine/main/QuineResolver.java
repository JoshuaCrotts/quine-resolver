package com.joshuacrotts.quine.main;

import com.joshuacrotts.quine.model.QuineTree;
import com.joshuacrotts.quine.model.treenode.WffTree;
import com.joshuacrotts.quine.parser.QuineParserAdapter;
import com.joshuacrotts.quine.utils.ArgParser;

public class QuineResolver {

    public static void main(String[] args) {
        if (args.length < 2 && !ArgParser.isArgPresent("-h", args)) {
            ArgParser.printErrorAndExit("Require at least 3 arguments or -h flag; got " + args.length);
        } else if (ArgParser.isArgPresent("-h", args)) {
            printQuineResolverHelp();
            ArgParser.printArgUsage();
            System.exit(0);
        } else if (!ArgParser.isArgPresent("-i", args)) {
            ArgParser.printErrorAndExit("Missing required option: -i");
        } else if (ArgParser.getArgIndex("-i", args) == args.length - 1) {
            ArgParser.printErrorAndExit("Argument option -i cannot be last argument");
        } else {
            int idx = ArgParser.getArgIndex("-i", args);
            WffTree tree = QuineParserAdapter.getAbstractSyntaxTree(args[idx + 1]);
            if (tree != null) {
                QuineTree qt = new QuineTree(tree, tree.getAtoms());
                System.out.println(qt.printQuineTree());
            }
        }
    }

    private static void printQuineResolverHelp() {
        System.out.println("'quine-resolver' is a program to evaluate a propositional logic");
        System.out.println("schema or well-formed formula with Quine's method of truth-value analysis.");
        System.out.println("");
        System.out.println("Schema use any upper or lower-case letters, e.g., p or P. Connectives are as follows:");
        System.out.printf("\tConjunction: '%s' | '%s' | '%s' | '%s' | '%s'\n", '&', '∧', '^', '·', "AND");
        System.out.printf("\tDisjunction: '%s' | '%s' | '%s' | '%s' | '%s'\n", '|', '∨', '+', "||", "OR");
        System.out.printf("\tImplication: '%s' | '%s' | '%s' | '%s' | '%s' | '%s'\n", "->", '→', '⇒', '⊃', '>', "IMPLIES");
        System.out.printf("\tBiconditional: '%s' | '%s' | '%s' | '%s' | '%s' | '%s'\n", "<->", '⇔', "≡", '↔', "<>", "IFF");
        System.out.printf("\tExclusive-Or: '%s' | '%s' | '%s' | '%s' | '%s' | '%s'\n", '⊕', '⊻', '≢', '⩒', '↮', "XOR");
        System.out.printf("\tNegation: '%s' | '%s' | '%s' | '%s' | '%s' | '%s' | '%s' | '%s'\n", '˜', '\u007e', '\uff5e', '\u223c', '¬', '!', '-', "NOT");
        System.out.println();
    }
}
