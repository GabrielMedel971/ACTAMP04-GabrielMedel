package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
	// write your code here
        Random random = new Random();
        Scanner teclat = new Scanner(System.in);
        double suma = 0;
        double cont;
        double mig = 0.5;
        int num = 0;
        System.out.println("quant vols apostar?");
        double aposta = teclat.nextDouble();
        String continuar = "no";


        while (num==0) {

            int rand = random.nextInt(10) + 1;

            System.out.println("vols continuar? si o no");
            continuar = teclat.next();


            switch (rand) {
                case 1 -> {
                    System.out.println("te ha tocat el numero " + rand);
                    cont = suma + 1;
                }

                case 2 -> {
                    System.out.println("te ha tocat el numero " + rand);
                    cont = suma + 2;

                }

                case 3 -> {
                    System.out.println("te ha tocat el numero " + rand);
                    cont = suma + 3;

                }

                case 4 -> {
                    System.out.println("te ha tocat el numero " + rand);
                    cont = suma + 4;

                }

                case 5 -> {
                    System.out.println("te ha tocat el numero " + rand);
                    cont = suma + 5;

                }

                case 6 -> {
                    System.out.println("te ha tocat el numero " + rand);
                    cont = suma + 6;

                }

                case 7 -> {
                    System.out.println("te ha tocat el numero " + rand);
                    cont = suma + 7;

                }

                case 8 -> {
                    System.out.println("te ha tocat la carta sota");
                    cont = suma + mig;

                }

                case 9 -> {
                    System.out.println("te ha tocat la carta cavall");
                    cont = suma + mig;

                }

                case 10 -> {
                    System.out.println("te ha tocat la carta rei");
                    cont = suma + mig;

                }

                default -> throw new IllegalStateException("Unexpected value: " + rand);
            }

            suma = cont;
            System.out.println("el teu valor de cartas es: "+suma);

            if (suma>7.5){
                continuar = "perdut";
                num = num +1;
            }
            if (suma==7.5){
                continuar = "guanyat";
                num = num +1;
            }

            if (continuar.contentEquals("no")){
                continuar = "no";
                num = num +1;
            }



        }

        if (continuar.contentEquals("guanyat")){
            System.out.println("Has guanyat!!");
            System.out.println("et quedes amb " + (aposta*2) +" euros");
        }

        if (continuar.contentEquals("perdut")){
            System.out.println("Has perdut!!");
            System.out.println("et quedes amb " + 0 +" euros");
        }

        if (continuar.contentEquals("no")){
            System.out.println("El jugador es planta");
            System.out.println("et quedes amb " + aposta +" euros");
        }

    }
}
