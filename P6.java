import java.util.Scanner;

/*6. Read two matrices, first 3x2 and second 2x3, perform multiplication operation
and store result in third matrix and print it. (HomeWork)*/
public class P6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre First Matrix:");
        int[][] a=new int[3][2];
        for (int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Entre Second Matrix:");
        int[][] b=new int[2][3];
        for (int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("MULTIPLICATION OF MATRIX FIRST AND SECOND");
        int[][] c=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=((a[i][0])*(b[0][j])+(a[i][1])*(b[1][j]));
                System.out.println(c[i][j]);
            }
        }
    }
}