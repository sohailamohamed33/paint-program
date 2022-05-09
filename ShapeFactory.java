/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import java.awt.event.MouseEvent;

/**
 *
 * @author hossam
 */
public class ShapeFactory {
    /**
     *
     * @param shapeName
     * @param e
     * @return
     */
    public Shape getShape(String shapeName, MouseEvent e) {
        Shape shape = null;
        System.out.println(shapeName);
        switch (shapeName) {
            case "CIRCLE":
                shape = new Oval(e.getX(), e.getY(), e.getX(), e.getY());
                break;
            case "RECTANGLE":
                shape = new Rectangle(e.getX(), e.getY(), e.getX(), e.getY());
                break;
            case "LINE":
                shape = new Line(e.getX(), e.getY(), e.getX(), e.getY());
                break;
            case "SQUARE":
                shape = new Square(e.getX(), e.getY(), e.getX(), e.getY());
                break;
            case "TRIANGLE":
                shape = new Triangle(e.getX(), e.getY(), e.getX(), e.getY());
                break;
        }
        return shape;
    }
    
}
