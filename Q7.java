public class Q7 {
    public static void main(String[] args)
    {   
        int x = 121 ;
        int result = 0;

        while (x != 0) {
            int digit = x % 10;   // pop last digit
            x /= 10;

            // Check overflow for positive side
            if (result > Integer.MAX_VALUE / 10 ||
                (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                System.out.println(0);
            }

            // Check overflow for negative side
            if (result < Integer.MIN_VALUE / 10 ||
                (result == Integer.MIN_VALUE / 10 && digit < -8)) {
                System.out.println(0);
            }

            result = result * 10 + digit;   // push digit
        }

        System.out.println(result);
    }
}

