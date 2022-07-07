/* 10. Implement a program for stack that performs following operations using array: 
PUSH, POP, PEEP, CHANGE & DISPLAY */
/* 10. Implement a program for stack that performs following operations using array: 
PUSH, POP, PEEP, CHANGE & DISPLAY */
import java.util.Scanner;
class stack{
    int top;
    int maxsize=100;
    int[] a=new int[maxsize];
    stack(){
        top=-1;
    }
    Scanner sc=new Scanner(System.in);
    void push(){
        if(top>maxsize-1){
            System.out.println("\nstack OverFlow\n");
        }else{
        top++;
        System.out.println("\nEnter Number For Push:");
        int x=sc.nextInt();
        a[top]=x;
        System.out.println("Number Pushed");
        }
    }
    void pop(){
         if(top<0){
            System.out.println("\nstack UnderFlow\n");
        }
        else{
        System.out.println("\n\n");
        System.out.println(a[top]+"is Element Is Remove From The Stack\n");
        top--;
        System.out.println("number Poped");
        }
    }
    void peep(){
         if(top<0){
            System.out.println("\nstack UnderFlow\n");
        }
        else if(top>maxsize-1){
            System.out.println("\nstack OverFlow\n");
        }else{
        System.out.println("\nEnter number's Index Which you want to show\n");
        int x=sc.nextInt();
        int b=top-x+1;
        System.out.println("\n");
        System.out.println(a[b]);
        }
    }
    void peek(){
         if(top<0){
            System.out.println("\nstack UnderFlow\n");
        }
        else if(top>maxsize-1){
            System.out.println("\nstack OverFlow\n");
        }else{
        System.out.println("\n");
        System.out.println("\nTop Element Of stack:\n");
        System.out.println(a[top]);
        }
    }
    void change(){
         if(top<0){
            System.out.println("\nstack UnderFlow\n");
        }
        else if(top>maxsize-1){
            System.out.println("\nstack OverFlow\n");
        }else{
        System.out.println("\nEnter number's Index Which you Want to change\n");
        int x=sc.nextInt();
        int b=top-x+1;
        System.out.println("\nEnter Number :");
        int d=sc.nextInt();
        a[b]=d;
        System.out.println("Value changed");
        }
    }
    void display(){
         if(top<0){
            System.out.println("\nstack Empty\n");
        }
        System.out.println("\nYour Stack\n");
        for(int i=top;i>=0;i--){
            System.out.println("\n");
            System.out.println(a[i]);
        }
    }
    void stop(){
        System.out.println("\n\n\nprogarm End\n\n\n");
        System.exit(0);
    }
}
public class P10{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0;
        stack s=new stack();
            while(n!=6){
            System.out.println("****************STACK OPRATIONS******************");
            System.out.println("\n\n\n");
            System.out.println("---------------------------------------------");
            System.out.println("\nEnter below Number to Perfrom stack oprations\n");
            System.out.println("1.PUSH\n\n2.POP\n\n3.PEEP\n\n4.PEEK\n\n5.CHANGE\n\n6.DISPLAY\n\n7.STOP\n\n");
            n=sc.nextInt();
            switch(n){
            case 1:
                {
                    s.push();
                    break;
                }
            case 2:
                {
                    s.pop();
                    break;
                }
            case 3:
                {
                    s.peep();
                    break;
                }
            case 4:
                {
                    s.peek();
                    break;
                }
            case 5:
                {
                   s.change();
                   break;
                }
            case 6:
                {
                    s.display();
                    break;
                }
            case 7:
                {
                    s.stop();
                    break;
                }
            default:
                System.out.println("Enter valid Input");

            }
        }
    }
} 
 
