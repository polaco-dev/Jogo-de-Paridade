public class Computador {
    private int numeroAleatorio;

    public Computador() {

    }
    
    public int gerarNumero() {
        numeroAleatorio = (int)(Math.random() * 6);
        return numeroAleatorio;
    }

    public int getNumeroAleatorio() {
        return numeroAleatorio;
    }
}