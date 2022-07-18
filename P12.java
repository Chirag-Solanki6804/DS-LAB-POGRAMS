// 12. Implement a program to convert in-fix notation to post-fix notation using stack
import java.util.*;
import java.io.*;
public class P12 {
    static P12 i1 = new P12();
    public static void main(String[] args) {
        System.out.println("Enter a Infix String : ");
        Scanner sc = new Scanner(System.in);
        String infix = sc.nextLine();
        System.out.println("PostFix Expression : " + i1.ItoP(infix));
    }

    char[] arr1 = new char[100];
    static int top = -1;

    public void push(char n) {
        if (top >= 100) {
            System.out.println("STACK OVERFLOW");
        }
        top++;
        arr1[top]=n;
    }

    public char pop() {
        if (top == -1) {
            System.out.println("STACK UNDERFLOW");
            return 0;
        }
        return arr1[top--];
    }

    public char peek() {
        if (top <= -1) {
            System.out.println("STACK UNDERFLOW");
            return 0;
        }
        return arr1[top];
    }

    public int SetPrecedenc(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return ch;
    }

    public String ItoP(String infix) {
        char symobl;
        String PostFix = "";
        for (int i = 0; i < infix.length();i++) {
            symobl = infix.charAt(i);
            if (Character.isLetter(symobl)) {
                PostFix += symobl;
            } else if (symobl == '(') {
                i1.push(symobl);
            } else if (symobl == ')') {
                while (i1.peek() != '(') {
                    PostFix += pop();
                }
                i1.pop();
            } else {
                while (top != -1 && !(i1.peek() == '(') && SetPrecedenc(symobl) <= SetPrecedenc(i1.peek())) 
                    PostFix += i1.pop();
                    i1.push(symobl);
                }
            }        
        while (top != -1) {
            PostFix += i1.pop();
        }
        return PostFix;
    }
}
