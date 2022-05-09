/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
public class Square extends Shape{
    Square(int x, int y, int x0, int y0) {
        super(x, y, x0, y0);
    }

    public Square(Shape shape) {
        super(shape);
    }
    
    

    /**
     *
     * @param g
     */
    @Override
    public void draw(Graphics2D g) {
            g.setColor(Data.getInstance().getColor());
                if (getX1() < getX2() && getY1() < getY2()) {
                    g.fillRect(getX1(), getY1(), getX2() - getX1(), getX2() - getX1());
                } else if (getX1() > getX2() && getY1() > getY2()) {
                    g.fillRect(getX1() - Math.abs(getY2() - getY1()), getY1() - Math.abs(getY2() - getY1()), Math.abs(getY2() - getY1()), Math.abs(getY2() - getY1()));
                } else if (getX2() > getX1() && getY2() < getY1()) {
                    g.fillRect(getX1(), getY2(), Math.abs(getY2() - getY1()), Math.abs(getY2() - getY1()));
                } else  {
                    g.fillRect(getX2(),getY1(), Math.abs(getX2() - getX1()), Math.abs(getX2() - getX1()));
                }
        
        

    }
}
