package main;

public class Main {
	

	public static void main(String[] args) {

		int[] sayilar = new int[] { 1, 3, 5, 7, 9 };
		int aranacak = 7;
		boolean  varMi= false;

		for (int sayi : sayilar) { // wordlist tarar(listeyi doner).

			if (sayi == aranacak) {
				System.out.println("var");

			} else {

				System.out.println("yok");

			}

		}

	}
}

