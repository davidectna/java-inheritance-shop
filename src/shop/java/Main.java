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

public class Main {
    public static void main(String[] args) {
    	
    	Random random = new Random();
    	
    	int productCode = random.nextInt((10000)+1);
    	String  imeiFirstPart = "IMEI" + random.nextInt((40000)+20000);
    	String imeiGeneraton = imeiFirstPart + random.nextInt((10000)+5000);
    	
    	Smartphone Iphone13 = new Smartphone(productCode,"Iphone 13","Apple",1300,22,imeiGeneraton,"128 GB");
    	System.out.println(Iphone13);
    	
	}
}
