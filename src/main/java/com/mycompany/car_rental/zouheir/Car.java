package com.mycompany.car_rental.zouheir;


import java.util.ArrayList;
import java.util.Date;


public class Car  {

    public String name;
    public String color;
    public int Id;
    public int maxRent;
    public int counter;
    public int ChasisNmber;
    public boolean status;
    public double  RRP;
    public static int NOR =0;   // number of cars rented in the agency 
    public Date DateOfRent;
    ArrayList<Transaction>transactions;

    public Car(String name, String color, int Id, int ChasisNmber) {
        this.name = name;
        this.color = color;
        this.Id = Id;
        this.ChasisNmber = ChasisNmber;
        this.DateOfRent= new Date();
        transactions= new ArrayList();
        
    }
    public void rent_car(){
        if(this.status==true){
            this.status=false;
        return ;}
        System.out.println(" the car is already rented ");
    }
    public void return_car(){
        if(this.status==false){
            this.status=true;
        return ;}
        System.out.println(" the car is not rented, You cannot return it  ");
    }
    
    public double calculate_Price(){
        
   return this.RRP; }

    public void printTransactions(){
        for (int i = 0; i < this.transactions.size(); i++) {
            System.out.println(transactions.get(i));
            
        }
    }

    @Override
    public String toString() {
        return "Car{" + "name=" + name + ", color=" + color + ", Id=" + Id + ", counter=" + counter + ", ChasisNmber=" + ChasisNmber + ", status=" + status + ", RRP=" + RRP + ", DateOfRent=" + DateOfRent + '}';
    }
    public void displayTransaction(Date d1, Date d2){
           for (int i = 0; i < this.transactions.size(); i++) {
      if((transactions.get(i)).Trans_date.before(d2)&&(transactions.get(i)).Trans_date.after(d1))
                   System.out.println(transactions.get(i));
    }
}

   
    
}