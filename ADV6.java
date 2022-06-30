import java.util.Scanner;

public class ADV6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("How Many Rows in First Matrix?? :");
        int fr=s.nextInt();
        System.out.print("How Many columns in First Matrix?? :");
        int fc=s.nextInt();
        System.out.print("How Many Rows in Second Matrix?? :");
        int sr=s.nextInt();
        System.out.print("How Many columns in Second Matrix?? :");
        int sc=s.nextInt();
        if(fr==sc&&fc==sr) {
            int[][] a = new int[fr][fc];
            System.out.println("Enter First Matrix :");
            for (int i = 0; i < fr; i++) {
                for (int j = 0; j < fc; j++) {
                    a[i][j] = s.nextInt();
                }
            }
            int[][] b = new int[sr][sc];
            System.out.println("Enter Second Matrix :");
            for (int i = 0; i < sr; i++) {
                for (int j = 0; j < sc; j++) {
                    b[i][j] = s.nextInt();
                }
            }
            int[][] c = new int[fr][sc];
            System.out.println("Multiplication Of First And Second Is: ");
            for (int i = 0; i < fr; i++) {
                for (int j = 0; j < sc; j++) {
                    c[i][j] = (a[i][0]) * (b[0][j]) + (a[i][1]) * (b[1][j]);
                    System.out.println(c[i][j]);
                }
            }
        }
        else{
            System.out.println("Multiplication Is Not Possible");
        }
    }
}
