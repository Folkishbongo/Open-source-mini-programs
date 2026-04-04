import java.util.*;
public class Probabilities {
    static int maxnumber = 1;
    static int numbergenerated = 1;
    static double percentage = 100;
    static int usernumber = 1;
    public static void inputrecord() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type the max number that can be generated (1 to x)");
        maxnumber = scan.nextInt();
        System.out.println("Which number do you think that will go out?");
        usernumber = scan.nextInt();
        scan.close();
    }
    public static void RNGlogic() {
        Random rand = new Random();
        numbergenerated = rand.nextInt(maxnumber) + 1;
        percentage = 100 / maxnumber;
    }
    public static void results() {
        System.out.println("Your RNG from 1 to "+maxnumber+" was "+numbergenerated+"! You had a "+percentage+"% chance of hitting that!");
        System.out.println("");
        System.out.println("(Decimal percentages are rounded up to just one decimal. If the result is '0.0%', is that it was VERY rare!)");
        System.out.println("");
    }
    public static void main(String[] args) {
        inputrecord();
        RNGlogic();
        results();
    }
}