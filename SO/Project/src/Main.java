public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("");
        ExercicioUm();
        ExercicioDois();
        System.out.println("");
    }

    public static void ExercicioUm() throws InterruptedException {
        int[] vector = {1,2,3,4,5,6,7,8,9,10};

        Media average = new Media(vector);
        Mediana median = new Mediana(vector);

        average.start();
        median.start();

        average.join();
        System.out.println("=======================================");
        System.out.println(" A media dos valores do vetor: " + average.GetResult());
        System.out.println("=======================================");

        median.join();
        System.out.println("=======================================");
        System.out.println(" A mediana dos valores do vetor: " + median.GetResult());
        System.out.println("=======================================");
    }

    public static void ExercicioDois() throws InterruptedException {

        Contador count = new Contador();

        Incrementa increment = new Incrementa(count);
        Decrementa decrement = new Decrementa(count);

        increment.start();
        decrement.start();

        increment.join();
        decrement.join();
        
        System.out.println("=======================================");
        System.out.println(" Valor final do contador: " + count.GetValor());
        System.out.println("=======================================");
    }
}
