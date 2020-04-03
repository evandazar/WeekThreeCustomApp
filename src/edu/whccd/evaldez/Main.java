package edu.whccd.evaldez;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    //Initialize Variables
    String firstName = "";
    String lastName = "";
    int wholeNumber1 = 0;
    int wholeNumber2 = 0;
    int addNum = 0;
    int subNum = 0;
    int multNum = 0;
    int divNum = 0;
    int modNum = 0;
    Scanner sc = new Scanner(System.in);

    //Get first and last name
    while (firstName == "")
    {
        System.out.print("Enter first name: ");
        firstName = sc.next();
    }
    if (firstName != "")
    {
        System.out.print("Enter last name: ");
        lastName = sc.next();
    }

    //output message with last name first and first name second
    String message = "Hello " + lastName + ", " + firstName + "\n" + "*******************";
    System.out.println(message);

    //Get 2 numbers and add, subtract, multiply, divide, and get the modulo of them
        if (lastName != "" && wholeNumber1 == 0)
        {
            System.out.print("Enter a whole number: ");
            wholeNumber1 = sc.nextInt();
        }
        if (wholeNumber1 != 0)
        {
            System.out.print("Enter another whole number: ");
            wholeNumber2 = sc.nextInt();
        }
        addNum = wholeNumber1 + wholeNumber2;
        subNum = wholeNumber1 - wholeNumber2;
        multNum = wholeNumber1 * wholeNumber2;
        divNum = wholeNumber1 / wholeNumber2;
        modNum = wholeNumber1 % wholeNumber2;

        //output message for the arithmetic
        String totalMessage =
                "Addition: " + wholeNumber1 + " " + "+" + " " + wholeNumber2  + " = " +  addNum+ "\n" +
                "Subtraction: " + wholeNumber1 + " " + "-" + " " + wholeNumber2  + " = " +  subNum+ "\n" +
                "Multiplication: " + wholeNumber1 + " " + "*" + " " + wholeNumber2  + " = " +  multNum+ "\n" +
                "Division: " + wholeNumber1 + " " + "/" + " " + wholeNumber2  + " = " +  divNum+ "\n" +
                "Modulo: " + wholeNumber1 + " " + "%" + " " + wholeNumber2  + " = " +  modNum+ "\n"
                ;
        System.out.println(totalMessage);
    }
}
