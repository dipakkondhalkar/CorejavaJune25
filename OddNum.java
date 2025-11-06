//Q5. Write a java program to print all odd numbers between 1 to 100

class Odd{

public int OddN(int no){
System.out.println("All even Numbers are");
int i=1;
while(i<=no){
if(i%2!=0){

    System.out.println(i);
}
i++;
}
return i;
}
}

class  OddNum{

public static void main(String[]args){

Odd a = new Odd();
a.OddN(100);

}
}
/*
output:
All even Numbers are
1
3
5
7
9
11
13
15
17
19
21
23
25
27
29
31
33
35
37
39
41
43
45
47
49
51
53
55
57
59
61
63
65
67
69
71
73
75
77
79
81
83
85
87
89
91
93
95
97
99   */