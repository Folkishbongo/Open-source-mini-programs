import java.util.*;
public class RandomDiscovery {
    static int number = 0;
    static int loop = 0;
    public static void main(String[] args) {
        while (loop != 10) {
            Random rand = new Random();
            number = rand.nextInt(3) + 1;
            System.out.println(number);
            loop ++;
        }
    }
}
