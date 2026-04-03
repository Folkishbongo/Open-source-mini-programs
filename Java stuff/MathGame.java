import java.util.*;

public class MathGame {
    static int x = 0;
    static int y = 0;
    static int solution = 0;
    static boolean continuegame = true;
    static int correct = 0;
    static int mathmode = 0;
    static int clientinput = 0;
    public static void serverlogic() {
        Random rand = new Random();
        mathmode = rand.nextInt(3) + 1;
        x = rand.nextInt(10) + 1;
        y = rand.nextInt(10) + 1;
        if (mathmode == 1) {
            solution = x + y;
            System.out.println("What is " + x + " + " + y + "?");
        } else if (mathmode == 2) {
            solution = x - y;
            System.out.println("What is " + x + " - " + y + "?");
        } else if (mathmode == 3) {
            solution = x * y;
            System.out.println("What is " + x + " x " + y + "?");
        } else {
            System.out.println("???");
        }
    }
    public static void clientlogic() {
        Scanner scanner = new Scanner(System.in);
        clientinput = scanner.nextInt();
        if (clientinput == solution) {
            System.out.println("Correct!");
            correct = correct + 1;
        } else {
            System.out.println("Wrong! End of streak...");
            continuegame = false;
        }
    }
    public static void main(String[] args) {
        while (continuegame == true) {
            serverlogic();
            clientlogic();
        }
        System.out.println("You did a streak of " + correct + " correct answers! Congratulations!");
    }
}