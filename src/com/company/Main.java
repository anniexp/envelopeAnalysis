package com.company;

import java.util.Scanner;

import static com.company.Envelope.setEnvelope;

public class Main {

    static void inputValues(Envelope envelope, int number, Scanner scanner) {
        System.out.println("Please type in sizes of envelope " + number + "!");
        System.out.println("Height : ");
        String size1 = scanner.nextLine();
        System.out.println("Width : ");
        String size2 = scanner.nextLine();
        setEnvelope(envelope, number, size1, size2, scanner);
    }

    static void continueProgram(Scanner scanner) {
        System.out.println("Continue with new Envelopes? Type in “y” or “yes” (case insensitive) to continue running the program!");
        String toContinue = scanner.nextLine();
        if (toContinue.equalsIgnoreCase("y") || toContinue.equalsIgnoreCase("yes")) {
            compareEnvelopes(scanner);
        }
    }

    static void compareEnvelopes(Scanner scanner) {
        Envelope e1 = new Envelope();
        inputValues(e1, 1, scanner);

        Envelope e2 = new Envelope();
        inputValues(e2, 2, scanner);

        System.out.println(e1.isFittable(e2));
        continueProgram(scanner);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        compareEnvelopes(scanner);
    }
}
