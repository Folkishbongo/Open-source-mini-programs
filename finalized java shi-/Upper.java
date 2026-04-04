import java.util.*;

public class Upper {
    static String name = "";
    static String yeah = "";
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type your name please");
        name = scan.nextLine();
        yeah = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        System.out.println("Welcome back, " + yeah);
        scan.close();
    }
}
