import java.util.*;
public class memoryG {
    static int generatedN = 0;
    static int userinput = 0;
    public static void RNG() {
        Random rand = new Random();
        generatedN = rand.nextInt(1000) + 1;
        System.out.println("Your number is "+generatedN+", remember it!");
        try {
            Thread.sleep(3000); // waits for 2000 milliseconds (2 seconds)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void erase() {
        for (int i = 1; i <= 150; i++) {
            System.out.println("");
        }
    }
    public static void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What was your number?");
        userinput = scan.nextInt();
        if (userinput == generatedN) {
            System.out.println("Well done!");
        } else {
            System.out.println("FAILURE");
        }
        scan.close();
    }
    public static void main(String[] args) {
        RNG();
        erase();
        input();
    }
}
