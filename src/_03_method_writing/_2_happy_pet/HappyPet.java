package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	static String pet;
	static int hunger;
	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
		int petNum = JOptionPane.showOptionDialog(null, "Which pet would you like to adopt?", "Choose a Pet", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] {"Dog", "Cat", "Hamster"}, null);
		
		if (petNum == 0) {
			pet = "dog";
			hunger = 2;
		} else if (petNum == 1) {
			pet = "cat";
			hunger = 2;
		} else {
			pet = "hamster";
			hunger = 1;
		}
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
		for (int i = 0; i < 6; i++) {
			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What would you like to do with your " + pet + "?", "Make Pet Happy", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Feed", "Pet", "Walk" }, null);

			// 6. Use user input to call the appropriate method created in step 5 below.
			if (task == 0) {
				feed();
			} else if (task == 1) {
				pet();
			} else {
				walk();
			}
			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			if(happinessLevel >= 10) {
				break;
			}
		}

		JOptionPane.showMessageDialog(null, "Your pet is now very, very happy!", "You did it!", 1);
	}

	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.

	static void feed() {
		if(hunger > 0) {
			hunger -= 1;
			happinessLevel += 2;
			JOptionPane.showMessageDialog(null, "Your " + pet + " thanks you for feeding them. Current happiness score: " + happinessLevel, "Feed", 1);
		} else {
			JOptionPane.showMessageDialog(null, "Your " + pet + " is already full. Current happiness score: " + happinessLevel, "Feed", 1);
		}
		
	}
	static void pet() {
		if (pet.equals("dog")) {
			happinessLevel += 3;
			JOptionPane.showMessageDialog(null, "Your dog enjoyed being pet. Current happiness score: " + happinessLevel, "Pet", 1);
		} else if (pet.equals("cat")) {
			happinessLevel += 2;
			JOptionPane.showMessageDialog(null, "Your cat purrs as you pet it. Current happiness score: " + happinessLevel, "Pet", 1);
		} else {
			happinessLevel += 1;
			JOptionPane.showMessageDialog(null, "Your hamster didn't really enjoy being pet. Current happiness score: " + happinessLevel, "Pet", 1);
		}
	}
	static void walk() {
		if (pet.equals("dog")) {
			happinessLevel += 3;
			JOptionPane.showMessageDialog(null, "Your dog enjoyed being going on a walk. Current happiness score: " + happinessLevel, "Walk", 1);
		} else if (pet.equals("cat")) {
			happinessLevel += 1;
			JOptionPane.showMessageDialog(null, "Your cat didn't really enjoy going on a walk. Current happiness score: " + happinessLevel, "Walk", 1);
		} else {
			happinessLevel -= 2;
			JOptionPane.showMessageDialog(null, "Your hamster didn't enjoy going on a walk. Why would you walk a hamster? Current happiness score: " + happinessLevel, "Walk", 1);
		}
	}
}