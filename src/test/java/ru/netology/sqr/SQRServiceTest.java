package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void belowLoverLimit() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.calculateSqrOfNumber(399,500);

        assertEquals(expected, actual);
    }

    @Test
    void limit() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.calculateSqrOfNumber(400,500);
        assertEquals(expected, actual);
    }

    @Test
    void overLoverLimit() {
        SQRService service = new SQRService();
        int expected = 2;
        int actual = service.calculateSqrOfNumber(401, 500);
        assertEquals(expected, actual);
    }

    @Test
    void belowUpperLimit() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.calculateSqrOfNumber(400, 499);
        assertEquals(expected, actual);
    }

    @Test
    void overUpperLimit() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.calculateSqrOfNumber(400, 501);
        assertEquals(expected, actual);
    }
}
