import java.util.*;

public class king {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();

        int sum = 0;
        for (int j = 0; j < n; j++) sum += a[0][j];

        for (int i = 0; i < n; i++) {
            int row = 0, col = 0;
            for (int j = 0; j < n; j++) {
                row += a[i][j];
                col += a[j][i];
            }
            if (row != sum || col != sum) { System.out.println("no"); return; }
        }

        int d1 = 0, d2 = 0;
        for (int i = 0; i < n; i++) {
            d1 += a[i][i];
            d2 += a[i][n - i - 1];
        }

        System.out.println((d1 == sum && d2 == sum) ? "yes" : "no");
    }
}
