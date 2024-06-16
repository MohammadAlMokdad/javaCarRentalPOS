package com.mycompany.car_rental.zouheir;

import com.mycompany.car_rental.client;
import com.mycompany.car_rental.zouheir.Car;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author user
 */
public class FInalDecission extends JFrame {

    public JLabel RPD;
    public JLabel price;
    public JTextField Days;
    public JLabel DOR;
    public JLabel Bill;
    public JLabel counter;
    public JButton jbtsave;
    public JButton jbtback;

    public FInalDecission() {
        setLayout(new GridLayout(5, 2));
        setMaximumSize(new java.awt.Dimension(580, 363));
        setMinimumSize(new java.awt.Dimension(580, 363));

        RPD = new JLabel("The renting price per day is :");
        price = new JLabel();
        JPanel rent = new JPanel(new FlowLayout());
        rent.add(RPD);
        rent.add(price);
        DOR = new JLabel("the days of rent are :");
        Days = new JTextField(3);
        JPanel day = new JPanel(new FlowLayout());
        day.add(DOR);
        day.add(Days);
        Bill = new JLabel();
       // double Billl = ((Double.parseDouble(price.getText())) *( Double.parseDouble(Days.getText())));

     //   Bill.setText(String.valueOf(Billl));
        counter = new JLabel();
        jbtsave = new JButton("Save");
        jbtback = new JButton("Back");
        JPanel days = new JPanel(new FlowLayout());
        days.add(RPD);
        days.add(price);
        JPanel nmbrdays = new JPanel(new FlowLayout());
        nmbrdays.add(DOR);
        nmbrdays.add(Days);
        JPanel bill = new JPanel(new FlowLayout());
        bill.add(Bill);
        bill.add(counter);
        JPanel save = new JPanel(new FlowLayout());
        save.add(jbtsave, FlowLayout.LEFT);
        JPanel cancel = new JPanel(new FlowLayout());
        cancel.add(jbtback, FlowLayout.LEFT);
        add(days);
        add(nmbrdays);
        // add(bill, BorderLayout.CENTER);
        add(save);

    }

    public static void main(String[] args) {
        FInalDecission f = new FInalDecission();
        f.setVisible(true);

    }

    public class save implements ActionListener {

        public static int BMWM2c = 0;
        public static int BMWM3c = 0;
        public static int BMWM4c = 0;
        public static int BMWM5c = 0;
        public static int BMWM7c = 0;
        public static int BMWX1c = 0;
        public static int BMWX2c = 0;
        public static int BMWX5c = 0;
        public static int BMWixc = 0;
        public static int MercedesCLAc = 0;
        public static int MercedesCLEc = 0;
        public static int MercedesCLSc = 0;
        public static int MercedesEQAc = 0;
        public static int MercedesEQGc = 0;
        public static int MercedesEQSc = 0;
        public static int MercedesGLAc = 0;
        public static int MercedesGLBc = 0;
        public static int MercedesGLSc = 0;
        public static int HondaAccordc = 0;
        public static int HondaCRVc = 0;
        public static int HondaCivicSic = 0;
        public static int HondaHRVc = 0;
        public static int HondaOdysseyc = 0;
        public static int HondaPassportc = 0;
        public static int HondaPilotc = 0;
        public static int HondaRidgelinec = 0;
        public static int TypeRc = 0;
        public static int HyundaiElantrac = 0;
        public static int HyundaiIONIQ5c = 0;
        public static int HyundaiIONIQ6c = 0;
        public static int HyundaiKonac = 0;
        public static int HyundaiPalisadec = 0;
        public static int HyundaiSantaFec = 0;
        public static int HyundaiSonatac = 0;
        public static int HyundaiTucsonc = 0;
        public static int HyundaiVenuec = 0;
        public static int Toyota4Runnerc = 0;
        public static int ToyotaCHRc = 0;
        public static int ToyotaCamryc = 0;
        public static int ToyotaCorollac = 0;
        public static int ToyotaCrownc = 0;
        public static int ToyotaGTRc = 0;
        public static int ToyotaMiraic = 0;
        public static int ToyotaPriusc = 0;
        public static int ToyotaRav4c = 0;

        @Override
        public void actionPerformed(ActionEvent e) {
            ArrayList<client> cl;
            ArrayList<Transaction> t;
            Transaction tr = null;

            Scanner in = new Scanner(System.in);
            System.out.println(" Enter the name of the car that you chose");
            String name = in.next();
            System.out.println("enter color of the car  you want to rent");
            String color = in.next();
            System.out.println(" enter the ID and chasis number");
            int Id = in.nextInt();
            int chasisn = in.nextInt();
            System.out.println("enter the discount amount ");
            int Discount = in.nextInt();
            normalCar c = new normalCar(Integer.parseInt(Days.getText()), Discount, name, color, Id, chasisn);
            // ask for the times of max rent 
            System.out.println(" enter the maximum number of renting specific to this car");
            int l = in.nextInt();
            c.maxRent = l;
            counter.setText(String.valueOf("This car was rented "+c.counter+" times."));
            while (c.maxRent < l) {
                c.RRP = (Double.parseDouble(price.getText()));
                if (name.equals("BMWM2")) {
                    BMWM2c++;
                    c.counter = BMWM2c;
                } else if (name.equals("BMWM3")) {
                    BMWM3c++;
                    c.counter = BMWM3c;
                } else if (name.equals("BMWM4")) {
                    BMWM4c++;
                    c.counter = BMWM4c;
                } else if (name.equals("BMWM5")) {
                    BMWM5c++;
                    c.counter = BMWM5c;
                } else if (name.equals("BMWM7")) {
                    BMWM7c++;
                    c.counter = BMWM7c;

                } else if (name.equals("BMWX1")) {
                    BMWX1c++;
                    c.counter = BMWX1c;

                } else if (name.equals("BMWX2")) {
                    BMWX2c++;
                    c.counter = BMWX2c;

                } else if (name.equals("BMWX5")) {
                    BMWX5c++;
                    c.counter = BMWX5c;

                } else if (name.equals("BMWix")) {
                    BMWixc++;
                    c.counter = BMWixc;

                } else if (name.equals("MercedesCLA")) {
                    MercedesCLAc++;
                    c.counter = MercedesCLAc;

                } else if (name.equals("MercedesCLE")) {
                    MercedesCLEc++;
                    c.counter = MercedesCLEc;
                } else if (name.equals("MercedesCLS")) {
                    MercedesCLSc++;
                    c.counter = MercedesCLSc;

                } else if (name.equals("MercedesEQA")) {
                    MercedesEQAc++;
                    c.counter = MercedesEQAc;
                } else if (name.equals("MercedesEQG")) {
                    MercedesEQGc++;
                    c.counter = MercedesEQGc;
                } else if (name.equals("MercedesEQS")) {
                    MercedesEQSc++;
                    c.counter = MercedesEQSc;

                } else if (name.equals("MercedesGLA")) {
                    MercedesGLAc++;
                    c.counter = MercedesGLAc;

                } else if (name.equals("MercedesGLB")) {
                    MercedesGLBc++;
                    c.counter = MercedesGLBc;

                } else if (name.equals("MercedesGLS")) {
                    MercedesGLSc++;
                    c.counter = MercedesGLSc;

                } else if (name.equals(" HondaAccord")) {
                    HondaAccordc++;
                    c.counter = HondaAccordc;

                } else if (name.equals("HondaCRV")) {
                    HondaCRVc++;
                    c.counter = HondaCRVc;

                } else if (name.equals("HondaCivicSi")) {
                    HondaCivicSic++;
                    c.counter = HondaCivicSic;

                } else if (name.equals("HondaHRV")) {
                    HondaHRVc++;
                    c.counter = HondaHRVc;

                } else if (name.equals("HondaOdyssey")) {
                    HondaOdysseyc++;
                    c.counter = HondaOdysseyc;

                } else if (name.equals("HondaPassport")) {
                    HondaPassportc++;
                    c.counter = HondaPassportc;

                } else if (name.equals("HondaPilot")) {
                    HondaPilotc++;
                    c.counter = HondaPilotc;

                } else if (name.equals("HondaRidgeline")) {
                    HondaRidgelinec++;
                    c.counter = HondaRidgelinec;

                } else if (name.equals("TypeR")) {
                    TypeRc++;
                    c.counter = TypeRc;

                } else if (name.equals("HyundaiElantra")) {
                    HyundaiElantrac++;
                    c.counter = HyundaiElantrac;

                } else if (name.equals("HyundaiIONIQ5")) {
                    HyundaiIONIQ5c++;
                    c.counter = HyundaiIONIQ5c;

                } else if (name.equals("HyundaiIONIQ6")) {
                    HyundaiIONIQ6c++;
                    c.counter = HyundaiIONIQ6c;

                } else if (name.equals("HyundaiKona")) {
                    HyundaiKonac++;
                    c.counter = HyundaiKonac;

                } else if (name.equals("HyundaiPalisade")) {
                    HyundaiPalisadec++;
                    c.counter = HyundaiPalisadec;

                } else if (name.equals("HyundaiSantaFe")) {
                    HyundaiSantaFec++;
                    c.counter = MercedesGLSc;

                } else if (name.equals("HyundaiSonata")) {
                    HyundaiSonatac++;
                    c.counter = HyundaiSantaFec;

                } else if (name.equals("HyundaiTucson")) {
                    HyundaiTucsonc++;
                    c.counter = HyundaiTucsonc;

                } else if (name.equals("HyundaiVenue")) {
                    HyundaiVenuec++;
                    c.counter = HyundaiVenuec;

                } else if (name.equals("Toyota4Runner")) {
                    Toyota4Runnerc++;
                    c.counter = Toyota4Runnerc;

                } else if (name.equals("ToyotaCHR")) {
                    ToyotaCHRc++;
                    c.counter = ToyotaCHRc;

                } else if (name.equals("ToyotaCamry")) {
                    ToyotaCamryc++;
                    c.counter = ToyotaCamryc;

                } else if (name.equals("ToyotaCorolla")) {
                    ToyotaCorollac++;
                    c.counter = ToyotaCorollac;

                } else if (name.equals("ToyotaCrown")) {
                    ToyotaCrownc++;
                    c.counter = ToyotaCrownc;

                } else if (name.equals("ToyotaGTR")) {
                    ToyotaGTRc++;
                    c.counter = ToyotaGTRc;

                } else if (name.equals("ToyotaMirai")) {
                    ToyotaMiraic++;
                    c.counter = ToyotaMiraic;

                } else if (name.equals("ToyotaPrius")) {
                    ToyotaPriusc++;
                    c.counter = ToyotaPriusc;

                } else if (name.equals("ToyotaRav4")) {
                    ToyotaRav4c++;
                    c.counter = ToyotaRav4c;

                }
                ArrayList<Car> cars = new ArrayList();
                cars.add(c);

                try {
                    ObjectInputStream innn = new ObjectInputStream(new FileInputStream("clients.dat"));
                    cl = ((ArrayList<client>) (innn.readObject()));
                    innn.close();
                    client f = new client(cl.get(cl.size() - 1).getFname(), cl.get(cl.size() - 1).getLname(), cl.get(cl.size() - 1).getSsn(), cl.get(cl.size() - 1).getPhoneNumber(), cl.get(cl.size() - 1).getAddress(), cl.get(cl.size() - 1).getUsername(), cl.get(cl.size() - 1).getPassword());
                    tr = new Transaction(c, f);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(FInalDecission.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(FInalDecission.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(FInalDecission.class.getName()).log(Level.SEVERE, null, ex);
                }

                try {
                    ObjectInputStream inn = new ObjectInputStream(new FileInputStream("TransactionsDB.dat"));
                    t = ((ArrayList<Transaction>) inn.readObject());
                    inn.close();
                    ObjectInputStream car = new ObjectInputStream(new FileInputStream("Cars.dat"));
                    ArrayList<Car> cr = ((ArrayList<Car>) inn.readObject());
                    car.close();

                    cr.add(c);//------>
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(FInalDecission.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(FInalDecission.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(FInalDecission.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("TransactionsDB.dat"));
                    out.writeObject(tr);
                    out.close();
                    ObjectOutputStream carout = new ObjectOutputStream(new FileOutputStream("Cars.dat"));
                    carout.writeObject(cars);

                } catch (FileNotFoundException ex) {
                    Logger.getLogger(FInalDecission.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(FInalDecission.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }

    }
}
