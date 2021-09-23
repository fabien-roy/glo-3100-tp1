package ca.ulaval.glo3100;

import ca.ulaval.glo3100.console.Logger;

public class Main {

    private static final String ARG_FRIEDMAN = "friedman";
    private static final String ARG_DECRYPT = "decrypt";

    public static void main(String[] args) {
        if (argsAreInvalid(args)) {
            displayHelpText();
            return;
        }

        if (args[0].equals(ARG_FRIEDMAN)) {
            // TODO : DO Ex1 a
            Logger.log("Ex1 a : Friedman!");
        } else if (args[0].equals(ARG_DECRYPT)) {
            // TODO : DO Ex2 a
            Logger.log("Ex2 a : Decrypt!");
        } else {
            displayHelpText();
        }
    }

    private static boolean argsAreInvalid(String[] args) {
        return args == null || args.length == 0 ||  args[0] == null;
    }

    private static void displayHelpText() {
        Logger.log("You need to enter one of the following args :");
        Logger.log(String.format("  %s : Exercise 1.a : Calculate key size using Friedman test", ARG_FRIEDMAN));
        Logger.log(String.format("  %s : Exercise 1.b : Decrypt ciphertext", ARG_DECRYPT));
    }
}
