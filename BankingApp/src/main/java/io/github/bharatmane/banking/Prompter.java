package io.github.bharatmane.banking;

import java.io.PrintStream;
import java.util.Scanner;


public class Prompter {
    private final PrintStream stdOut;
    private Scanner scanner = new Scanner(System.in);
    private String option;
    public Prompter(PrintStream stdOut) {
        this.stdOut = stdOut;
    }

    public void greetUser() {
        print("Welcome to Great Learning Banking Services!");
    }

    private void print(String message) {
        stdOut.println(message);
    }

    private void prompt(String message) {
        stdOut.println("> ");
        option = scanner.nextLine();

    }

    public void promptLogin() {
        print("Choose Option");
        print("1. Login");
        print("2. Exit");
    }
}
