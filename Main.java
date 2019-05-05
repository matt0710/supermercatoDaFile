import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.IOException;

public class Main {

    public static String[] getDataFromFile(String filePath) throws IOException {

        String data[] = {"", "", ""};
        BufferedReader reader = new BufferedReader(new FileReader(filePath));

        String str = reader.readLine();

        for (int i = 0; i < 3 && str != null; i++) {
            data[i] = str;
            str = reader.readLine();
        }

        return data;
    }

    public static Prodotto[] getProdottoFromFile(String path) throws IOException{

        Prodotto[] prod1 = new Prodotto[3];
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String str = reader.readLine();
        int s = 0;

        for(int i=0; i<3 && str != null; i++){
            //System.out.println(str + "________________");
            prod1[i] = new Prodotto(str,0);
            //System.out.println(prod1[i].getNome());
            //prod1[i].nome = str;
            str = reader.readLine();

        }

        for(int j=3; j<6; j++){
            prod1[s].setPrezzo(Double.parseDouble(str));
            str = reader.readLine();
            s++;
        }

        return prod1;
    }

    public static void main(String[] args){

        String path = "";
        String pathCliente = "";
        Scanner sc = new Scanner(System.in);
        double budget = 0;

        try {
            System.out.println("inserisci la path del supermercato: ");
            path = sc.nextLine();

            Supermercato wmark = new Supermercato();

            Prodotto[] prodotto = new Prodotto[3];

            prodotto = getProdottoFromFile(path);

            for(int i=0; i<prodotto.length; i++){
                wmark.listaProdotti.add(prodotto[i]);
            }
            System.out.println("LA LISTA DEL W-MARK E': " + wmark.getListaProdotti());

            //SECONDA PARTE

            System.out.println("\n\nInserisci la path del Cliente: ");
            pathCliente = sc.nextLine();
            System.out.println("Inserisci il budget: ");
            budget = sc.nextDouble();

            Cliente matteo  = new Cliente();
            Prodotto[] acquisti = new Prodotto[3];
            acquisti = getProdottoFromFile(pathCliente);

            double somma = 0;
            for(int i=0; i<acquisti.length; i++){
                somma += acquisti[i].getPrezzo();
            }
            System.out.println("La spesa totale è: " + somma);

            for(int i = 0; i<acquisti.length; i++)
                matteo.prodottiDaAcquistare.add(acquisti[i]);

            if(budget<somma)
                throw new OutOfMoneyException();

            System.out.println("La lista dei prodotti da acquistare è: " + matteo.getProdottiDaAcquistare());

            for(int i=0; i<acquisti.length; i++) {
                if (wmark.getListaProdotti().get(i)==acquisti[i]){
                    System.out.println("tutti gli elementi appartegnono al supermercato");
                }
                else{
                    System.out.println("l'elemento "+ acquisti[i].getNome() + " non appartiene al supermercato");
                }
            }
        }catch(IOException io) {}
        catch (OutOfMoneyException out){}


    }
}
