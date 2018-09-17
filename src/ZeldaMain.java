import java.util.Scanner;

public class ZeldaMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean moving = true;
		Zelda zelda = new Zelda();
		Link link = new Link();
		
		int random;
		
		
		
		while(moving) {
			random = (int) (Math.random()*50);
			
			if (random == 5) {
				link.printMyName();
				zelda.printMyName();
				Monster monster = new Monster();
				System.out.println("Ive encountered a Monster!");
				boolean run = false;
			while (monster.getHealth() >= 0 && !run) { //Using method to get health
				System.out.println("Monster Health: " + monster.getHealth());
				System.out.println("Links health: "+ link.getHealth());
			if (monster.getHealth() == 0) {
				System.out.println("UUUGAUHGHGHHHH, MONSTER SLAIN");
			}
			if (monster.getHealth() > 0)
				System.out.println("The Monster is attacking!");
				link.hasBeenAttacked(monster.attack());
				monster.attack();
				System.out.println("Do you want to Attack?");
			String question = scan.nextLine().toLowerCase(); //Can change their input to lowercase with.toLowerCase();
			if (question.equals("yes")) {
					
			}
			else {
				System.out.println("Do you want to run?");
			String input = scan.nextLine().toLowerCase(); //Asking for input
			if (input.equals("yes")){
				run = true;
			}
	
			}
			}
			if (random == 12) {
				
			}
			if (random == 23) {
				
			}
			if (random == 37) {
				
			}
			
			
			
			
			
		}

		}
}
}
