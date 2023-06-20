package com.company;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
       // Vehicle[] v;
        //v= new Vehicle[5];

        //ArrayList<Vehicle> v= new ArrayList<Vehicle>();
        /*
        Slot[] slot=new Slot[5];
        for (int i=0;i<5;i++)
        {
            Scanner input= new Scanner(System.in);
            int availability= input.nextInt();

            //slot.add(i);


        }

         */
        boolean t= true;
        while(t)
        {
            System.out.println("1. park in ");
            System.out.println("2. park out");
            System.out.println("3. Exit ");

            Scanner input= new Scanner(System.in);
            int check= input.nextInt();
            garage g;
            switch (check)
            {
                case 1: {
                    System.out.println("enter vehicle");

                    int id = input.nextInt();
                    String mN = input.next();
                    int mY = input.nextInt();
                    int d = input.nextInt();
                    int w = input.nextInt();
                    Instant start = Instant.now();
                    Vehicle v=new Vehicle( id, mN, mY, start, d ,  w);

                    ParkingIn pi = new ParkingIn();
                    ParkMethod pm = new Firstfit();
                    pi.setPmethod(pm);
                }
                case 2:{
                    ParkOut po =new ParkOut();
                    Instant end = Instant.now();
                    po.setEndTime(end);
                }
                case 3:{
                    t=false;
                    System.exit(0);
                }

            }
        }
    }
}
