package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int x = -100;
    int y;
    int birdYVelocity = 0;
    int gravity = 1;

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        
    }

    @Override
    public void draw() {
    	background(0, 0, 100);
    	fill(255, 255, 0);
    	stroke(255, 255, 0);
    	ellipse(x, y, 50, 50);
    	birdYVelocity -= gravity;
    	x = birdYVelocity;
    	if (mousePressed) {
    		mousePressed(10);
    	}
    	fill(50, 255, 0);
    	rect(x, y, 80, 200);
    }
    
    public void mousePressed(int jumpHeight) {
    	birdYVelocity = jumpHeight;
    }

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
