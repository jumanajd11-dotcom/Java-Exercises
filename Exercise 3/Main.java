import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    /* 1- .Write a program that prints the numbers from 1 to 100 such that:
    If the number is a multiple of 3, you need to print "Fizz" instead of that number.
    If the number is a multiple of 5, you need to print "Buzz" instead of that number.
    If the number is a multiple of both 3 and 5, you need to print "FizzBuzz" instead of that number.*/

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else
                System.out.println(i);
        }
//------------------------------------------------------------------------------------------------------------------
    /* 2- Write a Java program to reverse a string.
         Test Data:
    Input a string: The quick brown fox
    Expected Output: Reverse string: xof nworb kciuq ehT*/

        Scanner input = new Scanner(System.in);

        System.out.println("Write here:");
        String s = input.nextLine();
        String reverse = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        System.out.println("Reverse is: " + reverse);

    //Another way (shorter & faster): use StringBuilder instead of the for loop
    //String reverse = new StringBuilder(s).reverse().toString();

//------------------------------------------------------------------------------------------------------------------
        /* 3- Write a program to find the factorial value of any number entered through the keyboard.*/

        System.out.println("Enter number:");
        int number = input.nextInt();
        long factorial = 1; //(long) is data type
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("factorial of number: " + number + " is " + factorial);

//------------------------------------------------------------------------------------------------------------------
    /* 4- Two numbers are entered through the keyboard.
     Write a program to find the value of one number raised to the power of another.
      (Do not use Java built-in method)*/
        // number2 (exponent) must be positive or zero.

        System.out.println("Enter number 1:");
        int number1 = input.nextInt();

        System.out.println("Enter number 2:");
        int number2 = input.nextInt();

        int result = 1;
        int i = number2;

        while (i > 0) {
            result *= number1;
            i--;
        }
        System.out.println(number1 + " ^ " + number2 + " = " + result);

//------------------------------------------------------------------------------------------------------------------
        /* 5- Write a program that reads a set of integers, and then prints the sum of the even and odd integers.*/

        int sum = 0; //sum of even number.
        int total= 0;//sum of odd number.
        int set;     // the number entered by the user

        do {
            System.out.println("Enter number or 0 to exit:");
            set = input.nextInt();
            if (set % 2 == 0)
                sum += set;
            else
                total += set;
        }
        while (set != 0);
        System.out.println("The sum of even number is: " + sum + "\nThe sum of odd number is: " + total);

//------------------------------------------------------------------------------------------------------------------
    /* 6- Write a program that prompts the user to input a positive integer.
    It should then output a message indicating whether the number is a prime number.*/

        System.out.println("Enter positive integer number:");
        int n = input.nextInt();
        boolean is_prime = true;

        if (n < 2) {
            is_prime = false;
        }
        for (int j = 2; j * j <= n; j++) {
            if (n % j == 0) {
                is_prime = false;
                break;
            }
        }
        if (is_prime)
            System.out.println(n + " is prime");
        else
            System.out.println(n + " is not prime");

//------------------------------------------------------------------------------------------------------------------
    /* 7- Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use
    another for loop to print the days (Days 1 -7) for each week.
    Expected Output:
    Week 1
       Day1
       Day2
       Day3
       Day4
       Day5
       Day6
       Day7
    Week 2
       Day1
       Day2
       .
       .
       .
        */
        for(int week =1 ; week <=4; week++) {
        System.out.println("Week " + week);
            for (int day = 1; day <= 7; day++) {
        System.out.println(" Day" + day);
            }
        }
//------------------------------------------------------------------------------------------------------------------
    /* 8- Write a program thats check if the word is a palindrome or not.
    hint: A string is said to be a palindrome if it is the same if we start reading it from
    left to right or right to left.*/

        input.nextLine();
        System.out.println("Enter word: ");
        // ignore uppercase/lowercase difference
        String word = input.nextLine().toLowerCase();
        int k=0; //start from first letter index(0).
        int last = word.length()-1;
        boolean is_palindrome =true;

        while(k < last) {
            if (word.charAt(k) != word.charAt(last)) {
                is_palindrome = false;
                break;
            }
            k++;
            last--;
        }
        if (is_palindrome)
            System.out.println(word + " is palindrome");
            else
                System.out.println(word  + " is not palindrome");
    }
}
