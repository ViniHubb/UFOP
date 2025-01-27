public class Contador {
    int value;
    public Contador() {
        this.value = 0;
    }

    public void Incrementa() {
        this.value += 1;
    }

    public void Decrementa() {
        this.value -= 1;
    }

    public int GetValor() {
        return value;
    }
}
