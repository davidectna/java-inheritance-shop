package shop.java;

/*Creare la classe Prodotto che gestisce i prodotti dello shop. Un prodotto � caratterizzato da:
- codice (numero intero)
- nome
- marca
- prezzo
- iva
Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter
 ed eventuali altri metodi di �utilit�� per fare in modo che:
- il codice prodotto sia accessibile solo in lettura
- gli altri attributi siano accessibili sia in lettura che in scrittura
- il prodotto esponga un metodo per avere il prezzo comprensivo di iva formattato
  Lo shop gestisce diversi tipi di prodotto:
- Smarphone, caratterizzati anche dal codice IMEI e dalla quantit� di memoria
- Televisori, caratterizzati dalle dimensioni e dalla propriet� di essere smart oppure no
- Cuffie, caratterizzate dal colore e se sono wireless o cablate
Utilizzate l�ereditariet� per riutilizzare il codice di Prodotto nella stesura delle classi che gestiscono
 i vari sotto tipi di prodotto e testate le funzionalit� delle vostre classi in una classe Main con metodo main.*/

public class Cuffie extends Prodotto {
	//attributes
	private String colore;
	private boolean wireless;
	public Cuffie(int productCode, String productName, String productBrand, int productPrice, int iva, String colore, boolean wireless) {
		super(productCode, productName, productBrand, productPrice, iva);
	this.colore = colore;
	this.wireless = wireless;
	
	}
	
	

}
