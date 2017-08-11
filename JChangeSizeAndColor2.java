/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W5HW;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Lisa
 */
public class JChangeSizeAndColor2 extends JFrame implements ActionListener {
int red, green, blue;
    int x, y;
    int size;
    int count;
    Color color;
    String message = "Can you hear me now??";

    Random random = new Random();
    JButton button = new JButton("CLICK ME");

    public JChangeSizeAndColor2() {
        setTitle("Size and Color");
        setSize(800, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(button);
        button.addActionListener(this);
    }

    public void paint(Graphics g) {
        super.paint(g);

        Font font = new Font("Courier", Font.PLAIN, size);

        g.setColor(color);
        g.setFont(font);
        g.drawString(message, x, y);
    }

    public static void main(String args[]) {
        JChangeSizeAndColor2 frame = new JChangeSizeAndColor2();
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == button) {
            x = random.nextInt(500);
            y = random.nextInt(500);
            size = random.nextInt(50);
            red = random.nextInt(256);
            green = random.nextInt(256);
            blue = random.nextInt(256);
            color = new Color(red, green, blue);
            repaint();
        }
    }
}

