package praktikum;

public class Aufgabe_3a {

	public static void main(String[] args) {
		boolean op1 = false; // boolean Variable op1 wird erstellt und auf false gesetzt
		boolean op2 = false; // boolean Variable op2 wird erstellt und ebenfalls auf false gesetzt

		System.out.println(" &&   | " + op2 + " | " + !op2); // && | op1( false) | op2(true) wird in der Konsole
																// ausgegeben
		System.out.println("------|-------|------"); // ------|-------|------ " " "
		System.out.println(op1 + " | " + (op1 && op2) + " | " + (op1 && !op2)); // op1(false) | (op1 && op2)false | (op1
																				// && !op2)false
		// && - Operator = und - Operator
		// || - Operator = oder - Operator
		op1 = !op1; // op1 wird negiert
		System.out.println(op1 + "  | " + (op1 && op2) + " | " + (op1 && !op2)); // (op1)true | (op1 && op2)false | (op1
																					// && !op2)true

		op1 = false;
		op2 = false;
		System.out.println(" ");
		System.out.println(" ||   | " + op2 + " | " + !op2);
		System.out.println("------|-------|------");
		System.out.println(op1 + " | " + (op1 || op2) + " | " + (op1 || !op2));
		op1 = !op1;
		System.out.println(op1 + "  | " + (op1 || op2) + "  | " + (op1 || !op2));

		op1 = false;
		op2 = false;
		System.out.println(" ");
		System.out.println("  |   | " + op2 + " | " + !op2);
		System.out.println("------|-------|------");
		System.out.println(op1 + " | " + (op1 | op2) + " | " + (op1 | !op2));
		op1 = !op1;
		System.out.println(op1 + "  | " + (op1 | op2) + "  | " + (op1 | !op2));

		op1 = false;
		op2 = false;
		System.out.println(" ");
		System.out.println(" &    | " + op2 + " | " + !op2);
		System.out.println("------|-------|------");
		System.out.println(op1 + " | " + (op1 & op2) + " | " + (op1 & !op2));
		op1 = !op1;
		System.out.println(op1 + "  | " + (op1 & op2) + " | " + (op1 & !op2));

		op1 = false;
		op2 = false;
		System.out.println(" ");
		System.out.println(" ^    | " + op2 + " | " + !op2);
		System.out.println("------|-------|------");
		System.out.println(op1 + " | " + (op1 ^ op2) + " | " + (op1 ^ !op2));
		op1 = !op1;
		System.out.println(op1 + "  | " + (op1 ^ op2) + "  | " + (op1 ^ !op2));

	}

}
