package com.mycompany.car_rental;

import java.util.Date;

class Transaction {

    private static int transactionCounter = 0;
    private int transactionNumber;
    private Car rentedCar;
    private client c;
    private Date transactionDate;
    private double rentingPrice;

    public Transaction(Car rentedCar, client c, Date transactionDate) {
        this.transactionNumber = ++transactionCounter;
        this.rentedCar = rentedCar;
        this.c = c;
        this.transactionDate = transactionDate;
        this.rentingPrice = rentedCar.calculatePrice();
    }

    @Override
    public String toString() {
        return "Transaction{" + "transactionNumber=" + transactionNumber + ", rentedCar=" + rentedCar + ", c=" + c + ", transactionDate=" + transactionDate + ", rentingPrice=" + rentingPrice + '}';
    }

}
