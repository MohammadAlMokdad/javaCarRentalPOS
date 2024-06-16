package com.mycompany.car_rental;

import java.util.ArrayList;

public class CarInventory {

    Car mercedes1 = new Car("Mercedes A-Class", "Black", 1, 12345);
    Car mercedes2 = new Car("Mercedes E-Class", "Silver", 2, 67890);

    Car bmw1 = new Car("BMW 3 Series", "White", 3, 54321);
    Car bmw2 = new Car("BMW 5 Series", "Blue", 4, 98765);

    Car toyota1 = new Car("Toyota Corolla", "Red", 5, 13579);
    Car toyota2 = new Car("Toyota Camry", "Gray", 6, 24680);

    Car nissan1 = new Car("Nissan Sentra", "Green", 7, 76543);

    Car hyundai1 = new Car("Hyundai Sonata", "Silver", 8, 87654);

    Car honda1 = new Car("Honda Civic", "Black", 9, 98765);
    Car honda2 = new Car("Honda Accord", "Blue", 10, 43210);
    Car honda3 = new Car("Honda CR-V", "White", 11, 56789);

    private ArrayList<Car> availableCars = new ArrayList<>();

    public CarInventory() {
        availableCars = new ArrayList<>();
    }

    public void addCar(Car car) {
        availableCars.add(car);
    }

    public void removeCar(Car car) {
        availableCars.remove(car);
    }

    public ArrayList<Car> getAvailableCars() {
        return availableCars;
    }
}
