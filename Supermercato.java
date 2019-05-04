import java.util.LinkedList;

public class Supermercato {
    LinkedList <Prodotto> listaProdotti = new LinkedList<Prodotto>();

    public Supermercato(Prodotto element){
        listaProdotti.add(element);
    }
    public Supermercato(){}

    public LinkedList<Prodotto> getListaProdotti() {
        return listaProdotti;
    }

    public void setListaProdotti(LinkedList<Prodotto> listaProdotti) {
        this.listaProdotti = listaProdotti;
    }

    @Override
    public String toString() {
        String s = "";
         for(int i=0; i<listaProdotti.size(); i++){
            s+="nome: " + listaProdotti.get(i).getNome() + "\t" + " Prezzo: " + listaProdotti.get(i).getPrezzo()+"\n";
        }
         return s;
    }
}
