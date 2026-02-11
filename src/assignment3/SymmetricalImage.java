import java.util.Scanner;
public class SymmetricalImage {
        public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

        System.out.print("How many rows?");
        int n = in.nextInt();

        System.out.print("How many columns?");
        int m = in. nextInt();

        boolean [][] image= new boolean [n][m];

        int points = (n*m)/4;

        for (int i=0; i<points; i++) {
            int row = (int)(Math.random() * n);
            int col=(int)(Math.random()*m);
            int mirrorCol = m-1-col;

            image[row][col] = true;
            image [row][mirrorCol] = true;
        }

        System.out.println("Symmetrical Image");

        for (int r = 0; r<n; r++) {
            for (int a = 0; a<m; a++) {
                if (image[r][a]) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                }
                System.out.println();
            }
            in.close();
        }


}
