package ru.netology.services;

public class FreeTimeService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0;
        int money = 0;

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                money = (money - expenses) / 3;
                count++;
            } else {
                money = (money + income) - expenses;
            }
        }

        return count;
    }
}