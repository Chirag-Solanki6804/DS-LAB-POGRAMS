// 7. Write a program to swap two numbers using user-defines method.
import java.util.Scanner;
class Swap{
  int a,b,temp;
  void Take_Number(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter First Number : ");
    a=sc.nextInt();
    System.out.println("Enter Second Number : ");
    b=sc.nextInt();
  }
  void Swap_Number(){
    temp=a;
    a=b;
    b=temp;
    System.out.println("a = "+a);
    System.out.println("b = "+b);
  }
}
public class P7{
  public static void main(String[] args) {
    Swap s=new Swap();
    s.Take_Number();
    s.Swap_Number();
  }
}
