package ru.netology.sqr;

public class SQRService {
    public int calculate(int boundMin, int boundMax) {
        int count = 0;

        for (int i = 10; i <= 90; i = i + 1) {
            if (i*i >= boundMin) {
                if (i * i < boundMax) {
                    count = count + 1;
                    System.out.println(i);
                }

            }
        }
        return count;

    }


}
