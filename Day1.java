import java.util.*;

public class Day1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();      
        sc.nextLine();            

        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
            strs[i] = sc.nextLine();
        }
        String result = "";

        if (strs != null && strs.length > 0) {
            for (int i = 0; i < strs[0].length(); i++) {
                char ch = strs[0].charAt(i);

                boolean match = true;

                for (int j = 1; j < strs.length; j++) {
                    if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
                        match = false;
                        break;
                    }
                }

                if (match) {
                    result += ch;
                } else {
                    break;
                }
            }
        }

        System.out.println(result);
        sc.close();
    }
}
