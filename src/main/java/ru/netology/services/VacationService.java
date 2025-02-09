package ru.netology.services;

public class VacationService {
    public int calculate(int income, int expenses, int threshold) {
        int restMonths = 0;
        int money = 0;
        for (int month = 1; month < 12; month++) {
            if (money >= threshold) {
                money -= expenses;
                money /= 3;
                restMonths++;
            } else {
                money += income - expenses;
            }
        }
        return restMonths;
    }
}
