import java.util.Scanner;
/*
1!=1
2!=1*2=2
3!=1*2*3=6
4!=1*2*3*4=24
5!=1*2*3*4*5=120 */
// 1. Write a program to find factorial of a number. (Using Loop)
public class P1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int fact=1; 		
		System.out.println("ENTER NUMBER:");
		long n=sc.nextInt();
		for(int i=1;i<=n;i++){
		    fact=fact*i;
	    }
		System.out.println("Factorial Of "+n+" = "+fact);
	}

}

