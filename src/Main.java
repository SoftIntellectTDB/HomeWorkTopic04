import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		/*
		 * Напишете програма, която взема дадена цифра (0-9) и я изписва с дума
		 * (на англ. език)
		 */
		String str1 = in.nextLine();
		switch (str1) {
		case "0":
			System.out.println("нула");
			break;
		case "1":
			System.out.println("едно");
			break;
		case "2":
			System.out.println("две");
			break;
		case "3":
			System.out.println("три");
			break;
		case "4":
			System.out.println("четири");
			break;
		case "5":
			System.out.println("пет");
			break;
		case "6":
			System.out.println("шест");
			break;
		case "7":
			System.out.println("седем");
			break;
		case "8":
			System.out.println("осем");
			break;
		case "9":
			System.out.println("девет");
			break;
		}

		/*
		 * Напишете програма, която изчислява бонус точки на база резултат от
		 * игра. Потребителят трябва да въведе своите точки в интервалa[1;9].
		 * Ако точките са в интервала [1;3], умножете ги по 5. Ако точките са в
		 * интервала [4;6], умножете ги по 10. Ако точките са в интервала [7;9],
		 * умножете ги по 50. Резултатът изведете на екрана.
		 */
		int score = in.nextInt();
		switch (score) {
		case 1:
		case 2:
		case 3:
			score = score * 5;
			break;
		case 4:
		case 5:
		case 6:
			score = score * 10;
			break;
		case 7:
		case 8:
		case 9:
			score = score * 50;
			break;
		}
		System.out.println(score);

		/*
		 * Класическото тесте карти се състои от 13 различни вида карти
		 * съответно 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K and A. Направете
		 * програма, която приема от конзолата един символ и принтира
		 * "Валидна карта", ако символът представлява валидна карта, и съответно
		 * принтира "Невалидна карта", ако символът е на невалидна карта.
		 */
		char card = in.next().charAt(0);
		if (card == '2' || card == '3' || card == '4' || card == '5'
				|| card == '6' || card == '7' || card == '8' || card == '9'
				|| card == 'T' || card == 'J' || card == 'Q' || card == 'K'
				|| card == 'A') {
			System.out.println("Валидна карта!");
		} else {
			System.out.println("Невалидна карта!");
		}
	}
}
