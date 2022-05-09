/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mediator;

import Observer.MouseChangedObserver;
import Memento.DrawAreaMemento;
import Factory.Shape;
import Factory.ShapeFactory;
import Singleton.Data;
import java.awt.Point;
import java.awt.event.MouseEvent;

/**
 *
 * @author hossam
 */
public class ShapeDrawer implements MouseChangedObserver {

    /**
     *
     * @param state
     * @param e
     */
    @Override
    public void MouseStateChanged(String state, MouseEvent e) {
        Data d = Data.getInstance();
        ShapeFactory shapeFactory = new ShapeFactory();
        if (state == "PRESSED") {
            if (d.getState() == "DRAWING" || d.getState() == "SELECTING") {
                Shape shape = shapeFactory.getShape(d.getShapeName(), e);
                d.getArea().setShape(shape);
            } else if (d.getState() == "MOVING") {
                d.setLastPoint(new Point(e.getX(), e.getY()));
                d.getArea().moveSelected();
                d.getCareTaker().save(new DrawAreaMemento(d.getArea().getImg()));

            } else if (d.getState() == "COPYING") {

                d.setLastPoint(new Point(e.getX(), e.getY()));
                d.getArea().copySelected();
                d.getCareTaker().save(new DrawAreaMemento(d.getArea().getImg()));

            } else if (d.getState() == "RESIZING") {

            }

        } else if (state == "RELEASED") {

            if (d.getState() == "DRAWING") {
                d.getArea().updateImg();
                d.getCareTaker().save(new DrawAreaMemento(d.getArea().getImg()));
            } else if (d.getState() == "RESIZING") {
                d.getArea().updateImg();
                d.getCareTaker().save(new DrawAreaMemento(d.getArea().getImg()));
            }

        } else if (state == "CLICKED") {

        } else if (state == "DRAGGED") {
            Shape sh = d.getArea().getShape();
            sh.setX2(e.getX());
            sh.setY2(e.getY());
            d.getArea().setShape(sh);
            d.getArea().repaint();
        }
    }

}
