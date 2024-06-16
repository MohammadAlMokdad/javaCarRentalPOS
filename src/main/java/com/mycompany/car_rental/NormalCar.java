package com.mycompany.car_rental;

class NormalCar extends Car {

    private int maxDurationRent;
    private double discount;

    public NormalCar(String name, String color, int id, int chassisNumber, int maxDurationRent, double discount) {
        super(name, color, id, chassisNumber);
        this.maxDurationRent = maxDurationRent;
        this.discount = discount;
    }

    @Override
    public double calculatePrice() {
        return getRegularRentingPrice() * (1 - getNumberOfTimesRented()) * (1 - discount / 100);
    }
}
