/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Singleton.Data;
import Memento.DrawAreaMemento;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

/**
 *
 * @author hossam
 */
public class Panel extends javax.swing.JFrame implements MouseListener {

    /**
     * Creates new form Panel
     */
    public Panel() {
        initComponents();
        setIcons();
        cursorBtn.addMouseListener(this);
        colorBtn.addMouseListener(this);
        rectBtn.addMouseListener(this);
        squareBtn.addMouseListener(this);
        lineBtn.addMouseListener(this);
        circleBtn.addMouseListener(this);
        triangleBtn.addMouseListener(this);
        copyBtn.addMouseListener(this);
        moveBtn.addMouseListener(this);
        resizeBtn.addMouseListener(this);
        undoBtn.addMouseListener(this);
        redoBtn.addMouseListener(this);
        deleteBtn.addMouseListener(this);
    }

    private void setIcons() {
        ImageIcon imageIcon;
        String path = "/home/hossam/Workplace/netBeansProjects/FinalProject/icons/";
        imageIcon = new ImageIcon(new ImageIcon(path + "cursor.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
        cursorBtn.setHorizontalAlignment(SwingConstants.CENTER);
        cursorBtn.setVerticalAlignment(SwingConstants.CENTER);
        cursorBtn.setIcon(imageIcon);
        cursorBtn.setOpaque(true);
        cursorBtn.setBackground(null);

        imageIcon = new ImageIcon(new ImageIcon(path + "line.png").getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT));
        lineBtn.setHorizontalAlignment(SwingConstants.CENTER);
        lineBtn.setVerticalAlignment(SwingConstants.CENTER);
        lineBtn.setIcon(imageIcon);
        lineBtn.setOpaque(true);
        lineBtn.setBackground(null);

        imageIcon = new ImageIcon(new ImageIcon(path + "square.png").getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH));
        squareBtn.setHorizontalAlignment(SwingConstants.CENTER);
        squareBtn.setVerticalAlignment(SwingConstants.CENTER);
        squareBtn.setIcon(imageIcon);
        squareBtn.setOpaque(true);
        squareBtn.setBackground(null);

        imageIcon = new ImageIcon(new ImageIcon(path + "rectangle.png").getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT));
        rectBtn.setHorizontalAlignment(SwingConstants.CENTER);
        rectBtn.setVerticalAlignment(SwingConstants.CENTER);
        rectBtn.setIcon(imageIcon);
        rectBtn.setOpaque(true);
        rectBtn.setBackground(null);

        imageIcon = new ImageIcon(new ImageIcon(path + "triangle.png").getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT));
        triangleBtn.setHorizontalAlignment(SwingConstants.CENTER);
        triangleBtn.setVerticalAlignment(SwingConstants.CENTER);
        triangleBtn.setIcon(imageIcon);
        triangleBtn.setOpaque(true);
        triangleBtn.setBackground(null);

        imageIcon = new ImageIcon(new ImageIcon(path + "circle.png").getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT));
        circleBtn.setHorizontalAlignment(SwingConstants.CENTER);
        circleBtn.setVerticalAlignment(SwingConstants.CENTER);
        circleBtn.setIcon(imageIcon);
        circleBtn.setOpaque(true);
        circleBtn.setBackground(null);

        imageIcon = new ImageIcon(new ImageIcon(path + "undo.png").getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT));
        undoBtn.setHorizontalAlignment(SwingConstants.CENTER);
        undoBtn.setVerticalAlignment(SwingConstants.CENTER);
        undoBtn.setIcon(imageIcon);
        undoBtn.setOpaque(true);

        imageIcon = new ImageIcon(new ImageIcon(path + "redo.png").getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT));
        redoBtn.setHorizontalAlignment(SwingConstants.CENTER);
        redoBtn.setVerticalAlignment(SwingConstants.CENTER);
        redoBtn.setIcon(imageIcon);
        redoBtn.setOpaque(true);

        imageIcon = new ImageIcon(new ImageIcon(path + "copy.png").getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT));
        copyBtn.setHorizontalAlignment(SwingConstants.CENTER);
        copyBtn.setVerticalAlignment(SwingConstants.CENTER);
        copyBtn.setIcon(imageIcon);
        copyBtn.setOpaque(true);

        imageIcon = new ImageIcon(new ImageIcon(path + "move.png").getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT));
        moveBtn.setHorizontalAlignment(SwingConstants.CENTER);
        moveBtn.setVerticalAlignment(SwingConstants.CENTER);
        moveBtn.setIcon(imageIcon);
        moveBtn.setOpaque(true);

        imageIcon = new ImageIcon(new ImageIcon(path + "resize.png").getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT));
        resizeBtn.setHorizontalAlignment(SwingConstants.CENTER);
        resizeBtn.setVerticalAlignment(SwingConstants.CENTER);
        resizeBtn.setIcon(imageIcon);
        resizeBtn.setOpaque(true);

        imageIcon = new ImageIcon(new ImageIcon(path + "trash.png").getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT));
        deleteBtn.setHorizontalAlignment(SwingConstants.CENTER);
        deleteBtn.setVerticalAlignment(SwingConstants.CENTER);
        deleteBtn.setIcon(imageIcon);
        deleteBtn.setOpaque(true);

        colorBtn.setBackground(Data.getInstance().getColor());
        colorBtn.setOpaque(true);
        //PanelData.getInstance().setColor(Color.BLACK);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cursorBtn = new javax.swing.JLabel();
        lineBtn = new javax.swing.JLabel();
        squareBtn = new javax.swing.JLabel();
        rectBtn = new javax.swing.JLabel();
        circleBtn = new javax.swing.JLabel();
        triangleBtn = new javax.swing.JLabel();
        undoBtn = new javax.swing.JLabel();
        redoBtn = new javax.swing.JLabel();
        copyBtn = new javax.swing.JLabel();
        colorBtn = new javax.swing.JLabel();
        moveBtn = new javax.swing.JLabel();
        deleteBtn = new javax.swing.JLabel();
        resizeBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        cursorBtn.setForeground(new java.awt.Color(255, 255, 255));
        cursorBtn.setLabelFor(this);

        lineBtn.setLabelFor(this);

        squareBtn.setLabelFor(this);

        rectBtn.setLabelFor(this);

        circleBtn.setLabelFor(this);

        triangleBtn.setLabelFor(this);

        undoBtn.setLabelFor(this);

        redoBtn.setLabelFor(this);

        copyBtn.setLabelFor(this);

        colorBtn.setLabelFor(this);

        moveBtn.setLabelFor(this);

        deleteBtn.setLabelFor(this);

        resizeBtn.setLabelFor(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cursorBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
            .addComponent(lineBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(squareBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rectBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(circleBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(triangleBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(undoBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(redoBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(copyBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(deleteBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(colorBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(moveBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(resizeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(cursorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(squareBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(circleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(triangleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(undoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(redoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(copyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(moveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resizeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(colorBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel circleBtn;
    private javax.swing.JLabel colorBtn;
    private javax.swing.JLabel copyBtn;
    private javax.swing.JLabel cursorBtn;
    private javax.swing.JLabel deleteBtn;
    private javax.swing.JLabel lineBtn;
    private javax.swing.JLabel moveBtn;
    private javax.swing.JLabel rectBtn;
    private javax.swing.JLabel redoBtn;
    private javax.swing.JLabel resizeBtn;
    private javax.swing.JLabel squareBtn;
    private javax.swing.JLabel triangleBtn;
    private javax.swing.JLabel undoBtn;
    // End of variables declaration//GEN-END:variables

    /**
     *
     * @param arg0
     */
    @Override
    public void mouseClicked(MouseEvent arg0) {
        Component c = arg0.getComponent();

        if (c == colorBtn) {
            Color initialcolor = colorBtn.getBackground();
            Color color = JColorChooser.showDialog(this,
                    "Select a color", initialcolor);
            c.setBackground(color);
            Data.getInstance().setColor(color);
            return;
        } else if (c == circleBtn) {
            Data.getInstance().setShapeName("CIRCLE");
            Data.getInstance().setState("DRAWING");

        } else if (c == rectBtn) {
            Data.getInstance().setShapeName("RECTANGLE");
            Data.getInstance().setState("DRAWING");

        } else if (c == squareBtn) {
            Data.getInstance().setShapeName("SQUARE");
            Data.getInstance().setState("DRAWING");
        } else if (c == lineBtn) {
            Data.getInstance().setShapeName("LINE");
            Data.getInstance().setState("DRAWING");
        } else if (c == triangleBtn) {
            Data.getInstance().setShapeName("TRIANGLE");
            Data.getInstance().setState("DRAWING");

        } else if (c == undoBtn) {
            Data.getInstance().getArea().getStateFromMemento(Data.getInstance().getCareTaker().undo());
        } else if (c == redoBtn) {
            Data.getInstance().getArea().getStateFromMemento(Data.getInstance().getCareTaker().redo());
        } else if (c == cursorBtn) {
            Data.getInstance().setShapeName("RECTANGLE");
            Data.getInstance().setState("SELECTING");

        } else if (c == deleteBtn) {
            Data.getInstance().getArea().deleteSelected();
            Data.getInstance().getCareTaker().save(new DrawAreaMemento(Data.getInstance().getArea().getImg()));

        } else if (c == moveBtn) {
            Data.getInstance().setState("MOVING");

        } else if (c == copyBtn) {
            Data.getInstance().setState("COPYING");
        } else if (c == resizeBtn) {
            Data.getInstance().setState("RESIZING");
            String m = JOptionPane.showInputDialog("Select resize percentage");
            Double perc = Double.parseDouble(m);
            Data.getInstance().getArea().resizeSelected(perc / 100);
            Data.getInstance().getCareTaker().save(new DrawAreaMemento(Data.getInstance().getArea().getImg()));
        }
        setIcons();
        if (c != undoBtn && c != redoBtn && c != colorBtn && c != deleteBtn && c != copyBtn && c != moveBtn && c != resizeBtn) {
            c.setBackground(Color.LIGHT_GRAY);
        }
    }

    /**
     *
     * @param arg0
     */
    @Override
    public void mousePressed(MouseEvent arg0) {
    }

    /**
     *
     * @param arg0
     */
    @Override
    public void mouseReleased(MouseEvent arg0) {
    }

    /**
     *
     * @param arg0
     */
    @Override
    public void mouseEntered(MouseEvent arg0) {
    }

    /**
     *
     * @param arg0
     */
    @Override
    public void mouseExited(MouseEvent arg0) {
    }
}
