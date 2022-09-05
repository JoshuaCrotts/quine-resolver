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
        System.out.println("usage: quine-resolver.jar -i <input schema> [-hp]");
        System.out.println("\t-i <arg>\tinput schema");
        System.out.println("\t-h\t\thelp menu");
        System.out.println("\t-p\t\toutput to LaTeX PDF");
    }

    public static void printErrorAndExit(String errMsg) {
        System.out.println(errMsg);
        ArgParser.printArgUsage();
        System.exit(1);
    }
}
