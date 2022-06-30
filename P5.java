import java.util.Scanner;

// 5. Read two 2x2 matrices and perform addition of matrices into third matrix and print it
public class P5 {
    public static void main(String[] args) {
        int[][] a=new int[2][2];
        Scanner sc= new Scanner(System.in);
        System.out.println("Entre First Matrix");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                a[i][j]= sc.nextInt();
            }
        }
        int[][] b=new int[2][2];
        System.out.println("Entre Second Matrix");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                b[i][j]= sc.nextInt();
            }
        }
        int[][] c=new int[2][2];
        System.out.println("ADDITION OF FIRST AND SECOND MATRIX:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                c[i][j]=a[i][j]+b[i][j];
                System.out.println(c[i][j]);
            }
        }
    }
}
