package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot Clank= new Robot();
Clank.setRandomPenColor();
Clank.penDown();
	Clank.setPenWidth(100);	
	for (int i = 0; i <20; i++) {
		Clank.move(400);
	Clank.turn(90);
	Clank.setRandomPenColor();
	}
	
	
	
	}
}
