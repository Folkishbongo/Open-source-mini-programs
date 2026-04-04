import java.util.*;

public class RNG {
    static int maxnumber = 0;
    static int numbergenerated = 0;
    public static void askformaxnumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter max number here:");
        maxnumber = scan.nextInt();
    }
    public static void rngenerator() {
        Random rng = new Random();
        maxnumber = maxnumber + 1;
        numbergenerated = rng.nextInt(maxnumber);
        maxnumber = maxnumber - 1;
        System.out.println("Your random number from 0 to " + maxnumber + " is: " + numbergenerated);
    }
    public static void main(String[] args) {
        askformaxnumber();
        rngenerator();
    }
}
