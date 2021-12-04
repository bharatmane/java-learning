package io.github.bharatmane.banking;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;



public class PrompterTest {

    @Test
    @DisplayName("should prompt welcome message")
    void shouldPromptWelcomeMessage(){
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        String expectedGreetMessage = "Welcome to Great Learning Banking Services!";
        //Given
        Prompter prompter = new Prompter(printStream);
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
        String expectedLoginString = "1. Login";
        String expectedExitString = "1. Login";
        //Given
        Prompter prompter = new Prompter(printStream);
        //When
        prompter.promptLogin();

        //Then
        assertThat(outputStream.toString()).contains(expectedLoginString);
        assertThat(outputStream.toString()).contains(expectedExitString);
    }
}
