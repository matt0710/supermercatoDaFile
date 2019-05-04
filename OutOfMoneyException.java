public class OutOfMoneyException extends Exception {
    public OutOfMoneyException(){
        System.err.println("L'insieme di prodotti da acquistare supera il budget!");
    }
}
