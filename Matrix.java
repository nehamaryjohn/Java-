import java.util.Scanner;

class Matrix{
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter number of rows and columns:");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        System.out.println("Enter Matrix1:");
        int[][]matrix1 = new int[rows][cols];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                matrix1[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Enter matrix2:");
        int[][]matrix2 = new int[rows][cols];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Result of Addition:");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.println(matrix1[i][j]+matrix2[i][j]);
            }
            System.out.println();
        }
        scanner.close();
    }
}