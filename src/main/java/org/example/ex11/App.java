/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex11;

import java.util.Scanner;

public class App {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        App mainApp = new App();

        double numberEuros = mainApp.getEuros();
        double exchangeRate = mainApp.getExchangeRate();

        String outputString = genOutputString(numberEuros, exchangeRate);
        System.out.println(outputString);
    }

    public Double getEuros()
    {
        System.out.println("How many Euros are you exchanging?");

        // Read and return an integer.
        return in.nextDouble();
    }

    public Double getExchangeRate()
    {
        System.out.println("What is the exchange rate?");

        // Read and return an integer.
        return in.nextDouble();
    }

    public Double getNumSlices()
    {
        System.out.println("How many slices per pizza?");

        // Read and return an integer.
        return in.nextDouble();
    }

    public static String genOutputString(double numberEuros, double exchangeRate)
    {
        return String.format("%.2f Euros at an exchange rate of %f is\n%.2f U.S. dollars.", numberEuros, exchangeRate, Math.ceil((numberEuros/exchangeRate)*100)/100);
    }
}
