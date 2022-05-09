/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memento;

import java.awt.image.BufferedImage;

/**
 *
 * @author hossam
 */
public class DrawAreaMemento {
    private BufferedImage img;

    /**
     *
     * @param img
     */
    public DrawAreaMemento(BufferedImage img) {
        this.img = img;
    }

    /**
     *
     * @return
     */
    public BufferedImage getImg() {
        return img;
    }

    /**
     *
     * @param img
     */
    public void setImg(BufferedImage img) {
        this.img = img;
    }
    
    
    
}
