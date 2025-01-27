public class Decrementa extends Thread {
    private Contador count;
    public Decrementa(Contador count) {
        this.count = count;
    }

    public void run() {
        for (int i = 0; i <= 100000; i++) {
            count.Decrementa();
        }
    }
}