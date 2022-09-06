package com.joshuacrotts.quine.utils;

public abstract class ArgParser {

    public static boolean isArgPresent(String flag, String[] args) {
        for (String arg : args) {
            if (arg.equals(flag)) { return true; }
        }
        return false;
    }

    public static int getArgIndex(String flag, String[] args) {
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals(flag)) { return i; }
        }
        return -1;
    }

    public static void printArgUsage() {
        System.out.println("usage: quine-resolver.jar -i <input schema> [-help | -output | -console]");
        System.out.println("\t-input <arg>\tinput schema");
        System.out.println("\t-help\t\t\thelp menu");
        System.out.println("\t-console\t\t\toutput to stdout");
        System.out.println("\t-output <arg>\toutput to LaTeX PDF");
    }

    public static void printErrorAndExit(String errMsg) {
        System.out.println(errMsg);
        ArgParser.printArgUsage();
        System.exit(1);
    }
}
