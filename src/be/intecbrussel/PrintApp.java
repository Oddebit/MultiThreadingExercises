package be.intecbrussel;

public class PrintApp {

    public static void main(String[] args) {
        Thread thread1 = new PrintThread('*', 100);
        Thread thread2 = new PrintThread('#', 100);

        thread1.start();
        thread2.start();
    }
}
