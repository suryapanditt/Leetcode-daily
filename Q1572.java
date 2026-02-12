import java.util.Scanner;
public class Q1572 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += mat[i][i];              
            ans += mat[n - 1 - i][i];      
        }
        if (n % 2 != 0) {
            ans -= mat[n / 2][n / 2];      
        }
        System.out.println(ans);
        sc.close();
    }
}
