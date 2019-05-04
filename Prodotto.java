public class Prodotto {

    protected String nome;
    protected double prezzo;

    public Prodotto(String nome, double prezzo){
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public Prodotto(){/*this(null,0);*/}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "nome: " + this.nome + " prezzo: " + this.prezzo + "\n";
    }
}
