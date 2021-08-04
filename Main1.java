import java.util.Scanner; 
 import java.util.*;
 public class Main1{
 private int Palindrome;
 private int printPattern;
 private int checkPrimeNumber;
private  int printFibonacciSeries;	
// palindrome
	public int getPalindrome() {
		return Palindrome;
	}

	public void setPalindrome(int Palindrome) {
		this.Palindrome = Palindrome;
	}
 
 
 //print pattern
 public int getprintPattern() {
		return printPattern;
	}

	public void  setprintPattern(int printPattern) {
		this.printPattern = printPattern;
	}
 
 
 
 //checkPrimeNumber
 public int getcheckPrimeNumber() {
		return checkPrimeNumber;
	}

	public void setcheckPrimeNumber(int checkPrimeNumber) {
		this.checkPrimeNumber = checkPrimeNumber;
	}
 
 // printFibonacciSeries
 
 public int getprintFibonacciSeries() {
		return printFibonacciSeries;
	}

	public void setprintFibonacciSeries(int printFibonacciSeries) {
		this.printFibonacciSeries = printFibonacciSeries;
	}
 
 
 
 
 
 public static void main(String[] args) {

                Main1 obj = new Main1();

                int choice;

                Scanner sc = new Scanner(System.in);


do {

 System.out.println("Enter your choice from below list.\n" + 
 "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" 
+ "3. Check whether the no is a  prime number.\n"

+ "4. Print Fibonacci series.\n" 
+ "0. Enter 0 to Exit.\n");

System.out.println();
choice = sc.nextInt();

switch (choice) {

 

case 0:

choice = 0;

break;

 

case 1: {


obj.Palindrome=sc.nextInt();


}

break;

 

case 2: {

 
obj.printPattern = sc.nextInt();


}

break;

 

case 3: {

obj.checkPrimeNumber=sc.nextInt();

}

break;

 

case 4: {

 

obj.printFibonacciSeries=sc.nextInt();

}

break;

 

default:

System.out.println("Invalid choice. Enter a valid no.\n");

}

 

} while (choice != 0);

System.out.println("Exited Successfully!!!");

sc.close();

}
 }
public class Palindrome  
{  
   public static void main(String args[])  
   {  
      String original, reverse = ""; // Objects of String class  
      Scanner in = new Scanner(System.in);   
      System.out.println("Enter a string/number to check if it is a palindrome");  
      original = in.nextLine();   
      int length = original.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + original.charAt(i);  
      if (original.equals(reverse))  
         System.out.println("Entered string/number is a palindrome.");  
      else  
         System.out.println("Entered string/number isn't a palindrome.");   
   }  
} 
  
public class printPattern   
{   
public static void main(String args[])   
{   
//i for rows and j for columns      
int i, j,row;

//row denotes the number of rows you want to print
System.out.print("Enter the number of rows you want to print: ");  
Scanner sc = new Scanner(System.in);  
row = sc.nextInt();  
//outer loop for rows  
for(i=0; i<row; i++)   
{   
//inner loop for columns  
for(j=0; j<=i; j++)   
{   
//prints stars   
System.out.print("* ");   
}   
//throws the cursor in a new line after printing each line  
System.out.println();   
}   
}   
} 
 
public class checkPrimeNumber {  
  
   public static void main(String[] args) {  
       Scanner s = new Scanner(System.in);  
       System.out.print("Enter a number : ");  
       int n = s.nextInt();  
       if (isPrime(n)) {  
           System.out.println(n + " is a prime number");  
       } else {  
           System.out.println(n + " is not a prime number");  
       }  
   }  
  
   public static boolean isPrime(int n) {  
       if (n <= 1) {  
           return false;  
       }  
       for (int i = 2; i < Math.sqrt(n); i++) {  
           if (n % i == 0) {  
               return false;  
           }  
       }  
       return true;  
   }  
}  
public class printFibonacciSeries{  
public static void main(String args[])  
{    
 int first=0,second=1,n,i,count;    
 System.out.print("Enter the number of count you want to print: ");  
Scanner sc = new Scanner(System.in);  
count = sc.nextInt();  
 System.out.print(first+" "+second);//printing 0 and 1    
    
 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
 {    
  n=first+second;    
  System.out.print(" "+n);    
  first=second;    
  second=n;    
 }    
  
}
}
