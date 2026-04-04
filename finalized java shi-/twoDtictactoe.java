import java.util.*;

public class twoDtictactoe {
    static ArrayList<Integer> firstrow = new ArrayList<>();
    static ArrayList<Integer> secondrow = new ArrayList<>();
    static int Xcurrentpos = 0;
    static int Ycurrentpos = 0;
    static int Pturn = 1;
    static int turns = 0;
    public static void setup() { //Setup thing
        firstrow.add(0);
        firstrow.add(0);
        secondrow.add(0);
        secondrow.add(0);
    }

    public static void ask() { //Game thing
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Type X:");
        Xcurrentpos = scan.nextInt();
        Xcurrentpos = Xcurrentpos - 1;
        System.out.println("Type Y:");
        Ycurrentpos = scan.nextInt();
        if (Ycurrentpos == 1) {
            secondrow.set(Xcurrentpos, Pturn);
        } else if (Ycurrentpos == 2) {
            firstrow.set(Xcurrentpos, Pturn);
        }
    }

    public static void switchturns() { //Game thing helper
        if (Pturn == 1) {
            Pturn = 2;
            System.out.println("Player 2 turn!");
        } else if (Pturn == 2) {
            Pturn = 1;
            System.out.println("Player 1 turn!");
        }
    }

    public static void display() { //C
        System.out.println(firstrow);
        System.out.println(secondrow);
    }
    public static void main(String[] args) {
        System.out.println("Welcome! Player 1 starts");
        setup();
        display();
        while (turns != 3) {
            ask();
            switchturns();
            display();
            turns = turns + 1;
        }
        System.out.println("Player 1 won!");
    }
}
