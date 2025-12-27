import java.util.*;
public class Q69 {
    public static void main(String[] args){
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int i = 0;

        while ((long) i * i <= x) {
            i++;
        }

        System.out.println(i-1);
        sc.close();
    }
}
}

