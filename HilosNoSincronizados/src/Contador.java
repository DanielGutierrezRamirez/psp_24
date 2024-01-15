public class Contador {
    private int contador=0;


    public Contador() {
        this.contador = 0;
    }

    public int getContador() {
        return contador;
    }

    public synchronized void incrementar() {
        contador++;
    }
}
