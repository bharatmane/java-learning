package io.github.bharatmane.banking;

import java.io.PrintStream;
import java.util.Scanner;


public class Prompter {
    private final PrintStream stdOut;
    private Scanner scanner;
    private String option;
    public Prompter(PrintStream stdOut, Scanner scanner) {
        this.stdOut = stdOut;
        this.scanner = scanner;
    }

    public void greetUser() {
        print("Welcome to Great Learning Banking Services!");
    }

    private void print(String message) {
        stdOut.println(message);
    }

    private void prompt() {
        stdOut.println("> ");
        option = scanner.nextLine();
    }

    public void promptLogin() {
        print("Choose Option");
        print("1. Login");
        print("2. Exit");
    }

    public void login() {
        prompt();
        if(option.equals("1")){
            promptCredentials();
        }

    }

    private void promptCredentials() {
        print("Please Enter User Name");
        prompt();
    }

    public String currentOption() {
        return option;
    }
}
