// 3. Write a program to check whether a number is prime or not. (Home Work)
import java.util.Scanner;
public class P3{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean falg=true;
		System.out.print("Enter Number Check Prime Or Not :");
		int n=sc.nextInt();
		for(int i=2;i<n/2;i++){
			if(n%i==0){
				falg=false;
				break;
			}
		}
		if(falg==true){
			System.out.println(n+" is a prime Number");
		}else if(falg==false){
			System.out.println(n+" is Not prime Number");
		}
	}
}