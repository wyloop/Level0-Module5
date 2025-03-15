package _02_nested_loops._1_snowflake;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;



public class Snowflake {
	
	public static void main(String[] args) {

		// #1. Make a new Robot
		Robot robot = new Robot();

		// #2. Set your robot’s position to x=300 and y=300
		robot.setX(300);
		robot.setY(300);

		// #3. Put the robot's pen down
		robot.penDown();

		// #4. Set the robot’s speed to 5
		robot.setSpeed(5);

		// #5. use a for loop below to do everything ( #6, #7, #8, #9, #12, #13, #14 ) 6 times (use i as the counter)
		for(int i = 0; i < 6; i++) {
			
			// #6. Set the pen color to black
			robot.setPenColor(Color.BLACK);
			
			// #7. move the robot by 50
			robot.move(50);
			
			// #8. turn the robot to the right by 60
			robot.turn(60);
			
			// #12. set the pen color to blue for even numbers of i
			// #13. set the pen color to red for all odd numbers of i
			if(i%2 == 0) {
				robot.setPenColor(Color.BLUE);
			} else {
				robot.setPenColor(Color.RED);
			}
			
			
			// #9. Use a for loop to do everything (#10, #11) 6 times ( use j as a counter )
			for(int j = 0; j < 6; j++){
				// #10. turn the robot to the left by 60
				robot.turn(-60);
					
				// #11. move the robot by 50 (play the start button)
				robot.move(50);
			}
			// #14. set the pen color to black

		}
				
		
	}

}
