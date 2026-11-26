import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
    1 - Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
       two numbers , takes two numbers as input
     */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int number1 = input.nextInt();

        System.out.println("Enter number 2: ");
        int number2 = input.nextInt();

        System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
        System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
        System.out.println(number1 + " X " + number2 + " = " + (number1 * number2));
        System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
        System.out.println(number1 + " mod " + number2 + " = " + (number1 % number2));

//---------------------------------------------------------------------------------------------------
       /*
    2 -  Write a Java program that takes a number as input and prints its multiplication table up to 10.
     */

        System.out.println("Enter number:");
        int number3 = input.nextInt();
        int counter = 0;

        while (counter <= 10) {
            System.out.println(number3 + " X " + counter + " = " + number3 * counter);
            counter++;

        }
//---------------------------------------------------------------------------------------------------
       /*
    3 -  Write a Java program to print the area and perimeter of a circle.
     */

        System.out.println("Enter Radius");
        double radius = input.nextDouble();

        double p = 2 * Math.PI * radius;
        double a = Math.PI * radius * radius;


        System.out.println("Perimeter is = " + p);
        System.out.println("Area is = " + a);

//---------------------------------------------------------------------------------------------------
       /*
    4 - Java program to find out the average of a set of integers.
     */

        System.out.println("Enter the count of numbers: ");
        int count = input.nextInt();

        int sum = 0;
        int i = 0;
        for (i = 0; i < count; i++) {
            System.out.println("Enter an integer:  ");
            sum += input.nextInt();

        }
        double average = sum / count;
        System.out.println("The average is: " + average);
//---------------------------------------------------------------------------------------------------
      /*
     5 - Write a Java program that accepts three integers as input, adds the first two integers
     together, and then determines whether the sum is equal to the third integer.
     */

        System.out.println("Enter first number: ");
        int first = input.nextInt();

        System.out.println("Enter second number: ");
        int second = input.nextInt();

        System.out.println("Enter third number: ");
        int third = input.nextInt();

        if (first + second == third) {
            System.out.println("The result is: true");
        } else {
            System.out.println("The result is: false");
        }
//---------------------------------------------------------------------------------------------------
       /*
     6 -  Write a Java program to reverse a word.
     */

        input.nextLine();
        System.out.println("Enter Word: ");
        String s = input.nextLine();

        String reverse = "";
        for (int j = s.length() - 1; j >= 0; j--) {
            reverse += s.charAt(j);
        }

        System.out.println("Reverse word: " + reverse);

//---------------------------------------------------------------------------------------------------
       /*
     7 -  Java program to check whether the given number is even or odd
     */

        System.out.println("Enter number: ");
        int number5 = input.nextInt();

        if (number5 % 2 == 0) {
            System.out.println("The number is Even ");
        } else {
            System.out.println("The number is Odd ");

        }
//---------------------------------------------------------------------------------------------------
       /*
      8 - Java program to convert the temperature in Centigrade to Fahrenheit
     */

        System.out.println("Enter temperature in Centigrade: ");
        double centigrade = input.nextDouble();
        double fahrenheit = (centigrade * 1.8) + 32;

        System.out.println("Temperature in Fahrenheit is: " + fahrenheit);
//---------------------------------------------------------------------------------------------------
        /*
      9 - Write a Java program that takes a string and a number from the user,then prints the
          character in the given index.
          // I have problem here.
     */

        input.nextLine();
        System.out.println("Enter here: ");
        String ss = input.nextLine();

        System.out.println("Enter number: ");
        int number6 = input.nextInt();

        switch (number6) {
            case 1:
                System.out.println("a");
                break;

            case 2:
                System.out.println("b");
                break;

            case 3:
                System.out.println("c");
                break;
            default:
                System.out.println("out");

        }
//---------------------------------------------------------------------------------------------------
        /*
      10 - Write a Java program to print the area and perimeter of a rectangle.
     */
        System.out.println("Enter Width");
        double width = input.nextDouble();

        System.out.println("Enter  Height");
        double height = input.nextDouble();

        double areas = (width * height);
        double Perimeter = 2 * (width + height);


        System.out.println("Area is: " + width + " * " + height + " = " + areas);
        System.out.println("Perimeter is = " + " 2 * (" + width + " + " + height + " ) = " + Perimeter);

//---------------------------------------------------------------------------------------------------
       /*
    11 - Write a Java program to compare two numbers.
     */
        System.out.println("Enter first number: ");
        int fnum = input.nextInt();

        System.out.println("Enter second number: ");
        int snum = input.nextInt();

        if (fnum != snum && fnum < snum && fnum <= snum) {
            System.out.println(fnum + " != " + snum);
            System.out.println(fnum + " < " + snum);
            System.out.println(fnum + " <= " + snum);
        } else if (fnum < snum) {
            System.out.println(fnum + " < " + snum);
        } else if (fnum <= snum) {
            System.out.println(fnum + " <= " + snum);
        }
//---------------------------------------------------------------------------------------------------
      /*
    12 -  Write a Java program to convert seconds to hours, minutes and seconds.
     */

        System.out.println("Enter Seconds :");
        int seconds = input.nextInt();
        long hours = seconds / 3600;
        long minutes = (seconds % 3600) / 60;
        long secondss = seconds % 60;


        System.out.println(minutes + ":" + minutes + ":" + secondss);
//---------------------------------------------------------------------------------------------------
      /*
    13 - Write a Java program that accepts four integers from the user and prints equal if all
        four are equal, and not equal otherwise.
     */
        System.out.println("Enter first number: ");
        int fnumber = input.nextInt();

        System.out.println("Enter second number: ");
        int snumber = input.nextInt();

        System.out.println("Enter third number: ");
        int thumber = input.nextInt();

        System.out.println("Enter fourth number: ");
        int forumber = input.nextInt();


        if (fnumber == snumber && fnumber == thumber && fnumber == forumber) {
            System.out.println("Numbers are equal!");

        } else {
            System.out.println("Numbers are not equal!");
        }
//---------------------------------------------------------------------------------------------------
        /*
     14 -  Write a Java program that reads an integer and check whether it is negative, zero, or
        positive.
     */

        System.out.println("Enter number: ");
        int onenumber = input.nextInt();

        if (onenumber > 0) {
            System.out.println("Number is positive");
        } else if (onenumber == 0) {
            System.out.println("Number is zero");

        } else if (onenumber < 0) {
            System.out.println("Number is negative");

        }

//---------------------------------------------------------------------------------------------------
       /*
     15 - Write a program to enter the numbers till the user wants and at the end it
      should display the count of positive, negative and zeros entered  (End loop use -1 , Don’t count -1).
       // I have problem here.
     */

        System.out.println("Enter number and -1 to Exit:");
        int num = input.nextInt();
        int pos = 0;
        int neg = 0;
        int zero = 0;

            if (num == -1) {
                System.out.println("Exit");
                //break; (while)
            } else if (num > 0) {
                pos++;
            } else if (num < 0) {
                neg++;
            } else {
                zero++;
            }
            System.out.println(pos + "Positive");
            System.out.println(neg + "negative");
            System.out.println(zero + "zero");


//---------------------------------------------------------------------------------------------------
       /*
     16 - Write a program that prompts the user to input an integer and then outputs the
     number with the digits reversed.
     */

            System.out.println("Enter number: ");
            int number11 = input.nextInt();
            int reversed = 0;

            while (number11 != 0) {
                int digital = number11 % 10;
                reversed = reversed * 10 + digital;
                number11 /= 10;
            }
            System.out.println("Reverse number: " + reversed);

//---------------------------------------------------------------------------------------------------
       /*
     17 - Write a program to enter the numbers till the user wants and at the end the
     program should display the largest and smallest numbers entered.
      // I dont have time.
     */

            System.out.println("Enter number;");
            int number17 = input.nextInt();

            int largest = 0;
            int smallest = 0;

            //for
            //if


            System.out.println("the largest number is: " + largest);
            System.out.println("the small number is: " + smallest);

//---------------------------------------------------------------------------------------------------
       /*
     18 - Determine and print the number of times the character ‘a’ appears in the input
     entered by the user.
      // I dont have time.
     */

            input.nextLine();
            System.out.println("Enter here to show how many times 'a' appear?: ");
            String sc = input.nextLine();
            int counters = 0;
            //char ch = sc.charAt(d);

            for (int d = 0; d < sc.length(); d++) {
                char ch = sc.charAt(d);
                if (sc.charAt(d) == 'a' || sc.charAt(d) == 'A') { // or ignore method.
                    counters++;
                }
            }

//---------------------------------------------------------------------------------------------------
        }
    }



