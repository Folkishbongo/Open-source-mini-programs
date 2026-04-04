import java.util.*;
public class filesys {
    static List<Integer> files = new ArrayList<>();
    static int action = 0;
    static int cellaction = 0;
    static int userinputdata = 0;
    static boolean userapprove = false;
    public static void setup() {
        files.add(0);
        files.add(0);
        files.add(0);
    }
    public static void program() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type your action (1=edit, 2=delete, 3=read all, 4=add cell, 5=wipe out a cell, 6=KILL EVERYTHING)");
        action = scan.nextInt();
        if (action == 1) {
            System.out.println("Which cell do you want to edit?");
            cellaction = scan.nextInt();
            cellaction = cellaction - 1;
            System.out.println("What number do you want to store in there?");
            userinputdata = scan.nextInt();
            files.set(cellaction, userinputdata);
        } else if (action == 2) {
            System.out.println("Which cell do you want to wipe out?");
            cellaction = scan.nextInt();
            cellaction = cellaction - 1;
            files.set(cellaction, 0);
        } else if (action == 3) {
            System.out.println(files);
        } else if (action == 4) {
            files.add(0);
        } else if (action == 5) {
            System.out.println("Which cell do you want to kill?");
            cellaction = scan.nextInt();
            cellaction = cellaction - 1;
            files.remove(cellaction);
        } else if (action == 6) {
            System.out.println("Are you sure? (true or false)");
            userapprove = scan.nextBoolean();
            if (userapprove == true) {
                files.clear();
                setup();
            } else {
                System.out.println("Operation was denied");
            }
        }
    }
    public static void main(String[] args) {
        setup();
        System.out.println("(The default set of cells is 3)");
        while (true) {
            program();
        }
    }
}
