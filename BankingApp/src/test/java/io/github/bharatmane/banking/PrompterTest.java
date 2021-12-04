package io.github.bharatmane.banking;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;



public class PrompterTest {

    @Test
    @DisplayName("should prompt welcome message")
    void shouldPromptWelcomeMessage(){
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        String expectedGreetMessage = "Welcome to Great Learning Banking Services!";
        Scanner scanner = new Scanner(System.in);

        //Given

        Prompter prompter = new Prompter(printStream, scanner);
        //When
        prompter.greetUser();

        //Then
        assertThat(outputStream.toString()).contains(expectedGreetMessage);
    }

    @Test
    @DisplayName("should prompt login options")
    void shouldPromptLoginOptions(){
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        Scanner scanner = new Scanner(System.in);
        String expectedLoginString = "1. Login";
        String expectedExitString = "2. Exit";
        //Given
        Prompter prompter = new Prompter(printStream, scanner);
        //When
        prompter.promptLogin();

        //Then
        assertThat(outputStream.toString()).contains(expectedLoginString);
        assertThat(outputStream.toString()).contains(expectedExitString);
    }

    @Test
    @DisplayName("should login when chosen as option 1")
    void shouldLoginWhenChosenOption1(){
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        Scanner scanner = new Scanner("1");

        //Given
        Prompter prompter = new Prompter(printStream,scanner);
        //When
        prompter.promptLogin();
        prompter.login();

        //Then
        assertThat(prompter.currentOption()).isEqualTo("1");
    }

    @Test
    @DisplayName("should ask login credentials for option 1")
    void shouldAskLoginCredentialsWhenChosenOption1(){
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        Scanner scanner = new Scanner("1\njack");

        //Given
        Prompter prompter = new Prompter(printStream,scanner);
        //When
        prompter.promptLogin();
        prompter.login();

        //Then
        assertThat(outputStream.toString()).contains("Please Enter User Name");
    }

}
