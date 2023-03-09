package com.clanki.ui;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/*
    Parts of the code below are copied and adapted from TextUi.java of addressbook-level2,
    link of original code:
    https://github.com/se-edu/addressbook-level2/blob/master/src/seedu/addressbook/ui/TextUi.java.
 */
public class Ui {
    private final Scanner in;
    private final PrintStream out;

    public Ui() {
        this(System.in, System.out);
    }

    public Ui(InputStream in, PrintStream out) {
        this.in = new Scanner(in);
        this.out = out;
    }

    /**
     * Prompts for the command and reads the text entered by the user. Ignores
     * empty, pure whitespace, and comment lines. Echos the command back to the
     * user.
     * 
     * @return command (full line) entered by the user
     */
    public String getUserCommand() {
        return in.nextLine();
    }

    public void printSuccessfulAddMessage(String questionText, String answerText) {
        System.out.println("A new card is now added:" + System.lineSeparator() + "Question: "
                + questionText + System.lineSeparator() + "Answer: " + answerText);
    }

    public void printInvalidInput() {
        System.out.println("The input is in an incorrect format.");
    }
}