
// Write a java program to input any alphabet and check whether it is vowel or consonant.

import java.util.*;
public class Vowel{

public static void main(String[]args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter the Alphabet");

char ch = sc.next().charAt(0);

String result = (ch=='a'|| ch=='A'|| ch=='e'|| ch=='E'|| ch=='i'|| ch=='I'|| ch=='o'|| ch=='O' || ch=='u' || ch=='U') ? "Enter character are vowel " :"Enter Character is consonant";

System.out.println(result);
}
}

