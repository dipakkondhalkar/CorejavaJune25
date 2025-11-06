//Q3. Write a java program to print all alphabets from a to z. - using while loop

import java.util.*;

class Alpha
{
  public int Alphabet(int n)
  
  {
   int  i=97;
   while(i<=n){
   
   System.out.println((char)i);
   i++;
   
   }
  return i;
 
  }
}

class AlphabetPrint
{
  public static void main(String[]args)
  {
  Alpha a = new Alpha();
  
  a.Alphabet(122);
  }
}
/*
output:
a
b
c
d
e
f
g
h
i
j
k
l
m
n
o
p
q
r
s
t
u
v
w
x
y
z

*/