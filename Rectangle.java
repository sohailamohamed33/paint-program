/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the edito
 */
package Factory;

import Singleton.Data;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 *
 * @author hossam
 */
public class Rectangle extends Shape {

    Rectangle(int x, int y, int x0, int y0) {
        super(x, y, x0, y0);
    }

    public Rectangle(Shape shape) {
        super(shape);
    }
    
    

    /**
     *
     * @param g
     */
    @Override
    public void draw(Graphics2D g) {

        if (Data.getInstance().getState() == "SELECTING") {
            float dash1[] = {10.0f};
            BasicStroke dashed = new BasicStroke(1.0f,
                    BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 1.0f, dash1, 0.0f);
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);

            g2.setPaint(Color.blue);

            g2.setStroke(dashed);
            if (getX1() < getX2() && getY1() < getY2()) {
                g.drawRect(getX1(), getY1(), Math.abs(getX2() - getX1()), Math.abs(getY2() - getY1()));
            } else if (getX1() > getX2() && getY1() > getY2()) {
                g.drawRect(getX2(), getY2(), Math.abs(getX2() - getX1()), Math.abs(getY2() - getY1()));
            } else if (getX1() > getX2() && getY1() < getY2()) {
                g.drawRect(getX2(), getY1(), Math.abs(getX2() - getX1()), Math.abs(getY2() - getY1()));
            } else {
                g.drawRect(getX1(), getY2(), Math.abs(getX2() - getX1()), Math.abs(getY2() - getY1()));
            }
            
        } else {
            g.setColor(Data.getInstance().getColor());
            if (getX1() < getX2() && getY1() < getY2()) {
                g.fillRect(getX1(), getY1(), Math.abs(getX2() - getX1()), Math.abs(getY2() - getY1()));
            } else if (getX1() > getX2() && getY1() > getY2()) {
                g.fillRect(getX2(), getY2(), Math.abs(getX2() - getX1()), Math.abs(getY2() - getY1()));
            } else if (getX1() > getX2() && getY1() < getY2()) {
                g.fillRect(getX2(), getY1(), Math.abs(getX2() - getX1()), Math.abs(getY2() - getY1()));
            } else {
                g.fillRect(getX1(), getY2(), Math.abs(getX2() - getX1()), Math.abs(getY2() - getY1()));
            }
        }
        

    }
}
