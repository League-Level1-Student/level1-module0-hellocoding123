package _01_methods._1_houses;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
		
	public void run() {
		Robot bob = new Robot();
		bob.setX(-200);
		bob.setY(0);
		bob.penDown();
		bob.turn(90);
		bob.move(50);
		bob.turn(-90);
		bob.move(200);
		bob.turn(90);
		bob.move(50);
		bob.turn(90);
		bob.move(200);
		bob.turn(-90);
	}
}
