public class Pattern13{

public static void main(String[]args){

int i,j;

for(i=1; i<=13; i++){

 for(j=1 ; j<=7 ;j++){
 
 if((j<=8-i && i<8) || (i>7 && j<=i-6)){
 
 System.out.printf("%c",j+64);
 }
 }
 System.out.printf("\n");
 }
 }
 }
 