import java.util.*;
public class mathgame {
    static int x = 0;
    static int y = 0;
    static int mathmode = 0;
    static int userinput = 0;
    static int solution = 0;
    static int score = 0;
    static boolean loopon = true;
    public static void serverloic() {
        Random rand = new Random();
        x = rand.nextInt(10) + 1;
        y = rand.nextInt(10) + 1;
        mathmode = rand.nextInt(3) + 1;
        if (mathmode == 1) {
            solution = x + y;
            System.out.println("What is "+x+" + "+y+"?");
        } else if (mathmode == 2) {
            solution = x - y;
            System.out.println("What is "+x+" - "+y+"?");
        } else if (mathmode == 3) {
            solution = x * y;
            System.out.println("What is "+x+" x "+y+"?");
        }
    }
    public static void clientlogic() {
        Scanner scan = new Scanner(System.in);
        userinput = scan.nextInt();
        if (userinput == solution) {
            System.out.println("Well done!");
            score ++;
        } else {
            System.out.println("Wrong!");
            loopon = false;
            scan.close();
        }
    }
    public static void main(String[] args) {
        while (loopon == true) {
            serverloic();
            clientlogic();
            System.out.println("");
        }
        System.out.println("You did "+score+" operations correctly before losing! Well done!");
    }
}