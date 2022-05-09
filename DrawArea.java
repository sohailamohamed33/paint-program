/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memento;

import Factory.Rectangle;
import Factory.Shape;
import Observer.MouseHandler;
import Singleton.Data;
import Mediator.ShapeDrawer;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JComponent;

/**
 *
 * @author hossam
 */
public class DrawArea extends JComponent {

    private BufferedImage img;
    private BufferedImage layer;
    private Shape shape;
    private Shape selectedRect;

    public DrawArea() {
       
        setPreferredSize(new Dimension(1500, 1000));
        MouseHandler m = new MouseHandler();
        ShapeDrawer d = new ShapeDrawer();
        m.setObserver(d);
        addMouseListener(m);
        addMouseMotionListener(m);
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

    /**
     *
     */
    public void setBlankImg() {
        img = new BufferedImage(1500, 1000, BufferedImage.TYPE_3BYTE_BGR);
        Graphics2D graphics = img.createGraphics();
        graphics.setPaint(new Color(255, 255, 255));
        graphics.fillRect(0, 0, img.getWidth(), img.getHeight());
    }

    /**
     *
     * @return
     */
    public Shape getShape() {
        return shape;
    }

    /**
     *
     * @param shape
     */
    public void setShape(Shape shape) {
        this.shape = shape;
    }

    /**
     *
     * @param g
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        layer = copyImage(img);
        Graphics gImg = (Graphics2D) layer.createGraphics();

        if (shape != null) {
            shape.draw((Graphics2D) gImg);
        }

        g.drawImage(layer, 0, 0, 1500, 1000, this);

    }

    /**
     *
     */
    public void updateImg() {
        img = layer;
    }

    /**
     *
     * @param memento
     */
    public void getStateFromMemento(DrawAreaMemento memento) {
        setImg(memento.getImg());
        shape = null;
        repaint();
    }

    /**
     *
     * @param source
     * @return
     */
    private BufferedImage copyImage(BufferedImage source) {
        BufferedImage b = new BufferedImage(source.getWidth(), source.getHeight(), source.getType());
        Graphics g = b.getGraphics();
        g.drawImage(source, 0, 0, null);
        g.dispose();
        return b;
    }

    public BufferedImage deleteSelected() {
        BufferedImage clippedImg = null;
        if (Data.getInstance().getState() != "DRAWING" && shape != null) {
            BufferedImage imggg = copyImage(this.img);
            System.out.println(shape.getX1() + " " + shape.getX2() + " " + shape.getY1() + " " + shape.getY2());
            if (shape.getX1() < shape.getX2() && shape.getY1() < shape.getY2()) {
                clippedImg = layer.getSubimage(shape.getX1() + 2, shape.getY1() + 2, Math.abs(shape.getX2() - shape.getX1() - 2), Math.abs(shape.getY2() - shape.getY1()) - 2);
            } else if (shape.getX1() > shape.getX2() && shape.getY1() > shape.getY2()) {
                clippedImg = layer.getSubimage(shape.getX2() + 2, shape.getY2() + 2, Math.abs(shape.getX2() - shape.getX1() - 2), Math.abs(shape.getY2() - shape.getY1()) - 2);
            } else if (shape.getX1() > shape.getX2() && shape.getY1() < shape.getY2()) {
                clippedImg = layer.getSubimage(shape.getX2() + 2, shape.getY1() + 2, Math.abs(shape.getX2() - shape.getX1() - 2), Math.abs(shape.getY2() - shape.getY1()) - 2);
            } else {
                clippedImg = layer.getSubimage(shape.getX1() + 2, shape.getY2() + 2, Math.abs(shape.getX2() - shape.getX1() - 2), Math.abs(shape.getY2() - shape.getY1()) - 2);
            }
            Graphics g = imggg.createGraphics();
            g.setColor(Color.WHITE);
            if (shape.getX1() < shape.getX2() && shape.getY1() < shape.getY2()) {
                g.fillRect(shape.getX1(), shape.getY1(), Math.abs(shape.getX2() - shape.getX1()), Math.abs(shape.getY2() - shape.getY1()));
            } else if (shape.getX1() > shape.getX2() && shape.getY1() > shape.getY2()) {
                g.fillRect(shape.getX2(), shape.getY2(), Math.abs(shape.getX2() - shape.getX1()), Math.abs(shape.getY2() - shape.getY1()));
            } else if (shape.getX1() > shape.getX2() && shape.getY1() < shape.getY2()) {
            } else {
                g.fillRect(shape.getX1(), shape.getY2(), Math.abs(shape.getX2() - shape.getX1()), Math.abs(shape.getY2() - shape.getY1()));
            }
            selectedRect = new Rectangle(shape);
           
            updateImg();
            img = imggg;
            shape = null;
            repaint();

        }
        return clippedImg;
    }

    public void moveSelected() {
        int x = Data.getInstance().getLastPoint().x;
        int y = Data.getInstance().getLastPoint().y;
        BufferedImage clippedImg = deleteSelected();
        BufferedImage imggg = copyImage(this.img);
        Graphics g = imggg.createGraphics();

        updateImg();
        img = imggg;
        shape = null;
        repaint();
        g.drawImage(clippedImg, x, y, clippedImg.getWidth(), clippedImg.getHeight(), this);

    }

    public void copySelected() {
        int x = Data.getInstance().getLastPoint().x;
        int y = Data.getInstance().getLastPoint().y;
        BufferedImage clippedImg = null;
        if (shape.getX1() < shape.getX2() && shape.getY1() < shape.getY2()) {
            clippedImg = layer.getSubimage(shape.getX1() + 2, shape.getY1() + 2, Math.abs(shape.getX2() - shape.getX1() - 2), Math.abs(shape.getY2() - shape.getY1()) - 2);
        } else if (shape.getX1() > shape.getX2() && shape.getY1() > shape.getY2()) {
            clippedImg = layer.getSubimage(shape.getX2() + 2, shape.getY2() + 2, Math.abs(shape.getX2() - shape.getX1() - 2), Math.abs(shape.getY2() - shape.getY1()) - 2);
        } else if (shape.getX1() > shape.getX2() && shape.getY1() < shape.getY2()) {
            clippedImg = layer.getSubimage(shape.getX2() + 2, shape.getY1() + 2, Math.abs(shape.getX2() - shape.getX1() - 2), Math.abs(shape.getY2() - shape.getY1()) - 2);
        } else {
            clippedImg = layer.getSubimage(shape.getX1() + 2, shape.getY2() + 2, Math.abs(shape.getX2() - shape.getX1() - 2), Math.abs(shape.getY2() - shape.getY1()) - 2);
        }
        BufferedImage imggg = copyImage(this.img);
        Graphics g = imggg.createGraphics();

        g.drawImage(clippedImg, x, y, clippedImg.getWidth(), clippedImg.getHeight(), this);
        updateImg();
        img = imggg;
        shape = null;
        repaint();
    }

    public void resizeSelected(Double perc) {
        BufferedImage clippedImg = deleteSelected();

    
        BufferedImage dimg = resize(clippedImg, perc);
        
        BufferedImage imggg = copyImage(this.img);
        Graphics g = imggg.createGraphics();
        g.drawImage(dimg, selectedRect.getX1(), selectedRect.getY1(), dimg.getWidth(), dimg.getHeight(), this);
        img = imggg;
        shape = null;
        repaint();
    }

    public BufferedImage resize(BufferedImage inputImage,
            int scaledWidth, int scaledHeight) {

        // creates output image
        BufferedImage outputImage = new BufferedImage(scaledWidth,
                scaledHeight, inputImage.getType());

        // scales the input image to the output image
        Graphics2D g2d = outputImage.createGraphics();
        g2d.drawImage(inputImage, 0, 0, scaledWidth, scaledHeight, null);
        g2d.dispose();

        return outputImage;
    }

    /**
     * Resizes an image by a percentage of original size (proportional).
     *
     * @param inputImagePath Path of the original image
     * @param outputImagePath Path to save the resized image
     * @param percent a double number specifies percentage of the output image
     * over the input image.
     * @throws IOException
     */
    public BufferedImage resize(BufferedImage inputImage,
            double percent) {
        int scaledWidth = (int) (inputImage.getWidth() * percent);
        int scaledHeight = (int) (inputImage.getHeight() * percent);

        return resize(inputImage, scaledWidth, scaledHeight);
    }
}
