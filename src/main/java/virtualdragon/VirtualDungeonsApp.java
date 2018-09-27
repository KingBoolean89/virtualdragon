package virtualdragon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VirtualDungeonsApp {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		VirtualDungeon castle = new VirtualDungeon();

		castle.addDragon("Drogon", "Dragon");
		castle.addDragon("Visery", "Dragon");
		System.out.println("Welcome To Castle Rock!");

		int turns = 25;
		while (!(turns == 0)) {
			displayValues(castle);
			menu();

			int userChoice = input.nextInt();
			input.nextLine();

			switch (userChoice) {
			case 1:
				tick();
				for (VirtualDragon dragon : ((VirtualDungeon) castle).getDragons()) {
					dragon.feed();
				}
				System.out.println("You fed all the dragons!");
				break;
			case 2:
				tick();
				for (VirtualDragon dragon : ((VirtualDungeon) castle).getDragons()) {
					dragon.fire();
				}
				System.out.println("You Hydrated the dragons");
				break;
			case 3:
				questMenu();
				for (VirtualDragon dragon : ((VirtualDungeon) castle).getDragons()) {
					dragon.quest();
					tick();
				}

				break;
			case 4:

				for (VirtualDragon dragon : ((VirtualDungeon) castle).getDragons()) {
					dragon.remove(dragon);
				}
				tick();

				break;
			case 5:
				castle.addDragon("Rhagaer", "Dragon");
				System.out.println("Rhagaer is born!");
				tick();
				break;
			case 6:
				System.out.println("Quitter!!!");
				System.exit(0);
				input.close();

				break;
			default:
				System.out.println("You did nothing.");
				break;
			}

		}

	}

	private static void tick() {
		// TODO Auto-generated method stub

	}

	private static void questMenu() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter numeric value that matches your selection");
		System.out.println("1. Quest with Drogon");
		System.out.println("2. Quest with Visery");
		int userChoice = input.nextInt();
		if (userChoice == 1) {
			System.out.println("Drogon is ready to go on a quest!!");

		} else {

			System.out.println("Visery is ready to go on a quest!!");

		}
	}

	private static void menu() {
		System.out.println("Enter numeric value that matches your selection");
		System.out.println("1. Feed  dragons");
		System.out.println("2. Hydrate your dragons");
		System.out.println("3. Play with a dragon");
		System.out.println("4. Free a dragon");
		System.out.println("5. Hatch a dragon");
		System.out.println("6. Exit game");
	}

	private static void displayValues(VirtualDungeon castle) {

		System.out.println("Here is the current status of all your Dragons:");
		System.out.println("Name	     |Hunger	      |Fire       |Thirst      |\r\n"
				+ "----------|---------|---------|----------|---------|---------");
		for (VirtualDragon dragons : castle.getDragons()) {
			System.out.println(dragons.getname() + "       |      " + dragons.getHungerLevel() + "       |       "
					+ dragons.getThirstLevel() + "      |     " + dragons.getfireLevel() + "|");

		}
	}
}
