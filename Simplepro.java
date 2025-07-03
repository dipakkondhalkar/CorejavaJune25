//Q1. Write a java program to display message "This is first java program". \

/*
public class Simplepro{
public static void main(String[]args){

System.out.println("This is first program");

}
}
*/
/*
//Q2. Write a java program to input all basic data types and print its out

import java.util.Scanner;

public class Simplepro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input all basic data types
        System.out.print("Enter a byte value: ");
        byte b = sc.nextByte();

        System.out.print("Enter a short value: ");
        short s = sc.nextShort();

        System.out.print("Enter an int value: ");
        int i = sc.nextInt();

        System.out.print("Enter a long value: ");
        long l = sc.nextLong();

        System.out.print("Enter a float value: ");
        float f = sc.nextFloat();

        System.out.print("Enter a double value: ");
        double d = sc.nextDouble();

        System.out.print("Enter a boolean value (true/false): ");
        boolean bool = sc.nextBoolean();

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        // Output all values
        System.out.println("\n--- Output ---");
        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Int: " + i);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Boolean: " + bool);
        System.out.println("Char: " + ch);

        sc.close();
    }
}

*/


//Q 3. Write a java program to enter two numbers and perform all arithmetic operations.

import java.util.*;
public class Simplepro{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter the number frist");
int first = sc.nextInt();


System.out.println("Enter the number second");
int second = sc.nextInt();

System.out.println("Multiplication is =  " + (first + second ));
System.out.println(first - second );
System.out.println(first * second );
System.out.println(first /5 second );

}
}






















