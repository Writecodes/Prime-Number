/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        //...................find the prime numbers from 1 to N..................
        int i, j, count = 0;
        System.out.print("Enter the number upto which you want to find the prime numbers = ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (i = 1; i <= num; i++) {
            for (j = 1; j <= i; j++) {
                if (i % j == 0)
                    count = count + 1;
            }
            if (count == 2)
                System.out.println(i);
            else
                count = 0;
            count = 0;
        }
    }
}

//.....................Check whether the number is prime or not....................
//     int i, count = 0;
//     System.out.print("Enter the number which is to be checked whether prime or not = ");
//     Scanner sc = new Scanner(System.in);
//     int num = sc.nextInt();
//     for (i = 1; i <= num; i++) {
//         if (num % i == 0)
//             count = count + 1;
//     }
//     if (count == 2)
//         System.out.println(num+" is prime.");
//     else
//         System.out.println(num+" number is not prime.");
//     }
// }

//..............Find the the prime numbers between numbers...............................
//         int i, j, count = 0;
//         System.out.print("Enter the first number = ");
//         Scanner sc = new Scanner(System.in);
//         int firstnum = sc.nextInt();
//         System.out.print("Enter the second number = ");
//         int secondnum = sc.nextInt();
//         for (i = firstnum; i <= secondnum; i++) {
//             for (j = 1; j <= i; j++) {
//                 if (i % j == 0)
//                     count = count + 1;
//             }
//             if (count == 2)
//                 System.out.println(i);
//             else
//                 count=0;
//             count=0;
//         }
//     }
// }

//....................check whether the number is prime or not using recursion.....................
//         int n=4;
//         int prime=rPrime(n,n/2);
//         if(prime==1)
//             System.out.println("Prime number");
//         else
//             System.out.println("Not a prime number");
//     }
//     public static int rPrime(int n,int i){
//     if(i==1)
//         return i;
//     else if (n%i==0)
//         return 0;
//     else
//         return rPrime(n,i-1);
//     }
// }

//..................checking the number is prime or not using while loop....................
//     int i=1, count = 0;
//         System.out.print("Enter the number which is to be checked whether prime or not = ");
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         while (i<=num){
//             if (num % i == 0)
//                 count = count + 1;
//         i++;
//         }
//         if (count == 2)
//             System.out.println(num+" is prime.");
//         else
//             System.out.println(num+" number is not prime.");
//     }
// }
