/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Singleton.Data;
import java.awt.Graphics2D;

/**
 *
 * @author hossam
 */
public class Triangle extends Shape{

   private int[]a= new int[3];
   private int[]b= new int[3];

  Triangle(int x, int y, int x0, int y0) {
        super(x, y, x0, y0);
    }

    /**
     *
     */
    public void setArrays(){
         a[0]=(getX1()+getX2())/2;
        a[1]=getX1();
        a[2]=getX2();
        b[0]=getY1();
        b[1]=getY2();
        b[2]=getY2();
    }

    /**
     *
     * @return
     */
    public int[] getA() {
        return a;
    }

    /**
     *
     * @param a
     */
    public void setA(int[] a) {
        this.a = a;
    }

    /**
     *
     * @return
     */
    public int[] getB() {
        return b;
    }

    /**
     *
     * @param b
     */
    public void setB(int[] b) {
        this.b = b;
    }

    /**
     *
     * @param g
     */
    @Override
    public void draw(Graphics2D g) {
        setArrays();
    g.setColor(Data.getInstance().getColor());
    g.fillPolygon(getA(), getB(), 3);
    }
    
    
}
