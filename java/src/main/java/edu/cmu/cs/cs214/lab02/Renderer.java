package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Shape;

public class Renderer {
    private Shape shape;

    Renderer(Shape shape) {
        this.shape = shape;
    }

    public void draw() {
        System.out.println("Drawing.");
        //assume actual 3d or 2d rendering logic here????
        shape.draw();
    }
}
