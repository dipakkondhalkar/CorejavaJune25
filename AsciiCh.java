//Q15. Write a java program to print all ASCII characters with their values

class AsciiCh
{
  public static void main(String[]args)
  {
  
  getAscii a = new getAscii();
  a.Ascci();
    
  }
}

class getAscii
{
  public void Ascci()
  {
  System.out.println("Ascii Characters with their values");
   for(int i=65;i<127;i++)
   {
    
    System.out.println((char)i);
   }
  
  }

}
/*

output:
A
B
C
D
E
F
G
H
I
J
K
L
M
N
O
P
Q
R
S
T
U
V
W
X
Y
Z
[
\
]
^
_
`
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
{
|
}
~  */