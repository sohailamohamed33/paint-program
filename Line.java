/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Singleton.Data;
import java.awt.BasicStroke;
import java.awt.Graphics2D;

/**
 *
 * @author hossam
 */
public class Line extends Shape {

    Line(int x, int y, int x0, int y0) {
        super(x, y, x0, y0);
    }

    /**
     *
     * @param g
     */
    @Override
    public void draw(Graphics2D g) {
        g.setStroke(new BasicStroke(5));
        g.setColor(Data.getInstance().getColor());
        g.drawLine(getX1(), getY1(), getX2(), getY2());

    }

}
