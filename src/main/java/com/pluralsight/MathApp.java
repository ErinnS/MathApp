package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        int bobSalary = 30_000;
        int garySalary = 25_000;
        int highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is" + highestSalary);


        int carPrice = 30_000;
        int truckPrice = 60_000;
        int highestPrice = Math.max(carPrice, truckPrice);
        System.out.println("The highest price is" + highestPrice);

        float areaofcirle = (float) 7.25f;
    }


}
