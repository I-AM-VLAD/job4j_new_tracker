package ru.job4j.tracker.input;

import java.util.Scanner;

import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.output.*;

public class ConsoleInput implements Input {
    private Scanner scanner = new Scanner(System.in);
    private final Output output;

    public ConsoleInput(Output output) {
        this.output = output;
    }

    @Override
    public String askStr(String question) {
        output.println(question);
        return scanner.nextLine();
    }

    @Override
    public int askInt(String question) {
        return Integer.parseInt(askStr(question));
    }
}
