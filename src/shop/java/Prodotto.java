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

public class Prodotto {
	int productCode;
	private String productName;
	private String productBrand;
	private String productPrice;
	private String iva;
	
	
	public Prodotto(int productCode, String productName, String productBrand, String productPrice, String iva) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.productBrand = productBrand;
		this.productPrice = productPrice;
		this.iva = iva;
	}
	
	
}
