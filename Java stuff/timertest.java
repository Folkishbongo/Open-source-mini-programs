public class timertest {
    public static void waitMs(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        System.out.println("READY???");
        waitMs(2000);
        System.out.println("ENDAVANT!");
    }
}
