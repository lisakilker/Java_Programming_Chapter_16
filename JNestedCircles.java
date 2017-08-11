/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W5HW;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author Lisa
 */
public class JNestedCircles extends JFrame {

    int axis = 50;
    int diameter = 400;
    int space = 14;
    Container con = getContentPane();

    public JNestedCircles() {
        con.setLayout(new FlowLayout());
        setTitle("JNested Circles");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.magenta);

        for (int i = 0; i <= 14; i++) {
            g.drawOval(axis, axis, diameter, diameter);
            axis = axis + space;
            diameter = diameter - (space * 2);
        }
    }

    public static void main(String[] args) {
        JNestedCircles frame = new JNestedCircles();
    }
}
