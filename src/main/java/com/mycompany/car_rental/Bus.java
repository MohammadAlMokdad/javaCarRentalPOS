package com.mycompany.car_rental;

class Bus extends Car {

    private int capacity;

    public Bus(String name, String color, int id, int chassisNumber, int capacity) {
        super(name, color, id, chassisNumber);
        this.capacity = capacity;
    }

    @Override
    public double calculatePrice() {
        return getRegularRentingPrice() * (1 - capacity / 30);
    }
}
