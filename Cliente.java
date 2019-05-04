import java.util.LinkedList;

public class Cliente {
    private double budget;
    LinkedList <Prodotto> prodottiDaAcquistare = new LinkedList<Prodotto>();


    public Cliente(double budget, Prodotto element){
        this.budget = budget;
        prodottiDaAcquistare.add(element);
    }

    public Cliente(Prodotto element){
        prodottiDaAcquistare.add(element);
    }

    public Cliente(){this(0,null);}

    public double getBudget() {
        return budget;
    }

    public void setBudget(float budget) {
        this.budget = budget;
    }

    public LinkedList<Prodotto> getProdottiDaAcquistare() {
        return prodottiDaAcquistare;
    }

    public void setProdottiDaAcquistare(LinkedList<Prodotto> prodottiDaAcquistare) {
        this.prodottiDaAcquistare = prodottiDaAcquistare;
    }

    @Override
    public String toString() {
        String s = "";
        s += prodottiDaAcquistare;
        return s;
    }
}
