//Teresa Tull worked on this on 10-11-2022 ch 11 work
package org.launchcode.Temperature;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double fahrenheit;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        fahrenheit = input.nextDouble();
        input.close();

        Temperature currentTemp = new Temperature();
        currentTemp.setFahrenheit(fahrenheit);
    }
}
