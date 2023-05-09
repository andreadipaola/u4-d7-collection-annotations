package esercizio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int listLength = 7;
		boolean isEven = true;
		List<Integer> randomList = createRandomList(listLength);
		List<Integer> customList = createCustomList(randomList);

		System.out.println();
		System.out.println("Random List: " + randomList);
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Custom List: " + customList);
		System.out.println("--------------------------------------------------------------------------");

		createEvenOrOddList(customList, isEven);
	}

	public static List<Integer> createRandomList(int randomListLength) {
		List<Integer> randomList = new ArrayList<Integer>();
		Random randomNumber = new Random();
		int i = 0;
		while (i < randomListLength) {
			randomList.add(randomNumber.nextInt(101));
			i++;
		}
		Collections.sort(randomList);
		return randomList;
	}

	public static List<Integer> createCustomList(List<Integer> list) {
		List<Integer> customList = new ArrayList<Integer>(list);
		customList.addAll(new ArrayList<Integer>(list));
		Collections.reverse(customList);
		return customList;
	}

	public static void createEvenOrOddList(List<Integer> list, boolean isEven) {
		System.out.print("Valori in posizioni ");
		if (isEven) {
			System.out.print("pari: ");
		} else {
			System.out.print("dispari: ");
		}
		int i = 0;
		while (i < list.size()) {
			if (isEven && i % 2 == 0) {
				System.out.print(list.get(i) + " ");
			} else if (!isEven && i % 2 != 0) {
				System.out.print(list.get(i) + " ");
			}
			i++;
		}
	}

}
