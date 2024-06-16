/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.car_rental.zouheir;

/**
 *
 * @author user
 */
public class Bus extends Car {
 public int cappacity ;

    public Bus(int cappacity, String name, String color, int Id, int ChasisNmber) {
        super(name, color, Id, ChasisNmber);
        this.cappacity = cappacity;
    }
 
 @Override
      public double calculate_Price(){
 
return (this.RRP)*(1-(this.cappacity/30));}

}