import java.util.*;

public class Greet {
    static String name = "Hey";
    public static void ask() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        name = scan.nextLine();
        System.out.println("Welcome, " + name);
    }
    public static void main(String[] args) {
        ask();
    }
}
