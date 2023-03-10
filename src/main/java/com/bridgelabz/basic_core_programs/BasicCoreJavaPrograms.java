package com.bridgelabz.basic_core_programs;

import java.util.Scanner;

public class BasicCoreJavaPrograms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many times you want to flip the coin");
        int num = sc.nextInt();
        int head = 0, tail = 0;
        for (int i = 0; i < num; i++) {
            int flip = (int) Math.floor(Math.random() * 10) % 2;
            if (flip < 0.5) {
                tail++;
            } else {
                head++;
            }
        }
        System.out.println("The number of heads " + tail);
        System.out.println("The number of tails " + head);
        float headPercentage = head * 100 / num;
        float tailPercentage = tail * 100 / num;
        System.out.println("The Percentage of tail is " + tailPercentage + "%");
        System.out.println("The Percentage of head is " + headPercentage + "%");
        System.out.println("===================");

        //Leap Year
        System.out.println("Enter the year");
        int year = sc.nextInt();
        if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0) {
            System.out.println(+year + " is a leap year");
        } else {
            System.out.println(+year + " is not a leap year");
        }
        System.out.println("===================");

        //power of 2
        System.out.println("Enter the power value");
        int N = sc.nextInt();
        int powerOfTwo;
        for (int i = 1; i <= N; i++) {
            powerOfTwo = (int) Math.pow(2, i);
            System.out.println(i + "th power of 2 is " + powerOfTwo);
        }
        System.out.println("===================");

        // Harmonic Number
        System.out.println("Enter the number whose harmonic number you want");
        int number = sc.nextInt();
        double result = 0.0;
        int i;
        for (i = 1; i < number; i++) {
            result = result + (double) 1 / i;
        }
        System.out.println("The harmonic number of " + i + " is " + result);
        System.out.println("===================");

        // Factors
        System.out.println("Enter the number whose prime factors you want");
        int factNumber = sc.nextInt();
        int primeFactorial = 2;
        while (factNumber > 1) {
            if (factNumber % primeFactorial == 0) {
                System.out.println(primeFactorial);
                factNumber = factNumber / primeFactorial;
            } else {
                primeFactorial++;
            }
        }
        System.out.println("===================");

        //Quotient and Remainder

        System.out.println("Enter the value of dividend");
        int dividend = sc.nextInt();
        System.out.println("Enter the value of divisor");
        int divisor = sc.nextInt();
        int quotient = dividend / divisor;
        int reminder = dividend % divisor;

        System.out.println("The quotient is " + quotient);
        System.out.println("The reminder is " + reminder);
        System.out.println("===================");

        //swap two numbers
        System.out.println("Enter the first number");
        int firstNumber = sc.nextInt();
        System.out.println("Enter the second number");
        int secondNumber = sc.nextInt();
        int temp = 0;
        System.out.println("Numbers before swapping " + firstNumber + " " + secondNumber);
        temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;
        System.out.println("Numbers after swapping " + firstNumber + " " + secondNumber);
        System.out.println("===================");

        //Even or odd
        System.out.println("Enter the number to check even or odd");
        int evenOrOdd = sc.nextInt();
        if (evenOrOdd % 2 == 0) {
            System.out.println(evenOrOdd + " is even number ");
        } else {
            System.out.println(evenOrOdd + " is odd number");
        }
        System.out.println("===================");

        System.out.println("Enter a character a to z");
        char alphabet = sc.next().charAt(0);
        switch (alphabet) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(+alphabet + " ia a vowel");
                break;
            default:
                if ((alphabet >= 'a' && alphabet <= 'z') || (alphabet >= 'A' && alphabet <= 'Z')) {
                    System.out.println(alphabet + " is a consonant");
                } else {
                    System.out.println("please enter the alphabet");
                }
        }
    }
}

