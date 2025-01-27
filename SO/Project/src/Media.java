public class Media extends Thread {
    int[] vector;
    int result;
    public Media(int[] vector) {
        this.vector = vector;
        this.result = 0;
    }

    public void run() {
        for (int i = 0; i < vector.length; i++) {
            this.result += vector[i];
        }
        this.result = result/vector.length;
    }

    public int GetResult( ){
        return this.result;
    }
}
