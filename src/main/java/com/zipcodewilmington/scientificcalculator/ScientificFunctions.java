package com.zipcodewilmington.scientificcalculator;

public class ScientificFunctions {

    public ScientificFunctions(){

    }

    public boolean isaNumber(Double input) {
        return true;
    }

    /*public class convertToDouble {
        private String number1;
        double convertedNumber = Double.parseDouble(number1);
    }*/
    public static Double add(Double a, Double b) {
        Double sum = a + b;
        return sum;
    }

<<<<<<< HEAD
    public Double subtract(Double a, passDouble b) {
=======
    public static Double subtract(Double a, Double b) {
>>>>>>> a0d3c8bc213b0c9f0525d6b4391d59775f240816
        Double sum = a - b;
        return sum;
    }

    public static Double multiply(Double a, Double b) {
        Double sum = a * b;
        return sum;
    }

    public static Double divide(Double a, Double b){
        if (b == 0){
            // tell user division by 0 is not allowed and to re enter input
        }
        else {
            Double sum = a / b;
            return sum;
        }
        return null;
    }
<<<<<<< HEAD
    // return square root
    public Double squareRoot(Double a) {
        if (a < 0) {
            // tell user square root of negative number is not possible
        }
=======

    public static Double squareRoot(Double a) {
>>>>>>> a0d3c8bc213b0c9f0525d6b4391d59775f240816
        Double sum = Math.sqrt(a);
        return sum;
    }

<<<<<<< HEAD
    // returns square
    public Double square(Double a) {
=======
    public static Double square(Double a) {
>>>>>>> a0d3c8bc213b0c9f0525d6b4391d59775f240816
        Double sum = a*a;
        return sum;
    }
    // Add all inverses?  Multiplicative/additive/
    public static Double inverse(Double a) {
        Double sum = (1/a);
        return sum;
    }
    // reset memory to 0?
    public void Clear() {

    }

    public static Double exponent(Double a, Double e){
        Double sum = Math.pow(a, e);
        return sum;
    }

    public static Double changeSign(Double a){
        if(a < 0){
            Double value = Math.abs(a);
            return value;
        }
        else{
            Double value = a - (a*2);
            return value;
        }
    }

    // returns sine
    public static Double sine(Double input){
        Double number = input;
        return Math.sin(number);
    }
    // returns cosine
    public static Double cosine(Double input){
        Double number = input;
        return Math.cos(number);
    }
    // returns tangent
    public static Double tangent(Double input){
        Double number = input;
        return Math.tan(number);
    }
    // inverse sine
    public Double inverseSine(Double input){
        Double number = input;
        return Math.asin(number);
    }
    // inverse cosine
    public static Double inverseCosine(Double input){
        Double number = input;
        return Math.acos(number);
    }
    // inverse tangent
    public static Double inverseTangent(Double input){
        Double number = input;
        return Math.atan(number);
    }

    // to radians

    public static Double radian(Double input){
        Double number = input;
        return Math.toRadians(number);
    }

    // to degrees
    public static Double degree(Double input){
        Double number = input;
        return Math.toDegrees(number);
    }

    // calc natural log
    public static Double naturalLog(Double input){
        Double number = input;
        return Math.log(number);
    }

    // calc base log
    public static Double baseLog(Double input){
        Double number = input;
        return Math.log10(number);
    }
    // calc inverse log
    public static Double inverseLog(Double input){
        Double number = Math.pow(10, input);
        return number;
    }

    // calc inverse natural log
    public Double inverseNaturalLog(Double input){
        Double number = Math.pow(Math.E, input);
        return number;
    }

    // calculate factorial
    public static Double factorial(Double input){
        Double number = 1.;
        for(int i = 2; i <= input; i++){
            number = number * i;
        }
        return number;

}


}
