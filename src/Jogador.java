public class Jogador {

    private String nome;
    private String escolha;
    private int numero;

    public Jogador() {

    }

    public Jogador(String nome, String escolha, int numero) {
        this.nome = nome;
        this.escolha = escolha;
        this.numero = numero;   
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEscolha() {
        return escolha;
    }

    public void setEscolha(String escolha) {
        this.escolha = escolha;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}