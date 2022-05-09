/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Singleton.Data;
import Memento.DrawArea;
import javax.swing.JFrame;

/**
 *
 * @author hossam
 */
public class FinalProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Panel panel = new Panel();
        Data data = Data.getInstance();

        panel.setVisible(true);
        JFrame frame = new JFrame();
        DrawArea drawArea = new DrawArea();
        drawArea.setBlankImg();
        data.setArea(drawArea);
        frame.add(data.getArea());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
}
