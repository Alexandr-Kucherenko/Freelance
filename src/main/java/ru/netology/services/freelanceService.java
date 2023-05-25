package ru.netology.services;

public class freelanceService {

    public int calculate(int income, int expenses, int threshold) {
        int balance = 0;
        int monthOfVacantion = 0;

        for (int i = 0; i < 12; i++) {
            if (balance >= threshold) {
                monthOfVacantion++;
                balance = (balance - expenses) / 3;
            } else {
                balance = balance + income - expenses;

            }
        }
        return monthOfVacantion;
    }

}



