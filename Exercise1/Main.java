import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* 1- Develop a program that takes the weight (in kilograms) and height (in meters)as input and calculates
        the BMI, then prints it.
      • Input: Weight (kg) = 70, Height (m) = 1.75
      • Expected Output: BMI = 22.86 */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight (in kilograms) : ");
        int weight = input.nextInt();

        System.out.println("Enter your Height (in meters) : ");
        double height = input.nextDouble();

        System.out.printf("BMI: %.2f%n" , (weight / (height * height)));
        //__________________________________________________________________________________________________________

        /* 2- Write a program that takes the obtained marks and total marks as input and calculates the percentage,
        then prints it.
      • Input: Obtained Marks = 85, Total Marks = 100
      • Expected Output: Percentage = 85.0% */

        System.out.println("Obtained Marks: ");
        int obtained_marks = input.nextInt();

        System.out.println("Total Marks: ");
        int total_marks = input.nextInt();

        double percentage = (obtained_marks * 100.00) / total_marks;
        System.out.println("Percentage is :" + percentage + "%");
        //__________________________________________________________________________________________________________

        /* 3- Create a program that takes an amount in one currency and an exchange rate as input, then converts and prints
        the amount in another currency.
      • Input: Amount in USD = 100, Exchange Rate (USD to EUR) = 0.85
      • Expected Output: Amount in EUR = 85.0 */

        System.out.println("Amount in USD: ");
        double amount = input.nextDouble();

        System.out.println("Exchange Rate (USD to EUR): ");
        double rate = input.nextDouble();

        double amountEur = amount * rate;
        System.out.println("Amount in EUR is " + amountEur);
        //__________________________________________________________________________________________________________

        /* 4- Create a program that takes a string as input, calculates its length, and then reverses the string using
        the StringBuilder class, finally printing both the length and reversed string.
      • Input: "Hello, World!"
      • Expected Output: Length of the string: 13 And Reversed string: "!dlroW,olleH" */

        input.nextLine();

        System.out.println("Enter here:");
        String str = input.nextLine();

        String reversed = new StringBuilder(str).reverse().toString();

        System.out.println("Length of string: " + str.length());
        System.out.println("Reversed string: \"" + reversed + "\"");
        //__________________________________________________________________________________________________________

        /* 5- Develop a program that takes a sentence as input and extracts a substring from it, then prints the extracted
         substring.
       • Input: Sentence = "The quick brown fox jumps over the lazy dog", Start Index= 10, End Index = 20
       • Expected Output: "brown fox" */

        System.out.println("Enter Sentence:");
        String s = input.nextLine();
        System.out.println(s.substring(10, 20).trim());
        //__________________________________________________________________________________________________________

        /* 6- Write a program that takes a sentence and a keyword as input, then check if the keyword is present in the
        sentence and prints the result.
      • Input: Sentence = "The quick brown fox jumps over the lazy dog", Keyword ="jumps"
      • Expected Output: Keyword "jumps" is present in the sentence. */

        System.out.println("Enter new Sentence:");
        String sentence = input.nextLine();

        System.out.println("Enter Keyword:");
        String keyword = input.nextLine();

        System.out.println("Keyword \"" + keyword + "\" is present in the sentence: " + sentence.contains(keyword));
        //__________________________________________________________________________________________________________

        /* 7- Develop a program that takes a sentence and a word to replace as input, then replace all occurrences of the
        word with another word and prints the modified sentence.
      • Input: Sentence = "The quick brown fox jumps over the lazy dog", Word to Replace = "fox", Replacement Word = "cat"
      • Expected Output: "The quick brown cat jumps over the lazy dog" */

        System.out.println("Enter next sentence: ");
        String next_sentence = input.nextLine();

        System.out.println("Word to replace: ");
        String oldWord = input.nextLine();

        System.out.println("Replacement word: ");
        String newWord = input.nextLine();

        System.out.println(next_sentence.replace(oldWord, newWord));
        //__________________________________________________________________________________________________________

        /* 8- Write a program that takes two strings as input and check if they are equal,ignoring the case, then prints
         whether they are equal or not.
       • Input: String 1 = "Hello", String 2 = "hello"
       • Expected Output: Strings are equal (ignoring case).*/

        System.out.println("Enter String 1:");
        String s1 = input.nextLine();

        System.out.println("Enter String 2:");
        String s2 = input.nextLine();

        System.out.println("Strings are equal (ignoring case): " + s1.equalsIgnoreCase(s2));
    }
}
