# supermercatoDaFile
Si consideri la classe Supermercato costituito da una lista di Prodotti; ciascun prodotto è
caratterizzato da un nome e un prezzo e può essere di tipo Alimentare o Elettronico.
Il prodotto alimentare è caratterizzato da una data di scadenza, mentre il prodotto elettronico dalla
garanzia. È possibile aggiungere o rimuovere prodotti dal supermercato.
Si implementi inoltre il metodo toString che stampa nel seguente formato i prodotti disponibili:
nome prodotto1 \t prezzo1
nome prodotto2 \t prezzo2
.
.
.
nome prodotton \t prezzon
Infine, si consideri la classe Cliente, caratterizzata da una lista di prodotti da acquistare (da cui è
possibile aggiungere o rimuovere un prodotto) e da un budget iniziale. Nel caso in cui l’insieme di
prodotti da comprare superi il budget previsto, viene lanciata l’eccezione OutOfMoneyException.

Si utilizzino due file: uno contenente la lista di elementi acquistabili da un supermercato ed uno contetente la lista degli acquisti di 
un cliente. Verificare poi quali elementi che il cliente vuole acquistare siano presenti nel supermercato.
