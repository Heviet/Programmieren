package praktikum;

import java.io.IOException;

public class Aufgabe_3b {

	public static void main(String[] args) {

		int operand1, operator, operand2; // Integer für Operation werden erstellt

		System.out.println("Bitte Operation eingeben");
		try { // einlesen der Operation
			operand1 = System.in.read();
			operator = System.in.read();
			operand2 = System.in.read();
		} catch (IOException Ausgabe) {
			System.out.println("Falsche oder keine Eingabe"); // fehler für Eingabe von zu wenig/vielen oder keinen
																// Operanden
			return;

		}

		boolean op1 = false, op2 = false;

		if (operand1 == 'T') {
			op1 = true;
		} else if (operand1 == 'F') {
			op1 = false;
		} else if (operand1 == 't' || operand1 == 'f') {
			System.out.println("Bitte Großbuchstaben für die Deklarierung verwenden");
		} else {
			System.out.println("Falsche Eingabe");
			return;
		}

		if (operand2 == 'T') {
			op2 = true;
		} else if (operand2 == 'F') {
			op2 = false;
		} else if (operand2 == 't' || operand2 == 'f') {
			System.out.println("Bitte Großbuchstaben für die Deklarierung verwenden");
		} else {
			System.out.println("Falsche Eingabe");
			return;
		}

		boolean ergebnis;

		if (operator == '&') {
			ergebnis = op1 & op2;
		} else if (operator == '|') {
			ergebnis = op1 | op2;
		} else if (operator == '^') {
			ergebnis = op1 ^ op2;
		} else {
			System.out.println("Falsche Eingabe für Operator");
			return;
		}

		System.out.println("Ergebnis = " + ergebnis);
	}
}
