/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import java.awt.Graphics2D;

/**
 *
 * @author hossam
 */
public abstract class Shape {

    private int x1, y1, x2, y2;

    /**
     *
     * @param g
     */
    public abstract void draw(Graphics2D g);

    /**
     *
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     */
    public Shape(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Shape(Shape shape) {
        this.x1 = shape.getX1();
        this.y1 = shape.getY1();
        this.x2 = shape.getX2();
        this.y2 = shape.getY2();
    }

    /**
     *
     * @return
     */
    public int getX1() {
        return x1;
    }

    /**
     *
     * @param x1
     */
    public void setX1(int x1) {
        this.x1 = x1;
    }

    /**
     *
     * @return
     */
    public int getY1() {
        return y1;
    }

    /**
     *
     * @param y1
     */
    public void setY1(int y1) {
        this.y1 = y1;
    }

    /**
     *
     * @return
     */
    public int getX2() {
        return x2;
    }

    /**
     *
     * @param x2
     */
    public void setX2(int x2) {
        this.x2 = x2;
    }

    /**
     *
     * @return
     */
    public int getY2() {
        return y2;
    }

    /**
     *
     * @param y2
     */
    public void setY2(int y2) {
        this.y2 = y2;
    }

}
