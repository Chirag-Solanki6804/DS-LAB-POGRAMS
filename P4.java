/* 4. Read n numbers in an array then read two different numbers,
replace 1st number with 2nd number in an array and print its index and final array.*/
import java.util.Scanner;
public class P4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Entre The Size Of An Array:");
        int size=sc.nextInt();
        System.out.println("Entre Array:");
        int[] a=new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter First Number:");
        int f=sc.nextInt();
        System.out.println("Enter Second Number");
        int s=sc.nextInt();
        for(int i=0;i<size;i++)
        if(a[i]==f){
            a[i]=s;
        }
        System.out.println("YOUR MODIFIED ARRAY:");
        for(int i=0;i<size;i++){
            System.out.println("a["+i+"]="+a[i]);
        }

    }
}