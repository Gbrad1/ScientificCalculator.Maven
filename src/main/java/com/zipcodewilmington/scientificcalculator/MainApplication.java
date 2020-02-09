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
                                "17) inverseCosine\n" +
                                "18) inverseTangent\n" +
                                "19) radian\n" +
                                "20) factorial\n" +
                                "21) fibonacci\n");

                        y = 1;
                    } else {
                        System.out.println("Invalid input");
                    }
                } catch (Exception e) {
                    System.out.println("Sorry bad input");
                }
            } while (y == 2);

//This is to error handle 1-4 ===============
/*            int test = 2;
            do {
                try {
                    Double operator = calc.getInputFromUser();
                    test = 1;
                } catch (Exception e) {
                    System.out.println("Sorry, bad input");
                }
            } while (test == 2);*/

// end process ===================================
            int test = 2;
            do {
                try {
                    Double operator = calc.getInputFromUser();

                    if (operator.equals(1.)) {
                        int x = 2;
                        do {
                            try {
                                System.out.println("Enter your first number");
                                Double firstNum = calc.getInputFromUser();
                                calc.setFirstInput(firstNum);
                                System.out.println("Enter your Second Number");
                                Double secondNum = calc.getInputFromUser();
                                calc.setSecondOptionInput(secondNum);
                                x = 1;
                            } catch (Exception e) {
                                System.out.println("Sorry, bad input");
                            }
                        } while (x == 2);
                        Double ans = ScientificFunctions.add(calc.getFirstNumber(), calc.getSecondNumber());
                        calc.setAns(ans);
                    } else if (operator.equals(2.)) {
                        int x = 2;
                        do {
                            try {
                                System.out.println("Enter your first number");
                                Double firstNum = calc.getInputFromUser();
                                calc.setFirstInput(firstNum);
                                System.out.println("Enter your Second Number");
                                Double secondNum = calc.getInputFromUser();
                                calc.setSecondOptionInput(secondNum);
                                x = 1;
                            } catch (Exception e) {
                                System.out.println("Sorry, bad input");
                            }
                        } while (x == 2);
                        Double ans = ScientificFunctions.subtract(calc.getFirstNumber(), calc.getSecondNumber());
                        calc.setAns(ans);
                    } else if (operator.equals(3.)) {
                        int x = 2;
                        do {
                            try {
                                System.out.println("Enter your first number");
                                Double firstNum = calc.getInputFromUser();
                                calc.setFirstInput(firstNum);
                                System.out.println("Enter your Second Number");
                                Double secondNum = calc.getInputFromUser();
                                calc.setSecondOptionInput(secondNum);
                                x = 1;
                            } catch (Exception e) {
                                System.out.println("Sorry, bad input");
                            }
                        } while (x == 2);
                        Double ans = ScientificFunctions.multiply(calc.getFirstNumber(), calc.getSecondNumber());
                        calc.setAns(ans);
                    } else if (operator.equals(4.)) {
                        int x = 2;
                        do {
                            try {
                                System.out.println("Enter your first number");
                                Double firstNum = calc.getInputFromUser();
                                calc.setFirstInput(firstNum);
                                System.out.println("Enter your Second Number");
                                Double secondNum = calc.getInputFromUser();
                                if (secondNum.equals(0.)) {
                                    System.out.println("Err");
                                } else {
                                    calc.setSecondOptionInput(secondNum);
                                    x = 1;
                                }
                            } catch (Exception e) {
                                System.out.println("Sorry, bad input");
                            }
                        } while (x == 2);
                        Double ans = ScientificFunctions.divide(calc.getFirstNumber(), calc.getSecondNumber());
                        calc.setAns(ans);

//--------------------------Basic---------------------------------------------

                    }
                    if (operator.equals(5.)) {
                        int x = 2;
                        do {
                            try {
                                System.out.println("Enter your number");
                                Double firstNum = calc.getInputFromUser();
                                calc.setFirstInput(firstNum);
                                x = 1;
                            } catch (Exception e) {
                                System.out.println("Sorry, bad input");
                            }
                        } while (x == 2);
                        Double ans = ScientificFunctions.degree(calc.getFirstNumber());
                        calc.setAns(ans);
                    } else if (operator.equals(6.)) {
                        int x = 2;
                        do {
                            try {
                                System.out.println("Enter your number");
                                Double firstNum = calc.getInputFromUser();
                                calc.setFirstInput(firstNum);
                                x = 1;
                            } catch (Exception e) {
                                System.out.println("Sorry, bad input");
                            }
                        } while (x == 2);
                        Double ans = ScientificFunctions.naturalLog(calc.getFirstNumber());
                        calc.setAns(ans);
                    } else if (operator.equals(7.)) {
                        int x = 2;
                        do {
                            try {
                                System.out.println("Enter your number");
                                Double firstNum = calc.getInputFromUser();
                                calc.setFirstInput(firstNum);
                                x = 1;
                            } catch (Exception e) {
                                System.out.println("Sorry, bad input");
                            }
                        } while (x == 2);
                        Double ans = ScientificFunctions.baseLog(calc.getFirstNumber());
                        calc.setAns(ans);
                    } else if (operator.equals(8.)) {
                        int x = 2;
                        do {
                            try {
                                System.out.println("Enter your number");
                                Double firstNum = calc.getInputFromUser();
                                calc.setFirstInput(firstNum);
                                x = 1;
                            } catch (Exception e) {
                                System.out.println("Sorry, bad input");
                            }
                        } while (x == 2);
                        Double ans = ScientificFunctions.inverseLog(calc.getFirstNumber());
                        calc.setAns(ans);
                    } else if (operator.equals(9.)) {
                        int x = 2;
                        do {
                            try {
                                System.out.println("Enter your number");
                                Double firstNum = calc.getInputFromUser();
                                calc.setFirstInput(firstNum);
                                x = 1;
                            } catch (Exception e) {
                                System.out.println("Sorry, bad input");
                            }
                        } while (x == 2);
                        Double ans = ScientificFunctions.squareRoot(calc.getFirstNumber());
                        calc.setAns(ans);
                    } else if (operator.equals(10.)) {
                        int x = 2;
                        do {
                            try {
                                System.out.println("Enter your number");
                                Double firstNum = calc.getInputFromUser();
                                calc.setFirstInput(firstNum);
                                x = 1;
                            } catch (Exception e) {
                                System.out.println("Sorry, bad input");
                            }
                        } while (x == 2);
                        Double ans = ScientificFunctions.inverse(calc.getFirstNumber());
                        calc.setAns(ans);
                    } else if (operator.equals(11.)) {
                        int x = 2;
                        do {
                            try {
                                System.out.println("Enter your number");
                                Double firstNum = calc.getInputFromUser();
                                calc.setFirstInput(firstNum);
                                x = 1;
                            } catch (Exception e) {
                                System.out.println("Sorry, bad input");
                            }
                        } while (x == 2);
                        Double ans = ScientificFunctions.square(calc.getFirstNumber());
                        calc.setAns(ans);
                    } else if (operator.equals(12.)) {
                        int x = 2;
                        do {
                            try {
                                System.out.println("Enter your number");
                                Double firstNum = calc.getInputFromUser();
                                calc.setFirstInput(firstNum);
                                x = 1;
                            } catch (Exception e) {
                                System.out.println("Sorry, bad input");
                            }
                        } while (x == 2);
                        Double ans = ScientificFunctions.exponent(calc.getFirstNumber(), calc.getSecondNumber());
                        calc.setAns(ans);
                    } else if (operator.equals(13.)) {
                        int x = 2;
                        do {
                            try {
                                System.out.println("Enter your number");
                                Double firstNum = calc.getInputFromUser();
                                calc.setFirstInput(firstNum);
                                x = 1;
                            } catch (Exception e) {
                                System.out.println("Sorry, bad input");
                            }
                        } while (x == 2);
                        Double ans = ScientificFunctions.changeSign(calc.getFirstNumber());
                        calc.setAns(ans);
                    } else if (operator.equals(14.)) {
                        int x = 2;
                        do {
                            try {
                                System.out.println("Enter your number");
                                Double firstNum = calc.getInputFromUser();
                                calc.setFirstInput(firstNum);
                                x = 1;
                            } catch (Exception e) {
                                System.out.println("Sorry, bad input");
                            }
                        } while (x == 2);
                        Double ans = ScientificFunctions.sine(calc.getFirstNumber());
                        calc.setAns(ans);
                    } else if (operator.equals(15.)) {
                        int x = 2;
                        do {
                            try {
                                System.out.println("Enter your number");
                                Double firstNum = calc.getInputFromUser();
                                calc.setFirstInput(firstNum);
                                x = 1;
                            } catch (Exception e) {
                                System.out.println("Sorry, bad input");
                            }
                        } while (x == 2);
                        Double ans = ScientificFunctions.cosine(calc.getFirstNumber());
                        calc.setAns(ans);
                    } else if (operator.equals(16.)) {
                        int x = 2;
                        do {
                            try {
                                System.out.println("Enter your number");
                                Double firstNum = calc.getInputFromUser();
                                calc.setFirstInput(firstNum);
                                x = 1;
                            } catch (Exception e) {
                                System.out.println("Sorry, bad input");
                            }
                        } while (x == 2);
                        Double ans = ScientificFunctions.tangent(calc.getFirstNumber());
                        calc.setAns(ans);
                    } else if (operator.equals(17.)) {
                        int x = 2;
                        do {
                            try {
                                System.out.println("Enter your number");
                                Double firstNum = calc.getInputFromUser();
                                calc.setFirstInput(firstNum);
                                x = 1;
                            } catch (Exception e) {
                                System.out.println("Sorry, bad input");
                            }
                        } while (x == 2);
                        Double ans = ScientificFunctions.inverseCosine(calc.getFirstNumber());
                        calc.setAns(ans);
                    } else if (operator.equals(18.)) {
                        int x = 2;
                        do {
                            try {
                                System.out.println("Enter your number");
                                Double firstNum = calc.getInputFromUser();
                                calc.setFirstInput(firstNum);
                                x = 1;
                            } catch (Exception e) {
                                System.out.println("Sorry, bad input");
                            }
                        } while (x == 2);
                        Double ans = ScientificFunctions.inverseTangent(calc.getFirstNumber());
                        calc.setAns(ans);
                    } else if (operator.equals(19.)) {
                        int x = 2;
                        do {
                            try {
                                System.out.println("Enter your number");
                                Double firstNum = calc.getInputFromUser();
                                calc.setFirstInput(firstNum);
                                x = 1;
                            } catch (Exception e) {
                                System.out.println("Sorry, bad input");
                            }
                        } while (x == 2);
                        Double ans = ScientificFunctions.radian(calc.getFirstNumber());
                        calc.setAns(ans);
                    } else if (operator.equals(20.)) {
                        int x = 2;
                        do {
                            try {
                                System.out.println("Enter your number");
                                Double firstNum = calc.getInputFromUser();
                                calc.setFirstInput(firstNum);
                                x = 1;
                            } catch (Exception e) {
                                System.out.println("Sorry, bad input");
                            }
                        } while (x == 2);
                        Double ans = ScientificFunctions.factorial(calc.getFirstNumber());
                        calc.setAns(ans);
                    } else if (operator.equals(21.)) {
                        String ans = ScientificFunctions.fibonacci(calc.getFirstNumber());
                    } else {
                        //System.out.println("Error");
                    }
                    test++;
                } catch (Exception e) {
                    System.out.println("Sorry, bad input. Please enter a valid choice(number): ");
                }
            } while (test == 2);
            System.out.println("Your answer is " + calc.getAns() + "");


            System.out.println("If you wish to convert your number to hexadecimal(1), Octal(2), or Binary(3), " +
                    "please enter the corresponding number. You may also press 0 to reset the calculator.");
            int q = 2;
            do {
                try {
                    Double temp = calc.getInputFromUser();
                    if (temp.equals(1.)) {
                        System.out.println("Your Hexadecimal answer for " + calc.getAns() + " is "
                                + ScientificFunctions.Hexadecimal(calc.getAns().intValue()));
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