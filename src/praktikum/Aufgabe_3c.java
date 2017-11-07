package praktikum;

import java.io.IOException;

public class Aufgabe_3c {

	public static void main(String[] args) {

		int a, b, c, d, e, f;
		System.out.println("Bitte Unicode eingeben");
		try {
			a = System.in.read();
			b = System.in.read();
			c = System.in.read();
			d = System.in.read();
			e = System.in.read();
			f = System.in.read();
		} catch (IOException Ausgabe) {
			System.out.println("Falsche oder keine Eingabe");
			return;
		}
		if (a == '\\') {
			if (b == 'u') {
				if (c == '0' && d == '0') {
					if (e == '3') {
						if (f >= '0' && f <= '9') {
							System.out.println("Es handelt sich um eine Zahl zwischen 1 und 9");
						} else {
							System.out.println("Falsche eingabe");
							return;
						}
					}
					if (e == '6') {
						if (f >= '1' && f <= '9' || f >= 'a' && f <= 'f') {
							System.out.println("Es handelt sich um einen Buchstaben");
						} else {
							System.out.println("Falsche eingabe");
							return;
						}
					}
					if (e == '7') {
						if (f >= '0' && f <= '9' || f == 'a') {
							System.out.println("Es handelt sich um einen Buchstaben");
						} else {
							System.out.println("Falsche Eingabe");
							return;
						}
					}
				} else {
					System.out.println("Falsche Eingabe");
				}
			} else {
				System.out.println("Falsche Eingabe");
			}
		} else {
			System.out.println("keine oder falsche Eingabe");
			return;
		}
	}

}
