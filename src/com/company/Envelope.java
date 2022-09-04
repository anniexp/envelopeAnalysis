package com.company;

import java.util.Scanner;

import static com.company.Main.inputValues;

public class Envelope {
    private float height;
    private float width;

    public Envelope() {
        this.height = 0;
        this.width = 0;
    }

    boolean isFittable(Envelope envelope) {
        if (this.height >= envelope.height && this.width >= envelope.width) {
            return true;
        }
        if (this.height >= envelope.width && this.width >= envelope.height) {
            return true;
        }

        return false;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    public void setWidth(float width) {
        this.width = width;
    }

    public static void setEnvelope(Envelope envelope, int number, String size1, String size2, Scanner scanner) {
        try {
            float width = Float.parseFloat(size1);
            float height = Float.parseFloat(size2);

            if (!areNumsPositive(width, height)) {
                System.out.println("Sizes must be >= 0!");
                inputValues(envelope, number, scanner);
            }
            envelope.setHeight(height);
            envelope.setWidth(width);
        } catch (Exception e) {
            System.out.println("Please type in numeric sizes!");
            inputValues(envelope, number, scanner);
        }
    }
    private static boolean areNumsPositive(float size1, float size2) {
        return  !(size1 < 0 || size2 < 0);
    }
}
