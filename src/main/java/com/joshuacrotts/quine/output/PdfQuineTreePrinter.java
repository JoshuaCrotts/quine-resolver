package com.joshuacrotts.quine.output;

import com.joshuacrotts.quine.model.QuineTree;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 */
public final class PdfQuineTreePrinter extends PdfPrinter {

    /**
     * Template location to read from.
     */
    private static final String TEX_TREE_TEMPLATE = "src/main/resources/quine_tree_template.tex";

    public PdfQuineTreePrinter(QuineTree _quineTree, String _outputFile) {
        super(_quineTree, _outputFile);
    }

    /**
     * Outputs the truth tree to a .tex file. The preamble information/template data is
     * copied to the output file first, then we recursively traverse the TruthTree object
     * calling the getTexLiteralCommand() methods on each node.
     */
    public void outputToFile() {
        try {
            this.setBufferedReader(new BufferedReader(new FileReader(TEX_TREE_TEMPLATE)));
            StringBuilder httpTex = new StringBuilder();

            // First copy the template over.
            int ch = this.getBufferedReader().read();
            while (ch != -1) {
                httpTex.append((char) ch);
                ch = this.getBufferedReader().read();
            }
            this.getBufferedReader().close();

            // Append the table code to this request.
            httpTex.append(this.getQuineTree().getTexQuineTree());
            httpTex.append("\n\\end{prooftree}\n\\end{document}\n");

            // Build the URL and HTTP request.
            String texURL = "https://latex.ytotech.com/builds/sync";
            PdfPrinter.downloadFile(texURL, this.getOutputFile(), httpTex.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}