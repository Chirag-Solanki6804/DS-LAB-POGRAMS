/*
5=5*4*3*2*1=120

fact(5)
  5*fact(4)
    4*fact(3)
       3*fact(2)
         2*fact(1)
            1*fact(0)
               1
*/
// 2. Write a program to find factorial of a number. (Using Recursion)
class Factorial{

long fact(int n){
	   if(n>0){
		   return(n*fact(n-1));
	    }
	    else{
		   return(1);
	    }
    }
}
public class P2{
	public static void main(String[] args) {
		Factorial f=new Factorial();
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter Number : ");
		int x=sc.nextInt();
		long b=f.fact(x);
		System.out.print("Factorial of "+x+" is "+b);
	}
}
