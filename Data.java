/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

import Memento.DrawAreaCaretaker;
import Memento.DrawArea;
import Memento.DrawAreaMemento;
import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author hossam
 */
public class Data {

    private static volatile Data instance = null;
    private static Object mutex = new Object();
    String state;
    String shapeName;
    Color color = Color.BLACK;
    DrawArea area;
    DrawAreaCaretaker careTaker = new DrawAreaCaretaker();
    Point lastPoint;

    public Point getLastPoint() {
        return lastPoint;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setLastPoint(Point lastPoint) {
        this.lastPoint = lastPoint;
    }

    /**
     *
     * @return
     */
    public DrawAreaCaretaker getCareTaker() {
        return careTaker;
    }

    /**
     *
     * @param careTaker
     */
    public void setCareTaker(DrawAreaCaretaker careTaker) {
        this.careTaker = careTaker;
    }

    /**
     *
     * @return
     */
    public static synchronized Data getInstance() {
        Data result = instance;
        if (result == null) {
            synchronized (mutex) {
                result = instance;
                if (result == null) {
                    instance = result = new Data();
                }
            }
        }
        return result;
    }

   
    /**
     *
     * @return
     */
    public String getShapeName() {
        return this.shapeName;
        
    }

    /**
     *
     * @param shapeName
     */
    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
        System.err.println(this.shapeName);
    }

    /**
     *
     * @return
     */
    public Color getColor() {
        return color;
    }

    /**
     *
     * @param color
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     *
     * @return
     */
    public DrawArea getArea() {
        return area;
    }

    /**
     *
     * @param area
     */
    public void setArea(DrawArea area) {
        this.area = area;
        careTaker.save(new DrawAreaMemento(area.getImg()));

    }

}
