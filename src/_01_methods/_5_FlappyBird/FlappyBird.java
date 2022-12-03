package _01_methods._5_FlappyBird;

import java.util.Random;

import processing.core.PApplet;
import processing.core.PImage;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int x = 100;
    int y;
    int birdYVelocity = 0;
    double gravity = 0;
    int randomNumber = new Random().nextInt(450);
    int randomNumber2 = new Random().nextInt(450);
    int pipeX = 1000;
    int pipeX2 = 1400;
    boolean mouseIsPressed = false;
    PImage bird;
    
    boolean intersectsPipes() { 
        if (y < randomNumber-600 && 100 > pipeX && 100 < (pipeX+80)){
           return true; }
       else if (y > randomNumber+200 && 100 > pipeX && 100 < (pipeX+80)) {
           return true; }
       else { return false; }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        bird = loadImage("bird.png");
    }

    @Override
    public void draw() {
    
    	background(0, 0, 100);
    	fill(255, 255, 0);
    	stroke(255, 255, 0);
    	y += gravity;
    	gravity += 0.5;
    	if (mouseIsPressed == false) {
		    if (mousePressed) {
		    	System.out.println("check jump");
		    	mouseIsPressed = true;
		    	mousePressed(9);
		    }
    	}
    	
    	if (!(mousePressed)) {
    		mouseIsPressed = false;
    	}
    	else {
    		mouseIsPressed = true;
    	}
    	//ellipse(x, y, 50, 50);
    	bird.resize(80,80);
    	image(bird, x, y);
    	pipeX -= 3;
    	pipeX2 -= 3;
    	fill(50, 255, 0);
    	rect(pipeX, randomNumber - 600, 80, 600);
    	rect(pipeX, randomNumber +200, 80, 600);
    	rect(pipeX2, randomNumber2 - 600, 80, 600);
    	rect(pipeX2, randomNumber2 +200, 80, 600);
    	
    	if (pipeX < 0) {	
    		int randomNumber = new Random().nextInt(500);
    		pipeX = 850;
    	}
    	if (pipeX2 < 0) {
    		int randomNumber2 = new Random().nextInt(500);
    		pipeX2 = 850;
    	}
    	
    	
    	// if (intersectsPipes = true) {
    		 //end game
    	// }
    }
    
    public void mousePressed(int jumpHeight) {
    	gravity = -jumpHeight;
    	
    		mouseIsPressed = false;
    }

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
