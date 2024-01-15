public class Principal {
    static int NUM_VECES = 10; //10 veces por cada hilo
    static int NUM_HILOS = 10; //10 hilos

    public static void main(String[] args) {
        Contador contador = new Contador();

        // CREAMOS Y EJECUTAMOS LOS  10 HILOS
        Thread[] hilos = new Thread[NUM_HILOS];
        for (int i = 0; i < NUM_VECES; i++) {
            hilos[i] = new Hilo(contador);
            hilos[i].start();
        }

        //Se ejecutan
        for (int i = 0; i < 10; i++) {
            try {
                hilos[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        System.out.println("El valor final del contador es: " + contador.getContador());
    }
}
