package ru.netology.sqr;

public class SQRService {
    public int calculateSqrOfNumber(int lowerLimit, int upperLimit) {
        int numberOccurrence = 0;
        for (int i = 10; i <= 99; i++) {
            if (lowerLimit <= i * i && i * i <= upperLimit) {
                System.out.print("число= " + i + ", квадрат числа = " + i * i+ "\n");
                numberOccurrence++;
            }
        }
        return numberOccurrence;
    }
}

