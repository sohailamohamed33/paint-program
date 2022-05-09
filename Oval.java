/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the edito
 */
package Factory;

import Singleton.Data;
import java.awt.Graphics2D;

/**
 *
 * @author hossam
 */
public class Oval extends Shape{

private int h,w;

    public Oval(int x, int y, int x0, int y0) {
        super(x, y, x0, y0);
    }

    /**
     *
     * @return
     */
    public int getH() {
        return h;
    }

    /**
     *
     * @param h
     */
    public void setH(int h) {
        this.h = h;
    }

    /**
     *
     * @return
     */
    public int getW() {
        return w;
    }

    /**
     *
     * @param w
     */
    public void setW(int w) {
        this.w = w;
    }
    void make()
    {
        w=Math.abs(getX2()-getX1());
        h=Math.abs(getY2()-this.getY1());
    }

    /**
     *
     * @param g
     */
    @Override
    public void draw(Graphics2D g) {
        make();
            g.setColor(Data.getInstance().getColor());
if(getX1()<getX2()&&getY1()<getY2()) 
              g.fillOval(getX1(), getY1(), getW(), getH());
          else if(getX1()>getX2()&&getY1()>getY2())
              g.fillOval(getX2(), getY2(), getW(), getH());
          else if(getX1()>getX2()&&getY1()<getY2())
              g.fillOval(getX2(), getY1(), getW(), getH());
          else
               g.fillOval(getX1(), getY2(), getW(), getH());

    }
    
}
