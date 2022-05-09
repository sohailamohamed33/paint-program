/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author hossam
 */
public class MouseHandler implements MouseMotionListener,MouseListener {

    MouseChangedObserver observer;

    /**
     *
     * @param observer
     */
    public void setObserver(MouseChangedObserver observer) {
        this.observer = observer;
    }

    /**
     *
     * @param arg0
     */
    @Override
    public void mouseClicked(java.awt.event.MouseEvent arg0) {
                notifyFactory("CLICKED",arg0);

    }

    /**
     *
     * @param arg0
     */
    @Override
    public void mousePressed(java.awt.event.MouseEvent arg0) {
        notifyFactory("PRESSED",arg0);
    }

    /**
     *
     * @param arg0
     */
    @Override
    public void mouseReleased(java.awt.event.MouseEvent arg0) {
        notifyFactory("RELEASED",arg0);

    }

    /**
     *
     * @param arg0
     */
    @Override
    public void mouseEntered(java.awt.event.MouseEvent arg0) {

    }

    /**
     *
     * @param arg0
     */
    @Override
    public void mouseExited(java.awt.event.MouseEvent arg0) {
    }

    private void notifyFactory(String mouseState,java.awt.event.MouseEvent e) {
        observer.MouseStateChanged(mouseState,e);
    }

    /**
     *
     * @param arg0
     */
    @Override
    public void mouseDragged(java.awt.event.MouseEvent arg0) {
        notifyFactory("DRAGGED",arg0);
    }

    /**
     *
     * @param arg0
     */
    @Override
    public void mouseMoved(java.awt.event.MouseEvent arg0) {
    }
}
