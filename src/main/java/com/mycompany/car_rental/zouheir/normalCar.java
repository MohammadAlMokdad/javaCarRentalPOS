package com.mycompany.car_rental.zouheir;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class normalCar extends Car {
   public int maxDuration;
    public int Discount  ;

    public normalCar(int maxDuration, int Discount, String name, String color, int Id, int ChasisNmber) {
        super(name, color, Id, ChasisNmber);
        this.maxDuration = maxDuration;
        this.Discount = Discount;
    }
    
   @Override
       public double calculate_Price(){

     return (1-this.counter)*(1-(this.Discount/100));  }
    
}
