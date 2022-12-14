import java.util.Scanner;

 

public class PreworkAsgnmt {

 

Scanner sc = new Scanner(System.in);

 

           //function to checkPalindrome

       public void checkPalindrome()  {
        System.out.println("Enter string to check whether it is palindrome or not");
        String str=sc.next();
        StringBuilder sb=new StringBuilder(str);  
        if(sb==sb.reverse()) System.out.println("It is palindrome");
        else System.out.println("It is not palindrome");


      }

 

            //function to printPattern

       public void printPattern() {
        System.out.println("Enter number to print pattern");
        int n=sc.nextInt();
        for(int i=n;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }

      }

 

          //function to check no is prime or not

        public void checkPrimeNumber() {
            System.out.println("Enter number to check whether it is prime or not");
            int num=sc.nextInt();
            int i,m=0,flag=0;      
               
            m=num/2;      
            if(num==0||num==1){  
             System.out.println(num+" is not prime number");      
            }else{  
             for(i=2;i<=m;i++){      
              if(num%i==0){      
               System.out.println(num+" is not prime number");      
               flag=1;      
               break;      
              }      
             }      
             if(flag==0)  { System.out.println(num+" is prime number"); }  
            }

        }

         

          // function to print Fibonacci Series

          public void printFibonacciSeries() {

                //initialize the first and second value as 0,1 respectively.
                System.out.println("Enter fibonocci size");
                int sizefib=sc.nextInt();

           int first = 0, second = 1;
           int n3,i;    
           System.out.print(first+" "+second);//printing 0 and 1    
              
           for(i=2;i<sizefib;++i)//loop starts from 2 because 0 and 1 are already printed    
           {    
            n3=first+second;    
            System.out.print(" "+n3);    
            first=second;    
            second=n3;    
           }    

          }

 

//main method which contains switch and do while loop

      public static void main(String[] args) {

        PreworkAsgnmt obj = new PreworkAsgnmt();

                int choice;

                Scanner sc = new Scanner(System.in);

do {

System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

System.out.println();

 

choice = sc.nextInt();

switch (choice) {

 

case 0:

choice = 0;

break;

 

case 1: {

obj.checkPalindrome();

}

break;

 

case 2: {

 

obj.printPattern();

}

break;

 

case 3: {

obj.checkPrimeNumber();

}

break;

 

case 4: {

 

obj.printFibonacciSeries();

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