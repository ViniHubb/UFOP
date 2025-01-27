public class Incrementa extends Thread {
    private Contador count;
    public Incrementa(Contador count) {
        this.count = count;
    }
    
    public void run() {
        for (int i = 0; i <= 100000; i++) {
            count.Incrementa();
        }
    }
}
