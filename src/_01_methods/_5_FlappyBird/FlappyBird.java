package _01_methods._5_FlappyBird;

import processing.core.PApplet;
import processing.core.PImage;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int x = 100;
    int y;
    int birdYVelocity = 0;
    double gravity = 0;
    int pipeX = 600;
    boolean mouseIsPressed = false;
    PImage bird;

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
    	bird.resize(100,100);
    	image(bird, x, y);
    	pipeX -= 2;
    	
    	fill(50, 255, 0);
    	rect(pipeX, 100, 80, 200);
    }
    
    public void mousePressed(int jumpHeight) {
    	gravity = -jumpHeight;
    	
    		mouseIsPressed = false;
    }

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
