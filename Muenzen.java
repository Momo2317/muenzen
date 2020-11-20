package muenzen;
import java.util.Scanner;

/* Ein/e Freund/in arbeitet an der Kasse und hat Probleme das Wechselgeld mit möglichst wenig Münzen zusammen zustellen.
 * Helfen Sie ihm/ihr mit einem Programm was ausgibt wie oft welche Münzen gebraucht wird um das Wechselgeld mit so wenig
 * Münzen wie möglich zusammen zu stellen. Gehen Sie von Euro- und Centbeträgen aus.
 */

public class Muenzen {
	public static void main(String[] args) {
		
		// Scanner initialisieren, damit in der Konsole ein beliebiger Wert an Wechselgeld eingegeben werden kann
		Scanner in = new Scanner(System.in);
		
		// Fordert den Benutzer auf, einen Wert einzugeben z.B.: 5,99€
		System.out.print("Geben Sie das Wechselgeld ein: ");
		
		// Der eingegebener Wert wird in die Variable "wechselgeld" gespeichert
		double wechselgeld = in.nextDouble();
		
		// Wechselgeld wird mit int gecastet, da die Variable wechselgeld ein double ist. Danach multipliziert mit 100, um eine glatte Zahl zu erhalten z.B.: 599€
		int uebrig = (int)(wechselgeld * 100);
		
		// 599€ wird mit 200 dividiert und man erhält 2,995. Da diese Variable einen integer Wert erwartet, werden die Nachkommastellen ignoriert. Also Anzahl der 2€ Münzen sind 2
		int anzahlZweiEuroMuenzen = uebrig / 200;
		
		// Diese Variable wird mit Modulo 200 berechnet. Also 599 % 200 = 199 (Rest)
		uebrig %= 200;
		
		// Und so weiter...
		int anzahlEinEuroMuenzen = uebrig / 100;
		uebrig %= 100;
		
		int anzahlFuenfzigCentMuenzen = uebrig / 50;
		uebrig %= 50;
		
		int anzahlZwanzigCentMuenzen = uebrig / 20;
		uebrig %= 20;
		
		int anzahlZehnCentMuenzen = uebrig / 10;
		uebrig %= 10;
		
		int anzahlFuenfCentMuenzen = uebrig / 5;
		uebrig %= 5;
		
		int anzahlZweiCentMuenzen = uebrig / 2;
		uebrig %= 2;
		
		int anzahlEinCentMuenzen = uebrig / 1;
		uebrig %= 1;
		
		// In der Konsole werden die Anzahl der Münzen sortiert ausgegeben
		System.out.println( "Das Wechselgeld " + wechselgeld + " bestehen aus: \n " + "\t" + 
							anzahlZweiEuroMuenzen + "x 2€ Münze/n \n" + "\t" + 
							anzahlEinEuroMuenzen + "x 1€ Münze/n \n" + "\t" + 
							anzahlFuenfzigCentMuenzen + "x 0,50€ Münze/n \n" + "\t" + 
							anzahlZwanzigCentMuenzen + "x 0,20€ Münze/n \n" + "\t" + 
							anzahlZehnCentMuenzen + "x 0,10€ Münze/n \n" + "\t" + 
							anzahlFuenfCentMuenzen + "x 0,05€ Münze/n \n" + "\t" + 
							anzahlZweiCentMuenzen + "x 0,02€ Münze/n \n" + "\t" + 
							anzahlEinCentMuenzen + "x 0,01€ Münze/n \n" + "\t");
	}
}
