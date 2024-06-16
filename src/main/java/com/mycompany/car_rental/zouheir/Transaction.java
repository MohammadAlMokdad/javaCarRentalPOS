package com.mycompany.car_rental.zouheir;

import com.mycompany.car_rental.client;
import com.mycompany.car_rental.zouheir.Car;
import java.util.Date;

public class Transaction implements Comparable {

    public static int trans_num = 1;
    public Car rentedCar;
    public Date Trans_date;
    public client c;
    double price;

    public Transaction(Car rentedCar, client c) {
        this.rentedCar = rentedCar;
        this.c = c;
        this.price = rentedCar.calculate_Price();
        trans_num = trans_num++;
        Trans_date = new Date();

    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {

        return " This car is rented to " + c.fname + c.lname + " and has the ID of " + this.rentedCar.Id + " and ID of transaction of" + trans_num;
    }

    @Override
    public int compareTo(Object o) {
        if (this.Trans_date.before(((Transaction) o).Trans_date)) {
            return 1;
        } else if (this.Trans_date.after(((Transaction) o).Trans_date)) {
            return -1;
        }
        return 0;
    }

}
