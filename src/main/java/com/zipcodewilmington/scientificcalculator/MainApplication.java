package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;

import sun.util.calendar.CalendarUtils;

public class MainApplication {
    public static void main(String[] args) {
        /*//This allows us to use all methods from the 'Calculator.java' class.

        System.out.println("Please choose 'basic' or 'scientific' calculator: ");
        //the method below calls the 'getInputFromUser' method on the 'calc' object created on line 9.
        Double input = calc.getInputFromUser();
        //the below line calls the 'checkBasicsOrScience' method and stores the user input as 'newInput'
        //because of the parameter that exists in the method.
        calc.checkBasicOrScience(input);*/
        boolean t = true;
        while (t) {

            Calculator calc = new Calculator();
            User user = new User(0.);
            ScientificFunctions func = new ScientificFunctions();


            int y = 2;
            do {
                try {
                    System.out.println("Please choose either '1' for 'Basic' or '2' for 'Scientific' calculator");
                    Double choice = calc.getInputFromUser();

                    if (choice.equals(1.)) {
                        System.out.println("Please choose an option from the below Menu by selecting " +
                                "it's corresponding number;\n" +
                                "1) Addition\n" +
                                "2) Subtraction\n" +
                                "3) Multiplication\n" +
                                "4) Divide \n");


                        y = 1;
                    } else if (choice.equals(2.)) {
                        System.out.println("Please choose an option from the below Menu;\n" +
                                "1) Addition\n" +
                                "2) Subtraction\n" +
                                "3) Multiplication\n" +
                                "4) Divide \n" +
                                "5) degree\n" +
                                "6) natural log\n" +
                                "7) base log\n" +
                                "8) inverse log\n" +
                                "9) square root\n" +
                                "10) inverse\n" +
                                "11) square\n" +
                                "12) exponent\n" +
                                "13) change sign\n" +
                                "14) sine\n" +
                                "15) cos\n" +
                                "16) tan\n" +
                                "17) inverseCosine\n" +ADD.Hexadecimal(calc.getAns().intValue()));
                    }
                    else if (temp.equals(2.)) {
                        System.out.println("Your Octal answer for " + calc.getAns() + " is "
                                + ScientificFunctions.Octal(calc.getAns().intValue()));
                    }
                    else if (temp.equals(3.)) {
                        System.out.println("Your Binary answer for " + calc.getAns() + " is "
                                + ScientificFunctions.Binary(calc.getAns().intValue()));
                    } else {

                    } q++;
                } catch (Exception e) {
                    System.out.println("Sorry, bad input. Please enter a valid choice(number): ");
                }
            } while (q == 2);
        }
    }
}