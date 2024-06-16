package com.mycompany.car_rental;

import java.util.ArrayList;
import java.util.Date;

class Car implements Comparable<Car> {

    private String name;
    private String color;
    private int id;
    private int chassisNumber;
    private boolean available;
    private double regularRentingPrice;
    private int numberOfTimesRented;
    private int maxAllowedRenting;
    private Date dateOfOwnership;
    private ArrayList<Transaction> transactions;

    public Car(String name, String color, int id, int chassisNumber) {
        this.name = name;
        this.color = color;
        this.id = id;
        this.chassisNumber = chassisNumber;
        this.available = true;
        this.regularRentingPrice = 0.0;
        this.numberOfTimesRented = 0;
        this.maxAllowedRenting = 0;
        this.dateOfOwnership = new Date();
        this.transactions = new ArrayList<>();
    }

    public double getRegularRentingPrice() {
        return regularRentingPrice;
    }

    public int getNumberOfTimesRented() {
        return numberOfTimesRented;
    }

    public void rentCar() {
        if (available) {
            available = false;
            numberOfTimesRented++;
        } else {
            System.out.println("The car is already rented.");
        }
    }

    public void returnCar() {
        if (!available) {
            available = true;
        } else {
            System.out.println("This car is not rented, then you cannot return it.");
        }
    }

    public double calculatePrice() {
        return 0.0;
    }

    public void printTransactions() {
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }

    @Override
    public String toString() {
        return "Car{" + "name=" + name + ", color=" + color + ", id=" + id + ", chassisNumber=" + chassisNumber + ", available=" + available + ", regularRentingPrice=" + regularRentingPrice + ", numberOfTimesRented=" + numberOfTimesRented + ", maxAllowedRenting=" + maxAllowedRenting + ", dateOfOwnership=" + dateOfOwnership + ", transactions=" + transactions + '}';
    }

    @Override
    public int compareTo(Car o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
