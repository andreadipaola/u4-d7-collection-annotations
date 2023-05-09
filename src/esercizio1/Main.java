package esercizio1;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		HashSet<String> distinctWords = new HashSet<String>();
		HashSet<String> duplicatedWords = new HashSet<String>();

		System.out.print("Inserisci il numero di parole che vorresti aggiungere: ");
		int wordToEnter = scanner.nextInt();
		System.out.println("----------------------------------------------------------");

		int i = 0;
		while (i < wordToEnter) {
			System.out.print("Inserisci la parola: ");
			String word = scanner.next();
			if (!distinctWords.add(word)) {
				duplicatedWords.add(word);
			}
			i++;
		}
		scanner.close();
		System.out.println("----------------------------------------------------------");
		System.out.println("Le parole duplicate: " + duplicatedWords);
		System.out.println("Numero di parole distinte: " + distinctWords.size());
		System.out.println("Parole distinte: " + distinctWords);
	}
}
