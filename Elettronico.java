public class Elettronico extends Prodotto {

    private int garanzia;

    public Elettronico(String nome, double prezzo, int garanzia) {
        super(nome, prezzo);
        this.garanzia = garanzia;
    }

    public Elettronico(){this(null,0,0);}

    public int getGaranzia() {
        return garanzia;
    }

    public void setGaranzia(int garanzia) {
        this.garanzia = garanzia;
    }
}
