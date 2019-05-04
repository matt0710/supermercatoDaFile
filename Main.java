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

        for(int i=0; i<3 && str != null; i++){

            prod1[i].setNome(str);
            str = reader.readLine();

        }
        double p = reader.read();
        int s = 0;
        for(int j=3; j<6; j++){
            prod1[s].setPrezzo(p);
            p = reader.read();
            s++;
        }

        return prod1;
    }

        public static void main(String[] args){
        String path = "";
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("inserisci la path: ");
            path = sc.nextLine();

            String[] prova = getDataFromFile(path);

            for(int i=0; i<prova.length;i++){
                System.out.println(prova[i]);
            }

            Supermercato wmark = new Supermercato();

            Prodotto[] prodotto = new Prodotto[3];
            //for(int i=0; i<3; i++){
                prodotto = getProdottoFromFile(path);
            //}
            System.out.println(prodotto);

        }catch(IOException io) {}


    }
}
