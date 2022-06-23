package shop.java;

import java.util.Random;

/*Creare la classe Prodotto che gestisce i prodotti dello shop. Un prodotto è caratterizzato da:
- codice (numero intero)
- nome
- marca
- prezzo
- iva
Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter
 ed eventuali altri metodi di “utilità” per fare in modo che:
- il codice prodotto sia accessibile solo in lettura
- gli altri attributi siano accessibili sia in lettura che in scrittura
- il prodotto esponga un metodo per avere il prezzo comprensivo di iva formattato
  Lo shop gestisce diversi tipi di prodotto:
- Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
- Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
- Cuffie, caratterizzate dal colore e se sono wireless o cablate
Utilizzate l’ereditarietà per riutilizzare il codice di Prodotto nella stesura delle classi che gestiscono
 i vari sotto tipi di prodotto e testate le funzionalità delle vostre classi in una classe Main con metodo main.*/

public class Smartphone extends Prodotto{
	//attributes 
	private String imeiCode;
	private String amountMemory;

	public Smartphone(int productCode, String productName, String productBrand, int productPrice, int iva,String imeiCode,String amountMemory) {
		super(productCode, productName, productBrand, productPrice, iva);
		this.imeiCode = imeiCode;
		this.amountMemory = amountMemory;
	}

	public String getImeiCode() {
		return imeiCode;
	}

	public void setImeiCode(String imeiCode) {
		this.imeiCode = imeiCode;
	}
	
	  @Override
	  public String toString() {

	    return super.toString() + "codice IMEI : " + imeiCode + " / capacità di memoria : " + amountMemory;
	  }

}
