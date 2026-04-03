public class counter {
    static int number = 0;
    public static void loop() {
        number++;
        System.out.println(number);
    }
    public static void main(String[] args) {
        while (number != 10) {
            loop();
        }
    }
}
