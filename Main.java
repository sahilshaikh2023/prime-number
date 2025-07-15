
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        for (int n = low; n <= high; n++) {
            int count = 0;
            for (int j = 2; j * j <= n; j++) {
                if (n % j == 0) {
                    count++;
                    break;
                }

            }
            if (count == 0) {  // this is main point to cheak the condition for the count is 0  or not 
                System.out.println(n);
            }

        }
    }
}
