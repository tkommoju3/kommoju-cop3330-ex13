/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tanushka Kommoju
 */

import java.util.Scanner;
import java.math.RoundingMode;

public class CompoundInterest {

    public static void main(String[] args) {

        double principle, interestRate, years, compound;

        Scanner input = new Scanner(System.in);
        System.out.print("What is the principal amount? ");
        principle = input.nextDouble();

        System.out.print("What is the rate? ");
        interestRate = input.nextDouble();

        System.out.print("What is the number of years? ");
        years = input.nextDouble();

        System.out.print("What is the number of times interest is compounded per year? ");
        compound = input.nextDouble();

        double newInterest = interestRate / 100;

        double simpleInterest = principle * (1 + (newInterest * years));

        double compoundInterest = principle * (Math.pow((1 + newInterest / compound), (compound * years)));

        System.out.print("$" + principle + " invested at %" + interestRate + " for " + years + " years compounded " +
                compound + " times per year is $" + Math.round(compoundInterest * 100.0) / 100.0);

    }
}




