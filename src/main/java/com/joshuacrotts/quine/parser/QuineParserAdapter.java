package com.joshuacrotts.quine.parser;

import com.joshuacrotts.quine.main.QuineLexer;
import com.joshuacrotts.quine.main.QuineParser;
import com.joshuacrotts.quine.model.treenode.WffTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.ArrayList;

public class QuineParserAdapter {

    /**
     * Builds the abstract syntax tree from the user input string. This
     * method should be called by any class that sends input from a front-end
     * and wants to create an AST, whether it be stdin or JavaFX.
     *
     * @param _wff - String of wff characters.
     * @return WffTree representing abstract syntax tree returned.
     */
    public static WffTree getAbstractSyntaxTree(String _wff) {
        QuineErrorListener.reset();
        CharStream charStream = CharStreams.fromString(_wff);
        QuineParserListener parser = QuineParserAdapter.parseStream(charStream);
        // For now, the errors are just printed in the tester class - if
        // JUnit is integrated, these should be removed so they align with the tests.
        QuineErrorListener.printErrors();
        return parser.getSyntaxTree();
    }

    /**
     * Runs the parser and syntax tree constructor for the provided input stream.
     * The returned object can be used to access the syntax tree for either further
     * processing or for checking results in automated tests.
     *
     * @param input an initialized CharStream
     */
    private static QuineParserListener parseStream(CharStream input) {
        // "input" is the character-by-character input - connect to lexer
        QuineLexer lexer = new QuineLexer(input);
        QuineErrorListener errorListener = new QuineErrorListener();
        lexer.removeErrorListeners();
        lexer.addErrorListener(errorListener);

        // Connect token stream to lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Connect parser to token stream
        QuineParser parser = new QuineParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(errorListener);
        ParseTree tree = parser.program();

        // Now do the parsing, and walk the parse tree with our listeners
        ParseTreeWalker walker = new ParseTreeWalker();
        QuineParserListener compiler = new QuineParserListener(parser);
        walker.walk(compiler, tree);
        return compiler;
    }
}
