package _03_method_writing._1_obedient_robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

import javax.swing.JOptionPane;

public class ObedientRobot {
    public static void main(String[] args) {
        Robot robot = new Robot();

		robot.setX(300);
		robot.setY(300);

		robot.penDown();

		robot.setSpeed(50);

        String shapeAskedFor = JOptionPane.showInputDialog("Circle, square, or triangle?");
        String color = JOptionPane.showInputDialog("Choose any color of the rainbow");

        if(color.equalsIgnoreCase("red")) {
            robot.setPenColor(Color.RED);
        } else if (color.equalsIgnoreCase("orange")) {
            robot.setPenColor(255, 117, 24);
        } else if (color.equalsIgnoreCase("yellow")) {
            robot.setPenColor(Color.YELLOW);
        } else if (color.equalsIgnoreCase("green")) {
            robot.setPenColor(Color.GREEN);
        } else if (color.equalsIgnoreCase("blue")) {
            robot.setPenColor(Color.BLUE);
        } else if (color.equalsIgnoreCase("purple")) {
            robot.setPenColor(138, 43, 226);
        }

        if(shapeAskedFor.equalsIgnoreCase("circle")) {
            drawCircle(robot, 250);
        } else if(shapeAskedFor.equalsIgnoreCase("square")) {
            drawSquare(robot, 250);
        } else if(shapeAskedFor.equalsIgnoreCase("triangle")) {
            drawTriangle(robot, 250);
        }

        
    }

    public static void drawSquare(Robot bot, int length) {
        for(int i = 0; i < 4; i++) {
            bot.move(length);
            bot.turn(90);
        }
    }

    public static void drawTriangle(Robot bot, int length) {
        for(int i = 0; i < 3; i++) {
            bot.move(length);
            bot.turn(120);
        }
    }
    public static void drawCircle(Robot bot, int diameter) {
        for(int i = 0; i < 360; i++) {
            bot.move((int) ((Math.PI * diameter)/360));
            bot.turn(1);
        }
    }
}
