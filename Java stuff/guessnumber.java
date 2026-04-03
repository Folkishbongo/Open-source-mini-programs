import java.util.*;

public class guessnumber {
    static int numbertoguess = 0;
    static int numberinput = 0;
    static boolean continuegame = true;
    static int attempts = 0;
    public static void gamesetup() {
        Random rand = new Random();
        numbertoguess = rand.nextInt(100) + 1;
        System.out.println("Type a number from 1 to 100!");
    }
    public static void mainloop() {
        Scanner scanner = new Scanner(System.in);
        numberinput = scanner.nextInt();
        if (numberinput < numbertoguess) {
            System.out.println("Too low!");
            attempts = attempts + 1;
        } else if (numberinput > numbertoguess) {
            System.out.println("Too high!");
            attempts = attempts + 1;
        } else {
            System.out.println("Correct!");
            attempts = attempts + 1;
            continuegame = false;
        }
    }
    public static void main(String[] args) {
        gamesetup();
        while (continuegame == true) {
            mainloop();
        }
        System.out.println("You did this in " + attempts + " attempts! Congratulations!"); 
    }
}
