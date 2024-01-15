class Hilo extends Thread {
    private Contador contador;

    public Hilo(Contador contador) {
        this.contador = contador;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            contador.incrementar();
            System.out.println("Hilo " + Thread.currentThread().getId() + ": Contador = " + contador.getContador());
        }
    }
}
