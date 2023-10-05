package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        int bobSalary = 30_000;
        int garySalary = 25_000;
        int highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is" + highestSalary);


        int carPrice = 30_000;
        int truckPrice = 60_000;
        int lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The lowest price is" + lowestPrice);

        double radius = 7.25;
        double area = Math.PI * Math.pow(radius,2);
        System.out.println("The area of a circle with a radius of" + radius + "is" + area);
    }


}
