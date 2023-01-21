package ru.netology.sqr;


import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {

    @org.junit.jupiter.api.Test
    public void shouldSQR2003003() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        int boundMin = 200; //
        int boundMax = 300;
        int expected = 3;

        // вызываем целевой метод:
        int actual = service.calculate(boundMin, boundMax);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    public void shouldSQR2004005() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        int boundMin = 200; //
        int boundMax = 400;
        int expected = 5;

        // вызываем целевой метод:
        int actual = service.calculate(boundMin, boundMax);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    public void shouldSQR2005008() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        int boundMin = 200; //
        int boundMax = 500;
        int expected = 8;

        // вызываем целевой метод:
        int actual = service.calculate(boundMin, boundMax);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    public void shouldSQR10050013() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        int boundMin = 100; //
        int boundMax = 500;
        int expected = 13;

        // вызываем целевой метод:
        int actual = service.calculate(boundMin, boundMax);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }





}
