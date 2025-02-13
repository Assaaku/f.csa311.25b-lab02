package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Circle;
import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Square;
import edu.cmu.cs.cs214.lab02.shapes.Shape;


public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 3);

        Renderer renderer = new Renderer(rectangle);
        renderer.draw();

        Square square = new Square(3);
        Renderer renderer2 = new Renderer(square);
        renderer2.draw();

        Circle circle = new Circle(5);
        Renderer renderer3 = new Renderer(circle);
        renderer3.draw();
    }
}
