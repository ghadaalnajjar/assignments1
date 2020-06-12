package org.example;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        // example 1: program to print 'Hello' on screen and then print 'your name'
        System.out.println("Hello");
        System.out.println("Ghada");

        //example 2:  program that takes a year as input from user and print if it’s leap year or not.
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any year");
        int year = obj.nextInt();
        boolean flag = false;
        if (year % 400 == 0 || year % 4 == 0) {
            flag = true;
        }
        if (flag) {
            System.out.println("Year "+year+" Is a leap year");
        } else {
            System.out.println("Year "+year+" Is not a leap year");
        }

        //example 3:  Java program to print the (+,-,*,/) of two numbers.
        int w = 15;
        int z = 30;
        int r = 0;
        char o = '+';
        switch (o){
            case '+':
                r = w + z;
                break;
            case '-':
                r = w - z;
                break;
            case '*':
                r = w * z;
                break;
            case '/':
                r = w / z;
                break;
        }
        System.out.println(r);

        //example 4:  program that prints the average of three numbers.
        int x1 = 23;
        int x2 = 11;
        int x3 = 77;
        double avg = (x1 + x2 + x3)/3;
        System.out.println("("+x1+"+"+x2+"+"+x3+")/3 = "+avg);

        //example5: input username and store in a variable and print 'Hello username'.
        Scanner username = new Scanner(System.in);
        System.out.println("enter the username: ");
        String user = username.next();
        System.out.println("Hello "+ user);

        //example 6:  input two numbers and print the sum/multiplication/division/subtraction of given numbers.
        Scanner input = new Scanner(System.in);
        System.out.println("enter two number and operator");
        int x = input.nextInt();
        int y = input.nextInt();
        int result = 0;
        char operator = input.next().charAt(0);
        switch (operator) {
            case '+':
                result = x + y;
                break;
            case '-':
                result = x - y;
                break;
            case '*':
                result = x * y;
                break;
            case '/':
                result = x / y;
                break;
        }
        System.out.println(result);

        //example7:  Create a program that converts seconds to hours, minutes and seconds.
        int sec = 0;
        int minute = 0;
        int hour = 0;
        System.out.print("Input seconds: ");
        int second = input.nextInt();
        for(int i = 1; i<=second; i++){
            sec ++;
            if(sec == 60){
                sec = 0;
                minute ++;
            }
            if(minute == 60){
                minute = 0;
                hour ++;
            }
        }
        System.out.println(hour+":"+minute+":"+sec);

        //exampl8: Input random number 1-500.
        Random rand = new Random();
        int numberRandom = rand.nextInt(500);
        System.out.println("Enter the number from 1 to 500 :");
        int num = input.nextInt();
        while (num != numberRandom){
            if(num>numberRandom)
                System.out.println("Your guess was too big");
            else if (num < numberRandom)
                System.out.println("Your guess was too small");
            System.out.println("Enter the new Number");
            num = input.nextInt();
        }
        System.out.println("number is " + num + " the correct guess");
    }
}
