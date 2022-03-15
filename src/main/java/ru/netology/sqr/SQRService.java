package ru.netology.sqr;

public class SQRService {

    public int sqrtErect(int num1, int num2) {
        int count = 0;
        for (int i = 10; i < 99; i++) {
            if (num1 <= i * i && i * i <= num2) {
                count = count + 1;
            }
        }
        System.out.println("В грацицу попало " + count + " чисел");
        return count;
    }
}
