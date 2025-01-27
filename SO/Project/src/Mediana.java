public class Mediana extends Thread {
    int[] vector;
    float result;
    public Mediana(int[] vector){
        this.vector = vector;
        this.result = 0;
    }

    public void run() {
        int half = vector.length/2;
        if (vector.length % 2 == 0) {
            this.result = (vector[half-1] + vector[half])/2.0F;
        }
        else {
            this.result = vector[half];
        }
    }

    public float GetResult( ){
        return this.result;
    }
}
