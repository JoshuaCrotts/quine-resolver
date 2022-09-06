package com.joshuacrotts.quine.main;

import com.joshuacrotts.quine.output.PdfPrinter;
import com.joshuacrotts.quine.output.PdfQuineTreePrinter;
import com.joshuacrotts.quine.model.QuineTree;
import com.joshuacrotts.quine.model.treenode.WffTree;
import com.joshuacrotts.quine.parser.QuineParserAdapter;
import com.joshuacrotts.quine.utils.ArgParser;

public class QuineResolver {

    public static void main(String[] args) {
        if (args.length < 2 && !ArgParser.isArgPresent("-help", args)) {
            ArgParser.printErrorAndExit("Require at least 3 arguments or -help flag; got " + args.length);
        } else if (ArgParser.isArgPresent("-help", args)) {
            printQuineResolverHelp();
            ArgParser.printArgUsage();
            System.exit(0);
        } else if (!ArgParser.isArgPresent("-input", args)) {
            ArgParser.printErrorAndExit("Missing required option: -input");
        } else if (ArgParser.getArgIndex("-input", args) == args.length - 1) {
            ArgParser.printErrorAndExit("Argument option -input cannot be last argument");
        } else {
            int idx = ArgParser.getArgIndex("-input", args);
            WffTree tree = QuineParserAdapter.getAbstractSyntaxTree(args[idx + 1]);
            if (tree != null) {
                QuineTree qt = new QuineTree(tree, tree.getAtoms());
                if (ArgParser.isArgPresent("-console", args)) {
                    System.out.println(qt.printQuineTree());
                }
                if (ArgParser.isArgPresent("-output", args)) {
                    int pdfIdx = ArgParser.getArgIndex("-output", args);
                    String outFileName = args[pdfIdx + 1];
                    if (!outFileName.endsWith("pdf")) {
                        ArgParser.printErrorAndExit("Output file to -output must be a pdf file, but got " + outFileName);
                    } else {
                        PdfPrinter printer = new PdfQuineTreePrinter(qt, outFileName);
                        printer.outputToFile();
                        System.out.printf("Successfully output quine tree to PDF %s\n", outFileName);
                    }
                }
            }
        }
    }

    private static void printQuineResolverHelp() {
        System.out.println("About: 'quine-resolver' is a program to evaluate a propositional logic");
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
        System.out.println("All binary operators must have parentheses, unless they are part of the outermost expression.");
        System.out.println("\tEx: '(p → q → r) → p' is disallowed, but '((p → q) → r) → p' is valid.");
        System.out.println("");
    }
}
