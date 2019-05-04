public class Alimentare extends Prodotto {
    private String dataScadenza;

    public Alimentare(String nome, double prezzo, String dataScadenza){
        super(nome, prezzo);
        this.dataScadenza=dataScadenza;
    }

    public Alimentare(){/*this(null,0,null);*/}

    public String getDataScadenza() {
        return dataScadenza;
    }

    public void setDataScadenza(String dataScadenza) {
        this.dataScadenza = dataScadenza;
    }
}
