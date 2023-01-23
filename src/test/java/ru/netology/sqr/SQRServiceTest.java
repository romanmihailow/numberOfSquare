package ru.netology.sqr;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {
    @ParameterizedTest
//    @CsvSource({
//            "200,300,3",
//            "200,400,5"
//    })
    @CsvFileSource(files="src/test/resources/SQRService.csv") //  ** получение тестовых данных из csv файла **
    public void testParam(int boundMin, int boundMax, int expected) {
        SQRService service = new SQRService();
        int actual = service.calculate(boundMin, boundMax);
        assertEquals(expected, actual);

    }

//    @org.junit.jupiter.api.Test
//    public void shouldSQR2003003() {
//        SQRService service = new SQRService();
//
//        // подготавливаем данные:
//        int boundMin = 200; //
//        int boundMax = 300;
//        int expected = 3;
//
//        // вызываем целевой метод:
//        int actual = service.calculate(boundMin, boundMax);
//
//        // производим проверку (сравниваем ожидаемый и фактический):
//        assertEquals(expected, actual);
//    }
//    @org.junit.jupiter.api.Test
//    public void shouldSQR2004005() {
//        SQRService service = new SQRService();
//
//        // подготавливаем данные:
//        int boundMin = 200; //
//        int boundMax = 400;
//        int expected = 5;
//
//        // вызываем целевой метод:
//        int actual = service.calculate(boundMin, boundMax);
//
//        // производим проверку (сравниваем ожидаемый и фактический):
//        assertEquals(expected, actual);
//    }
//    @org.junit.jupiter.api.Test
//    public void shouldSQR2005008() {
//        SQRService service = new SQRService();
//
//        // подготавливаем данные:
//        int boundMin = 200; //
//        int boundMax = 500;
//        int expected = 8;
//
//        // вызываем целевой метод:
//        int actual = service.calculate(boundMin, boundMax);
//
//        // производим проверку (сравниваем ожидаемый и фактический):
//        assertEquals(expected, actual);
//    }
//    @org.junit.jupiter.api.Test
//    public void shouldSQR10050013() {
//        SQRService service = new SQRService();
//
//        // подготавливаем данные:
//        int boundMin = 100; //
//        int boundMax = 500;
//        int expected = 13;
//
//        // вызываем целевой метод:
//        int actual = service.calculate(boundMin, boundMax);
//
//        // производим проверку (сравниваем ожидаемый и фактический):
//        assertEquals(expected, actual);
//    }





}


